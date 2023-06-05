public class Giocatore {
    private int punteggio;

    public Giocatore() {
        punteggio = 0;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punti) {
        punteggio += punti;
    }
}
