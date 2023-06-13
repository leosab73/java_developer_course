public abstract class Veicolo {
    private final String ID;
    private double[] posizioneGeografica;
    private boolean affittato;
    private double statoCarburante;
    private final double[] starterPoint = {0.0, 0.0};

    public Veicolo(String ID) {
        this.ID = ID;
        affittato = false;
        statoCarburante = 1.0;
        System.arraycopy(starterPoint, 0, posizioneGeografica, 0, starterPoint.length);
    }

    public String getID() {
        return ID;
    }

    public double[] getPosizioneGeografica() {
        return posizioneGeografica;
    }

    public void setPosizioneGeografica(double[] posizioneGeografica) {
        this.posizioneGeografica = posizioneGeografica;
    }

    public boolean isAffittato() {
        return affittato;
    }

    public void setAffittato(boolean affittato) {
        this.affittato = affittato;
    }

    public double getStatoCarburante() {
        return statoCarburante;
    }

    public void setStatoCarburante(double statoCarburante) {
        this.statoCarburante = statoCarburante;
    }

}
