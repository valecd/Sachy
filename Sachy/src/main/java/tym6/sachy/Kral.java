package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku krále na hracím poli.
 * Třída obsahuje metody týkající se konkrétního typu figurky.
 * 
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Kral extends Figurka {

    private int[][] polePohybu = new int[8][8];
    private int[] souradnice = new int[2];
    private char barva;

    /**
     *
     * @param barva
     */
    public Kral(Barva barva) {
        //super(barva);
        if (barva.equals(Barva.BILA)) {
        }
    }
}
