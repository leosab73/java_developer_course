import exception.InteresseException;

import java.util.HashMap;

public class Utente {
    private final String nome;
    private final String cognome;
    private final int id;
    private HashMap<Integer, String> mappaInteressi = new HashMap<>();

    public Utente(String name, String lastName, int id) {
        nome = name;
        cognome = lastName;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getId() {
        return id;
    }

    public void aggiungiInteresse(Interessi interesse) throws InteresseException {
        if (mappaInteressi.containsKey(interesse.getCodice()))
            throw new InteresseException();
        else mappaInteressi.put(interesse.getCodice(), interesse.getTesto());
    }

    public
}
