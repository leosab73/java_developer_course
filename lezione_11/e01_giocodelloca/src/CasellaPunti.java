public class CasellaPunti extends Casella {

    public CasellaPunti() {
        super();
    }

    @Override
    public void effettoCasella(Giocatore player, int punti) {
        player.setPunti(player.getPunti() + punti);
    }
}
