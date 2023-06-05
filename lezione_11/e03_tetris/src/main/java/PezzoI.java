public class PezzoI extends Pezzo {
    private static char[][] pezzoI = new char[][] {{'+'},{'+'},{'+'},{'+'}};

    public PezzoI() {
        super(pezzoI);
    }

    public int getAltezza() {
        return pezzoI[0].length;
    }

    public int getLarghezza() {
        return pezzoI.length;
    }

    public void left() {

    }

    public void right() {

    }

    public void rotate() {

    }

    public void down() {

    }
}
