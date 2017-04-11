
/*
 * ChangePassword.java
 *
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author  Jeremiah
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form ChangePassword */
    public ChangePassword() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TxtOldPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        TxtNewPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        TxtConfirmPassword = new javax.swing.JPasswordField();
        CmdOk = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("P2P Library : Change Password");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        
        jLabel3.setName("jLabel3");
        jLabel3.setText("Old Password:");

        jLabel4.setName("jLabel4");
        jLabel4.setText("New Password:");

        jLabel5.setName("jLabel5");
        jLabel5.setText("Confirm Password:");

        CmdOk.setName("CmdOk");
        CmdOk.setText("Ok");
        CmdOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdOkActionPerformed(evt);
            }
        });

        CmdClose.setName("CmdClose");
        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        
        jLabel1.setName("jLabel1");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("P2P Library - Change Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtOldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(TxtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(CmdOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdOk)
                    .addComponent(CmdClose))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdOkActionPerformed
        //validation



        try {

        if (TxtOldPassword.getText().isEmpty()==true) {
            JOptionPane.showMessageDialog(null,"Enter Old Password.");
            return;
        }

        if (TxtNewPassword.getText().isEmpty()==true) {
            JOptionPane.showMessageDialog(null,"Enter New Password.");
            return;
        }
        if (TxtNewPassword.getText().equals(TxtConfirmPassword.getText() )==false) {
            JOptionPane.showMessageDialog(null,"New and Confirm passwords are not matched.");
            return;
        }


            //get database connection details
        	DBManager m = new DBManager();

            //open connection
            Connection connection;
            connection=m.getConnection();
            String str="";
            str="select * from lib_user where user_name =? and user_password =?";
            PreparedStatement pst=connection.prepareStatement(str);
            pst.setString(1, MainClass.StrUser);
            pst.setString(2, TxtOldPassword.getText());
            ResultSet rs;
            rs=pst.executeQuery();
            if (rs.next()) {
                //Update password
                String sql = "UPDATE lib_user SET user_password='" + TxtNewPassword.getText() + "' WHERE user_name = '" + MainClass.StrUser +"'";


                pst.executeUpdate(sql);

                JOptionPane.showMessageDialog(null,"Password updated.");

                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null,"Old password are not correct.");
                return;
            }


        } catch (Exception e) {
            System.err.println(e);
            System.exit(1);
        }
    }//GEN-LAST:event_CmdOkActionPerformed

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        // Close project
        this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdOk;
    private javax.swing.JPasswordField TxtConfirmPassword;
    private javax.swing.JPasswordField TxtNewPassword;
    private javax.swing.JPasswordField TxtOldPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
