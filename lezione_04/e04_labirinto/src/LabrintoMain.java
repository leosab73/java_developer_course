import java.util.Scanner;

public class LabrintoMain {

    public static int vaiSu(char[][] labirinto) {
        int stato = 0;
        int[] posizioneAttuale = posizioneGiocatore(labirinto);
        if (posizioneAttuale[0]-1>=0) {
            if (labirinto[posizioneAttuale[0]-1][posizioneAttuale[1]] != '-') {
                System.out.println("C'è un ostacolo! Ritenta");
            } else {
                labirinto[posizioneAttuale[0]-1][posizioneAttuale[1]] = 'P';
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]] = '-';
                stato = 1;
            }
        } else {
            System.out.println("Mossa non possibile");
        }
        return stato;
    }

    public static int vaiADestra(char[][] labirinto) {
        int stato = 0;
        int[] posizioneAttuale = posizioneGiocatore(labirinto);
        if (posizioneAttuale[1]+1 <= labirinto.length) {
            if (labirinto[posizioneAttuale[0]][posizioneAttuale[1]+1] != '-') {
                System.out.println("C'è un ostacolo! Ritenta");
            } else {
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]+1] = 'P';
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]] = '-';
                stato = 1;
            }
        } else {
            System.out.println("Mossa non possibile");
        }
        return stato;
    }

    public static int vaiASinistra(char[][] labirinto) {
        int stato = 0;
        int[] posizioneAttuale = posizioneGiocatore(labirinto);
        if (posizioneAttuale[1]-1>=0) {
            if (labirinto[posizioneAttuale[0]][posizioneAttuale[1]-1] != '-') {
                System.out.println("C'è un ostacolo! Ritenta");
            } else {
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]-1] = 'P';
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]] = '-';
                stato = 1;
            }
        } else {
            System.out.println("Mossa non possibile");
        }
        return stato;
    }

    public static int vaiSotto(char[][] labirinto) {
        int stato = 0;
        int[] posizioneAttuale = posizioneGiocatore(labirinto);
        if (posizioneAttuale[0] + 1 < labirinto[0].length) {
            if (labirinto[posizioneAttuale[0]+1][posizioneAttuale[1]] != '-') {
                System.out.println("C'è un ostacolo! Ritenta");
            } else {
                labirinto[posizioneAttuale[0]+1][posizioneAttuale[1]] = 'P';
                labirinto[posizioneAttuale[0]][posizioneAttuale[1]] = '-';
                stato = 1;
            }
        } else {
            System.out.println("Mossa non possibile");
        }
        return stato;
    }

    public static void posizionaGiocatore(char[][] labirinto) {
        labirinto[2][0] = 'P';
    }

    public static int[] posizioneGiocatore(char[][] labirinto) {
        int[] coordinate = new int[2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (labirinto[i][j] == 'P') {
                    coordinate[0] = i;
                    coordinate[1] = j;
                }
            }
        }
        return coordinate;
    }

    public static void stampaLabirinto(char[][] labirinto) {
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(labirinto[i][j] + " ");
            }
        }
    }

    public static void spazio() {
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        char[] riga1 = {'-','-','W','W','-'};
        char[] riga2 = {'-','W','-','W','-'};
        char[] riga3 = {'-','W','-','W','W'};
        char[] riga4 = {'-','-','W','-','E'};
        char[] riga5 = {'W','-','-','-','W'};

        char[][] labirinto = new char[5][5];
        labirinto[0] = riga1;
        labirinto[1] = riga2;
        labirinto[2] = riga3;
        labirinto[3] = riga4;
        labirinto[4] = riga5;

        posizionaGiocatore(labirinto);

        stampaLabirinto(labirinto);

        System.out.println();
        System.out.println();

        Scanner input = new Scanner(System.in);

        while (labirinto[3][4] != 'P') {
            System.out.println("W: vai su");
            System.out.println("A: vai a sinistra");
            System.out.println("S: vai indietro");
            System.out.println("D: vai a destra");
            System.out.println("Inserisci il prossimo movimento: ");

            char prossimaMossa = input.nextLine().charAt(0);

            int stato = 0;

            switch (prossimaMossa) {
                case 'W' -> {
                    do {
                        stato = vaiSu(labirinto);
                    } while (stato == 0);
                    stampaLabirinto(labirinto);
                    spazio();
                }
                case 'A' -> {
                    do {
                        stato = vaiASinistra(labirinto);
                    } while (stato == 0);
                    stampaLabirinto(labirinto);
                    spazio();
                }
                case 'S' -> {
                    do {
                        stato = vaiSotto(labirinto);
                    } while (stato == 0);
                    stampaLabirinto(labirinto);
                    spazio();
                }
                case 'D' -> {
                    do {
                        stato = vaiADestra(labirinto);
                    } while (stato == 0);
                    stampaLabirinto(labirinto);
                    spazio();
                }
                default -> System.out.print("Mossa non valida. Inserisci una mossa: ");
            }
        }
        System.out.println("HAI VINTO!");
    }
}
