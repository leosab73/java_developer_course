import java.util.Scanner;

public class SommaDiagonale {
    public static int sommaDiagonali (int[][] matrix) {
        int somma = 0;
        for (int i = 0; i < matrix.length; i++) {
            somma += matrix[i][i];
        }
        return somma;
    }

    public static int sommaDiagonaleScelta (int[][] matrix, boolean scelta) {
        int somma = 0;
        if (scelta) {
            sommaDiagonali(matrix);
        } else {
            for (int i = matrix.length-1; i >= 0; i--) {
                somma += matrix[i][i];
            }
        }
        return somma;
    }

    public static void main(String[] args) {
        System.out.print("Insersci la dimensione della matrice quadrata: ");
        Scanner input = new Scanner(System.in);
        int dimensione = input.nextInt();
        int[][] matrice = new int[dimensione][dimensione];
        System.out.print("Inserisci i valori all'interno della matrice");
        for (int i = 0; i < dimensione; i++) {
            for (int j = 0; j < dimensione; j++) {
                matrice[i][j] = input.nextInt();
            }
        }
        System.out.println("Somma: "+sommaDiagonali(matrice));
        System.out.println("Insersci 1 se vuoi la somma delle diagonali da S a D, 0 da D a S: ");
        int flag = input.nextInt();
        boolean scelta;
        scelta = flag == 1;
        System.out.println("Somma: "+sommaDiagonaleScelta(matrice,scelta));
    }
}
