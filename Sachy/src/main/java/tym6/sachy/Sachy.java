/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Sachy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dama dama = new Dama();
        dama.mozneTahy();
        Okno okno = new Okno();
        okno.setVisible(true);
        
    }
    
}
