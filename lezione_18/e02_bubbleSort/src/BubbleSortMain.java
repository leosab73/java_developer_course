public class BubbleSortMain {

    public static void bubbleSort(double[] array) {
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static double[] riempiArray(int dimensione) {
        double[] data = new double[dimensione];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.random();
        }
        return data;
    }

    public static long misuraEsecuzione(double[] data) {
        long start = System.nanoTime();
        bubbleSort(data);
        long end = System.nanoTime();
        return end - start;
    }


    public static void main(String[] args) {
        double[] vettore1 = riempiArray(100);
        double[] vettore2 = riempiArray(1000);
        double[] vettore3 = riempiArray(1000000);

        System.out.println(misuraEsecuzione(vettore1));
        System.out.println(misuraEsecuzione(vettore2));
        System.out.println(misuraEsecuzione(vettore3));
    }
}
