package veicolo;

import enumerazioni.Carburante;
import enumerazioni.Patente;

public class Automobile extends VeicoloMotorizzato {

    public Automobile(String id, String targa, Carburante carburante) {
        super(id, targa, carburante, -5, -15, Patente.B);
    }
}
