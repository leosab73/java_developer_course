public class Main {

    public static void somma (int start) {
        int n = start + 1;
        System.out.println(n);
        somma(n);
    }
    public static void main(String[] args) {
        somma(1);
    }
}
