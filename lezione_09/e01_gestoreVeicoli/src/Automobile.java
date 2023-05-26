public class Automobile extends Veicolo {
    private final int numeroPorte;

    public Automobile(String targa, int posti, int porte) {
        super(targa, posti);
        numeroPorte = porte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public String toString() {
        return numeroTarga + ": " + numeroPorte;
    }
}
