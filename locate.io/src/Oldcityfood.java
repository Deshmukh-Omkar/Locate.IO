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
public class Oldcityfood extends javax.swing.JFrame {

    /**
     * Creates new form Oldcityfood
     */
    public String control = null;
    public Oldcityfood() {
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
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ShobhitFood = new javax.swing.JButton();
        ZamZamFastFood = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        KhanSaheb = new javax.swing.JButton();
        JameelHotel = new javax.swing.JButton();
        settingbutton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Informationdialogbox.setBounds(new java.awt.Rectangle(896, 0, 896, 470));
        Informationdialogbox.setMinimumSize(new java.awt.Dimension(896, 470));
        Informationdialogbox.setResizable(false);
        Informationdialogbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InformationdialogboxFocusGained(evt);
            }
        });

        cf2.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        cf2.setForeground(new java.awt.Color(255, 255, 255));
        cf2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cf2.setMaximumSize(new java.awt.Dimension(340, 80));
        cf2.setMinimumSize(new java.awt.Dimension(340, 80));
        cf2.setPreferredSize(new java.awt.Dimension(340, 80));

        phno.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        phno.setForeground(new java.awt.Color(255, 255, 255));
        phno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phno.setMaximumSize(new java.awt.Dimension(340, 80));
        phno.setMinimumSize(new java.awt.Dimension(340, 80));
        phno.setPreferredSize(new java.awt.Dimension(340, 80));

        address.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        address.setMaximumSize(new java.awt.Dimension(430, 110));
        address.setMinimumSize(new java.awt.Dimension(430, 110));
        address.setPreferredSize(new java.awt.Dimension(430, 110));

        ratings.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        ratings.setForeground(new java.awt.Color(255, 255, 255));
        ratings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ratings.setMaximumSize(new java.awt.Dimension(270, 60));
        ratings.setMinimumSize(new java.awt.Dimension(270, 60));
        ratings.setPreferredSize(new java.awt.Dimension(270, 60));

        jLabel6.setFont(new java.awt.Font("Helvetica", 0, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doalog.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(896, 470));
        jLabel6.setMinimumSize(new java.awt.Dimension(896, 470));
        jLabel6.setPreferredSize(new java.awt.Dimension(896, 470));

        javax.swing.GroupLayout InformationdialogboxLayout = new javax.swing.GroupLayout(Informationdialogbox.getContentPane());
        Informationdialogbox.getContentPane().setLayout(InformationdialogboxLayout);
        InformationdialogboxLayout.setHorizontalGroup(
            InformationdialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(510, 510, 510)
                .addComponent(ratings, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(cf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        InformationdialogboxLayout.setVerticalGroup(
            InformationdialogboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(ratings, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(InformationdialogboxLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(cf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel4.setText("Khan Saheb Restaurant and Fast Food");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 230, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel3.setText("                    Zam Zam Fast Food");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 180, 20));

        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel5.setText("               Shobhit's Food Storm");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 170, 20));

        ShobhitFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foods copy.png"))); // NOI18N
        ShobhitFood.setBorderPainted(false);
        ShobhitFood.setContentAreaFilled(false);
        ShobhitFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShobhitFoodActionPerformed(evt);
            }
        });
        getContentPane().add(ShobhitFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 30, 20));

        ZamZamFastFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foods copy.png"))); // NOI18N
        ZamZamFastFood.setBorderPainted(false);
        ZamZamFastFood.setContentAreaFilled(false);
        ZamZamFastFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZamZamFastFoodActionPerformed(evt);
            }
        });
        getContentPane().add(ZamZamFastFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 30, 20));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel2.setText("Jameel Hotel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, 20));

        KhanSaheb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foods copy.png"))); // NOI18N
        KhanSaheb.setBorderPainted(false);
        KhanSaheb.setContentAreaFilled(false);
        KhanSaheb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhanSahebActionPerformed(evt);
            }
        });
        getContentPane().add(KhanSaheb, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 30, 20));

        JameelHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foods copy.png"))); // NOI18N
        JameelHotel.setBorderPainted(false);
        JameelHotel.setContentAreaFilled(false);
        JameelHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JameelHotelActionPerformed(evt);
            }
        });
        getContentPane().add(JameelHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 30, 20));

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
        jButton2.setText("FIND MOVIE THEATERS IN THIS AREA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASD.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 896, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JameelHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JameelHotelActionPerformed
        // TODO add your handling code here:
        Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "JameelHotel";
    }//GEN-LAST:event_JameelHotelActionPerformed

    private void ZamZamFastFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZamZamFastFoodActionPerformed
        // TODO add your handling code here:
        Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "ZamZamFastFood";
    }//GEN-LAST:event_ZamZamFastFoodActionPerformed

    private void KhanSahebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhanSahebActionPerformed
        // TODO add your handling code here:
        Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "KhanSaheb";
    }//GEN-LAST:event_KhanSahebActionPerformed

    private void ShobhitFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShobhitFoodActionPerformed
        // TODO add your handling code here:
         Informationdialogbox.setVisible(true);
        Informationdialogbox.setBounds(896,0,896,470);
        Informationdialogbox.setLocationRelativeTo(null);
        control = "ShobhitFood";
    }//GEN-LAST:event_ShobhitFoodActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    Oldcitymovie Oldcitymovie = new Oldcitymovie();
    Oldcityfood.this.setVisible(false);
    Oldcitymovie.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    intro_page intro_page = new intro_page();
    Oldcityfood.this.setVisible(false);
    intro_page.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InformationdialogboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InformationdialogboxFocusGained
        // TODO add your handling code here:
        String query = null;
        if(null != control)
        switch (control) {
            case "ShobhitFood":
                query = "select * FROM oldcity where place = 'Shobhit Food Storm';";
                break;
            case "KhanSaheb":
                query = "select * FROM oldcity where place = 'Khan Sahab Restaurant & Fast Food';";
                break;
            case "JameelHotel":
                query = "select * FROM oldcity where place = 'Jameel Hotel';";
                break;
            case "ZamZamFastFood":
                query = "select * FROM oldcity where place = 'Zam Zam Fast Food';";
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
    Oldcityfood.this.setVisible(false);
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
            java.util.logging.Logger.getLogger(Oldcityfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oldcityfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oldcityfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oldcityfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oldcityfood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Informationdialogbox;
    private javax.swing.JButton JameelHotel;
    private javax.swing.JButton KhanSaheb;
    private javax.swing.JButton ShobhitFood;
    private javax.swing.JButton ZamZamFastFood;
    private javax.swing.JLabel address;
    private javax.swing.JLabel cf2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel phno;
    private javax.swing.JLabel ratings;
    private javax.swing.JButton settingbutton;
    // End of variables declaration//GEN-END:variables
}
