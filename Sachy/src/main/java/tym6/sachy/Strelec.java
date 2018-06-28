package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku střelce na hracím poli.
 * Třída obsahuje metody týkající se konkrétního typu figurky.
 * 
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Strelec extends Figurka {

    private int[][] polePohybu = new int[8][8];
    /**
     *
     * @param barva
     */
    
   Strelec(Barva barva) {
        super.hra = hra;
        super.barva = barva;
        setJmeno("strelec");
        if (barva.equals(Barva.BILA)) {
            setSouradnice(4, 7);

        } else {
            setSouradnice(4, 0);
        }
    }
    
    
    public int[][] mozneTahy() {
        polePohybu = new int[8][8];
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());
        while (true) {
            
            xy = Pohyb.PosunUpLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDownLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunUpRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        while (true) {
            xy = Pohyb.PosunDownRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
       
        return polePohybu;
    }
    
}
