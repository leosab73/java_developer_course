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
}
