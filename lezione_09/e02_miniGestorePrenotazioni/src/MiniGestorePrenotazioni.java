import java.util.Objects;

public class MiniGestorePrenotazioni {
    private int numeroPostiInterno;
    private int numeroPostiEsterno;
    private Prenotazione[] prenotazioniInterno;
    private Prenotazione[] prenotazioniEsterno;

    public MiniGestorePrenotazioni(int m, int n) {
        numeroPostiInterno = m;
        numeroPostiEsterno = n;
        prenotazioniInterno = new Prenotazione[0];
        prenotazioniEsterno = new Prenotazione[0];
    }

    public int getNumeroPostiInterno() {
        return numeroPostiInterno;
    }

    public void setNumeroPostiInterno(int postiInterno) {
        numeroPostiInterno = postiInterno;
    }

    public int getNumeroPostiEsterno() {
        return numeroPostiEsterno;
    }

    public void setNumeroPostiEsterno(int postiEsterno) {
        numeroPostiEsterno = postiEsterno;
    }

    public boolean prenota(Prenotazione p) {
        if (p.getPreferenza() == Preferenza.INTERNO) {
            if (numeroPostiInterno - p.getnPosti() >= 0) {
                numeroPostiEsterno -= p.getnPosti();
                add(p);
                return true;
            } else {
                return false;
            }
        } else {
            if (numeroPostiEsterno - p.getnPosti() >= 0) {
                numeroPostiEsterno -= p.getnPosti();
                add(p);
                return true;
            } else {
                return false;
            }
        }
    }

    public void terminaPrenotazione(Prenotazione p) {
        int indice = trovaPrenotazione(p);
        if (p.getPreferenza() == Preferenza.INTERNO) {
            for (int i = indice + 1; i < prenotazioniInterno.length; i++) {
                prenotazioniInterno[i - 1] = prenotazioniInterno[i];
            }
            int dim = prenotazioniInterno.length;
            dim--;
            Prenotazione[] nuovoVettore = new Prenotazione[dim];
            System.arraycopy(prenotazioniInterno, 0, nuovoVettore, 0, nuovoVettore.length);
            prenotazioniInterno = nuovoVettore;
        } else {
            for (int i = indice + 1; i < prenotazioniEsterno.length; i++) {
                prenotazioniEsterno[i - 1] = prenotazioniEsterno[i];
            }
            int dim = prenotazioniEsterno.length;
            dim--;
            Prenotazione[] nuovoVettore = new Prenotazione[dim];
            System.arraycopy(prenotazioniEsterno, 0, nuovoVettore, 0, nuovoVettore.length);
            prenotazioniEsterno = nuovoVettore;
        }
    }

    public Prenotazione[] prenotazioniAttualiInterno() {
        return prenotazioniInterno;
    }

    public Prenotazione[] prenotazioniAttualiEsterno() {
        return prenotazioniEsterno;
    }

    public void add(Prenotazione p) {
        if (p.getPreferenza() == Preferenza.INTERNO) {
            int dim = prenotazioniInterno.length;
            dim++;
            Prenotazione[] nuovoVettore = new Prenotazione[dim];
            System.arraycopy(prenotazioniInterno, 0, nuovoVettore, 0, prenotazioniInterno.length);
            nuovoVettore[dim - 1] = p;
            prenotazioniInterno = nuovoVettore;
        } else {
            int dim = prenotazioniEsterno.length;
            dim++;
            Prenotazione[] nuovoVettore = new Prenotazione[dim];
            System.arraycopy(prenotazioniEsterno, 0, nuovoVettore, 0, prenotazioniEsterno.length);
            nuovoVettore[dim - 1] = p;
            prenotazioniEsterno = nuovoVettore;
        }
    }

    private int trovaPrenotazione(Prenotazione p) {
        int indice = 0;
        if (p.getPreferenza() == Preferenza.INTERNO) {
            for (int i = 0; i < prenotazioniInterno.length; i++) {
                if (Objects.equals(p.getId(), prenotazioniInterno[i].getId())) {
                    indice = i;
                }
            }
        } else {
            for (int i = 0; i < prenotazioniEsterno.length; i++) {
                if (Objects.equals(p.getId(), prenotazioniEsterno[i].getId())) {
                    indice = i;
                }
            }
        }
        return indice;
    }

}
