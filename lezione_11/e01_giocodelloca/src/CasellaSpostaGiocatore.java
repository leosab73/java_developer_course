public class CasellaSpostaGiocatore extends Casella{

    public CasellaSpostaGiocatore() {
        super();
    }

    @Override
    public void effettoCasella(Giocatore p, int s) {
        int[] posix = p.getPosizione();
        int x = posix[0]+s;
        int y = posix[1];
        p.setPosizione(x,y);
        p.setPosizione(posix[0], posix[1]);
    }
}
