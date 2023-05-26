public abstract class Veicolo {
    protected final String numeroTarga;
    protected final int numeroPosti;

    public Veicolo(String targa, int posti) {
        numeroTarga = targa;
        numeroPosti = posti;
    }

    public String getNumeroTarga() {
        return numeroTarga;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public abstract String toString();
}
