public class Classifica {
    private Squadra[] classifica;

    public Classifica(Squadra[] squadre) {
        classifica = new Squadra[squadre.length];
        System.arraycopy(squadre, 0, classifica, 0, squadre.length);
    }

    private static void assegnaGol(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite) {
        squadraCasa.setGolFatti(golCasa);
        squadraOspite.setGolFatti(golOspite);
        squadraCasa.setGolSubiti(golOspite);
        squadraOspite.setGolSubiti(golCasa);
    }

    public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite) {
        if (golCasa > golOspite) {
            squadraCasa.setPunteggio(3);
            assegnaGol(squadraCasa, golCasa, squadraOspite, golOspite);
            System.out.println(squadraCasa.getNome() + ": " + golCasa + " - " + squadraOspite.getNome() + ": " + golOspite);
        } else if (golCasa == golOspite) {
            squadraCasa.setPunteggio(1);
            squadraOspite.setPunteggio(1);
            assegnaGol(squadraCasa, golCasa, squadraOspite, golOspite);
            System.out.println(squadraCasa.getNome() + ": " + golCasa + " - " + squadraOspite.getNome() + ": " + golOspite);
        } else {
            squadraOspite.setPunteggio(3);
            assegnaGol(squadraCasa, golCasa, squadraOspite, golOspite);
            System.out.println(squadraCasa.getNome() + ": " + golCasa + " - " + squadraOspite.getNome() + ": " + golOspite);
        }
    }

    private Squadra[] ordinaClassifica() {
        for (int i = 0; i < classifica.length; i++) {
            for (int j = i + 1; j < classifica.length; j++) {
               if (classifica[i].getPunteggio() < classifica[j].getPunteggio()) {
                   Squadra temp = classifica[i];
                   classifica[i] = classifica[j];
                   classifica[j] = temp;
               }
            }
        }
        return classifica;
    }

    public void getClassifica() {
        ordinaClassifica();
        for (Squadra squadra : classifica) {
            System.out.println(squadra.getNome() + ": " + squadra.getPunteggio());
        }
    }

    public Squadra getMiglioreAttacco() {
        Squadra migliorAttacco = classifica[0];
        for (int i = 1; i < classifica.length; i++) {
            if (classifica[i].getGolFatti() > migliorAttacco.getGolFatti()) {
                migliorAttacco = classifica[i];
            }
        }
        return migliorAttacco;
    }

    public Squadra getPeggiorDifesa() {
        Squadra peggiorDifesa = classifica[0];
        for (int i = 1; i < classifica.length; i++) {
            if (classifica[i].getGolSubiti() > peggiorDifesa.getGolSubiti()) {
                peggiorDifesa = classifica[i];
            }
        }
        return peggiorDifesa;
    }
}