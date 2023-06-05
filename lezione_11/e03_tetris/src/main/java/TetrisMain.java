import java.util.Scanner;

public class TetrisMain {
    public static void main(String[] args) {

        System.out.println("Inserisci dimensione X della tabella: ");
        Scanner input = new Scanner(System.in);
        int dimX = input.nextInt();
        System.out.println("Inserisci dimensione Y della tabella: ");
        int dimY = input.nextInt();
        while (dimX >= 11 && dimY >= 13) {
            System.out.println("Le dimensioni non sono valide");
            System.out.println("Inserisci dimensione X della tabella: ");
            dimX = input.nextInt();
            System.out.println("Inserisci dimensione Y della tabella: ");
            dimY = input.nextInt();
        }

        Tetris tab = new Tetris(dimX, dimY);

        PezzoL pezzoL = new PezzoL();
        PezzoT pezzoT = new PezzoT();
        PezzoS pezzoS = new PezzoS();
        PezzoI pezzoI = new PezzoI();
        PezzoCubo pezzoCubo = new PezzoCubo();

        Giocatore user1 = new Giocatore();

        System.out.println("*** PEZZO L ***");
        tab.posizionaOggetto(pezzoL);
        tab.printaTabella();

        while (tab.trovaSimbolo('*')) {
            System.out.println("Inserisci la mossa");
            System.out.println("A: vai a sinistra");
            System.out.println("D: vai a destra");
            System.out.println("S: ruota");
            System.out.println("Z: vai giù");
            char mossa = input.nextLine().charAt(0);
            while (mossa != 'A' && mossa != 'D' && mossa != 'S' && mossa != 'Z') {
                System.out.println("Mossa non valida. Inserisci una nuova mossa: ");
                mossa = input.nextLine().charAt(0);
            }
            switch (mossa) {
                case 'A':
                    pezzoL.left();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'D':
                    pezzoL.right();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'S':
                    pezzoL.rotate();
                    tab.printaTabella();
                    user1.setPunteggio(2);
                case 'Z':
                    pezzoL.down();
                    tab.printaTabella();
                    user1.setPunteggio(1);
            }
        }

        System.out.println("*** PEZZO T ***");
        tab.posizionaOggetto(pezzoT);
        tab.printaTabella();

        while (tab.trovaSimbolo('#')) {
            System.out.println("Inserisci la mossa");
            System.out.println("A: vai a sinistra");
            System.out.println("D: vai a destra");
            System.out.println("S: ruota");
            System.out.println("Z: vai giù");
            char mossa = input.nextLine().charAt(0);
            while (mossa != 'A' && mossa != 'D' && mossa != 'S' && mossa != 'Z') {
                System.out.println("Mossa non valida. Inserisci una nuova mossa: ");
                mossa = input.nextLine().charAt(0);
            }
            switch (mossa) {
                case 'A':
                    pezzoT.left();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'D':
                    pezzoT.right();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'S':
                    pezzoT.rotate();
                    tab.printaTabella();
                    user1.setPunteggio(2);
                case 'Z':
                    pezzoT.down();
                    tab.printaTabella();
                    user1.setPunteggio(1);
            }
        }

        System.out.println("*** PEZZO S ***");

        tab.printaTabella();
        tab.posizionaOggetto(pezzoS);

        while (tab.trovaSimbolo('O')) {
            System.out.println("Inserisci la mossa");
            System.out.println("A: vai a sinistra");
            System.out.println("D: vai a destra");
            System.out.println("S: ruota");
            System.out.println("Z: vai giù");
            char mossa = input.nextLine().charAt(0);
            while (mossa != 'A' && mossa != 'D' && mossa != 'S' && mossa != 'Z') {
                System.out.println("Mossa non valida. Inserisci una nuova mossa: ");
                mossa = input.nextLine().charAt(0);
            }
            switch (mossa) {
                case 'A':
                    pezzoS.left();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'D':
                    pezzoS.right();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'S':
                    pezzoS.rotate();
                    tab.printaTabella();
                    user1.setPunteggio(2);
                case 'Z':
                    pezzoS.down();
                    tab.printaTabella();
                    user1.setPunteggio(1);
            }
        }

        tab.printaTabella();
        tab.posizionaOggetto(pezzoI);

        while (tab.trovaSimbolo('+')) {
            System.out.println("Inserisci la mossa");
            System.out.println("A: vai a sinistra");
            System.out.println("D: vai a destra");
            System.out.println("S: ruota");
            System.out.println("Z: vai giù");
            char mossa = input.nextLine().charAt(0);
            while (mossa != 'A' && mossa != 'D' && mossa != 'S' && mossa != 'Z') {
                System.out.println("Mossa non valida. Inserisci una nuova mossa: ");
                mossa = input.nextLine().charAt(0);
            }
            switch (mossa) {
                case 'A':
                    pezzoI.left();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'D':
                    pezzoI.right();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'S':
                    pezzoI.rotate();
                    tab.printaTabella();
                    user1.setPunteggio(2);
                case 'Z':
                    pezzoI.down();
                    tab.printaTabella();
                    user1.setPunteggio(1);
            }
        }

        tab.printaTabella();
        tab.posizionaOggetto(pezzoCubo);

        while (tab.trovaSimbolo('X')) {

            System.out.println("Inserisci la mossa");
            System.out.println("A: vai a sinistra");
            System.out.println("D: vai a destra");
            System.out.println("S: ruota");
            System.out.println("Z: vai giù");
            char mossa = input.nextLine().charAt(0);
            while (mossa != 'A' && mossa != 'D' && mossa != 'S' && mossa != 'Z') {
                System.out.println("Mossa non valida. Inserisci una nuova mossa: ");
                mossa = input.nextLine().charAt(0);
            }
            switch (mossa) {
                case 'A':
                    pezzoCubo.left();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'D':
                    pezzoCubo.right();
                    tab.printaTabella();
                    user1.setPunteggio(1);
                case 'S':
                    pezzoCubo.rotate();
                    tab.printaTabella();
                    user1.setPunteggio(2);
                case 'Z':
                    pezzoCubo.down();
                    tab.printaTabella();
                    user1.setPunteggio(1);
            }
        }

        System.out.println("*** TABELLA FINALE ***");
        tab.printaTabella();
        System.out.println("Punteggio giocatore: " + user1.getPunteggio());




        {
            if (pezzo.getLarghezza() == 1) {
                for (int i = 0; i < i + pezzo.getAltezza(); i++) {
                    tabella[i][5] = p.getParti(i, 0);
                }
            } else {
                for (int i = 0; i < i + p.getAltezza(); i++) {
                    for (int j = 5; j < j + p.getLarghezza(); j++) {
                        tabella[i][j] = p.getParti(i, j);
                    }
                }
            }
        }
    }
}
