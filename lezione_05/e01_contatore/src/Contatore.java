public class Contatore {
    private int valoreIniziale;

    public Contatore() {
        valoreIniziale = 0;
    }

    public Contatore(int start) {
        valoreIniziale = start;
    }

    public void setValoreIniziale(int nuovoValore) {
        valoreIniziale = nuovoValore;
    }

    public int getValoreIniziale() {
        return valoreIniziale;
    }

    public void incrementa() {
        valoreIniziale++;
    }

    public void resettaAZero() {
        valoreIniziale = 0;
    }

    public void resettaAValore(int nuovoValore) {
        valoreIniziale = nuovoValore;
    }
}
