public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double areaQuadrato() {
        return Math.pow(lato, 2);
    }

    public double perimetroQuadrato() {
        return lato*4;
    }
}
