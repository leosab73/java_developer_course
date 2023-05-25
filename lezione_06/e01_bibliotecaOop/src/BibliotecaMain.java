public class BibliotecaMain {
    public static void main(String[] args) {
        Libro[] books = new Libro[] {
                new Libro(123, "Luciana Litizzetto", "I dolori del giovane Programmatore"),
                new Libro(4, "Super Mario", "Errori da non ripetere"),
                new Libro(98, "Luigi Pirandino", "Uno, nessuno e diecimila bug"),
                new Libro(33, "Roberto Roberti", "Come programmare in Java da zero"),
                new Libro(76, "Piero Java", "Mille splendidi errori"),
                new Libro(2, "Lavinia Pitoni", "Non si esce vivi dalle biblioteche"),
                new Libro(235, "Luciana Litizzetto Jr. ", "I dolori del vecchio programmatore")
        };

        Biblioteca library = new Biblioteca(books);
        System.out.println(library.esisteLibro(76));

        Libro[] booksInLibrary = library.getLibriOrdinati();
        System.out.println(booksInLibrary[0].getIndice() == 2);
        System.out.println(booksInLibrary[1].getIndice() == 4);
        System.out.println(booksInLibrary[2].getIndice() == 33);
        System.out.println(booksInLibrary[3].getIndice() == 76);
        System.out.println(booksInLibrary[4].getIndice() == 98);
        System.out.println(booksInLibrary[5].getIndice() == 123);
        System.out.println(booksInLibrary[6].getIndice() == 235);
    }
}
