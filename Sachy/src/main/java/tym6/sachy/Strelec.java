package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku střelce na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Strelec extends Figurka {

    /**
     *
     * @param barva
     */
    private int[][] polePohybu = new int[8][8];

    Strelec(Barva barva, Hra hra) {
        super.hra = hra;
        super.barva = barva;
        setJmeno("strelec");
        if (barva.equals(Barva.BILA)) {
            setSouradnice(4, 7);

        } else {
            setSouradnice(4, 1);
        }
    }

    /**
     * Metoda pro vybrání konkrétní figurky ze seznamu figurek.
     *
     * @param souradnice Souřadnice na kterých se žádaná figurka nachází.
     * @return Vrací konkrétní figurku.
     */
    public Figurka getFigurku(Souradnice souradnice) {
        for (Figurka fig : hra.figurky) {
            if (fig.getSouradnice().getX() == super.getSouradnice().getX() && fig.getSouradnice().getY() == super.getSouradnice().getY()) {
                return fig;
            }
            if (fig.getSouradnice().getX() == souradnice.getX() && fig.getSouradnice().getY() == souradnice.getY()) {
                return fig;
            }
        }
        return null;
    }

    /**
     * Metoda která nabídne políčka, na která je možné se posunout.
     *
     * @return Vrací dvourozměrné pole, kde jsou vyznačena dostupná políčka pro
     * pohyb.
     */
    
    public int[][] mozneTahy() {
        polePohybu = new int[8][8];
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());

        while (true) {
            //System.out.println(xy.getX()+" "+xy.getY());
            xy = Pohyb.PosunUpLeft(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva() != super.getBarva()) {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                    break;
                }
            }
            if (xy.getX() == -1 && xy.getY() == -1 || fg == null) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDownLeft(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva() != super.getBarva()) {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                    break;
                }
            }
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunUpRight(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva() != super.getBarva()) {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                    break;
                }
            }
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDownRight(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva() != super.getBarva()) {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                    break;
                }
            }
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }

        return polePohybu;
    }

}
