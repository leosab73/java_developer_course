import java.util.Arrays;
public class Negozio {
    private Prodotto[] prodotti = new Prodotto[100];

    public Negozio(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public Negozio() {

    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    @Override
    public String toString() {
        return "Negozio{" +
                "prodotti=" + Arrays.toString(prodotti) +
                '}';
    }

    private int indexFinale() {
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null)
                return i;
        }
        return -1;
    }

    private int indexProdotto(String nomeProdotto) {
        for (int i = 0; i < prodotti.length; i++) {
            if (prodotti[i] == null) {
                return i;
            } else if (prodotti[i].getNome().equals(nomeProdotto)) {
                return i;
            }
        }
        return -1;
    }

    public void aggiungiProdotto(Prodotto p, int quantità) {
        int nuovaQuantita = p.getQuantita() + quantità;
        p.setQuantita(nuovaQuantita);
    }

    public void rata(Prodotto p, int numeroMesi) {
        double prezzo = p.getPrezzo();
        double costoRata = prezzo/numeroMesi;
        System.out.println("Costo della rata mensile: " + costoRata);
    }

    public void rata(Prodotto p, double costoRata) {
        double prezzo = p.getPrezzo();
        int numeroMesi = (int) (prezzo/costoRata);
        System.out.println("Numero rate mensili: " + (numeroMesi + 1));
    }
}
