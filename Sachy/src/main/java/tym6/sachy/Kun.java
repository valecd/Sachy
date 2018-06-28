package tym6.sachy;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
//Třída pro vytváření objektu, reprezentujícího figurku koně
public class Kun implements Figurka {

    private int[][] polePohybu = new int[8][8];
    private int[] souradnice = new int[2];
    private char barva;

    public Kun(int[] souradnice, char barva) {
        this.souradnice = souradnice;
        this.barva = barva;
    }

    @Override
    public int[] getSouradnice() {
        return souradnice;
    }

    @Override
    public int[] setSouradnice() {
        return souradnice;
    }

    @Override
    public int[][] mozneTahy() {

        return polePohybu;
    }

    @Override
    public char getBarva() {
        return barva;
    }
}
