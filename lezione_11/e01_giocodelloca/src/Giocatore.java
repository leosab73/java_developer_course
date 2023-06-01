public class Giocatore {
    private int[] posizione;
    private int punti;

    public Giocatore() {
        posizione = new int[]{0,0};
        punti = 0;
    }

    public int[] getPosizione() {
        return posizione;
    }

    public int getPunti() {
        return punti;
    }

    public void setPosizione(int lungoX, int lungoY) {
        posizione[0] += lungoX;
        posizione[1] += lungoY;
    }

    public void setPunti(int punti) {
        this.punti += punti;
    }

    public int tiraDadi() {
        int a;
        do {
            a = (int) (Math.random() * 10);
        } while (a >= 1 && a <= 6);
        int b;
        do {
            b = (int) (Math.random() * 10);
        } while (b >= 1 && b <= 6);
        return a + b;
    }
}
