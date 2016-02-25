package Graphique;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//




import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Fenetre extends JFrame {
    public static final int dimentionX = 500;
    public static final int dimentionY = 500;
    private Panneau pan = new Panneau();
    private JPanel container = new JPanel();
    private boolean animated = true;
    private Thread t;

    public Fenetre() {
        this.setTitle("Animation");
        this.setSize(500, 500);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(3);
        this.setContentPane(this.pan);
        this.setVisible(true);
        this.go();
    }

    private void go() {
        boolean vitesse = true;

        while(this.animated) {
            for(int e = 0; e < 5; ++e) {
                int var4 = this.pan.getObj(e).getVitesse();
                this.pan.collision_objet();
                this.pan.collision_contour(e);
                if(!this.pan.getObj(e).getBackX()) {
                    this.pan.getObj(e).moveX(var4);
                } else {
                    this.pan.getObj(e).moveX(-var4);
                }

                if(!this.pan.getObj(e).getBackY()) {
                    this.pan.getObj(e).moveY(var4);
                } else {
                    this.pan.getObj(e).moveY(-var4);
                }
            }

            this.pan.repaint();

            try {
                Thread.sleep(5L);
            } catch (InterruptedException var3) {
                var3.printStackTrace();
            }
        }

    }
}
