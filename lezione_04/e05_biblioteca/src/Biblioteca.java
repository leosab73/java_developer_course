import java.lang.reflect.Array;
import java.util.Arrays;

public class Biblioteca {
    int[] libriDellaBiblioteca;

    public Biblioteca(int[] libri) {
        libriDellaBiblioteca = libri;
    }

    public boolean esisteLibro(int indice) {
        boolean esiste = false;
        for (int i = 0; i < libriDellaBiblioteca.length; i++) {
            if (libriDellaBiblioteca[i] == indice) {
                esiste = true;
            }
        }
        return esiste;
    }

    public int[] getIndiciLibriOrdinati() {
        int[] indiciOrdinati = new int[libriDellaBiblioteca.length];
        Arrays.sort(libriDellaBiblioteca);
        for (int i = 0; i < libriDellaBiblioteca.length; i++) {
            indiciOrdinati[i] = libriDellaBiblioteca[i];
        }
        return indiciOrdinati;
    }
}
