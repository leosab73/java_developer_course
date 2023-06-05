public class InsertionSortMain {

    public static void insertionSort(double[] data) {
        for (int i = 0; i < data.length; i++) {
            double temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j+1] = temp;
        }
    }

    public static double[] ordinamentoDecrescente(double[] data) {
        double[] data2 = new double[data.length];
        for (int i = 0; i < data.length; i++) {
            data2[data.length - i - 1] = data[i];
        }
        return data2;
    }


    public static double[] riempiVettore(int dimensione) {
        double[] data = new double[dimensione];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.random();
        }
        return data;
    }

    public static void main(String[] args) {
        
        double[] vettore1 = riempiVettore(100);
        double[] vettore2 = riempiVettore(1000);
        double[] vettore3 = riempiVettore(1000000);

        insertionSort(vettore1);
        double[] decVettore1 = ordinamentoDecrescente(vettore1);
        long start1 = System.nanoTime();
        insertionSort(decVettore1);
        long end1 = System.nanoTime();
        System.out.println("Ends in " + (end1 - start1) + " ns");

        insertionSort(vettore2);
        double[] decVettore2 = ordinamentoDecrescente(vettore2);
        long start2 = System.nanoTime();
        insertionSort(decVettore2);
        long end2 = System.nanoTime();
        System.out.println("Ends in " + (end2 - start2) + " ns");

        insertionSort(vettore3);
        double[] decVettore3 = ordinamentoDecrescente(vettore3);
        long start3 = System.nanoTime();
        insertionSort(decVettore3);
        long end3 = System.nanoTime();
        System.out.println("Ends in " + (end3 - start3) + " ns");
    }
}
