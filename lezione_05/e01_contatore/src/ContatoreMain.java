public class ContatoreMain {
    public static void main(String[] args) {
        Contatore counter1 = new Contatore();        //crea un contatore inizializzandolo a 0
        Contatore counter2 = new Contatore(1);  //crea un secondo contatore inizializzandolo a 1
        counter1.incrementa();                       //il primo contatore va a 1
        counter2.resettaAZero();                     //il secondo contatore va a 0
        counter1.resettaAValore(3);       //il primo contatore va a 3
        counter2.incrementa();                       //il secondo contatore va a 1
        System.out.println("Primo contatore: " + counter1.getValoreIniziale());
        System.out.println("Secondo contatore: " + counter2.getValoreIniziale());
    }
}
