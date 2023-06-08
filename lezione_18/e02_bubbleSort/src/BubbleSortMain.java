public class BubbleSortMain {

    public static void bubbleSort(int[] array) {
        int numeroScambi = 0;
        int n = array.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    numeroScambi++;
                }
            }
            //se due elementi sono già in ordine, questi rimarranno così
            if (!swapped) {
                break;
            }
        }
        System.out.println("Numero scambi: " + numeroScambi);
    }

    public static double[] riempiArray(int dimensione) {
        double[] data = new double[dimensione];
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.random();
        }
        return data;
    }

    public static long misuraEsecuzione(int[] data) {
        long start = System.nanoTime();
        bubbleSort(data);
        long end = System.nanoTime();
        return end - start;
    }

    public static void bubbleSortReverse(double[] data) {
        int n = data.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] < data[j + 1]) { // Inversione del confronto
                    double temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    //caso medio
    public static void main(String[] args) {
        //array di prova numero scambi
        int[] vettore1 = {17, 49, 62, 83, 31, 55, 28, 92, 41, 76,
                63, 98, 12, 36, 70, 24, 89, 45, 52, 77, 94, 68,
                21, 84, 39, 72, 26, 58, 32, 67, 90, 13, 48, 81,
                16, 60, 87, 29, 73, 34, 79, 95, 50, 66, 22, 75,
                40, 56, 85, 43, 69, 27, 91, 38, 54, 80, 10, 65,
                30, 74, 9, 47, 82, 15, 37, 53, 78, 64, 33, 88,
                19, 57, 86, 35, 71, 23, 42, 61, 18, 93, 51, 97,
                46, 11, 25, 59, 96, 20, 44, 100, 3, 7, 1, 8, 4,
                5, 6, 2};
        bubbleSort(vettore1);
    }
}


