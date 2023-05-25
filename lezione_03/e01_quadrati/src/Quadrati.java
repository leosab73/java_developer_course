import java.util.Scanner;

public class Quadrati {

    public static int quadrato(int n) {
        int somma = 0;  //somma di numeri dispari
        for (int i = 0; i < n; i++) {
            somma += 2*i + 1;
        }
        return somma;
    }

    public static void main(String[] args) {
        System.out.println("Inserisci il numero del quale vuoi calcolare il quadrato: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Il quadrato di "+num+" è: "+quadrato(num));
    }
}
