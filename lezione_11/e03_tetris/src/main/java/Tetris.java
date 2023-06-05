public class Tetris {
    private final char[][] tabella;

    public Tetris(int dimX, int dimY) {
        tabella = new char[dimX][dimY];
    }


    public void printaTabella() {
        for (int i = 0; i < tabella[0].length; i++) {
            for (int j = 0; j < tabella.length; j++) {
                System.out.print(tabella[i][j]);
            }
            System.out.println();
        }
    }

    public boolean trovaSimbolo(char sym) {
        boolean flag = false;
        for (int i = 0; i < tabella.length; i++) {
            if (tabella[tabella.length-1][i] == sym) {
                flag = true;
            }
        }
        return flag;
    }
}
