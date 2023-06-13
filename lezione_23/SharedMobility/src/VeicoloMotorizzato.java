public abstract class VeicoloMotorizzato extends Veicolo {
    private final Carburante carburante;
    private final String targa;
    private final Patente patente;

    public VeicoloMotorizzato(String ID, Carburante c, String t, Patente p) {
        super(ID);
        carburante = c;
        targa = t;
        patente = p;
    }

    public Carburante getCarburante() {
        return carburante;
    }

    public String getTarga() {
        return targa;
    }

    public Patente getPatente() {
        return patente;
    }

}
