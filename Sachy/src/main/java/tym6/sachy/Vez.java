package tym6.sachy;

/**
 *
 * @author Libor
 */
public class Vez implements Figurka {

    private int[][] polePohybu = new int[8][8];
    private int[] souradnice = new int[2];
    private char barva;

    public Vez(int[] souradnice, char barva) {
        this.souradnice = souradnice;
        this.barva = barva;
    }

    @Override
    public int[] getSouradnice() {
        return souradnice;
    }        

    @Override
    public void mozneTahy() {
        int xy[] = {souradnice[0], souradnice[1]};
        while(true){
            xy = Pohyb.PosunUpLeft(xy[0], xy[1]);
            if(xy[0]==-1&&xy[1]==-1){
                break;
            }else{
                polePohybu[xy[0]][xy[1]] = 1;
            }
        }
        
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.print(polePohybu[j][i]);
            }
            System.out.println("");
        }
        
    }

    @Override
    public char getBarva() {
        return barva;
    }
}
