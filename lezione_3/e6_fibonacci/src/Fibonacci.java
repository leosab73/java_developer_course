import java.util.Scanner;

public class Fibonacci {

    public static int valueAt(int n) {
        int[] values = new int[n + 1];
        values[1] = 1;
        for (int i = 2; i <= n; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }
        return values[n];
    }
    public static void main(String[] args) {
        System.out.print("Inserisci il passo n da calcolare della serie di Fibonacci: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int value = valueAt(n);
        System.out.println(value);
    }
}
