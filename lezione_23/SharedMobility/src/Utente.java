import java.util.Scanner;

public class Utente {
    private final String nome;
    private final String cognome;
    private final String dataNascita;
    private final String codiceFiscale;
    private final String id;
    private String[] patenti;
    private boolean casco;
    private double conto;

    public Utente(String nome, String cognome, String dataNascita, String codiceFiscale, String id, boolean casco, double conto, int numeroPatenti) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.id = id;
        this.casco = casco;
        this.conto = conto;
        this.patenti = new String[numeroPatenti];
    }

    public void inserisciPatenti() {
        for (int i = 0; i < patenti.length; i++) {
            System.out.println("Inserisci patente [A, B, C, D]: ");
            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            while ((a.equals("A")||(a.equals("B"))||(a.equals("C"))||(a.equals("D"))) {
                System.out.println("Patente inserita non valida");
                System.out.println("Inserisci patente [A, B, C, D]: ");
                a = input.nextLine();
            }
            patenti[i] = a;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public String getId() {
        return id;
    }

    public String[] getPatenti() {
        return patenti;
    }

    public void aggiungiPatente(String nuovaPatente) {
        String[] nuovePatenti = new String[patenti.length+ 1];
        System.arraycopy(patenti, 0, nuovePatenti, 0, patenti.length);
        nuovePatenti[patenti.length] = nuovaPatente;
        patenti = nuovePatenti;
    }

    public void rimuoviPatente(String patente) {
        String[] nuovePatenti = new String[patenti.length-1];
        for (int i = 0; i < patenti.length; i++) {
            if (patenti[i].equals(patente)) {
                for (int j = i + 1; j < patenti.length; j++) {
                    patenti[j-1] = patenti[j];
                }
            }
        }
        System.arraycopy(patenti, 0, nuovePatenti, 0, nuovePatenti.length);
        patenti = nuovePatenti;
    }

    public boolean isCasco() {
        return casco;
    }

    public void setCasco(boolean casco) {
        this.casco = casco;
    }

    public double getConto() {
        return conto;
    }

    public void setConto(double conto) {
        this.conto = conto;
    }
}
