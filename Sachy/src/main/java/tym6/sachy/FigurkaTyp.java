/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tym6.sachy;

/**
 *
 * @author Valecek, Maca, Beran, Pavlik
 */
public enum FigurkaTyp {
    DAMA, KRAL, KUN, STRELEC, VEZ, PESEC;

    public static String getJmenoTypu(FigurkaTyp typ) {
        String jmeno = "";
        if(typ.equals(DAMA)){
        jmeno = "dama";
        }else if(typ.equals(KRAL)){
        jmeno = "kral";
        }else if(typ.equals(KUN)){
        jmeno = "kun";
        }else if(typ.equals(STRELEC)){
        jmeno = "strelec";
        }else if(typ.equals(VEZ)){
        jmeno = "vez";
        }else if(typ.equals(PESEC)){
        jmeno = "pesec";
        }
        return jmeno;
    }
    
}
