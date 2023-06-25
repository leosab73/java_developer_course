package veicolo;

import enumerazioni.Carburante;
import enumerazioni.Patente;

public class Furgone extends VeicoloMotorizzato {

    public Furgone(String id, String targa, Carburante carburante) {
        super(id, targa, carburante, -7, -13, Patente.B);
    }
}
