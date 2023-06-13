package veicolo;

import enumerazioni.Carburante;
import enumerazioni.Patente;

public abstract class VeicoloMotorizzato extends Veicolo {
    private final Patente patente;
    private final String targa;
    private final Carburante carburante;
    private double statoCarburante;

    public VeicoloMotorizzato(String id, String targa, Carburante carburante, double tariffa, double consumo, Patente patente) {
        super(id, consumo, tariffa);
        this.targa = targa;
        this.carburante = carburante;
        this.patente = patente;
    }

    public String getTarga() {
        return targa;
    }

    public Carburante getCarburante() {
        return carburante;
    }

    public double getStatoCarburante() {
        return statoCarburante;
    }

    public void setStatoCarburante(double carburante) {
        statoCarburante += carburante;
    }
}
