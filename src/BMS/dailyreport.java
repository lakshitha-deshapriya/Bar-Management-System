/*
 * dailyreport.java
 *
 * Created on April 26, 2013, 7:17 PM
 */

package BMS;

import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author  Owner
 */
public class dailyreport extends javax.swing.JFrame {
    
    /** Creates new form dailyreport */
    public dailyreport() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REPORT");
        getContentPane().setLayout(null);

        dateChooserCombo1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        getContentPane().add(dateChooserCombo1);
        dateChooserCombo1.setBounds(100, 180, 130, 20);

        jButton1.setFont(new java.awt.Font("Georgia", 3, 14));
        jButton1.setText("Daily Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 170, 140, 30);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel1.setText("Other incomes         :-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 170, 17);

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel2.setText("Balance forwarded :-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 170, 17);

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel3.setText("Billiard room            :-");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 170, 17);

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel4.setText("Guest fees                  :-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 170, 17);

        jLabel5.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel5.setText("Membership fees     :-");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 170, 17);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 10, 100, 21);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 40, 100, 21);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(180, 70, 100, 21);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(180, 100, 100, 21);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(180, 130, 100, 21);

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel6.setText("Bank deposits  :-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 10, 130, 17);

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel7.setText("Other expenses:-");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 40, 130, 17);

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(420, 10, 100, 21);

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField7);
        jTextField7.setBounds(420, 40, 100, 21);

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel8.setText("Vouchers          :-");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 70, 130, 17);

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField8);
        jTextField8.setBounds(420, 70, 100, 21);

        jLabel9.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel9.setText("Cash in hand   :-");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 100, 130, 17);

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 12));
        getContentPane().add(jTextField9);
        jTextField9.setBounds(420, 100, 100, 21);

        jLabel10.setFont(new java.awt.Font("Georgia", 3, 14));
        jLabel10.setText("Date    :-");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 180, 70, 17);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BMS/aero_light_colors_3-wallpaper-1024x576.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-20, -290, 610, 540);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-543)/2, (screenSize.height-257)/2, 543, 257);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            String a = dateChooserCombo1.getText();
            String b[] = a.split("/");
            String realDate = b[2] + "-" + b[0] + "-" + b[1];
            
            String jasp = "Report/bms2.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(jasp);
            Map<String, Object> params = new HashMap<String, Object>();

            params.put("date", realDate);
            params.put("balanceforward", Double.parseDouble(jTextField1.getText()));
            params.put("billiardroom", Double.parseDouble(jTextField2.getText()));
            params.put("guestfees", Double.parseDouble(jTextField3.getText()));
            params.put("membershipfees", Double.parseDouble(jTextField4.getText()));
            params.put("otherincomes", Double.parseDouble(jTextField5.getText()));
            params.put("bankdiposits", Double.parseDouble(jTextField6.getText()));
            params.put("otherexpences", Double.parseDouble(jTextField7.getText()));
            params.put("vouchers", Double.parseDouble(jTextField8.getText()));
            params.put("cashinhand", Double.parseDouble(jTextField9.getText()));

            JasperPrint jp = JasperFillManager.fillReport(jr, params, DB.createConnection());
            JasperViewer jv = new JasperViewer(jp);
            JasperViewer.viewReport(jp, false);
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");

        } catch (Exception e) {
            e.printStackTrace();
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dailyreport().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
}
