/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class HraTest {

    @Test
    public void testRozestaveniDamaBila() {

        Hra hra = new Hra();
        List<Figurka> figurky = new ArrayList<>();
        figurky.add(new Dama(Barva.BILA));

        Dama instance = (Dama) figurky.get(0);
        int expectedX = 3;
        int resultX = instance.getSouradnice().getX();
        int expectedY = 7;
        int resultY = instance.getSouradnice().getY();
        
        assertEquals(expectedX, resultX);
        assertEquals(expectedY, resultY);
    }
}
