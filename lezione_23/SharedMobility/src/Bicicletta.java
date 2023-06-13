public class Bicicletta extends VeicoloNonMotorizzato {
    private final Casco casco = Casco.BICICLETTA;

    public Bicicletta(String ID) {
        super(ID);
    }

    public Casco getCasco() {
        return casco;
    }
}
