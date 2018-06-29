package tym6.sachy;

/**
 * Tato třída slouží pro výpočet pohybu jednotlivých figurek.
 * 
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Pohyb {

    /**
     * Tato metoda vypočítává pohyb figurky po ose Y směrem nahoru.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunUp(int x, int y) {
        if (y > 0) {
            y--;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose Y směrem dolu.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunDown(int x, int y) {
        if (y < 7) {
            y++;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X směrem doleva.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunLeft(int x, int y) {
        if (x > 0) {
            x--;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X směrem doprava.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunRight(int x, int y) {
        if (x < 7) {
            x++;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X a Y směrem nahoru a doprava.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunUpRight(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X a Y směrem dolu a doprava.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunDownRight(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X a Y směrem nahoru a doleva.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunUpLeft(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypočítává pohyb figurky po ose X a Y směrem dolu a doleva.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice PosunDownLeft(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypočítává pohyb koně po ose X a Y směrem nahoru a doprava.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice KunPosunUpRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 7 && y > 1) {
            souradnice = PosunUp(x, y);
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }

    /**
     * Tato metoda vypočítává pohyb koně po ose X a Y směrem dolu a doprava.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice KunPosunDownRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 7 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb koně po ose X a Y směrem nahoru a doleva.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice KunPosunUpLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 0 && y > 1) {
            souradnice = PosunUp(x, y);
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;
    }

    /**
     * Tato metoda vypočítává pohyb koně po ose X a Y směrem dolu a doleva.
     * 
     * @param x Souřadnice na ose x.
     * @param y Souřadnice na ose y.
     * @return Vrací nové souřadnice.
     */
    public static Souradnice KunPosunDownLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 0 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        }
        return souradnice;
    }
    
     public static Souradnice KunPosunUpRightRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 7 && y > 1) {
            souradnice = PosunRight(x, y);
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }
    
    public static Souradnice KunPosunDownRightRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 7 && y > 1) {
            souradnice = PosunRight(x, y);
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }
    
    public static Souradnice KunPosunUpLeftLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 0 && y > 1) {
            souradnice = PosunLeft(x, y);
            souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;
    }
    
    public static Souradnice KunPosunDownLeftLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 0 && y < 7) {
            souradnice = PosunLeft(x, y);
            souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
        }
        return souradnice;
    }

    /**
     * Tato metoda ověřuje, že vypočítané souřadnice jsou stále v daném rozsahu
     * velikosti šachovnice.
     * 
     * @param souradnice Ověřované souřadnice.
     * @return
     */
    public static Souradnice Overeni(Souradnice souradnice) {
        if (souradnice.getX() < 8 && souradnice.getX() >= 0 && souradnice.getY() < 8 && souradnice.getY()>= 0) {
            return souradnice;
        }
        souradnice.setX(-1);
        souradnice.setY(-1);
        return souradnice;
    }
}
