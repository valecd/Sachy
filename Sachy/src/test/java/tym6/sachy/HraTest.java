/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class HraTest {

    @Test
    public void testRozestaveniKralBily() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.KRAL, Barva.BILA, Arrays.asList(
                new Souradnice(4, 7)));
    }

    @Test
    public void testRozestaveniKralCerny() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.KRAL, Barva.CERNA, Arrays.asList(
                new Souradnice(4, 0)));
    }

    @Test
    public void testRozestaveniDamaBila() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.DAMA, Barva.BILA, Arrays.asList(
                new Souradnice(3, 7)));
    }

    @Test
    public void testRozestaveniDamaCerna() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.DAMA, Barva.CERNA, Arrays.asList(
                new Souradnice(3, 0)));
    }

    @Test
    public void testRozestaveniKunBily() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.KUN, Barva.BILA, Arrays.asList(
                new Souradnice(1, 7),
                new Souradnice(6, 7)));
    }

    @Test
    public void testRozestaveniKunCerny() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.KUN, Barva.CERNA, Arrays.asList(
                new Souradnice(1, 0),
                new Souradnice(6, 0)));
    }

    @Test
    public void testRozestaveniStrelecBily() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.STRELEC, Barva.BILA, Arrays.asList(
                new Souradnice(2, 7),
                new Souradnice(5, 7)));
    }

    @Test
    public void testRozestaveniStrelecCerny() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.STRELEC, Barva.CERNA, Arrays.asList(
                new Souradnice(2, 0),
                new Souradnice(5, 0)));
    }

    @Test
    public void testRozestaveniVezBila() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.VEZ, Barva.BILA, Arrays.asList(
                new Souradnice(0, 7),
                new Souradnice(7, 7)));
    }

    @Test
    public void testRozestaveniVezCerna() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.VEZ, Barva.CERNA, Arrays.asList(
                new Souradnice(0, 0),
                new Souradnice(7, 0)));
    }
    
        @Test
    public void testRozestaveniPesecBily() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.PESEC, Barva.BILA, Arrays.asList(
                new Souradnice(0, 6),
                new Souradnice(1, 6),
                new Souradnice(2, 6),
                new Souradnice(3, 6),
                new Souradnice(4, 6),
                new Souradnice(5, 6),
                new Souradnice(6, 6),
                new Souradnice(7, 6)));
    }

    @Test
    public void testRozestaveniPesecCerny() {
        Hra hra = new Hra();
        checkPositions(hra, FigurkaTyp.PESEC, Barva.CERNA, Arrays.asList(
                new Souradnice(0, 1),
                new Souradnice(1, 1),
                new Souradnice(2, 1),
                new Souradnice(3, 1),
                new Souradnice(4, 1),
                new Souradnice(5, 1),
                new Souradnice(6, 1),
                new Souradnice(7, 1)));
    }

    /**
     * Zkontroluj, že na všech souřadnicích je figurka dané barvy a nikde jinde
     * není.
     *
     * @param hra
     * @param figurka
     * @param barva
     * @param souradnice
     */
    private void checkPositions(Hra hra, FigurkaTyp expectedTyp, Barva expectedBarva, List<Souradnice> souradnice) {
        Set<Souradnice> souradniceSet = new HashSet<>(souradnice);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Souradnice aktualniSouradnice = new Souradnice(i, j);
                Figurka f = hra.getFigurka(aktualniSouradnice);
                if (souradniceSet.contains(aktualniSouradnice)) {
                    assertNotNull(f);
                    assertEquals(expectedBarva, f.getBarva());
                    assertEquals(expectedTyp, f.getFigurkaTyp());
                    souradniceSet.remove(aktualniSouradnice);
                } else if (f != null) {
                    assertFalse(expectedTyp.equals(f.getFigurkaTyp()) && expectedBarva.equals(f.getBarva()));
                }
            }
        }
        assertEquals(0, souradniceSet.size());
    }
}
