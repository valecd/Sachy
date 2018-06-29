package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku pěšce na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Pesec extends Figurka {

    private int[][] polePohybu = new int[8][8];
    private Hra hra;

    public Pesec(Barva barva, Hra hra, int x, int y) {
        super(barva, hra, x, y);
        super.barva = barva;
        super.hra = hra;
        super.x = x;
        super.y = y;
        setSouradnice(x, y);
    }

    @Override
    public FigurkaTyp getFigurkaTyp() {
        return FigurkaTyp.PESEC;
    }

    @Override
    protected int[][] vypocitejMozneTahy() {
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
