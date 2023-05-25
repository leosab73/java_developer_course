import java.util.Scanner;

public class Secondi {

    public static int numGiorni(int s) {
        double giorni = (double) s/86400;
        return (int) giorni;
    }

    public static int numOre(int s) {
        int s1 = s - numGiorni(s)*86400;
        double ore = (double) s1 /3600;
        return (int) ore;
    }

    public static int numMin(int s) {
        int s2 = s - numGiorni(s)*86400 - numOre(s)*3600;
        double minuti = (double) s2/60;
        return (int) minuti;
    }

    public static int numSec(int s) {
        return s - numGiorni(s)*86400 - numOre(s)*3600 - numMin(s)*60;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci numeri di secondi: ");
        int sec = input.nextInt();
        System.out.println("Giorni: "+numGiorni(sec)+" Ore: "+numOre(sec)+" Min: "+numMin(sec)
        +" Sec: "+numSec(sec));

    }
}
