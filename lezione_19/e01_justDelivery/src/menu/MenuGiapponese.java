package menu;

import menu.piatti.Pesce;
import menu.piatti.Primo;

import java.util.ArrayList;

public class MenuGiapponese extends Menu {
    private ArrayList<Primo> listaPrimi = new ArrayList<Primo>();
    private ArrayList<Pesce> listaPesce = new ArrayList<Pesce>();

    public MenuGiapponese () { }

    public void aggiungiPesce(Pesce pesce) {
        listaPesce.add(pesce);
    }

    public void aggiungiPrimo(Primo primo) {
        listaPrimi.add(primo);
    }


    @Override
    public String toString() {
        System.out.println("*** MENU GIAPPONESE ***");
        System.out.println("Pesce Crudo:");
        for (Pesce pesce : listaPesce) {
            System.out.println(pesce.getNome() + "   €: " + pesce.getPrezzo());
        }
        System.out.println("Bevande:");
        for (Primo primo : listaPrimi) {
            System.out.println(primo.getNome() + "   €: " + primo.getPrezzo());
        }
        return null;
    }
}
