/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Pohyb {

    public static void main(String[] args) {
        char pole[][] = new char[8][8];
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[j][i]=' ';
            }
        }
        
        pole[3][5]='X';
        
        int souradnice[] = PosunUpRight(7,6);
        System.out.println("x:"+souradnice[0]+" y:"+souradnice[1]);
        //while()
    }
    public static int []PosunUp(int x, int y){
        if(y>0){
            y--;
        }
        int souradnice[] = {x,y};
        return souradnice;
    }
    
    public static int []PosunDown(int x, int y){
        if(y<8){
            y++;
        }
        int souradnice[] = {x,y};
        return souradnice;
    }
    
    public static int []PosunLeft(int x, int y){
        if(x>0){
            x--;
        }
        int souradnice[] = {x,y};
        return souradnice;
    }
    
    public static int []PosunRight(int x, int y){
        if(x<8){
            x++;
        }
        int souradnice[] = {x,y};
        return souradnice;
    }
    
    public static int []PosunUpRight(int x, int y){
        int souradnice[] = PosunUp(x,y);
        souradnice = PosunRight(souradnice[0], souradnice[1]);
        if(souradnice[0]==x||souradnice[1]==y){
            souradnice[0] = x;
            souradnice[1] = y;
        }
        return souradnice;
    }
    public static int []PosunDownRight(int x, int y){
        int souradnice[] = PosunDown(x,y);
        souradnice = PosunRight(souradnice[0], souradnice[1]);
        if(souradnice[0]==x||souradnice[1]==y){
            souradnice[0] = x;
            souradnice[1] = y;
        }
        return souradnice;
    }
    public static int []PosunUpLeft(int x, int y){
        int souradnice[] = PosunUp(x,y);
        souradnice = PosunLeft(souradnice[0], souradnice[1]);
        if(souradnice[0]==x||souradnice[1]==y){
            souradnice[0] = x;
            souradnice[1] = y;
        }
        return souradnice;
    }
    public static int []PosunDownLeft(int x, int y){
        int souradnice[] = PosunDown(x,y);
        souradnice = PosunLeft(souradnice[0], souradnice[1]);
        if(souradnice[0]==x||souradnice[1]==y){
            souradnice[0] = x;
            souradnice[1] = y;
        }
        return souradnice;
    }
}
