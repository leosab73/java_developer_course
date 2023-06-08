public class Main {

    public static int somma (int index, int[] numeriNelVettore, int somma) {
        int s = somma + numeriNelVettore[index];
        somma(index + 1, numeriNelVettore, s);
        return index, somma;
    }
    public static void main(String[] args) {
        int[] numeri = {1,2,3,4,5,6,7,8,9,10};
        int i = 0;
        while (i < numeri.length) {
            int[] valori = [somma(0, numeri, 0);]
        }
    }
}
