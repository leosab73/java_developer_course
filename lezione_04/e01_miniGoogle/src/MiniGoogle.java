import java.util.Scanner;

public class MiniGoogle {
    public static void main(String[] args) {
        System.out.println("Inserisci la dimensione dell'array: ");
        Scanner input = new Scanner(System.in);
        int dimensione = input.nextInt();
        int[] vettore = new int[dimensione];
        System.out.println("Inizializza l'array: ");
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = input.nextInt();
        }
        System.out.println("Inserisci il numero da cercare: ");
        int numero = input.nextInt();
        int contatore = 0;
        for (int j : vettore) {
            if (numero == j) {
                contatore++;
            }
        }
        if (contatore>0) {
            System.out.println("Il numero è presente");
        } else {
            System.out.println("Il numero non è presente");
        }
    }
}
