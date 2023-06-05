public class PezzoS extends Pezzo {
    private static char[][] pezzoS = new char[][] {{' ','O','O'},{'O','O',' '}};

    public PezzoS() {
        super(pezzoS);
    }

    public int getAltezza() {
        return pezzoS[0].length;
    }

    public int getLarghezza() {
        return pezzoS.length;
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
