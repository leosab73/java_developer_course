import java.util.Scanner;

public class Anagrammi {

    public static void anagrams(String a, String b) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i)==b.charAt(j)) {
                    counter++;
                    b.replace(b.charAt(j),'-');
                    break;
                }
            }
        }
        if (counter==a.length()) {
            System.out.println("Anagramma");
        } else {
            System.out.println("Non anagramma");
        }

    }

    public static void main(String[] args) {
        System.out.print("Inserisci la prima stringa: ");
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println();
        System.out.print("Inserisci la seconda stringa: ");
        String b = input.nextLine();
        System.out.println();
        anagrams(a,b);
    }
}
