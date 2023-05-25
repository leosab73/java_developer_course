import java.util.Arrays;

public class ListaDiInteri {
    int[] vettoreIniziale;

    public ListaDiInteri() {
        vettoreIniziale = new int[0];
    }

    public int get(int i) {
        return vettoreIniziale[i];
    }

    public int indexOf(int i) {
        int index = 0;
        for (int j = 0; j < vettoreIniziale.length; j++) {
            if (vettoreIniziale[j] == i) {
                index = j;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "Lista di interi: " + Arrays.toString(vettoreIniziale);
    }

    public int length() {
        return vettoreIniziale.length;
    }

    public boolean contains(int i) {
        for (int j : vettoreIniziale) {
            if (j == i)
                return true;
        }
        return false;
    }

    public void add(int i) {
        int dim = vettoreIniziale.length;
        int[] vettore = new int[dim + 1];
        System.arraycopy(vettoreIniziale, 0, vettore, 0, this.vettoreIniziale.length);
        vettore[dim] = i;
        this.vettoreIniziale = vettore;
    }

    public void aggiungiAPosizione(int i, int p) {
        if (p < vettoreIniziale.length) {
            vettoreIniziale[p] = i;
        } else {
            for (int j = 0; j <= p - vettoreIniziale.length + 1; j++) {
                add(0);
            }
        }
        vettoreIniziale[p - 1] = i;
    }

    public void eliminaPrimaOccorrenza(int i) {
        if (contains(i)) {
            for (int j = 0; j < vettoreIniziale.length; j++) {
                if (vettoreIniziale[j] == i) {
                    for (int k = j + 1; k < vettoreIniziale.length; k++) {
                        vettoreIniziale[k - 1] = vettoreIniziale[k];
                    }
                }
            }
            int[] vettore = new int[vettoreIniziale.length - 1];
            System.arraycopy(vettoreIniziale, 0, vettore, 0, vettore.length);
            vettoreIniziale = vettore;
        } else {
            System.out.println("Numero " + i + " non trovato");
        }
    }

    public void eliminaElementoI(int i) {
        if (i < vettoreIniziale.length && i >= 0) {
            if (i + 1 < vettoreIniziale.length) {
                for (int j = i + 1; j < vettoreIniziale.length; j++) {
                    vettoreIniziale[j - 1] = vettoreIniziale[j];
                }
            }
            int[] vettore = new int[vettoreIniziale.length - 1];
            System.arraycopy(vettoreIniziale, 0, vettore, 0, vettore.length);
            vettoreIniziale = vettore;
        } else {
            System.out.println("Indice non valido");
        }
    }
}
