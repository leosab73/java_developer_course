import java.util.Scanner;

public class FormeMain {
    public static void main(String[] args) {
        System.out.println("Inserisci il lato del quadrato: ");
        Scanner input = new Scanner(System.in);
        double lato = input.nextDouble();
        Quadrato quadrato = new Quadrato(lato);
        System.out.println("Inserisci il raggio del cerchio: ");
        double raggio = input.nextDouble();
        Cerchio cerchio = new Cerchio(raggio);
        System.out.println("Il perimetro del quadrato è: " +
                quadrato.perimetroQuadrato() + ", l'area del quadrato è: " + quadrato.areaQuadrato());
        System.out.println("La circonferenza del cerchio misura: " + cerchio.circonferenza() +
                ", l'area del cerchio misura: " + cerchio.areaCerchio());
    }
}
