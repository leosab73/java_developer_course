public class Main {
    public static void main(String[] args) {
        Prodotto p1 = new Prodotto("Mela", 3, 20, Prodotto.Tipologia.ALIMENTARE);
        Prodotto p2 = new Prodotto("Pera", 2, 1, Prodotto.Tipologia.ALIMENTARE);
        Prodotto p3 = new Prodotto("Pesca", 4, 30, Prodotto.Tipologia.ALIMENTARE);
        Prodotto p4 = new Prodotto("Libro", 5, 0, Prodotto.Tipologia.NON_ALIMENTARE);

        Negozio n1 = new Negozio();

        n1.aggiungiProdotto(p1, 20);
        n1.aggiungiProdotto(p2, 30);

        System.out.println(n1);

        n1.rata(p1, 10);

    }
}
