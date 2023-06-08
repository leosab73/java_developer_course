package actors;

import actors.Ristorante;
import actors.Utente;

import java.util.HashMap;
public class Piattaforma {
    HashMap<String, Utente> utenti = new HashMap<>();
    HashMap<String, Ristorante> ristoranti = new HashMap<>();

    public Piattaforma() { }

    public void registraUtente(Utente user) {
        boolean flag = !utenti.containsKey(user.getNomeUtente());
        if (flag) {
            utenti.put(user.getNomeUtente(), user);
            System.out.println("L'utente: " + user.getNomeUtente() + " è stato registrato correttamente.");
        } else {
            System.out.println("L'utente " + user.getNomeUtente() + " risulta già registrato.");
        }
    }

    public void registraRistorante(Ristorante rest) {
        boolean flag = !ristoranti.containsKey(rest.getNomeRistorante());
        if (flag) {
            ristoranti.put(rest.getNomeRistorante(), rest);
            System.out.println("Il ristorante: " + rest.getNomeRistorante() + " è stato registrato correttamente.");
        } else {
            System.out.println("Il ristorante: " + rest.getNomeRistorante() + " risulta già registrato.");
        }
    }
}
