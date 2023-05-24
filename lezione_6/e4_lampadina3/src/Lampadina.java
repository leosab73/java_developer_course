import java.util.Objects;

public class Lampadina {
    private String stato;
    private final int numeroMassimo;
    private int contatore;

    public Lampadina(int massimo) {
        stato = "Spenta";
        numeroMassimo = massimo;
        contatore = 0;
    }

    public int getNumeroMassimo() {
        return numeroMassimo;
    }

    public String getStato() {
        return stato;
    }

    public void cambiaStato() {
         if (contatore <= numeroMassimo) {
             if (Objects.equals(stato, "Accesa")) {
                 stato = "Spenta";
             } else if (Objects.equals(stato, "Spenta")) {
                 stato = "Accesa";
             } else {
                 stato = "Rotta";
             }
             contatore++;
         } else {
             System.out.println("Lampadina rotta");
         }
    }
}
