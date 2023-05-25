import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        stringReverse(a);
    }

    static void stringReverse(String s) {
        int n = s.length();
        char[] nuovaStringa = new char[n];
        for (int i = 0; i < n; i++) {
            nuovaStringa[n-1-i] = s.charAt(i);
        }
        String stringa = new String(nuovaStringa);
        System.out.println(stringa);
    }
}

