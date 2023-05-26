public abstract class Prenotazione {
    private final Preferenza preferenza;
    private final String id;

    public Prenotazione(String identificativo, Preferenza p) {
        id = identificativo;
        preferenza = p;
    }

    public String getId() {
        return id;
    }

    public Preferenza getPreferenza() {
        return preferenza;
    }

    public abstract int getnPosti();

}
