import java.util.Scanner;

public class NumeriPrimi {

    public static int[] trovaNumeriPrimi(int[] v) {
        int count = 0;
        for (int value : v) {
            if (isPrimo(value)) {
                count++;
            }
        }
        int[] primi = new int[count];
        int j = 0;
        for (int k : v) {
            if (isPrimo(k)) {
                primi[j] = k;
                j++;
            }
        }
        return primi;
    }

    public static boolean isPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Inserisci il numero n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }
        int[] primi = trovaNumeriPrimi(v);
        for (int j : primi) {
            System.out.print(j + " ");
        }
    }
}
