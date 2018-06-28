package tym6.sachy;

/**
 *
 * @author Libor
 */
// Třída pro vytváření objektu, reprezentujího figurku krále.
public class Kral extends Figurka {

    private int[][] polePohybu = new int[8][8];
    private int[] souradnice = new int[2];
    private char barva;

    public Kral(Barva barva) {
        super(barva);
        if (barva.equals(Barva.BILA)) {
        }
    }
}
