public class Libro {
    private int indice;
    private String autore;
    private String nome;

    public Libro(int indice, String autore, String nome) {
        this.indice = indice;
        this.autore = autore;
        this.nome = nome;
    }

    public int getIndice() {
        return indice;
    }

    public String getAutore() {
        return autore;
    }

    public String getNome() {
        return nome;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
