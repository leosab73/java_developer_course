package veicolo;

import enumerazioni.Carburante;

public abstract class Veicolo {
    private final double consumo;
    private final double tariffa;
    private final String id;
    private double[] posizioneGeografica;
    private boolean affittato;
    private final double[] posizioneIniziale = new double[]{0.0, 0.0};

    public Veicolo(String id, double consumo, double tariffa) {
        this.id = id;
        this.consumo = consumo;
        this.tariffa = tariffa;
        System.arraycopy(posizioneIniziale, 0, posizioneGeografica, 0, posizioneGeografica.length);
        this.affittato = false;
    }

    public double getTariffa() {
        return tariffa;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getId() {
        return id;
    }


    public boolean isAffittato() {
        return affittato;
    }

    public String getPosizione() {
        return posizioneGeografica[0] + ", " + posizioneGeografica[1];
    }

    public void setPosizioneGeografica(double x, double y) {
        posizioneGeografica[0] += x;
        posizioneGeografica[1] += y;
    }


}
