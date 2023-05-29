public class Squadra {
    private final String id;         //Identificativo Squadra
    private final String nome;       //Nome Squadra
    private final Giocatore[] rosa;  //Giocatori che formano la rosa
    private int punteggio;  //Quantità di punti che ha conquistato la squadra
    private int golFatti;
    private int golSubiti;

    public Squadra(String id, String nome, Giocatore[] rosa) {
        this.id = id;
        this.nome = nome;
        this.rosa = rosa;
        punteggio = 0;
        golFatti = 0;
        golSubiti = 0;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void getRosa() {
        for (Giocatore giocatore : rosa) {
            System.out.println(giocatore.getId() + ": " + giocatore.getNome() + " " + giocatore.getCognome());
        }
    }

    public int getPunteggio() {
        return punteggio;
    }

    public int getGolFatti() {
        return golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }

    public void setPunteggio(int punti) {
        punteggio += punti;
    }

    public void setGolFatti(int gol) {
        golFatti += gol;
    }

    public void setGolSubiti(int gol) {
        golSubiti = gol;
    }
}
