
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nayansaxena
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        uname = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(896, 470));
        setPreferredSize(new java.awt.Dimension(896, 470));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 210, -1));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 210, -1));

        jButton1.setFont(new java.awt.Font("Helvetica", 1, 13)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 140, 60));

        jLabel2.setFont(new java.awt.Font("Futura", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Already have an account ?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 240, -1));

        signup.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 0, 0));
        signup.setText("Click Here to Log In !");
        signup.setAlignmentY(0.0F);
        signup.setBorderPainted(false);
        signup.setContentAreaFilled(false);
        signup.setFocusPainted(false);
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 270, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        //Write code to open signup jframe.For signup button-
        Login  Login = new  Login();
        signup.this.setVisible(false);
        Login.setVisible(true);
    }//GEN-LAST:event_signupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Wrapper conn = null;
				                                
                                //declare variables                                
				String username="" ;
				String password="" ;
                                String rpassword="";
				String IQuery="";
                                String IQuery_Bak="";
                                
				//get values using getText() method
				username = uname.getText().trim();
				password = pw.getText().trim();
				
                                // check condition it field equals to blank throw error message
				
                                if(password.equals("")|| username.equals("")){
                                   
                                   JOptionPane.showMessageDialog(null," Missing Username or Password","Error",JOptionPane.ERROR_MESSAGE);
                                   return;
                                }
                                
				if(username!=("") & password!=("")) //else insert query is run properly
                                {
					IQuery = "INSERT INTO credentials VALUES('"+username+"', '"+password+"',curdate(),curtime());";
                                        IQuery_Bak = "INSERT INTO credentials_bak VALUES('"+username+"', '"+password+"',curdate(),curtime());";
					System.out.println("Connecting to a selected database...");}
                                
				try {
				//STEP 3: Open a connection
				Connection con = (Connection)
                                DriverManager.getConnection("jdbc:mysql://localhost:3306/locate_io", "root", "tiger");
					
                                System.out.println("Connected database successfully...");
                                                                                		
                                PreparedStatement st = con.prepareStatement("select * from credentials;");
                                ResultSet rs=st.executeQuery();
                                String usernameCounter;
                                while(rs.next()) 
                                {
                                 usernameCounter =  rs.getString("Uname");
                                  if(usernameCounter.equals(username)) //this part does not happen even if it should
                                {
                                    JOptionPane.showMessageDialog(null, "Username entered already exists!");
                                    return;
                                }
                                }
                                
				Statement stmt = con.createStatement();//select the rows
                                stmt.addBatch(IQuery);
                                stmt.addBatch(IQuery_Bak);
                                stmt.executeBatch();
                                variables v =new variables();
                                v.user=username;
                                v.pas=password;
       String query2="UPDATE credentials SET Login_Time=curtime() where Uname='"+username+"';";
       String LLI="SELECT Login_Time from credentials where Uname='"+username+"'";
       String MS="SELECT Joined_On from credentials where Uname='"+username+"'";
        stmt.addBatch(query2);    
        ResultSet rs2=stmt.executeQuery(LLI);
       if(rs2.last())
       {
           v.last=rs2.getString("Login_Time");
       }
       ResultSet rs3=stmt.executeQuery(MS);
       if(rs3.last())
       {
           v.mems=rs3.getString("Joined_On");
       }
       stmt.executeBatch();
					// define SMessage variable
				String SMessage = "Welcome " +username+ " to LOCATE.io !";
					
                                       // create dialog ox which is print message
	                    JOptionPane.showMessageDialog(null,SMessage,"Message",JOptionPane.PLAIN_MESSAGE);
                            
                                        intro_page intro_page = new intro_page();
                                        signup.this.setVisible(false);
                                        intro_page.setVisible(true);
					//close connection
					
				}				
			
			catch (SQLException se) 
			{
				//handle errors for JDBC
				se.printStackTrace();
			}
			catch (Exception a) //catch block
			{
				a.printStackTrace();
			}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pw;
    private javax.swing.JButton signup;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}