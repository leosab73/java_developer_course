public class Cerchio {
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public double circonferenza() {
        return 2*raggio*Math.PI;
    }

    public double areaCerchio() {
        return Math.pow(raggio, 2)*Math.PI;
    }
}
