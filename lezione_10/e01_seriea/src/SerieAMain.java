public class SerieAMain {
    public static void main(String[] args) {

        Giocatore kManolas = new Giocatore("001", "Kostantinos", "Manolas");
        Giocatore gervinho = new Giocatore("002", "Lombe", "Gervinho");
        Giocatore[] rosaRoma = new Giocatore[]{kManolas, gervinho};
        Giocatore pGollini = new Giocatore("003", "Pierluigi","Gollini");
        Giocatore tKoopmeiners = new Giocatore("004", "Teun", "Koopmeiners");
        Giocatore[] rosaAta = new Giocatore[]{pGollini, tKoopmeiners};
        Giocatore aMilik = new Giocatore("005", "Arek", "Milik");
        Giocatore pPogba = new Giocatore("006", "Paul", "Pogba");
        Giocatore[] rosaJuve = new Giocatore[]{aMilik, pPogba};
        Giocatore nBarella = new Giocatore("007", "Nicolo", "Barella");
        Giocatore lMartinez = new Giocatore("008", "Lautaro", "Martinez");
        Giocatore[] rosaInter = new Giocatore[]{nBarella, lMartinez};

        Squadra roma = new Squadra("101", "Roma", rosaRoma);
        Squadra atalanta = new Squadra("102", "Atalanta", rosaAta);
        Squadra juventus = new Squadra("103", "Juventus", rosaJuve);
        Squadra inter = new Squadra("104", "Inter", rosaInter);

        Squadra[] campionato = new Squadra[]{roma, atalanta, juventus, inter};

        Classifica classifica = new Classifica(campionato);
        //prima giornata
        System.out.println("***PRIMA GIORNATA***");
        classifica.esitoPartita(roma, 0, atalanta, 1);
        classifica.esitoPartita(juventus, 2, inter, 0);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
        //seconda giornata
        System.out.println("***SECONDA GIORNATA***");
        classifica.esitoPartita(roma, 1, juventus, 0);
        classifica.esitoPartita(inter, 3, atalanta, 2);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
        //terza giornata
        System.out.println("***TERZA GIORNATA***");
        classifica.esitoPartita(roma, 0, inter, 2);
        classifica.esitoPartita(atalanta, 0, juventus, 2);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
        //quarta giornata
        System.out.println("***QUARTA GIORNATA***");
        classifica.esitoPartita(juventus, 1, roma, 1);
        classifica.esitoPartita(atalanta, 2, inter, 3);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
        //quinta giornata
        System.out.println("***QUINTA GIORNATA***");
        classifica.esitoPartita(atalanta, 3, roma, 1);
        classifica.esitoPartita(inter, 1, juventus, 1);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
        //sesta giornata
        System.out.println("***SESTA GIORNATA***");
        classifica.esitoPartita(inter, 3, roma, 1);
        classifica.esitoPartita(juventus, 3, atalanta, 3);
        System.out.println("---CLASSIFICA---");
        classifica.getClassifica();
        System.out.println(" ");
        System.out.println("--Miglior Attacco");
        System.out.println(classifica.getMiglioreAttacco().getNome());
        System.out.println("--Peggior Difesa");
        System.out.println(classifica.getPeggiorDifesa().getNome());
        System.out.println(" ");
        System.out.println(" ");
    }
}