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
 * @author User
 */
public class Dama implements Figurka {
    private boolean[][] polePohybu = new boolean[8][8];
    private int[] souradnice;
    private char barva;
    
    public Dama(int[] souradnice, char barva){      
        this.souradnice = souradnice;
        this.barva = barva;
    }

    Dama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] getSouradnice() {
        return souradnice;
    }        

    @Override
    public void mozneTahy() {
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print(polePohybu[j][i]);
            }
            System.out.println("");
        }
        
    }

    @Override
    public char getBarva() {
        return barva;
    }
}
