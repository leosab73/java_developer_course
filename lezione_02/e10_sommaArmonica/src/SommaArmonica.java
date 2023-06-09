public class SommaArmonica {
    public static void main(String[] args) {
        System.out.println(harmonicSum(0) == (0));
        System.out.println(harmonicSum(1) == (1));
        System.out.println(harmonicSum(2) == (1.5));
        System.out.println(harmonicSum(20) == (55835135./15519504));
    }

    private static double harmonicSum(int n) {
        double sum = 0;
        if (n==0) {
            System.out.println("Valore di n non consentito");
        } else {
            for (int i = 1; i <= n; i++) {
                sum +=  ((double) 1 /i);
            }
        }
        return sum;
    }
}


