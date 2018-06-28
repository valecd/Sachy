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
        figurky.add(new Dama(Barva.CERNA));
        figurky.add(new Dama(Barva.BILA));
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

    public int coJeNaPozici(int x, int y) {
        int hodnota = 0;//0=nic;1=cerna;2bila
        for (Figurka fig : figurky) {
            if (fig.getSouradnice().getX() == x && fig.getSouradnice().getY() == y) {
                if(fig.getBarva()==Barva.CERNA){
                    hodnota = 1;
                }else{
                    hodnota = 2;
                }
            }
        }
        return hodnota;
    }
    public Figurka getFigurku(Souradnice souradnice){
    for (Figurka fig : figurky) {
            if (fig.getSouradnice().getX() == souradnice.getX() && fig.getSouradnice().getY() == souradnice.getY()) {
                return fig;
            }
        }
        return null;
    }
    public List<Figurka> getFigurky() {
       
        return figurky;

    }

}
