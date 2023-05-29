public class Classifica {
    private Squadra[] classifica;

    public Classifica(Squadra[] squadre) {
        classifica = squadre;
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
            System.out.println("La squadra " + squadraCasa.getNome() + " vince sulla squadra " + squadraOspite.getNome());
        } else if (golCasa == golOspite) {
            squadraCasa.setPunteggio(1);
            squadraOspite.setPunteggio(1);
            assegnaGol(squadraCasa, golCasa, squadraOspite, golOspite);
            System.out.println("La squadra " + squadraCasa.getNome() + " e la squadra " + squadraOspite.getNome() + " hanno pareggiato");
        } else {
            squadraOspite.setPunteggio(3);
            assegnaGol(squadraCasa, golCasa, squadraOspite, golOspite);
            System.out.println("La squadra " + squadraCasa.getNome() + " vince sulla squadra " + squadraOspite.getNome());
        }
    }

    private void ordinaClassifica() {
        Squadra[] classificaOrdinata = new Squadra[classifica.length];
        classificaOrdinata[0] = classifica[0];
        for (int i = 1; i < classifica.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
               if (classifica[i].getPunteggio() > classifica[j].getPunteggio()) {
                   Squadra temp = classificaOrdinata[i];
                   classificaOrdinata[i] = classificaOrdinata[j];
                   classificaOrdinata[j] = temp;
               }
            }
        }
        classifica = classificaOrdinata;
    }

    public void getClassifica() {
        ordinaClassifica();
        for (Squadra squadra : classifica) {
            System.out.println(squadra);
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