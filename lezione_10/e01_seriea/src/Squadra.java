public class Squadra {
    private final String id;
    private final String nome;
    private final Giocatore[] rosa;
    private String punteggio;
    private int golFatti;
    private int golSubiti;

    public static Integer[] acquisiciGol(String esitoPartita, SquadraCasa sc) {
        Integer[] punteggioFormattato = new Integer[3];
        String[] esitoFormattato = esitoPartita.split("-");
        for (int i = 0; i < 2; i++) {
            punteggioFormattato[i] = Integer.parseInt(esitoFormattato[i]);
        }
        if (sc == SquadraCasa.SI) {
            punteggioFormattato[2] = 0;
        } else {
            punteggioFormattato[2] = 1;
        }
        return punteggioFormattato;
    }

    public Squadra(String id, String nome, Giocatore[] rosa, String punteggio) {
        this.id = id;
        this.nome = nome;
        this.rosa = rosa;
        this.punteggio = punteggio;
        Integer[] punteggioFormattato = acquisiciGol(punteggio);
        
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRosa() {
        for (int i = 0; i < rosa.length; i++) {
            return rosa[i].getId() + ": " + rosa[i].getNome() + " " + rosa[i].getCognome();
        }
    }

    public String getPunteggio() {
        return punteggio;
    }

    public int getGolFatti() {
        return golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }
}
