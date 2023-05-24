public class LampadinaMain {
    public static void main(String[] args) {
        Lampadina[] filara = new Lampadina[3];
        filara[0] = new Lampadina("primaLampadina", 20);
        filara[1] = new Lampadina("secondaLampadina", 20);
        filara[2] = new Lampadina("terzaLampadina", 20);
        Interruttore interruttore = new Interruttore(filara);
        interruttore.mettiCorrente();
        System.out.println("Corrente: " + interruttore.getCorrente());
        interruttore.accendiLampadina();
        for (Lampadina lampadina : filara) {
            System.out.println(lampadina.getNome() + ", stato: " + lampadina.getStato());
        }
        interruttore.togliCorrente();
        System.out.println("Corrente: " + interruttore.getCorrente());
        for (Lampadina lampadina : filara) {
            System.out.println(lampadina.getNome() + ", stato: " + lampadina.getStato());
        }
    }
}
