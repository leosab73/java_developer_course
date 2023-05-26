public class PrenotazioneGruppo extends Prenotazione {
    private final int numeroPosti;

    public PrenotazioneGruppo(String identificativo, int numeroPosti) {
        super(identificativo, Preferenza.ESTERNO);
        this.numeroPosti = numeroPosti;
    }

    public int getnPosti() {
        return numeroPosti;
    }

}
