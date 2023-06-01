public class ListaOrdinataDiInteri {
    private int[] lista;

    public ListaOrdinataDiInteri(int[] l, int senso) {
        lista = new int[l.length];
        if (l.length > 0) {
            System.arraycopy(l, 0, lista, 0, l.length);
        }
        if (senso == 0)
            ordinaCrescente();
        else
            ordinaDecrescente();
    }

    private void ordinaCrescente() {
        for (int i = 1; i < lista.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lista[i] < lista[j]) {
                    int temp = lista[j];
                    lista[j] = lista[i];
                    lista[i] = temp;
                }
            }
        }
    }

    private void ordinaDecrescente() {
        for (int i = 1; i < lista.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lista[i] > lista[j]) {
                    int temp = lista[j];
                    lista[j] = lista[i];
                    lista[i] = temp;
                }
            }
        }
    }

    private int trovaPrimoMaggioreDiK(int k) {
        int indice = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > k) {
                indice = i;
                break;
            }
        }
        return indice;
    }

    public void add(int k) {
        int index = trovaPrimoMaggioreDiK(k);
        int[] vettoreConK = new int[lista.length + 1];
        for (int i = 0; i < vettoreConK.length; i++) {
            if (i < index) {
                vettoreConK[i] = lista[i];
            } else if (i == index) {
                vettoreConK[i] = k;
            } else {
                vettoreConK[i] = lista[i - 1];
            }
        }
        lista = vettoreConK;
    }

    public void add(int k, int j) {
        if (trovaPrimoMaggioreDiK(k) == j) {
            add(k);
        } else {
            System.out.println("L'indice inserito non garantisce l'ordinamento della lista");
        }
    }

    public void addLast(int k) {
        if (trovaPrimoMaggioreDiK(k) == lista.length - 1) {
            add(k);
        } else {
            System.out.println("L'indice inserito non garantisce l'ordinamento della lista");
        }
    }

}
