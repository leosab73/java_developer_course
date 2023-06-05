public class PezzoCubo extends Pezzo {
    private static char[][] pezzoCubo = new char[][]{{'X','X'},{'X','X'}};

    public PezzoCubo() {
        super(pezzoCubo);
    }

    public int getAltezza() {
        return pezzoCubo[0].length;
    }

    public int getLarghezza() {
        return pezzoCubo.length;
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
