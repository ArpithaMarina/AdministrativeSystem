
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josep
 */
public class FORGOTEMPLOYEE extends javax.swing.JFrame {

    /**
     * Creates new form FORGOTEMPLOYEE
     */
    public FORGOTEMPLOYEE() {
        initComponents();
    }

     public FORGOTEMPLOYEE(String us){
         initComponents();
         user.setText(us);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        answer = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("FZYaoTi", 0, 70)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("QUESTION");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 350, 410, 110);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-login-100 (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1670, 640, 150, 120);

        answer.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        answer.setForeground(new java.awt.Color(160, 160, 160));
        answer.setText("ANS");
        answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerMouseClicked(evt);
            }
        });
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });
        jPanel1.add(answer);
        answer.setBounds(1070, 440, 650, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-male-100.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(840, 240, 100, 110);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-lock-104.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(830, 400, 130, 130);

        jLabel7.setFont(new java.awt.Font("FZYaoTi", 0, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("WHAT IS YOUR HOBBY ?");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1060, 240, 730, 110);

        jLabel5.setFont(new java.awt.Font("FZYaoTi", 0, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SECURITY");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 250, 420, 110);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-globe.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 90, 100, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halfblue.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 1020);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(546, 770, 100, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(720, 0, 1240, 1020);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1918, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void answerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerMouseClicked

        answer.setText("");
        answer.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_answerMouseClicked

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed

    }//GEN-LAST:event_answerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hitachi?zeroDateTimeBehavior=convertToNull", "root", "");
            String sql = "Select * from employee where Employee_id=? and Hobby=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, user.getText());
            pst.setString(2, answer.getText());
            ResultSet rs = pst.executeQuery();
         
            if(rs.next()){
                   String us=user.getText();
                new EMPLOYEEOTP(us).setVisible(true);
                dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(this,"INCORRECT SECURITY ANSWER!!!","Anticipated",JOptionPane.ERROR_MESSAGE);
                answer.setText("");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(FORGOTEMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORGOTEMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORGOTEMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORGOTEMPLOYEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORGOTEMPLOYEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
