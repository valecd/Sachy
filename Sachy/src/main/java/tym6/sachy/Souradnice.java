/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

/**
 *
 * @author Libor
 */
public class Souradnice {

    private int x;
    private int y;

    public Souradnice(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        checkRange(x);
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        checkRange(y);
        this.y = y;
    }

    private void checkRange(int value) {
        if (value < -2 || value > 8) {
            throw new IllegalArgumentException("Souradnice mimo rozsah: " + value);
        }
    }

    @Override
    public String toString() {
        return "Souradnice{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.x;
        hash = 83 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Souradnice other = (Souradnice) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }

}
