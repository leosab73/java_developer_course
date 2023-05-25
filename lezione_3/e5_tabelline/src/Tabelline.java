import java.util.Scanner;

public class Tabelline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero n: ");
        System.out.println();
        int n = input.nextInt();
        System.out.print("Inserisci il numero m: ");
        System.out.println();
        int m = input.nextInt();
        int[] tab = new int[m];
        for (int i = 0; i < m; i++) {
            tab[i] = n * i;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(tab[i]+" ");
        }
    }
}
