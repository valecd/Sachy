package tym6.sachy;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * Třída sloužící jako grafické rozhraní hry.
 *
 * @author Valeczek, Maca, Beran, Pavlik
 */
public class Okno extends javax.swing.JFrame {

    Boolean prvniSpusteni = true;
    int velikost = 100;
    int posunX = 25;
    int posunY = 25;
    Hra hra;
    Boolean vybrano = false;
    Figurka figur;

    /**
     * Konstruktor třídy Okno
     */
    public Okno() {
        initComponents();
        addMouseListener(new MysListener());
        hra = new Hra();
    }

    /**
     * Metoda pro vytvoření grafické podoby herní desky.
     *
     * @return Vrací obrázek reprezentující herní desku.
     */
    public BufferedImage hraciDeska() {
        BufferedImage bfi = new BufferedImage(850, 850, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gr = bfi.createGraphics();

        char znaky[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < 8; i++) {
            gr.setColor(Color.blue);
            gr.setFont(new Font("Serif", Font.BOLD, 20));
            gr.drawString(znaky[i] + "", velikost / 2 + posunX + i * velikost - 2, 18);
            for (int j = 0; j < 8; j++) {
                gr.setColor(Color.blue);
                gr.setFont(new Font("Serif", Font.BOLD, 20));
                gr.drawString(8 - i + "", 5, velikost / 2 + posunY + i * velikost + 5);
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        gr.setColor(Color.LIGHT_GRAY);
                        gr.fill(new Rectangle(posunX + j * velikost, posunY + i * velikost, velikost, velikost));
                    } else {
                        gr.setColor(Color.DARK_GRAY);
                        gr.fill(new Rectangle(posunX + j * velikost, posunY + i * velikost, velikost, velikost));
                    }
                } else {
                    if (j % 2 == 0) {
                        gr.setColor(Color.DARK_GRAY);
                        gr.fill(new Rectangle(posunX + j * velikost, posunY + i * velikost, velikost, velikost));
                    } else {
                        gr.setColor(Color.LIGHT_GRAY);
                        gr.fill(new Rectangle(posunX + j * velikost, posunY + i * velikost, velikost, velikost));
                    }
                }
            }
        }

        return bfi;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (prvniSpusteni == true) {
            jPanel1.getGraphics().drawImage(hraciDeska(), 0, 0, null);
            prvniSpusteni = false;
        }
    }

    /**
     * Metoda sloužící pro vykreslování jednotlivých figurek na herní desce.
     */
    public void vykresliFigurky() {

        //System.out.println("./"+hra.getFigurky().get(0).getJmeno()+((hra.getFigurky().get(0).getBarva()==Barva.BILA)?"b":"c")+".png");
        for (Figurka fig : hra.getFigurky()) {
            try {
                //BufferedImage img = ImageIO.read(new File("C:\\Users\\NIKVAL\\Documents\\NetBeansProjects\\Sachy\\Sachy\\src\\main\\java\\tym6\\sachy\\damab.png"));
                Image img = ImageIO.read(new File("./src/main/java/tym6/sachy/images/" + fig.getJmeno() + ((fig.getBarva() == Barva.BILA) ? "b" : "c") + ".png"));
                jPanel1.getGraphics().drawImage(img, fig.getSouradnice().getX() * velikost + posunX, fig.getSouradnice().getY() * velikost + posunY, null);

            } catch (IOException ex) {
                Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * Metoda pro hledání skutečných souřadnic konkrétních políček na herní
     * desce. Tato metoda podle poskytnutých, reprezentativních souřadnic,
     * poskytnutých hrou, vrací skutečné souřadnice grafického políčka.
     *
     * @param x Souřadnice osy X poskytnuté hrou.
     * @param y Souřadnice osy Y poskytnuté hrou.
     * @return Skutečné souřadnice v grafickém prostředí.
     */
    public int[] najdiSouradniceCtverce(int x, int y) {
        int pole[] = new int[2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (x >= j * velikost + posunX + this.getInsets().left && x <= j * velikost + posunX + velikost + this.getInsets().left && y >= i * velikost + posunY + this.getInsets().top && y <= i * velikost + posunY + this.getInsets().top + velikost) {
                    //System.out.println("souradnice: "+pole[0]+" i"+i+" "+" y"+y+" "+pole[1]);
                    pole[0] = j * velikost + posunX;
                    pole[1] = i * velikost + posunY;
                    BufferedImage bfi = new BufferedImage(velikost, velikost, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D gr = bfi.createGraphics();
                    gr.setColor(Color.YELLOW);
                    float opacity = 0.5f;
                    gr.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
                    gr.fill(new Rectangle(0, 0, velikost, velikost));
                    //jPanel1.getGraphics().drawImage(bfi, pole[0], pole[1], null);

                    boolean klinutiNaFigurku = false;

                    if (vybrano == true && (figur.getSouradnice().getX() * velikost + posunX != pole[0] || figur.getSouradnice().getY() * velikost + posunY != pole[1])) {
                        if (figur.mozneTahy()[j][i] == 1) {
                            Souradnice sour = new Souradnice(j, i);
                            if (hra.getFigurku(sour) != null) {
                                hra.odeberFigurkuFigurkou(sour);
                            }
                        }
                    } else {
                        for (Figurka fig : hra.getFigurky()) {
                            if (fig.getSouradnice().getX() * velikost + posunX == pole[0] && fig.getSouradnice().getY() * velikost + posunY == pole[1]) {
                                klinutiNaFigurku = true;
                                vybrano = true;
                                figur = fig;
                                jPanel1.getGraphics().drawImage(bfi, pole[0], pole[1], null);
                                for (int k = 0; k < fig.mozneTahy().length; k++) {
                                    for (int p = 0; p < fig.mozneTahy().length; p++) {
                                        if (fig.mozneTahy()[p][k] == 1) {
                                            jPanel1.getGraphics().drawImage(bfi, p * velikost + posunX, k * velikost + posunY, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (klinutiNaFigurku == false) {
                        vybrano = false;
                        //jPanel1.repaint();
                        jPanel1.getGraphics().drawImage(hraciDeska(), 0, 0, null);
                        vykresliFigurky();

                    }

                }
            }
        }
        vykresliFigurky();
        return pole;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(455, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.getGraphics().drawImage(hraciDeska(), 0, 0, null);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    /**
     * Tato třída kontroluje vstupy hráče (kliknutí myší) a reaguje na ně
     */
    private class MysListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent event) {
            int x = event.getX();
            int y = event.getY();
            najdiSouradniceCtverce(x, y);
        }
    }

}
