public class ListaDiInteriMain {
    public static void main(String[] args) {
        ListaDiInteri lista = new ListaDiInteri();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista.length());
        System.out.println(lista.toString());
        System.out.println(lista.contains(3));
        System.out.println(lista.get(2));
        System.out.println(lista.indexOf(3));
        lista.aggiungiAPosizione(2,6);
        System.out.println(lista.toString());
        lista.eliminaPrimaOccorrenza(2);
        System.out.println(lista.toString());
        lista.add(4);
        lista.add(5);
        lista.add(6);
        System.out.println(lista.toString());
        lista.eliminaElementoI(3);
        System.out.println(lista.toString());
    }
}
