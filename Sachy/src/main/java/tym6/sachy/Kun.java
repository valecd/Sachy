package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku koně na hracím poli.
 * Třída obsahuje metody týkající se konkrétního typu figurky.
 * 
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Kun extends Figurka {
    
    private int[][] polePohybu = new int[8][8];
    private char barva;

    /**
     *
     * @param barva
     */
    
    public int[][] mozneTahy() {
        polePohybu = new int[8][8];
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());
        if (true) {
            //System.out.println(xy.getX()+" "+xy.getY());

            xy = Pohyb.KunPosunUpRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
//                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
//                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunUpLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
//                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
//                break;
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
    

        
        return polePohybu;
    }
    
}
