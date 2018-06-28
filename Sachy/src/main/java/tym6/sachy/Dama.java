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
    private int[] souradnice = new int[2];
    private Barva barva;

    public Dama(Barva barva) {
        super(barva);
        if (barva.equals(Barva.BILA)) {
        }
    }

    public int[] getSouradnice() {
        return souradnice;
    }

    public void setSouradnice(int[] souradnice) {
        this.souradnice = souradnice;
    }

    public int[][] mozneTahy() {
        int xy[] = {souradnice[0], souradnice[1]};
        while (true) {
            xy = Pohyb.PosunUpLeft(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
        xy[0] = souradnice[0];
        xy[1] = souradnice[1];
        while (true) {
            xy = Pohyb.PosunDownLeft(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
        /* while (true) {
            xy = Pohyb.PosunUpRight(xy[0], xy[1]);
            if (xy[0] == -1 && xy[1] == -1) {
                break;
            } else {
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
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

    @Override
    public Barva getBarva() {
        return barva;
    }
}
