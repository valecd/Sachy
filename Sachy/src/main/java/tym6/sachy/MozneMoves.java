/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

import java.util.ArrayList;

/**
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class MozneMoves {

    /**
     * @param args the command line arguments
     */
    //Vytvoreni statickeho 2 rozmerneho pole (Sachovnice) 8x8 policek
    public static char[][] pole = new char[8][8];
    
    public char[][] generujGraf(ArrayList<Figurka> figurky){
        naplnPole();
        for(int i=0; i<figurky.size(); i++){
            int x = figurky.get(i).getSouradnice()[0];
            int y = figurky.get(i).getSouradnice()[1];
            pole[x][y] = figurky.get(i).getBarva();
        }
        return pole;
    }

    public static void main(String[] args) {
        naplnPole();
        tiskPole(pole);
        moznostLeva(5, 6, 'V');
        moznostLevaNahoru(4, 2, 'K');
        moznostLevaDolu(4, 2, 'K');
        moznostPravaNahoru(4, 2, 'K');
        moznostPravaDolu(4, 2, 'K');
        tiskPole(pole);
    }
    
    //Naplneni pole
    private static void naplnPole() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                pole[i][j] = 'o';
            }
        }
    }
    //Vytisteni pole 2. krok
    private static void tiskPole(char[][] pol) {
        System.out.println("Novy stav");
        for (int i = 0; i < pol.length; i++) {
            for (int j = 0; j < pol[0].length; j++) {
                System.out.print(pol[i][j] + " ");
            }
            System.out.println("");
        }
    }  
    
    //Moznost pohybu figurky v Levo
    private static void moznostLeva(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y][x - 1] == 'o') {
            pole[y][x - 1] = 'x';
        }
    }

    //Moznost pohybu figurky v Pravo
    private static void moznostPrava(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y][x + 1] == 'o') {
            pole[y][x + 1] = 'x';
        }
    }
    
    //Moznost pohybu figurky nahoru
    private static void moznostNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x] == 'o') {
            pole[y - 1][x] = 'x';
        }
    }

    //Moznost pohybu figurky dolu
    private static void moznostDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x] == 'o') {
            pole[y + 1][x] = 'x';
        }
    }

    //Moznost pohybu figurky do leva nahoru (diagonlne) \
    private static void moznostLevaNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x - 1] == 'o') {
            pole[y - 1][x - 1] = 'x';
        }
    }

    //Moznost pohybu figurky do leva dolu (diagonlne) \
    private static void moznostLevaDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x - 1] == 'o') {
            pole[y + 1][x - 1] = 'x';
        }
    }

    //Moznost pohybu figurky do prava nahoru (diagonlne) /
    private static void moznostPravaNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x + 1] == 'o') {
            pole[y - 1][x + 1] = 'x';
        }
    }

    //Moznost pohybu figurky do prava dolu (diagonlne) /
    private static void moznostPravaDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x + 1] == 'o') {
            pole[y + 1][x + 1] = 'x';
        }
    }

}
