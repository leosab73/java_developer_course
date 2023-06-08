package menu;

import menu.piatti.Hamburger;
import menu.piatti.Bevanda;

import java.util.ArrayList;

public class MenuAmericano extends Menu {
    private ArrayList<Hamburger> listaHamburger = new ArrayList<>();
    private ArrayList<Bevanda> listaBevande = new ArrayList<Bevanda>();

    public MenuAmericano () { }

    public void aggiungiHamburger(Hamburger hamburger) {
        listaHamburger.add(hamburger);
    }

    public void aggiungiBevanda(Bevanda bevanda) {
        listaBevande.add(bevanda);
    }


    @Override
    public String toString() {
        System.out.println("*** MENU AMERICANO ***");
        System.out.println("Hamburger:");
        for (Hamburger hamburger : listaHamburger) {
            System.out.println(hamburger.getNome() + "   €: " + hamburger.getPrezzo());
        }
        System.out.println("Bevande:");
        for (Bevanda bevanda : listaBevande) {
            System.out.println(bevanda.getNome() + "   €: " + bevanda.getPrezzo());
        }
        return null;
    }
}
