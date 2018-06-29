package tym6.sachy;

/**
 * Tato třída reprezentuje jednu konkrétní figurku koně na hracím poli.
 * Třída obsahuje metody týkající se konkrétního typu figurky.
 * 
 * @author Valecek, Maca, Beran, Pavlik
 */
public class Kun extends Figurka {
    
    private int[][] polePohybu = new int[8][8];
    private char barva;

    public Kun(Barva barva, Hra hra, int x, int y) {
        super(barva, hra, x, y);
        super.barva = barva;
        super.hra = hra;
        super.x = x;
        super.y = y;
        setSouradnice(x, y);
    }
    @Override
    public FigurkaTyp getFigurkaTyp() {
        return FigurkaTyp.KUN;
    }
    
    public int[][] mozneTahy() {
        polePohybu = new int[8][8];
        Souradnice xy = new Souradnice(this.getSouradnice().getX(), this.getSouradnice().getY());
        if (true) {
           
            xy = Pohyb.KunPosunUpRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {

            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunUpLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunUpRightRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownRightRight(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunDownLeftLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
        xy.setX(this.getSouradnice().getX());
        xy.setY(this.getSouradnice().getY());
        if (true) {
            xy = Pohyb.KunPosunUpLeftLeft(xy.getX(), xy.getY());
            if (xy.getX() == -1 && xy.getY() == -1) {
            } else {
                polePohybu[xy.getX()][xy.getY()] = 1;
            }
        }
    

        
        return polePohybu;
    }
    
}
