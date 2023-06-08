package actors;


import menu.Menu;
import java.util.Scanner;

public class Ristorante {
    private String nomeRistorante;
    private Menu[] menu;


    public Ristorante(String nome, int numeroTipiCucine) {
        nomeRistorante = nome;
        Scanner input = new Scanner(System.in);
        while (numeroTipiCucine >= 1  && numeroTipiCucine <= 3) {
            System.out.println("I tipi di cucine sono minimo 1 e massimo 3");
            numeroTipiCucine = input.nextInt();
        }
        input.close();
        menu = new Menu[numeroTipiCucine];
    }

    private String validaRisposta(String answer, Scanner input) {
        while (answer.equals("y")||answer.equals("n")) {
            System.out.println("Risposta non valida");
            System.out.println("Il ristorante ha un menu italiano? [y/n] : ");
            answer = input.nextLine();
        }
        return answer;
    }

    private void tipiCucine() {
        System.out.println("Il ristorante ha un menu italiano? [y/n] : ");
        Scanner input = new Scanner(System.in);
        String answer1 = input.nextLine();
        answer1 = validaRisposta(answer1, input);
        System.out.println("Il ristorante ha un menu americano? [y/n] : ");
        String answer2 = input.nextLine();
        answer2 = validaRisposta(answer2, input);
        System.out.println("Il ristorante ha un menu giapponese? [y/n] : ");
        String answer3 = input.nextLine();
        answer3 = validaRisposta(answer3, input);
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

}
