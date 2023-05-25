import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        int a=sc.nextInt();
        System.out.print("Enter b:");
        int b=sc.nextInt();
        computeValues(a, b);
    }

    private static void computeValues(int a, int b) {
        int somma = a + b;
        int sottrazione = a - b;
        int prodotto = a * b;
        double divisione = a / b;
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + sottrazione);
        System.out.println("Prodotto: " + prodotto);
        System.out.println("Divisione: " + divisione);
    }
}
