/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moznemoves;

/**
 *
 * @author User
 */
public class MozneMoves {

    /**
     * @param args the command line arguments
     */
    public static char[][] pole = new char[8][8];

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

    private static void tiskPole(char[][] pol) {
        System.out.println("Novy stav");
        for (int i = 0; i < pol.length; i++) {
            for (int j = 0; j < pol[0].length; j++) {
                System.out.print(pol[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void naplnPole() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                pole[i][j] = 'o';
            }
        }
    }

    private static void moznostLeva(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y][x - 1] == 'o') {
            pole[y][x - 1] = 'x';
        }
    }

    private static void moznostPrava(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y][x + 1] == 'o') {
            pole[y][x + 1] = 'x';
        }
    }

    private static void moznostNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x] == 'o') {
            pole[y - 1][x] = 'x';
        }
    }

    private static void moznostDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x] == 'o') {
            pole[y + 1][x] = 'x';
        }
    }

    private static void moznostLevaNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x - 1] == 'o') {
            pole[y - 1][x - 1] = 'x';
        }
    }

    private static void moznostLevaDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x - 1] == 'o') {
            pole[y + 1][x - 1] = 'x';
        }
    }

    private static void moznostPravaNahoru(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y - 1][x + 1] == 'o') {
            pole[y - 1][x + 1] = 'x';
        }
    }

    private static void moznostPravaDolu(int x, int y, char figurka) {
        pole[y][x] = figurka;
        if (pole[y + 1][x + 1] == 'o') {
            pole[y + 1][x + 1] = 'x';
        }
    }

}
