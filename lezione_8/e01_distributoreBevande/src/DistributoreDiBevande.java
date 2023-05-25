import java.util.Objects;

public class DistributoreDiBevande {
    private double importo;
    private double resto;
    private double saldo;
    private Prodotto[] prodotti;

    public DistributoreDiBevande(int quantitaProdotti) {
        prodotti = new Prodotto[quantitaProdotti];
        saldo = 0;
        resto = 0;
        importo = 0;
    }

    public double getImporto() {
        return importo;
    }

    public void getProdotti() {
        for (Prodotto prodotto : prodotti) {
            if (prodotto.getNome() == "caffè" || prodotto.getNome() == "cappuccino") {
                System.out.println(prodotto.getNome());
            }
        }
    }

    public void caricaProdotto(Prodotto p) {

    }

    public void rimuoviProdotto(Prodotto p) {
        for (int i = 0; i < prodotti.length; i++) {
            if (Objects.equals(prodotti[i].getNome(), p.getNome())) {
                for (int j = i + 1; j < prodotti.length; j++) {
                    prodotti[j - 1] = prodotti[j];
                }
            }
        }
        Prodotto[] nuoviProdotti = new Prodotto[prodotti.length - 1];
        System.arraycopy(prodotti, 0, nuoviProdotti, 0, nuoviProdotti.length);
        prodotti = nuoviProdotti;
    }

    public double saldoAttuale() {
        return saldo;
    }

    public double getResto() {
        saldo = 0;
        return resto;
    }

    public void inserisciImporto(double importo) {
        this.importo += importo;
        saldo = importo;
        resto = importo;
    }

    public Prodotto scegliProdotto(String nomeProdotto) {
        for (int i = 0; i < prodotti.length; i++) {
            if (Objects.equals(prodotti[i].getNome(), nomeProdotto)) {
               Prodotto prodottoSelezionato = prodotti[i];
               rimuoviProdotto(prodotti[i]);
               return prodottoSelezionato;
            }
            break;
        }
        return null;
    }
}
