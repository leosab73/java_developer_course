package veicolo;

import enumerazioni.Carburante;

public class VeicoloNonMotorizzato extends Veicolo {
    private final Carburante carburante = Carburante.ELETTRICO;
    private double statoBatteria;

    public VeicoloNonMotorizzato(String id, double consumo, double tariffa) {
        super(id, consumo, tariffa);
        statoBatteria = 1;
    }

    public String getCarburante() {
        if (this instanceof Bicicletta)
            return "Veicolo senza motore.";
        else return "Elettrico";
    }

    public double getStatoBatteria() {
        return statoBatteria;
    }

    public void setStatoBatteria(double carica) {
        statoBatteria += carica;
    }
}
