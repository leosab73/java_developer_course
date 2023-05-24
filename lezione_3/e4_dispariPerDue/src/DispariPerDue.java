import java.util.Scanner;

public class DispariPerDue {
    public static void main(String[] args) {
        System.out.println("Inserisci dimensione array: ");
        Scanner input = new Scanner(System.in);
        int dim = input.nextInt();
        int[] valori = new int[dim];
        System.out.println("Inserisci i valori all'interno del vettore: ");
        for (int i = 0; i < valori.length; i++) {
            valori[i] = input.nextInt();
        }
        int[] valoriCopia = new int[valori.length];
        for (int i = 0; i < valoriCopia.length; i++) {
            if (valori[i] % 2 == 0) {
                valoriCopia[i] = valori[i];
            } else {
                valoriCopia[i] = 2*valori[i];
            }
        }
        for (int j : valori) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : valoriCopia) {
            System.out.print(j + " ");
        }
    }
}
