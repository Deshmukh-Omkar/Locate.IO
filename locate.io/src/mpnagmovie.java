/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author nayansaxena
 */
public class mpnagmovie extends javax.swing.JFrame {

    /**
     * Creates new form mpnagmovie
     */
    public String control = null;
    public mpnagmovie() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Informationdialogbox = new javax.swing.JDialog();
        cf2 = new javax.swing.JLabel();
        phno = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        ratings = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jyoticinema = new javax.swing.JButton();
        funcinema = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        settingbutton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Informationdialogbox.setBounds(new java.awt.Rectangle(896, 0, 896, 470));
        Informationdialogbox.setResizable(false);
        Informationdialogbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InformationdialogboxFocusGained(evt);
            }
        });
        Informationdialogbox.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cf2.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        cf2.setForeground(new java.awt.Color(255, 255, 255));
        cf2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cf2.setMaximumSize(new java.awt.Dimension(340, 80));
        cf2.setMinimumSize(new java.awt.Dimension(340, 80));
        cf2.setPreferredSize(new java.awt.Dimension(340, 80));
        Informationdialogbox.getContentPane().add(cf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 340, 80));

        phno.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        phno.setForeground(new java.awt.Color(255, 255, 255));
        phno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phno.setMaximumSize(new java.awt.Dimension(340, 80));
        phno.setMinimumSize(new java.awt.Dimension(340, 80));
        phno.setPreferredSize(new java.awt.Dimension(340, 80));
        Informationdialogbox.getContentPane().add(phno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 380, 80));

        address.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        address.setMaximumSize(new java.awt.Dimension(430, 110));
        address.setMinimumSize(new java.awt.Dimension(430, 110));
        address.setPreferredSize(new java.awt.Dimension(430, 110));
        Informationdialogbox.getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 390, 100));

        ratings.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        ratings.setForeground(new java.awt.Color(255, 255, 255));
        ratings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ratings.setMaximumSize(new java.awt.Dimension(270, 60));
        ratings.setMinimumSize(new java.awt.Dimension(270, 60));
        ratings.setPreferredSize(new java.awt.Dimension(270, 60));
        Informationdialogbox.getContentPane().add(ratings, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 300, 80));

        jLabel8.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doalog.jpg"))); // NOI18N
        jLabel8.setText("jLabel6");
        jLabel8.setMaximumSize(new java.awt.Dimension(896, 470));
        jLabel8.setMinimumSize(new java.awt.Dimension(896, 470));
        jLabel8.setPreferredSize(new java.awt.Dimension(896, 470));
        Informationdialogbox.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 896, 470));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel2.setText("Fun Cinemas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, 20));

        jyoticinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesymbol.png"))); // NOI18N
        jyoticinema.setBorderPainted(false);
        jyoticinema.setContentAreaFilled(false);
        jyoticinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jyoticinemaActionPerformed(evt);
            }
        });
        getContentPane().add(jyoticinema, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 40, 20));

        funcinema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviesymbol.png"))); // NOI18N
        funcinema.setBorderPainted(false);
        funcinema.setContentAreaFilled(false);
        funcinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcinemaActionPerformed(evt);
            }
        });
        getContentPane().add(funcinema, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 30, 20));

        jLabel4.setBackground(new java.awt.Color(233, 233, 233));
        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel4.setText("Jyoti Cineplex");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 103, 80, 20));

        settingbutton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        settingbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/107568.gif"))); // NOI18N
        settingbutton.setText("SETTINGS");
        settingbutton.setToolTipText("");
        settingbutton.setActionCommand("ACCOUNT SETTINGS");
        settingbutton.setAutoscrolls(true);
        settingbutton.setContentAreaFilled(false);
        settingbutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settingbutton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/107568.gif"))); // NOI18N
        settingbutton.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/10nomap.jpg"))); // NOI18N
        settingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(settingbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, -1));

        jButton4.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 120, -1));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        jButton1.setText("Return To Home Screen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, -1));

        jButton2.setFont(new java.awt.Font("Helvetica Neue", 3, 12)); // NOI18N
        jButton2.setText("FIND FOOD IN THIS AREA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mpnagarmap.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 896, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void funcinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcinemaActionPerformed
        // TODO add your handling code here:
        Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "fun";
    }//GEN-LAST:event_funcinemaActionPerformed

    private void jyoticinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jyoticinemaActionPerformed
        // TODO add your handling code here:
        Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "jyoti";
    }//GEN-LAST:event_jyoticinemaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    mpnagfood mpnagfood = new mpnagfood();
    mpnagmovie.this.setVisible(false);
    mpnagfood.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    intro_page intro_page = new intro_page();
    mpnagmovie.this.setVisible(false);
    intro_page.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InformationdialogboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InformationdialogboxFocusGained
        // TODO add your handling code here:
        String query = null;
        if(null != control)
        switch (control) {
            case "fun":
            query = "select * FROM mp_nagar where place = 'Fun Cinemas';";
            break;
            case "jyoti":
            query = "select * FROM mp_nagar where place = 'Jyoti Cineplex';";
            break;
            default:
            break;
        }

        try{
            //Connect to MYSQL Database
            Connection conn= (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/locate_io", "root", "tiger");
            //Execute Query
            Statement stmt=conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            //We Get The Data
            while(rs.next())
            {
                String costfor2 = rs.getString("Cost_for_two");
                String phone_no = rs.getString("phone_no");
                String Address = rs.getString("Address");
                String Rating = rs.getString("Rating");
                cf2.setText("Rs. "+costfor2);
                phno.setText(""+phone_no);
                address.setText("<html><p><center>"+Address+"</center></p></html>");
                ratings.setText(""+Rating+"⋆");  //Special Character ⋆
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_InformationdialogboxFocusGained

    private void settingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingbuttonActionPerformed
        // TODO add your handling code here:
        Settings Settings = new Settings();
        mpnagmovie.this.setVisible(false);
        Settings.setLocationRelativeTo(null);
        Settings.setVisible(true);
    }//GEN-LAST:event_settingbuttonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mpnagmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mpnagmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mpnagmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mpnagmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mpnagmovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Informationdialogbox;
    private javax.swing.JLabel address;
    private javax.swing.JLabel cf2;
    private javax.swing.JButton funcinema;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jyoticinema;
    private javax.swing.JLabel phno;
    private javax.swing.JLabel ratings;
    private javax.swing.JButton settingbutton;
    // End of variables declaration//GEN-END:variables
}