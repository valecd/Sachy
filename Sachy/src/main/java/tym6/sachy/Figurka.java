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
public abstract class Figurka {

    // protected final Hra hra;
    private Souradnice souradnice = new Souradnice(0,0);
    private Barva barva = Barva.BILA;
    private int x;
    private int y;

    public Figurka(Barva barva) {
    }

    //  protected int[] getSouradnice()
    public void setSouradnice(int x, int y) {
        souradnice.setX(x);
        souradnice.setY(y);
    }

    public Souradnice getSouradnice() {
        return souradnice;
    }

    // public int[][] mozneTahy()
    public Barva getBarva() {
        return barva;
    }
}
