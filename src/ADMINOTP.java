
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josep
 */
public class ADMINOTP extends javax.swing.JFrame {

    /**
     * Creates new form ADMINOTP
     */
     String from,to,host,sub,content;
    public ADMINOTP() {
        initComponents();
    }
     public ADMINOTP(String us){
         initComponents();
         user.setText(us);
          update.setEnabled(false);
    }
  int o;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        verify = new javax.swing.JButton();
        OTP = new javax.swing.JTextField();
        get = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        passwordlabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        valid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tomail = new javax.swing.JTextField();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        verify.setBackground(new java.awt.Color(0, 102, 102));
        verify.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setText("VERIFY");
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });
        jPanel1.add(verify);
        verify.setBounds(1260, 370, 140, 70);

        OTP.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        OTP.setForeground(new java.awt.Color(0, 102, 102));
        OTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OTPMouseClicked(evt);
            }
        });
        OTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTPActionPerformed(evt);
            }
        });
        OTP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OTPKeyTyped(evt);
            }
        });
        jPanel1.add(OTP);
        OTP.setBounds(1040, 230, 360, 70);

        get.setBackground(new java.awt.Color(0, 102, 102));
        get.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        get.setForeground(new java.awt.Color(255, 255, 255));
        get.setText("GET OTP");
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });
        jPanel1.add(get);
        get.setBounds(1040, 370, 130, 70);

        jLabel8.setFont(new java.awt.Font("FZYaoTi", 0, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("ENTER YOUR OTP SENT TO YOUR REGISTERED");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 0, 1060, 110);

        password.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        password.setForeground(new java.awt.Color(0, 153, 153));
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordMouseReleased(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(1050, 660, 340, 70);

        passwordlabel.setFont(new java.awt.Font("FZYaoTi", 0, 50)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(passwordlabel);
        passwordlabel.setBounds(810, 510, 650, 80);

        jLabel7.setFont(new java.awt.Font("FZYaoTi", 0, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("E-MAIL ADDRESS");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(790, 70, 400, 110);

        jLabel9.setFont(new java.awt.Font("FZYaoTi", 1, 80)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ADMIN");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(223, 270, 250, 110);

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-login-100 (1).png"))); // NOI18N
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(1400, 790, 150, 120);

        valid.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        valid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(valid);
        valid.setBounds(1050, 310, 290, 30);

        jLabel5.setFont(new java.awt.Font("FZYaoTi", 0, 70)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 400, 603, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(720, 0, 1240, 1020);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-globe.gif"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 70, 100, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/halfblue.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 1000);
        jPanel1.add(tomail);
        tomail.setBounds(520, 120, 140, 22);
        jPanel1.add(user);
        user.setBounds(210, 50, 0, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OTPMouseClicked

        OTP.setText("");
        OTP.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_OTPMouseClicked

    private void OTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTPActionPerformed
   
    }//GEN-LAST:event_OTPActionPerformed

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
    
    try{  
         Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hitachi?zeroDateTimeBehavior=convertToNull", "root", "");
            String sql = "Select * from admin where Admin_id=?";  
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, user.getText());
            ResultSet rs = pst.executeQuery();
              Random rand=new Random();
              o=rand.nextInt(99999);
        
    if(rs.next()){
         tomail.setText(rs.getString("Email_ID"));
         from = "hitachicompany452@gmail.com";
         to = tomail.getText();
         host = "localhost";
         sub = "OTP for Changing your PIN";
          content = "Dear ADMIN,please use the OTP "+o+" for changing your Password \n\n\n\nTHANK YOU \n\n\nREGARDS HITACHI VANTARA\nPRIVATE LIMITED";
          Properties p= new Properties();
         p.put("mail.smtp.auth","true");
         p.put("mail.smtp.starttls.enable","true");
         p.put("mail.smtp.host","smtp.gmail.com");
         p.put("mail.smtp.port","587");
         Session s= Session.getDefaultInstance(p, new javax.mail.Authenticator(){
          protected PasswordAuthentication getPasswordAuthentication()
         {
           return new PasswordAuthentication("hitachicompany452@gmail.com","a.s.j.l.r");
          }
           });
      try{
            MimeMessage m = new MimeMessage(s);
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setText(content);
            Transport.send(m);
            JOptionPane.showMessageDialog(this, "OTP Sent has been sent to your E-mail Succesfully ");
          }
    catch(Exception e){
            e.printStackTrace();
            }
          }
    else{
      JOptionPane.showMessageDialog(this,"Attempted to send an OTP, Please check your Network Connection","Failed",JOptionPane.WARNING_MESSAGE);
    }
   
    
    
    }
    catch(Exception e){
    }
    }//GEN-LAST:event_getActionPerformed

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
 if(Integer.parseInt(OTP.getText())==o){
   update.setEnabled(true);
   passwordlabel.setText("ENTER YOUR NEW PASSWORD");
   OTP.setText("");
   verify.setEnabled(false);
   get.setEnabled(false);
    JOptionPane.showMessageDialog(this,"OTP verified","Anticipated",JOptionPane.INFORMATION_MESSAGE);
    }
    else{
    JOptionPane.showMessageDialog(this,"Specified OTP is Incorrcet","Anticipated",JOptionPane.ERROR_MESSAGE);
    this.setVisible(false);
    new LOGIN().setVisible(true);
    dispose();
    }   
    }//GEN-LAST:event_verifyActionPerformed

    private void OTPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OTPKeyTyped
      try{
        int a=Integer.parseInt(OTP.getText()); 
        valid.setText("");
    }
    catch(NumberFormatException el){
        valid.setText("Enter Numeric Values");
    
    }
    }//GEN-LAST:event_OTPKeyTyped

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        PreparedStatement mystmt=null;
         String s=password.getText();
 if(s.length()<10&&s.length()>5){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hitachi?zeroDateTimeBehavior=convertToNull", "root", "");

            String a="UPDATE admin SET Admin_password=? WHERE Admin_id=?";
            mystmt= con.prepareStatement(a);
            mystmt.setString(1, password.getText());
            mystmt.setString(2, user.getText());
            mystmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Password Updation Complete","Successfull",JOptionPane.INFORMATION_MESSAGE);   
            String us= user.getText();
            new ADMINHOME(us).setVisible(true);
        }
        catch(Exception e){

        }
        }
        else{
                JOptionPane.showMessageDialog(this,"Enter a Password between the limits(5-10)","Anticipated",JOptionPane.WARNING_MESSAGE); 
                password.setText("");
              }
    }//GEN-LAST:event_updateActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseReleased
         
    }//GEN-LAST:event_passwordMouseReleased

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
            java.util.logging.Logger.getLogger(ADMINOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINOTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINOTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField OTP;
    private javax.swing.JButton get;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField tomail;
    private javax.swing.JButton update;
    private javax.swing.JLabel user;
    private javax.swing.JLabel valid;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
