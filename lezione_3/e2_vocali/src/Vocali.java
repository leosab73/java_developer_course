import java.util.Scanner;

public class Vocali {

    public static int contaVocali(String p) {
        char[] vocali = {'a','e','i','o','u'};
        int nVocali = 0;
        for (int i = 0; i < p.length(); i++) {
            for (char c : vocali) {
                if (c == p.charAt(i)) {
                    nVocali += 1;
                }
            }
        }
        return nVocali;
    }

    public static int contaPunteggiatura(String p) {
        int nPunteggiatura = 0;
        char[] punteggiatura = {',','.',':',';','(',')'};
        for (int i = 0; i < p.length(); i++) {
            for (char c : punteggiatura) {
                if (c == p.charAt(i)) {
                    nPunteggiatura += 1;
                }
            }
        }
        return nPunteggiatura;
    }

    public static int contaSpazi(String p) {
        int nSpazi = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == ' ') {
                nSpazi += 1;
            }
        }
        return nSpazi;
    }

    public static int contaConsonanti(String p) {
        int dim = p.length();
        int voc = contaVocali(p);
        int pun = contaPunteggiatura(p);
        int sp = contaSpazi(p);
        return dim - voc - pun - sp;
    }

    public static void main(String[] args) {
        System.out.println("Inserisci la frase: ");
        Scanner input = new Scanner(System.in);
        String parola = input.nextLine();
        int voc = contaVocali(parola);
        int cons = contaConsonanti(parola);
        System.out.println("Il numero di vocali è: "+voc+", il numero di consonanti è: "+cons);
    }
}