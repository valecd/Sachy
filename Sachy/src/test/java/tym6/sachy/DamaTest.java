/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class DamaTest {

    @Test
    public void testMozneTahy() {

        Hra hra = new Hra();
        
        int[][] expResult = {
            {0, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}};
        int[][] result = hra.getFigurka(new Souradnice (0,0)).vypocitejMozneTahy();
        assertArrayEquals(expResult, result);
    }

}
