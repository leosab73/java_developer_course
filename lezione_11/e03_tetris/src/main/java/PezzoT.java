public class PezzoT extends Pezzo {
    private static char[][] pezzoT = new char[][] {{'#','#','#'},{' ','#',' '}};

    public PezzoT() {
        super(pezzoT);
    }

    public int getAltezza() {
        return pezzoT[0].length;
    }

    public int getLarghezza() {
        return pezzoT.length;
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
