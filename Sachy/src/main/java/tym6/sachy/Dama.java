package tym6.sachy;

import java.awt.Image;
import java.util.ArrayList;

/**
 * Tato třída reprezentuje jednu konkrétní figurku dámy na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Dama extends Figurka {

    private int[][] polePohybu = new int[8][8];

    Dama(Barva barva) {
        super.hra = hra;
        super.barva = barva;
        setJmeno("dama");
        if (barva.equals(Barva.BILA)) {
            setSouradnice(3, 7);

        } else {
            setSouradnice(4, 0);
        }
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
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDownLeft(xy.getX(), xy.getY());
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
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunUp(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDown(xy.getX(), xy.getY());
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
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        /*for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(polePohybu[j][i]);
            }
            System.out.println("");
        }*/
        return polePohybu;
    }
}
