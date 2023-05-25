import java.util.Scanner;

public class Crucipuzzle {

    public static char[][] creaCrucipuzzle(int righe, int colonne) {
        char[][] crucipuzzle = new char[righe][colonne];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < righe; i++) {
            System.out.println("Inserisci la riga " + (i + 1));
            for (int j = 0; j < colonne; j++) {
                crucipuzzle[i][j] = input.nextLine().charAt(0);
            }
        }
        return crucipuzzle;
    }

    public static void cercaParola(char[][] c, String p) {
        if (or(c, p)||orac(c, p)||ver(c, p)||verac(c, p)||obab(c, p)||obsdac(c, p)||obba(c, p)||obbaac(c, p)) {
            System.out.println("parola trovata");
        } else {
            System.out.println("parola non trovata");
        }
    }

    //controlla la presenza della parola orizzontalmente
    public static boolean or(char[][] crucipuzzle, String parola) {
       boolean stato = false;
       int counter = 0;
       for (int i  = 0; i < crucipuzzle[0].length; i++) {
          for (int j = 0; j <= crucipuzzle.length - parola.length(); j++) {
              if (crucipuzzle[i][j] == parola.charAt(0)) {
                  for (int k = j + 1; k < j + parola.length() - 1; k++) {
                      if (parola.charAt(k - j) == crucipuzzle[i][k]) {
                          counter++;
                      }
                  }
              }
          }
       }
       if (counter == parola.length()) {
            stato = true;
       }
       return stato;
    }

    //controlla la presenza della parola orizzontalmente ma al contrario: cerca "alorap" anzichè "parola"
    public static boolean orac(char[][] crucipuzzle, String parola) {
        String alContrario = reverse(parola);
        return or(crucipuzzle, alContrario);
    }

    //controlla la presenza della parola verticalmente
    public static boolean ver(char[][] crucipuzzle, String parola) {
        boolean stato = false;
        int counter = 0;
        for (int j = 0; j < crucipuzzle.length; j++) {
            for (int i = 0; i <= crucipuzzle[0].length - parola.length(); i++) {
                if (crucipuzzle[i][j] == parola.charAt(0)) {
                    for (int k = i + 1; k < i + parola.length(); k++) {
                        if (parola.charAt(k - i) == crucipuzzle[k][j]) {
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter == parola.length()) {
            stato = true;
        }
        return stato;
    }

    //controlla la presenza della parola verticalmente ma al contrario: cerca "alorap" anzichè "parola"
    public static boolean verac(char[][] crucipuzzle, String parola) {
        String alContrario = reverse(parola);
        return ver(crucipuzzle, alContrario);
    }

    //controlla la presenza della parola obliquamente dall'alto verso il basso
    public static boolean obab(char[][] crucipuzzle, String parola) {
        boolean stato = false;
        int counter = 0;
        for (int i = 0; i <= crucipuzzle[0].length - parola.length(); i++) {
            for (int j = 0; j <= crucipuzzle.length - parola.length(); j++) {
                if (parola.charAt(0) == crucipuzzle[i][j]) {
                    for (int k = i + 1; k < i + parola.length(); k++) {
                        if (parola.charAt(k - i) == crucipuzzle[k][k-i+j]) {
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter == parola.length()) {
            stato = true;
        }
        return stato;
    }

    //controlla la presenza della parola obliquamente dall'alto verso il basso ma al contrario
    public static boolean obsdac(char[][] crucipuzzle, String parola) {
        String alContrario = reverse(parola);
        return obab(crucipuzzle, alContrario);
    }

    //controlla la presenza della parola obliquamente dal basso verso l'alto
    public static boolean obba(char[][] crucipuzzle, String parola) {
        boolean stato = false;
        int counter = 0;
        for (int i = crucipuzzle[0].length - 1; i >= parola.length() - 1; i--) {
            for (int j = 0; j <= crucipuzzle.length - parola.length() + 1; j++) {
                if (parola.charAt(0) == crucipuzzle[i][j]) {
                    for (int k = i - 1; k > i - parola.length(); k--) {
                        if (crucipuzzle[k][crucipuzzle[0].length - k] == parola.charAt(crucipuzzle[0].length - k)) {
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter == parola.length()) {
            stato = true;
        }
        return stato;
    }

    //controlla la presenza della parola obliquamente dal basso verso l'alto ma al contrario
    public static boolean obbaac(char[][] crucipuzzle, String parola) {
        String alContrario = reverse(parola);
        return obba(crucipuzzle, alContrario);
    }

    //inverte la sequenza dei caratteri di una stringa
    public static String reverse(String allaDritta) {
        return new StringBuilder(allaDritta).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Inserisci numero di righe: ");
        Scanner input = new Scanner(System.in);
        int righe = input.nextInt();
        System.out.println("Inserisci numero di colonne: ");
        int colonne = input.nextInt();
        char[][] crucipuzzle = creaCrucipuzzle(righe, colonne);
        System.out.println("Inserisci la parola da cercare: ");
        String parola = input.nextLine();
        cercaParola(crucipuzzle, parola);
    }
}
