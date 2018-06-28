package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku pěšce na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Pesec extends Figurka {

    /**
     *
     * @param barva
     */
    private int[][] polePohybu = new int[8][8];
    private Hra hra;

    Pesec(Barva barva, Hra hra) {
        this.hra = hra;
        super.barva = barva;
        setJmeno("Pesec");
        if (barva.equals(Barva.BILA)) {
            int souradniceX = 0;
            for (int i = 0; i < hra.figurky.size(); i++) {
                if (hra.figurky.get(i).getJmeno().equals("Pesec") && hra.figurky.get(i).getBarva() == Barva.BILA) {
                    souradniceX++;
                }
            }
            setSouradnice(souradniceX, 6);
        } else {
            int souradniceX = 0;
            for (int i = 0; i < hra.figurky.size(); i++) {
                if (hra.figurky.get(i).getJmeno().equals("Pesec") && hra.figurky.get(i).getBarva() == Barva.CERNA) {
                    souradniceX++;
                }
            }
            setSouradnice(souradniceX, 1);
        }
    }

    public int[][] mozneTahy() {
        polePohybu = new int[8][8];
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());
        if (true) {
            if (barva == Barva.BILA) {

                xy = Pohyb.PosunUp(xy.getX(), xy.getY());
                if (xy.getX() == -1 && xy.getY() == -1) {
                } else {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                }
            } else if (barva == Barva.CERNA) {
                xy = Pohyb.PosunDown(xy.getX(), xy.getY());
                if (xy.getX() == -1 && xy.getY() == -1) {
                } else {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                }
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());

        return polePohybu;

    }
}
