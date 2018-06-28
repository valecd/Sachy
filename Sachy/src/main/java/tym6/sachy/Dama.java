package tym6.sachy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Dama extends Figurka {

    private int[][] polePohybu = new int[8][8];

    public Dama(Barva barva) {
        super(barva);
        if (barva.equals(Barva.BILA)) {
        }
    }

    public int[][] mozneTahy() {
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());
        /*while (true) {
            xy = Pohyb.PosunUpLeft(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
        xy[0] = this.getSouradnice().getX();
        xy[1] = this.getSouradnice().getY();
        while (true) {
            xy = Pohyb.PosunDownLeft(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
        xy[0] = this.getSouradnice().getX();
        xy[1] = this.getSouradnice().getY();*/
        while (xy.getX() < 7) {
            xy = Pohyb.PosunUpRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
       /* xy[0] = this.getSouradnice().getX();
        xy[1] = this.getSouradnice().getY();
        while (true) {
            xy = Pohyb.PosunDownRight(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }*/
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(polePohybu[j][i]);
            }
            System.out.println("");
        }
        return polePohybu;
    }
}
