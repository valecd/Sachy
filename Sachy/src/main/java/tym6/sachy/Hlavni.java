/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import java.util.ArrayList;

/**
 *
 * @author NIKVAL
 */
public class Hlavni {
    ArrayList <Figurka> figurky = new ArrayList<>();
    Hlavni(){
        
    }
    
    public void pridejFigurku(Figurka figurka){
        figurky.add(figurka);
    }
    public void odeberFigurkuFigurkou(int souradnice[]){
        for(Figurka fig : figurky){
            if(fig.getSouradnice()[0]==souradnice[0]&&fig.getSouradnice()[1]==souradnice[1]){
                figurky.remove(fig);
            }
        }
    }
    public void zmenPozici(int puvodniSouradnice[], int novaSouradnice[]){
        for(Figurka fig : figurky){
            if(fig.getSouradnice()[0]==puvodniSouradnice[0]&&fig.getSouradnice()[1]==puvodniSouradnice[1]){
                fig.setSouradnice();
            }
        }
    }
}
