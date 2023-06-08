import exception.UtenteGiaRegistratoException;
import exception.UtenteNonTrovatoException;

import java.util.HashMap;
import java.util.Iterator;

public class Piattaforma {
    HashMap<Integer, Utente> mappaUtenti = new HashMap<>();

    public Piattaforma() { }

    public void inserisciUtente(Utente utente) throws UtenteGiaRegistratoException {
        if (mappaUtenti.containsKey(utente.getId()))
            throw new UtenteGiaRegistratoException();
        else mappaUtenti.put(utente.getId(), utente);
    }

    public void rimuoviUtente(Utente utente) throws UtenteNonTrovatoException {
        if (mappaUtenti.containsKey(utente.getId()))
            mappaUtenti.remove(utente.getId());
        else throw new UtenteNonTrovatoException();
    }

    public void verificaInteressi(Utente utente) {
        Iterator<Utente> it = mappaUtenti.values().iterator();
        while (it.hasNext()) {
            Utente temp = it.next();
            temp.
    }

}
