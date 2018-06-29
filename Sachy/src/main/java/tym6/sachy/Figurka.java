package tym6.sachy;

/**
 * Tato abstraktní třída slouží jako šablona pro všechny figurky. Nachází se zde
 * metody, které mají všechny figurky stejné.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public abstract class Figurka {

    private int[][] polePohybu = new int[8][8];
    private Souradnice souradnice = new Souradnice(0, 0);
    private String jmeno;
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
    public String getJmeno() {
        return this.jmeno;
    }

    /**
     * Tato metoda umožňuje nastavit Název figurky.
     *
     * @param jmeno Název figurky.
     */
    protected void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

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
    public int[][] mozneTahy() {
        return polePohybu;
    }
}
