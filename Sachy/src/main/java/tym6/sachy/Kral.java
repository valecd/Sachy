package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku krále na hracím poli. Třída
 * obsahuje metody týkající se konkrétního typu figurky.
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Kral extends Figurka {

    private int[][] polePohybu = new int[8][8];

    public Kral(Barva barva, Hra hra) {
        super.hra = hra;
        super.barva = barva;
        setJmeno("kral");
        if (barva.equals(Barva.BILA)) {
            setSouradnice(3, 7);

        } else {
            setSouradnice(3, 1);
        }
    }
}
