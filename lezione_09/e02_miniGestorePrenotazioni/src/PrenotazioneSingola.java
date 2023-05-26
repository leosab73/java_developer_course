public class PrenotazioneSingola extends Prenotazione {
    private final int numeroPosti;

    public PrenotazioneSingola(String identificatore, Preferenza pref) {
        super(identificatore, pref);
        numeroPosti = 1;
    }

    public int getnPosti() {
        return numeroPosti;
    }


}
