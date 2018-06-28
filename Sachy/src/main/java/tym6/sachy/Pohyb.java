package tym6.sachy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
// Třída pro vytváření objektu, reprezentující Pohyb Figurek. 
public class Pohyb {

    public static void main(String[] args) {
        //Deklarace 2 rozměrného pole (Šachovnice) o rozměrech 8x8 políček
        char pole[][] = new char[8][8];
        //Naplnění 2 rozměrného pole ' '
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[j][i] = ' ';
            }
        }

        pole[3][5] = 'X';

        int souradnice[] = PosunUp(0,0);
        System.out.println("x:" + souradnice[0] + " y:" + souradnice[1]);
        //while()
    }
    
    //Pohyb Nahoru ↑
    public static int[] PosunUp(int x, int y) {
        if (y > 0) {
            y--;
            int souradnice[] = {x, y};
            return souradnice;
        }
        int souradnice[] = {-1, -1};
            return souradnice;
    }
    
    //Pohyb Dolu ↓
    public static int[] PosunDown(int x, int y) {
        if (y < 8) {
            y++;
            int souradnice[] = {x, y};
            return souradnice;
        }
        int souradnice[] = {-1, -1};
            return souradnice;
    }

    //Pohyb do Leva ←
    public static int[] PosunLeft(int x, int y) {
        if (x > 0) {
            x--;
        int souradnice[] = {x, y};
            return souradnice;
        }
        int souradnice[] = {-1, -1};
            return souradnice;
    }
    
    //Pohyb do Prava →
    public static int[] PosunRight(int x, int y) {
        if (x < 8) {
            x++;
        int souradnice[] = {x, y};
            return souradnice;
        }
        int souradnice[] = {-1, -1};
            return souradnice;
    }

    //Pohyb Nahoru do Prava / ↑→
    public static int[] PosunUpRight(int x, int y) {
        int souradnice[] = PosunUp(x, y);
        souradnice = PosunRight(souradnice[0], souradnice[1]);
        return Overeni(souradnice, x, y);
    }

    //Pohyb Dolu do Prava \ ↓→
    public static int[] PosunDownRight(int x, int y) {
        int souradnice[] = PosunDown(x, y);
        souradnice = PosunRight(souradnice[0], souradnice[1]);
        return Overeni(souradnice, x, y);
    }

    //Pohyb Nahoru do Leva \ ↑←
    public static int[] PosunUpLeft(int x, int y) {
        int souradnice[] = PosunUp(x, y);
        souradnice = PosunLeft(souradnice[0], souradnice[1]);
        return Overeni(souradnice, x, y);
    }

    //Pohyb Dolu do Leva / ↓←
    public static int[] PosunDownLeft(int x, int y) {
        int souradnice[] = PosunDown(x, y);
        souradnice = PosunLeft(souradnice[0], souradnice[1]);
        return Overeni(souradnice, x, y);
    }

    public static int[] KunPosunUpRight(int x, int y) {
        int souradnice[] = {x, y};
        if (x < 8 && y > 1) {
            souradnice = PosunUp(x, y);
            souradnice = PosunUp(souradnice[0], souradnice[1]);
            souradnice = PosunRight(souradnice[0], souradnice[1]);
            return souradnice;
        }
        return souradnice;

    }

    public static int[] KunPosunDownRight(int x, int y) {
        int souradnice[] = {x, y};
        if (x < 8 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice[0], souradnice[1]);
            souradnice = PosunRight(souradnice[0], souradnice[1]);
            return souradnice;
        }
        return souradnice;
    }

    public static int[] KunPosunUpLeft(int x, int y) {
        int souradnice[] = {x, y};
        if (x > 0 && y > 1) {
        souradnice = PosunUp(x, y);
        souradnice = PosunUp(souradnice[0], souradnice[1]);
        souradnice = PosunLeft(souradnice[0], souradnice[1]);
        return souradnice;
        }
        return souradnice;
    }

    public static int[] KunPosunDownLeft(int x, int y) {
        int souradnice[] = {x, y};
        if (x > 0 && y < 7) {
            souradnice = PosunDown(x, y);
            souradnice = PosunDown(souradnice[0], souradnice[1]);
            souradnice = PosunLeft(souradnice[0], souradnice[1]);
        }
        return souradnice;
    }

    public static int[] Overeni(int souradnice[], int x, int y) {
        if (souradnice[0] < 8 && souradnice[0] >=0&&souradnice[1] < 8 && souradnice[1] >=0) {
            return souradnice;
        }
        souradnice[0] = -1;
        souradnice[1] = -1;
        return souradnice;
    }
}
