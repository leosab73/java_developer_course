public class Autocarro extends Veicolo{
    private final double capacitaCarico;

    public Autocarro(String targa, int posti, double capacita) {
        super(targa, posti);
        capacitaCarico = capacita;
    }

    public double getCapacitaCarico() {
        return capacitaCarico;
    }

    public String toString() {
        return numeroTarga + ": " + capacitaCarico + " quintali";
    }
}
