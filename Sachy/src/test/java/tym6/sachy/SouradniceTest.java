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
 * @author Libor
 */
public class SouradniceTest {

    @Test
    public void testGetX() {
        System.out.println("getX");
        Souradnice instance = new Souradnice(5, 6);
        int expResult = 5;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 6;
        Souradnice instance = new Souradnice (0, 1);
        instance.setX(x);
        assertEquals(x, instance.getX());
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        Souradnice instance = new Souradnice(4, 3);
        int expResult = 3;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 5;
        Souradnice instance = new Souradnice (4,2);
        instance.setY(y);
        assertEquals(y, instance.getY());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Souradnice instance = new Souradnice(5, 4);
        String expResult = "Souradnice{x=5, y=4}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
