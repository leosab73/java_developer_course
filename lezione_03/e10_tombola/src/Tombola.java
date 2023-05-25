import java.util.Scanner;

public class Tombola {

    public static void checkNumeri (int[][] cartella, int[] numeri) {
        for (int k : numeri) {
            for (int j = 0; j < 3; j++) {
                for (int t = 0; t < 5; t++) {
                    if (k == cartella[j][t]) {
                        cartella[j][t] = 0;
                    }
                }
            }
        }
    }

    public static int[][] copiaCartella(int[][] cart) {
        int[][] cartellaCopia = new int[3][5];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(cart[i], 0, cartellaCopia[i], 0, 5);
        }
        return cartellaCopia;
    }

    public static int ambo(int[][] cartella) {
        int ambo = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (cartella[i][j] == 0) {
                    if (cartella[i][j+1] == 0) {
                        ambo += 1;
                    }
                }
            }
        }
        return ambo;
    }

    public static int terno(int[][] cartella) {
        int terno = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cartella[i][j] == 0) {
                    if (cartella[i][j+1] == 0) {
                        if (cartella[i][j+2] == 0) {
                            terno += 1;
                        }
                    }
                }
            }
        }
        return terno;
    }

    public static int quaterna(int[][] cartella) {
        int quaterna = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if (cartella[i][j] == 0) {
                    if (cartella[i][j+1] == 0) {
                        if (cartella[i][j+2] == 0) {
                            if (cartella[i][j+3] == 0) {
                                quaterna += 1;
                            }
                        }
                    }
                }
            }
        }
        return quaterna;
    }

    public static int quintina(int[][] cartella) {
        int quintina = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if (cartella[i][j] == 0) {
                    if (cartella[i][j+1] == 0) {
                        if (cartella[i][j+2] == 0) {
                            if (cartella[i][j+3] == 0) {
                                if (cartella[i][j+4] == 0) {
                                    quintina += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return quintina;
    }

    public static boolean verificaTombola(int[][] cartella) {
        boolean tombola = false;
        int somma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                somma += cartella[i][j];
            }
            tombola = somma == 0;
        }
        return tombola;
    }

    public static void main(String[] args) {
        int[][] cartella = new int[3][5];
        System.out.println("Inserisci i valori nella cartella: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                cartella[j][i] = input.nextInt();
            }
        }
        int[][] copia = copiaCartella(cartella);
        System.out.println("Inserisci numeri casuali nel vettore: ");
        int[] numeri = new int[20];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = input.nextInt();
        }
        checkNumeri(copia, numeri);
        System.out.println("Ambo: "+ambo(copia));
        System.out.println("Terno: "+terno(copia));
        System.out.println("Quaterna: "+quaterna(copia));
        System.out.println("Quintina: "+quintina(copia));
        System.out.println("Tombola: "+verificaTombola(copia));
    }
}
