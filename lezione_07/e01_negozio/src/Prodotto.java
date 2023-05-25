public class Prodotto {

    private String nome;
    private double prezzo;
    private int quantita;
    private Tipologia tipo;

    public enum Tipologia {
        ALIMENTARE, NON_ALIMENTARE
    }

    public Prodotto(String nome, double prezzo, int quantita, Tipologia tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.tipo = tipo;
    }

    public Prodotto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Tipologia getTipo() {
        return tipo;
    }

    public void setTipo(Tipologia tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n Prodotto{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", quantita=" + quantita +
                ", tipo=" + tipo +
                '}';
    }
}
