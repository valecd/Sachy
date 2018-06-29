package tym6.sachy;

import java.util.List;
import java.util.ArrayList;

/**
 * Třída pro vytváření jednotlivých instancí různých her. V této třídě jsou
 * metody obstarávající chod hry.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Hra {

    protected List<Figurka> figurky = new ArrayList<>();

    Hra() {
        figurky.add(new Dama(Barva.CERNA, this, 3, 0));
        figurky.add(new Dama(Barva.CERNA, this, 3, 7));
        /*figurky.add(new Strelec(Barva.CERNA, this));
        figurky.add(new Strelec(Barva.CERNA, this));
        figurky.add(new Strelec(Barva.BILA, this));
        figurky.add(new Strelec(Barva.BILA, this));
        figurky.add(new Kral(Barva.CERNA, this));
        figurky.add(new Kral(Barva.BILA, this));
        figurky.add(new Vez(Barva.CERNA, this));
        figurky.add(new Vez(Barva.CERNA, this));
        figurky.add(new Vez(Barva.BILA, this));
        figurky.add(new Vez(Barva.BILA, this));*/
        /*for (int i = 0; i < 8; i++) {
            figurky.add(new Pesec(Barva.BILA, this));
        }
        for (int i = 0; i < 8; i++) {
            figurky.add(new Pesec(Barva.CERNA, this));
        }*/
    }

    /**
     * Metoda přiřazující figurky do seznamu všech figurek.
     *
     * @param figurka Konkrétní instance třídy jedné z figurek.
     */
    private void pridejFigurku(Figurka figurka) {
        figurky.add(figurka);
    }

    /**
     * Metoda pro odebrání figurky ze seznamu figurek.
     *
     * @param souradnice Souřadnice na kterých se figurka nacházía.
     */
    public void odeberFigurkuFigurkou(Souradnice souradnice) {
        for (int i = 0; i < figurky.size(); i++) {
            if (figurky.get(i).getSouradnice().getX() == souradnice.getX() && figurky.get(i).getSouradnice().getY() == souradnice.getY()) {
                figurky.remove(i);
            }
        }
    }

    /**
     * Metoda pro určení zda se na daném políčku nachází figurka a jaké je
     * barvy.
     *
     * @param x Součadnice osy X.
     * @param y Souřadnice osy Y.
     * @return vrací hodnotu 0,1,2 podle toho co se na poli nachází 0 = nic 1 =
     * cerna 2 = bila
     */
    public int coJeNaPozici(int x, int y) {
        int hodnota = 0;
        for (Figurka fig : figurky) {
            if (fig.getSouradnice().getX() == x && fig.getSouradnice().getY() == y) {
                if (fig.getBarva() == Barva.CERNA) {
                    hodnota = 1;
                } else {
                    hodnota = 2;
                }
            }
        }
        return hodnota;
    }

    public Figurka getFigurku(Souradnice souradnice) {
        for (Figurka fig : this.figurky) {
            if (fig.getSouradnice().getX() == souradnice.getX() && fig.getSouradnice().getY() == souradnice.getY()) {
                return fig;
            }
        }
        return null;
    }

    /**
     * Metoda vracející seznam všech figurek.
     *
     * @return Seznam všech figurek.
     */
    protected List<Figurka> getFigurky() {

        return figurky;

    }

}
