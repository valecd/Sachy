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
    protected Hra hra;
    private int[][] polePohybu = new int[8][8];
    private Souradnice souradnice = new Souradnice(0,0);
    private String jmeno;
    protected Barva barva = Barva.BILA;
    private int x;
    private int y;
    
    public String getJmeno(){
        return this.jmeno;
    }
    protected void setJmeno(String jmeno){
        this.jmeno = jmeno;  
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
    public int[][] mozneTahy() {
        return polePohybu;
    }
}
