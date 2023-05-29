public class Classifica {
    private Squadra[] classifica;

    public Classifica(Squadra[] squadre) {
        classifica = squadre;
    }

    public esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite) {

    }

    public void getClassifica() {
        for (int i = 0; i < classifica.length; i++) {
            System.out.println(classifica[i]);
        }
    }

    public String getMiglioreAttacco() {

    }

    public String getPeggiorDifesa() {

    }
}