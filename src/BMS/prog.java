package BMS;

/*
 * prog.java
 *
 * Created on November 8, 2012, 1:36 PM
 */






import com.easynth.lookandfeel.EaSynthLookAndFeel;
import java.awt.Toolkit;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author  DELL
 */
public class prog extends javax.swing.JFrame {

    /** Creates new form prog */
    public prog() {
        initComponents();
        progressbar();
    }

    void progressbar() {

        new Thread(new Runnable() {

            @SuppressWarnings("empty-statement")
            public void run() {
                int i = 0;
                for (i = 0; i <= 100; i++) {

                    jProgressBar1.setValue(i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                    if (i >= 0 && i <= 10) {
                        jLabel4.setText("5 %");

                    }
                    if (i >= 11 && i <= 20) {
                        jLabel4.setText("15 %");

                    }
                    if (i >= 21 && i <= 30) {
                        jLabel4.setText("25 %");

                    }

                    if (i >= 31 && i <= 40) {
                        jLabel4.setText("35 %");

                    }
                    if (i >= 41 && i <= 50) {
                        jLabel4.setText("45 %");

                    }
                    if (i >= 51 && i <= 60) {
                        jLabel4.setText("55 %");

                    }
                    if (i >= 61 && i <= 70) {
                        jLabel4.setText("65 %");

                    }
                    if (i >= 71 && i <= 80) {
                        jLabel4.setText("75%");

                    }
                    if (i >= 81 && i <= 85) {
                        jLabel4.setText("85%");

                    }
                    if (i >= 86 && i <= 90) {
                        jLabel4.setText("99 %");

                    }
                    if (i == 100) {

                        Toolkit.getDefaultToolkit().beep();
                        m();


                    }

                }

            }
        }).start();

    }

    void m() {


        this.dispose();

        try {
            LookAndFeel look = new EaSynthLookAndFeel();
            UIManager.setLookAndFeel(look);
        } catch (Exception e) {
        }

    new login().setVisible(true);




    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     * 
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(0, 51, 153));
        jProgressBar1.setForeground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(10, 240, 440, 10);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 200, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/untitled3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-50, 0, 540, 380);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-464)/2, (screenSize.height-266)/2, 464, 266);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new prog().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
