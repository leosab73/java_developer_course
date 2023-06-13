package veicolo;

import enumerazioni.Carburante;
import enumerazioni.Patente;

public class Motorino extends VeicoloMotorizzato {

    public Motorino(String id, String targa, Carburante carburante) {
        super(id, targa, carburante, -3, -20, Patente.A);
    }
}
