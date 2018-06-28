package tym6.sachy;

/**
 *
 * @author Libor
 */
public class Vez implements Figurka {

    private int[][] polePohybu = new int[8][8];
    private int[] souradnice = new int[2];
    private char barva;

    public Vez(int[] souradnice, char barva) {
        this.souradnice = souradnice;
        this.barva = barva;
    }

    @Override
    public int[] getSouradnice() {
        return souradnice;
    }        

    @Override
    public void mozneTahy() {

        
    }

    @Override
    public char getBarva() {
        return barva;
    }
}
