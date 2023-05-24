public class LampadinaMain {
    public static void main(String[] args) {
        Lampadina light = new Lampadina(20);
        Interruttore interruttore1 = new Interruttore(light);
        Interruttore interruttore2 = new Interruttore(light);

        interruttore1.accendiLampadina();
        System.out.println(light.getStato());
        interruttore2.spegniLampadina();
        System.out.println(light.getStato());
    }
}
