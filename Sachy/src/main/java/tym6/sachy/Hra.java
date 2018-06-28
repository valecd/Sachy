/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author NIKVAL
 */
public class Hra {

    private List<Figurka> figurky = new ArrayList<>();

    Hra() {
        System.out.println("velikost: "+figurky.size());
        figurky.add(new Dama(Barva.CERNA));
        System.out.println("velikost: "+figurky.size());
    }

    private void pridejFigurku(Figurka figurka) {
        figurky.add(figurka);
    }

    public void odeberFigurkuFigurkou(Souradnice souradnice) {
        for (Figurka fig : figurky) {
            if (fig.getSouradnice().getX() == souradnice.getX() && fig.getSouradnice().getY() == souradnice.getY()) {
                figurky.remove(fig);
            }
        }
    }

    /*public void zmenPozici(int puvodniSouradnice[], int novaSouradnice[]) {
        for (Figurka fig : figurky) {
            if (fig.getSouradnice()[0] == puvodniSouradnice[0] && fig.getSouradnice()[1] == puvodniSouradnice[1]) {
                fig.setSouradnice();
            }
        }
    }*/
    public List<Figurka> getFigurky() {
       
        return figurky;

    }

}
