/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josep
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        admin = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        admin.setBackground(new java.awt.Color(0, 102, 102));
        admin.setForeground(new java.awt.Color(0, 102, 102));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emp.png"))); // NOI18N
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin);
        admin.setBounds(600, 560, 197, 194);

        employee.setBackground(new java.awt.Color(0, 102, 102));
        employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2021-04-13.png"))); // NOI18N
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });
        jPanel1.add(employee);
        employee.setBounds(1050, 560, 197, 194);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 440, 1830, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Level 12, No 9/0, Lavelle Road, Bengaluru - 560051, India");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(650, 950, 570, 40);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 270, 840, 10);

        jLabel8.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("ADMIN");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(620, 750, 150, 56);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-globe.gif"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(70, 50, 100, 100);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Hitahi Vantara India Private Limited");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(740, 910, 380, 40);

        jLabel13.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("LOGIN AS");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(290, 510, 250, 56);

        jLabel12.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("EMPLOYEE");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(1040, 750, 240, 56);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white2.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 490, 1920, 510);

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 80)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 202, 202));
        jLabel7.setText("INSPIRE THE NEXT");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(550, 190, 760, 90);

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 150)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HITACHI");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(550, 20, 750, 190);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zzz.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 1920, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
     new ADMINN().setVisible(true);
     dispose();
    }//GEN-LAST:event_adminActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
     new EMPLOYEE().setVisible(true);
     dispose();
    }//GEN-LAST:event_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton employee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
