import java.util.Objects;

public class Interruttore {
    private Lampadina lampadina;

    public Interruttore (Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    public void accendiLampadina() {
        if (Objects.equals(lampadina.getStato(), "Accesa")) {
            System.out.println("La lampadina è già accesa");
        } else {
            lampadina.cambiaStato();
        }
    }

    public void spegniLampadina() {
        if (Objects.equals(lampadina.getStato(), "Spenta")) {
            System.out.println("La lampadina è già spenta");
        } else if (Objects.equals(lampadina.getStato(), "Rotta")) {
            System.out.println("La lampadina è già spenta");
        } else {
            lampadina.cambiaStato();
        }
    }
}
