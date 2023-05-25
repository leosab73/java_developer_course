import java.util.Scanner;

public class ArrayFuso {
    public static int[] riempiVettore(int dimensione) {
        Scanner input2 = new Scanner(System.in);
        int[] vettore = new int[dimensione];
        System.out.println("Inserisci i numeri nel vettore:");
        for (int i = 0; i < vettore.length; i++) {
            vettore[i] = input2.nextInt();
        }
        return vettore;
    }

    public static int[] fondiVettori (int[] primoVettore, int[] secondoVettore) {
        int dimensioneVettoreFuso = primoVettore.length + secondoVettore.length;
        int[] vettoreFuso = new int[dimensioneVettoreFuso];
        System.arraycopy(primoVettore, 0, vettoreFuso, 0, primoVettore.length);
        System.arraycopy(secondoVettore, 0, vettoreFuso, primoVettore.length, secondoVettore.length);
        return vettoreFuso;
    }

    public static void stampaVettore(int[] vettoreDaStampare) {
        for (int j : vettoreDaStampare) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la dimensione del primo vettore: ");
        int dimensione = input.nextInt();
        int[] vettoreUno = riempiVettore(dimensione);
        System.out.print("Inserisci la dimensione del secondo vettore: ");
        dimensione = input.nextInt();
        int[] vettoreDue = riempiVettore(dimensione);
        int[] vettoreFuso = fondiVettori(vettoreUno, vettoreDue);
        stampaVettore(vettoreFuso);
    }
}
