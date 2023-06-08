public class Interessi {
    private final int codice;
    private final String testo;

    public Interessi(int cod, String text) {
        codice = cod;
        testo = text;
    }

    public int getCodice() {
        return codice;
    }

    public String getTesto() {
        return testo;
    }
}
