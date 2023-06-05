public abstract class Pezzo {
    private char[][] pezzo;

    public Pezzo(char[][] p) {
        pezzo = new char[p[0].length][p.length];
        for (int i = 0; i < p.length; i++) {
            System.arraycopy(p[i], 0, pezzo[i], 0, p[0].length);
        }
    }

    public abstract void posizionaOggetto(Tetris t);

    public char getParti(int x, int y) {
        return pezzo[x][y];
    }

    abstract int getLarghezza();

    abstract int getAltezza();

    abstract void left();

    abstract void right();

    abstract void rotate();

    abstract void down();
}
