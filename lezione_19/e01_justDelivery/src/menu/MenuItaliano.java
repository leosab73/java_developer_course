package menu;

import menu.piatti.Antipasto;
import menu.piatti.Primo;
import menu.piatti.Secondo;

import java.util.ArrayList;

public class MenuItaliano extends Menu {
    private ArrayList<Antipasto> antipasti = new ArrayList<>();
    private ArrayList<Primo> primi = new ArrayList<>();
    private ArrayList<Secondo> secondi = new ArrayList<>();

    public MenuItaliano () { }

    public void aggiungiAntipasti(Antipasto antipasto) {
        antipasti.add(antipasto);
    }

    public void aggiungiPrimi(Primo primo) {
        primi.add(primo);
    }

    public void aggiungiSecondi(Secondo secondo) {
        secondi.add(secondo);
    }

    @Override
    public String toString() {
        System.out.println("*** MENU ITALIANO ***");
        System.out.println("Antipasti:");
        for (Antipasto antipasto : antipasti) {
            System.out.println(antipasto.getNome() + "   €: " + antipasto.getPrezzo());
        }
        System.out.println("Primi:");
        for (Primo primo : primi) {
            System.out.println(primo.getNome() + "   €: " + primo.getPrezzo());
        }
        System.out.println("Secondi:");
        for (Secondo secondo : secondi) {
            System.out.println(secondo.getNome() + "   €: " + secondo.getPrezzo());
        }
        return null;
    }
}
