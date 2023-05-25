import java.util.Scanner;

public class MaxMin {
    public static int[] parseNumbers(String s) {
        String[] value = s.split(",");
        int[] values = new int[value.length];
        for (int i = 0; i < value.length; i++) {
            values[i] = Integer.parseInt(value[i]);
        }
        return values;
    }

    public static void computeMinAndMax(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
        }
        System.out.println("Massimo: " + max);
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }
        System.out.println("Minimo: " + min);
    }

    public static void main(String[] args) {
        System.out.println("Inserisci un array separato da virgole senza spazi: ");
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        int[] values = parseNumbers(numbers);
        computeMinAndMax(values);
    }
}

