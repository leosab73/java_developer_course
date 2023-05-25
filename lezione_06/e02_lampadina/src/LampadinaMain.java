public class LampadinaMain {
    public static void main(String[] args) {
        Lampadina light = new Lampadina(20);
        for (int i = 0; i <= light.getNumeroMassimo(); i++) {
            light.cambiaStato();
            System.out.println(light.getStato());
        }
    }
}
