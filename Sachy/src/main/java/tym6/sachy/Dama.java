package tym6.sachy;

import java.awt.Image;
import java.util.ArrayList;

/**
 * Tato třída reprezentuje jednu konkrétní figurku dámy na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Dama extends Figurka {

    private int[][] polePohybu = new int[8][8];

    public Dama(Barva barva, Hra hra, int x, int y) {
        super(barva, hra, x, y);
        super.barva = barva;
        super.hra = hra;
        super.x = x;
        super.y = y;
        setSouradnice(x, y);
    }

    @Override
    public FigurkaTyp getFigurkaTyp() {
        return FigurkaTyp.DAMA;
    }

        
    /**
     * Metoda pro vybrání konkrétní figurky ze seznamu figurek.
     *
     * @param souradnice Souřadnice na kterých se žádaná figurka nachází.
     * @return Vrací konkrétní figurku.
     */
    /*protected void getFigurku(Souradnice souradnice) {
        for(int i=0; i<Hra.class.figurky.size();i++){
            if(figurky.get(i).getSouradnice().getX()==souradnice.getX()&&figurky.get(i))
        }
    }*/
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
                break;
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

        ///////////////////////////////////////////////////////////
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            //System.out.println(xy.getX()+" "+xy.getY());
            xy = Pohyb.PosunUp(xy.getX(), xy.getY());
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
            xy = Pohyb.PosunDown(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva().equals(Barva.CERNA) && super.getBarva().equals(Barva.BILA)||fg.getBarva().equals(Barva.BILA) && super.getBarva().equals(Barva.CERNA)) {
                    polePohybu[xy.getX()][xy.getY()] = 1;
                    break;
                }
                break;
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
            xy = Pohyb.PosunRight(xy.getX(), xy.getY());
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
            xy = Pohyb.PosunLeft(xy.getX(), xy.getY());
            Figurka fg = getFigurku(xy);
            if (fg.getSouradnice().getX() == xy.getX() && fg.getSouradnice().getY() == xy.getY()) {
                if (fg.getBarva() != this.getBarva()) {
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
