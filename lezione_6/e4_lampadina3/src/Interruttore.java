import java.util.Objects;

public class Interruttore {
    private final Lampadina[] lampadine;
    private boolean corrente;

    public Interruttore (Lampadina[] fila) {
        lampadine = fila;
        corrente = false;
    }

    public boolean getCorrente() {
        return corrente;
    }

    public void mettiCorrente() {
        if (corrente) {
            System.out.println("La corrente è già presente");
        } else {
            corrente = true;
        }
    }

    public void accendiLampadina() {
        if (corrente) {
            for (Lampadina lampadina : lampadine) {
                if (Objects.equals(lampadina.getStato(), "Accesa")) {
                    System.out.println("La lampadina è già accesa");
                } else {
                    lampadina.cambiaStato();
                }
            }
        } else {
            System.out.println("Non c'è corrente!");
        }
    }

    public void togliCorrente() {
        if (corrente) {
            corrente = false;
            for (Lampadina lampadina : lampadine) {
                if (Objects.equals(lampadina.getStato(), "Acceso")) {
                    lampadina.cambiaStato();
                }
            }
            System.out.println("Le lampadine sono spente");
        } else {
            System.out.println("Corrente già assente");
        }
    }

    public void spegniLampadina() {
        if (corrente) {
            for (Lampadina lampadina : lampadine) {
                if (Objects.equals(lampadina.getStato(), "Spenta")) {
                    System.out.println("La lampadina è già spenta");
                } else if (Objects.equals(lampadina.getStato(), "Rotta")) {
                    System.out.println("La lampadina è rotta");
                } else {
                    lampadina.cambiaStato();
                }
            }
        }
    }
}
