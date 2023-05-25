import java.util.Scanner;

public class NumeriPerfetti {
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        System.out.print("Insert number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + ": is perfect");
            } else {
                System.out.println(i + ": is not perfect");
            }
        }
    }
}

