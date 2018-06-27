/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moznemoves;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Dama implements Figurka {
        
    MozneMoves mm = new MozneMoves();
    
    private int[] souradnice;
    char barva;
    
    public Dama(int[] souradnice, char barva){      
        this.souradnice = souradnice;
        this.barva = barva;
    }

    @Override
    public int[] getSouradnice() {
        return souradnice;
    }        

    @Override
    public void mozneTahy(int[] spur) {
        
    }

    @Override
    public char getBarva() {
        return barva;
    }
}
