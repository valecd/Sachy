package tym6.sachy;

/**
 * Tato tĹ™Ă­da slouĹľĂ­ pro vĂ˝poÄŤet pohybu jednotlivĂ˝ch figurek.
 * 
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Pohyb {

    /**
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose Y smÄ›rem nahoru.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose Y smÄ›rem dolu.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X smÄ›rem doleva.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X smÄ›rem doprava.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X a Y smÄ›rem nahoru a doprava.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
     */
    public static Souradnice PosunUpRight(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X a Y smÄ›rem dolu a doprava.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
     */
    public static Souradnice PosunDownRight(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X a Y smÄ›rem nahoru a doleva.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
     */
    public static Souradnice PosunUpLeft(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb figurky po ose X a Y smÄ›rem dolu a doleva.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
     */
    public static Souradnice PosunDownLeft(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice);
    }

    /**
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb konÄ› po ose X a Y smÄ›rem nahoru a doprava.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb konÄ› po ose X a Y smÄ›rem dolu a doprava.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb konÄ› po ose X a Y smÄ›rem nahoru a doleva.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
     * Tato metoda vypoÄŤĂ­tĂˇvĂˇ pohyb konÄ› po ose X a Y smÄ›rem dolu a doleva.
     * 
     * @param x SouĹ™adnice na ose x.
     * @param y SouĹ™adnice na ose y.
     * @return VracĂ­ novĂ© souĹ™adnice.
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
        if (x < 6 && y > 0) {
            souradnice = PosunRight(x, y);
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }
    
    public static Souradnice KunPosunDownRightRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 6 && y > 6) {
            souradnice = PosunRight(x, y);
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }
    
    public static Souradnice KunPosunUpLeftLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 1 && y > 0) {
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
     * Tato metoda ovÄ›Ĺ™uje, Ĺľe vypoÄŤĂ­tanĂ© souĹ™adnice jsou stĂˇle v danĂ©m rozsahu
     * velikosti Ĺˇachovnice.
     * 
     * @param souradnice OvÄ›Ĺ™ovanĂ© souĹ™adnice.
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
