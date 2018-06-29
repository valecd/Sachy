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
 * @author Pavel Beran
 */
public class PohybTest {
    
    
    private static int PosunUp1(int y) {
        if (y > 0) {
            y--;
        }      
        return y;
    }
    
    private static int PosunDown1(int y) {
        if (y < 7) {
            y++;
        }
        return y;
    }
    
     private static int PosunLeft1(int x) {
        if (x > 0) {
            x--;
        }
        return x;
    }
     
      private static int PosunRight1(int x) {
        if (x < 7) {
            x++;
        }
        return x;
    }
    
    
    @Test
    public void PosunUpTest(){
        assertEquals(7, PosunUp1(8));
        System.out.println("Test proběhl");
            
    }
    
    @Test
    public void PosunDownTest(){
        assertEquals(7, PosunDown1(6));
        System.out.println("Test proběhl");
            
    }
    
    @Test
    public void PosunLeftTest(){
        assertEquals(7, PosunLeft1(8));
        System.out.println("Test proběhl");
            
    }
    
    @Test
    public void PosunRightTest(){
        assertEquals(6, PosunRight1(5));
        System.out.println("Test proběhl");
            
    }
    
     
    @Test
     public void PosunUpRightTest(){
         assertEquals(2,PosunUp1(3));
         assertEquals(2,PosunRight1(1));
         System.out.println("Test proběhl");
         
     }
     
     @Test
     public void PosunDownRightTest(){
         assertEquals(4,PosunDown1(3));
         assertEquals(2,PosunRight1(1));
         System.out.println("Test proběhl");
         
     }
     
     @Test
     public void PosunUpLeftTest(){
         assertEquals(2,PosunUp1(3));
         assertEquals(1,PosunLeft1(2));
         System.out.println("Test proběhl");
         
     }
     
     @Test
     public void PosunDownLeftTest(){
         assertEquals(3,PosunDown1(2));
         assertEquals(1,PosunLeft1(2));
         System.out.println("Test proběhl");
         
     }
    
     @Test
     public void KunPosunUpRightTest(){
         assertEquals(5,PosunRight1(4));
         assertEquals(5,PosunUp1(3)+3);
     }
     
     @Test
     public void KunPosunDownRightTest(){
         assertEquals(5,PosunRight1(4));
         assertEquals(1,PosunDown1(3)-3);
     }
     
     @Test
     public void KunPosunUpLeftTest(){
         assertEquals(3,PosunLeft1(4));
         assertEquals(5,PosunUp1(3)+3);
     }
     
     @Test
     public void KunPosunDownLeftTest(){
         assertEquals(3,PosunLeft1(4));
         assertEquals(1,PosunDown1(3)-3);
     }
     
 
}
