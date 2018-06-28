package tym6.sachy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Pohyb {

    //Pohyb nahoru
    public static Souradnice PosunUp(int x, int y) {
        if (y > 0) {
            y--;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    public static Souradnice PosunDown(int x, int y) {
        if (y < 7) {
            y++;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    public static Souradnice PosunLeft(int x, int y) {
        if (x > 0) {
            x--;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    public static Souradnice PosunRight(int x, int y) {
        if (x < 7) {
            x++;
            Souradnice souradnice = new Souradnice(x, y);
            return souradnice;
        }
        Souradnice souradnice = new Souradnice(-1, -1);
        return souradnice;
    }

    public static Souradnice PosunUpRight(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice, x, y);
    }

    public static Souradnice PosunDownRight(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunRight(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice, x, y);
    }

    public static Souradnice PosunUpLeft(int x, int y) {
        Souradnice souradnice = PosunUp(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice, x, y);
    }

    public static Souradnice PosunDownLeft(int x, int y) {
        Souradnice souradnice = PosunDown(x, y);
        souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        return Overeni(souradnice, x, y);
    }

    public static Souradnice KunPosunUpRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 8 && y > 1) {
            souradnice = PosunUp(x, y);
            souradnice = PosunUp(souradnice.getX(), souradnice.getY());
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;

    }

    public static Souradnice KunPosunDownRight(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x < 8 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            souradnice = PosunRight(souradnice.getX(), souradnice.getY());
            return souradnice;
        }
        return souradnice;
    }

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

    public static Souradnice KunPosunDownLeft(int x, int y) {
        Souradnice souradnice = new Souradnice(x, y);
        if (x > 0 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice.getX(), souradnice.getY());
            souradnice = PosunLeft(souradnice.getX(), souradnice.getY());
        }
        return souradnice;
    }

    public static Souradnice Overeni(Souradnice souradnice, int x, int y) {
        if (souradnice.getX() < 8 && souradnice.getX() >= 0 && souradnice.getY() < 8 && souradnice.getY() >= 0) {
            return souradnice;
        }
        souradnice.setX(-1);
        souradnice.setY(-1);
        return souradnice;
    }
}
