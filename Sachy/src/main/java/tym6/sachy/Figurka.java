package tym6.sachy;

import java.util.HashSet;
import java.util.Set;

/**
 * Tato abstraktní třída slouží jako šablona pro všechny figurky. Nachází se zde
 * metody, které mají všechny figurky stejné.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public abstract class Figurka {

    private Souradnice souradnice = new Souradnice(0, 0);
    protected Barva barva = Barva.BILA;
    protected int x;
    protected int y;
    protected Hra hra;

    public Figurka(Barva barva, Hra hra, int x, int y) {
        this.barva = barva;
        this.hra = hra;
        this.x = x;
        this.y = y;
    }

    /**
     * Tato metoda vrací název figurky.
     *
     * @return Název figurky.
     */
    public abstract FigurkaTyp getFigurkaTyp();

    /**
     * Metoda umožňující nastavit souřadnice na hracím poli pro figurky.
     *
     * @param x Souřadnice osy X.
     * @param y Souřadnice osy Y.
     */
    public void setSouradnice(int x, int y) {
        souradnice.setX(x);
        souradnice.setY(y);
    }

    /**
     * Metoda vracející souřadnice dané figurky.
     *
     * @return Souřadnice figurky.
     */
    public Souradnice getSouradnice() {
        return souradnice;
    }

    /**
     * Metoda vracející barvu dané figurky.
     *
     * @return Barva figurky.
     */
    public Barva getBarva() {
        return barva;
    }

    /**
     * Metoda která vrací to, na jaká políčka se může figurka posunout.
     *
     * @return Dvourozměrné pole, znázorňující políčka na která je možné se
     * posunout
     */
    public Set<Souradnice> mozneTahy() {
        Set<Souradnice> result = new HashSet<>();
        int[][] mozneTahy = vypocitejMozneTahy();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (mozneTahy[j][i] == 1) {
                    result.add(new Souradnice(j, i));
                }
            }
        }
        return result;
    }

    protected abstract int[][] vypocitejMozneTahy();
}
