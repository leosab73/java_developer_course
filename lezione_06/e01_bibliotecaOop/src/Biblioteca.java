import java.util.Arrays;
import java.util.Comparator;

public class Biblioteca {
    private Libro[] scaffale;

    public Biblioteca(Libro[] scaffale) {
        this.scaffale = scaffale;
    }

    public boolean esisteLibro(int index) {
        boolean flag = false;
        for (Libro libro : scaffale) {
            if (libro.getIndice() == index) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public Libro[] getLibriOrdinati() {
        Arrays.sort(scaffale, Comparator.comparing(Libro::getIndice));
        return scaffale;
    }


}
