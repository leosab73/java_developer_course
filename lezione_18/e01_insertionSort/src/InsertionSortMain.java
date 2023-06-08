public class InsertionSortMain {

    public static void insertionSort(double[] data) {
        int numeroScambi = 0;
        for (int i = 0; i < data.length; i++) {
            double temp = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
                numeroScambi++;
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

    public static long tempoEsecuzione(double[] data) {
        long start = System.nanoTime();
        insertionSort(data);
        long end = System.nanoTime();
        return end - start;
    }

    //caso medio
    public static void main(String[] args) {
        double[] vettore1 = riempiVettore(100);
        double[] vettore2 = riempiVettore(1000);
        double[] vettore3 = riempiVettore(1000000);
        System.out.println(tempoEsecuzione(vettore1));
        System.out.println(tempoEsecuzione(vettore2));
        System.out.println(tempoEsecuzione(vettore3));
    }
}
