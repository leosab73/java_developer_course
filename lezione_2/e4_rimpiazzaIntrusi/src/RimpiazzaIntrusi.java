import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String a=sc.nextLine();
        System.out.print("Enter string:");
        String b=sc.nextLine();
        System.out.print("Enter string:");
        String c=sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b , String c) {
        String[] splitted = c.split(" ");
        splitted[1] = splitted[1].replaceAll(a, b);
        System.out.println(splitted[0]+" "+splitted[1]+" "+splitted[2]);
    }
}
