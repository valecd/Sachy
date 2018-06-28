package tym6.sachy;

/**
 * Tato třída slouží jako šablona, která se používá pro práci se souřadnicemi,
 * určujícími pozici na šachovnici.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Souradnice {

    private int x;
    private int y;

    /**
     * Konstruktor třídy.
     *
     * @param x Souřadnice osy X.
     * @param y Souřadnice osy Y.
     */
    public Souradnice(int x, int y) {
        setX(x);
        setY(y);
    }

    /**
     * Vrací hodnotu souřadnice osy X.
     *
     * @return Souřadnice osy X.
     */
    public int getX() {
        return x;
    }

    /**
     * Umožňuje nastavení hodnoty souřadnice osy X.
     *
     * @param x Požadovaná hodnota souřadnice osy X.
     */
    public void setX(int x) {
        checkRange(x);
        this.x = x;
    }

    /**
     * Vrací hodnotu souřadnice osy Y.
     *
     * @return Souřadnice osy Y.
     */
    public int getY() {
        return y;
    }

    /**
     * Umožňuje nastavení hodnoty souřadnice osy Y.
     *
     * @param y Požadovaná hodnota souřadnice osy Y.
     */
    public void setY(int y) {
        checkRange(y);
        this.y = y;
    }

    /**
     * Metoda hlídající hodnoty zadávaných souřadnic.
     * Stará se o to aby hodnota byla v žádaném rozsahu.
     *
     * @param y Zadávaná hodnota.
     */
    private void checkRange(int value) {
        if (value < -1 || value > 8) {//zkontrolovat
            throw new IllegalArgumentException("Souradnice mimo rozsah: " + value);
        }
    }

    @Override
    public String toString() {
        return "Souradnice{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.x;
        hash = 83 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Souradnice other = (Souradnice) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

}
