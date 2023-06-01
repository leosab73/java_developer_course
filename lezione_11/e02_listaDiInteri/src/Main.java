public class Main {
    public static void main(String[] args) {
        int[] listaIniziale = new int[10];
        listaIniziale[0] = 10;
        listaIniziale[1] = 5;
        listaIniziale[2] = 3;
        listaIniziale[3] = 4;
        listaIniziale[4] = 7;
        listaIniziale[5] = 9;
        listaIniziale[6] = 1;
        listaIniziale[7] = 3;
        listaIniziale[8] = 11;
        listaIniziale[9] = 12;
        ListaOrdinataDiInteri lista = new ListaOrdinataDiInteri(listaIniziale, 0);
        lista.add(8);
        lista.addLast(12);
        lista.add(5,7);
    }
}
