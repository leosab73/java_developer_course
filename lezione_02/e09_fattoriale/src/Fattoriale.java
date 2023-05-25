public class Fattoriale {
    public static void main(String[] args) {
        System.out.println(factorial(1) == (0));
        System.out.println(factorial(2) == (2));
        System.out.println(factorial(5) == (120));
        System.out.println(factorial(10) == (3628800));
        System.out.println(factorial(20) == 2432902008176640000L);
    }

    private static long factorial(int n) {
        long fatt;
        if (n==0) {
            fatt = 1;
        } else {
            fatt = 1;
            for (int i = 0; i < n; i++) {
                fatt = fatt * (n-i);
            }
        }
        return fatt;
    }
}
