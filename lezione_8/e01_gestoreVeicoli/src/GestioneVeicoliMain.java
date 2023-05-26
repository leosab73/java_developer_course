public class GestioneVeicoliMain {
    public static void main(String[] args) {
        Automobile automobile = new Automobile("CF123RM", 4, 4);
        Autocarro autocarro = new Autocarro("CA133SM", 4, 2);
        System.out.println(automobile.toString());
        System.out.println(autocarro.toString());
    }
}
