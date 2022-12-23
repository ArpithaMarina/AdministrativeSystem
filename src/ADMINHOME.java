
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Marina
 */
public class ADMINHOME extends javax.swing.JFrame {

    /**
     * Creates new form ADMINHOME
     */
    public ADMINHOME() {
        initComponents();
    }
     public ADMINHOME(String us){
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        admin7 = new javax.swing.JButton();
        admin9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        admin8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        admin5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        admin6 = new javax.swing.JButton();
        admin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("INVENTORY");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(710, 410, 140, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("MODIFY DATA");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(1050, 410, 170, 50);

        admin7.setBackground(new java.awt.Color(0, 102, 102));
        admin7.setForeground(new java.awt.Color(0, 102, 102));
        admin7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-schedule-100 (1).png"))); // NOI18N
        admin7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin7ActionPerformed(evt);
            }
        });
        jPanel2.add(admin7);
        admin7.setBounds(860, 570, 190, 180);

        admin9.setBackground(new java.awt.Color(0, 102, 102));
        admin9.setForeground(new java.awt.Color(0, 102, 102));
        admin9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-admin-settings-male-100.png"))); // NOI18N
        admin9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin9ActionPerformed(evt);
            }
        });
        jPanel2.add(admin9);
        admin9.setBounds(1040, 230, 190, 180);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("ALLOCATE WORK SHIFT");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(470, 750, 240, 50);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("SCHEDULING MEETING");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(840, 750, 240, 50);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("ADD EMPLOYEE");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(1240, 750, 190, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("HITACHI DEVICES");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1430, 410, 180, 50);

        admin8.setBackground(new java.awt.Color(0, 102, 102));
        admin8.setForeground(new java.awt.Color(0, 102, 102));
        admin8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-user-male-100.png"))); // NOI18N
        admin8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin8ActionPerformed(evt);
            }
        });
        jPanel2.add(admin8);
        admin8.setBounds(1230, 570, 190, 180);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("FZYaoTi", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-in-inventory-100 (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(670, 230, 190, 180);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("EMPLOYEE MANAGEMENT");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(280, 410, 270, 50);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("FZYaoTi", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("EMPLOYEE MANAGEMENT");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(280, 410, 270, 50);

        admin5.setBackground(new java.awt.Color(0, 102, 102));
        admin5.setForeground(new java.awt.Color(0, 102, 102));
        admin5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-multiple-devices-100.png"))); // NOI18N
        admin5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin5ActionPerformed(evt);
            }
        });
        jPanel2.add(admin5);
        admin5.setBounds(1420, 230, 190, 180);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("FZYaoTi", 0, 100)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADMINISTRATOR ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(640, 20, 730, 100);

        admin6.setBackground(new java.awt.Color(0, 102, 102));
        admin6.setForeground(new java.awt.Color(0, 102, 102));
        admin6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-planner-100.png"))); // NOI18N
        admin6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin6ActionPerformed(evt);
            }
        });
        jPanel2.add(admin6);
        admin6.setBounds(490, 570, 190, 180);

        admin1.setBackground(new java.awt.Color(0, 102, 102));
        admin1.setForeground(new java.awt.Color(0, 102, 102));
        admin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-user-male-104.png"))); // NOI18N
        admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin1ActionPerformed(evt);
            }
        });
        jPanel2.add(admin1);
        admin1.setBounds(310, 230, 190, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white2.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 150, 1700, 750);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zzz.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1930, 1030);

        user.setText("jLabel1");
        jPanel2.add(user);
        user.setBounds(10, 10, 100, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin1ActionPerformed
        String us = user.getText();
        new EMPLOYEEMANAGEMENT(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_admin1ActionPerformed

    private void admin6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin6ActionPerformed
        String us = user.getText();
        new WORKSHIFT(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_admin6ActionPerformed

    private void admin5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin5ActionPerformed
        String us=user.getText();
        new JTableWithImage().setVisible(true);
        dispose();
    }//GEN-LAST:event_admin5ActionPerformed

    private void admin8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin8ActionPerformed
        String us = user.getText();
        new ADDUSER(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_admin8ActionPerformed

    private void admin9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin9ActionPerformed
        String us = user.getText();
        new MODIFYDATA(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_admin9ActionPerformed

    private void admin7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin7ActionPerformed
        String us=user.getText();
        new SCHEDULE(us).setVisible(true);
        dispose();
    }//GEN-LAST:event_admin7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hitachi?zeroDateTimeBehavior=convertToNull", "root", "");
            String sql = "Select * from product where Product_Name=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "PROCESSOR MODULE");
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String one=rs.getString("Qty");

                pst = con.prepareStatement(sql);
                pst.setString(1, "128GB MEMORY CARD");
                rs = pst.executeQuery();
                if(rs.next()){
                    String two=rs.getString("Qty");

                    pst = con.prepareStatement(sql);
                    pst.setString(1, "HITACHI TRANSISTOR 2 pcs");
                    rs = pst.executeQuery();
                    if(rs.next()){
                        String three=rs.getString("Qty");

                        pst = con.prepareStatement(sql);
                        pst.setString(1, "CUSTOMIZED WIRELESS MOUSE");
                        rs = pst.executeQuery();
                        if(rs.next()){
                            String four=rs.getString("Qty");

                            pst = con.prepareStatement(sql);
                            pst.setString(1, "250GB 7200 RPM HDD");
                            rs = pst.executeQuery();
                            if(rs.next()){
                                String five=rs.getString("Qty");

                                pst = con.prepareStatement(sql);
                                pst.setString(1, "HIGH SPEED PENDRIVE");
                                rs = pst.executeQuery();
                                if(rs.next()){
                                    String six=rs.getString("Qty");

                                    pst = con.prepareStatement(sql);
                                    pst.setString(1, "BATTERY CHARGER");
                                    rs = pst.executeQuery();
                                    if(rs.next()){
                                        String seven=rs.getString("Qty");

                                        pst = con.prepareStatement(sql);
                                        pst.setString(1, "STAR BOARD INTERACTIVE DISPLAY");
                                        rs = pst.executeQuery();
                                        if(rs.next()){
                                            String eight=rs.getString("Qty");

                                            pst = con.prepareStatement(sql);
                                            pst.setString(1, "WIRELESS MINI KEYBOARD");
                                            rs = pst.executeQuery();
                                            if(rs.next()){
                                                String nine=rs.getString("Qty");

                                                pst = con.prepareStatement(sql);
                                                pst.setString(1, "AC DRIVE FREQUENCY INVERTER");
                                                rs = pst.executeQuery();
                                                if(rs.next()){
                                                    String ten=rs.getString("Qty");

                                                    pst = con.prepareStatement(sql);
                                                    pst.setString(1, "WATER HEATER (4800W)");
                                                    rs = pst.executeQuery();
                                                    if(rs.next()){
                                                        String eleven=rs.getString("Qty");

                                                        pst = con.prepareStatement(sql);
                                                        pst.setString(1, "PORTABLE PROJECTOR (white)");
                                                        rs = pst.executeQuery();
                                                        if(rs.next()){
                                                            String twelve=rs.getString("Qty");

                                                            pst = con.prepareStatement(sql);
                                                            pst.setString(1, "AIR PURIFIER");
                                                            rs = pst.executeQuery();
                                                            if(rs.next()){
                                                                String thirteen=rs.getString("Qty");

                                                                pst = con.prepareStatement(sql);
                                                                pst.setString(1, "12V CORDLESS DRILL");
                                                                rs = pst.executeQuery();
                                                                if(rs.next()){
                                                                    String fourteen=rs.getString("Qty");

                                                                    pst = con.prepareStatement(sql);
                                                                    pst.setString(1, "2TB STORAGE CAPACITY EXTERNAL HDD");
                                                                    rs = pst.executeQuery();
                                                                    if(rs.next()){
                                                                        String fifteen=rs.getString("Qty");

                                                                        pst = con.prepareStatement(sql);
                                                                        pst.setString(1, "CORDLESS USB ADAPTER");
                                                                        rs = pst.executeQuery();
                                                                        if(rs.next()){
                                                                            String sixteen=rs.getString("Qty");

                                                                            pst = con.prepareStatement(sql);
                                                                            pst.setString(1, "RX2 SERIES INDUSTRIAL INKJET PRINTER");
                                                                            rs = pst.executeQuery();
                                                                            if(rs.next()){
                                                                                String seventeen=rs.getString("Qty");

                                                                                pst = con.prepareStatement(sql);
                                                                                pst.setString(1, "MILD STEEL CUTOFF MACHINE");
                                                                                rs = pst.executeQuery();
                                                                                if(rs.next()){
                                                                                    String eighteen=rs.getString("Qty");

                                                                                    pst = con.prepareStatement(sql);
                                                                                    pst.setString(1, "SOUND BAR WITH BLUETOOTH");
                                                                                    rs = pst.executeQuery();
                                                                                    if(rs.next()){
                                                                                        String nineteen=rs.getString("Qty");

                                                                                        pst = con.prepareStatement(sql);
                                                                                        pst.setString(1,"NEW HITACHI ICs");
                                                                                        rs = pst.executeQuery();
                                                                                        if(rs.next()){
                                                                                            String twenty=rs.getString("Qty");

                                                                                            pst = con.prepareStatement(sql);
                                                                                            pst.setString(1, "VACCUM CLEANER 880W");
                                                                                            rs = pst.executeQuery();
                                                                                            if(rs.next()){
                                                                                                String twentyone=rs.getString("Qty");

                                                                                                pst = con.prepareStatement(sql);
                                                                                                pst.setString(1, "wi-fi SMART WIRELESS SPEAKER");
                                                                                                rs = pst.executeQuery();
                                                                                                if(rs.next()){
                                                                                                    String twentytwo=rs.getString("Qty");

                                                                                                    int a=Integer.parseInt(one);
                                                                                                    int b=Integer.parseInt(two);
                                                                                                    int c=Integer.parseInt(three);
                                                                                                    int d=Integer.parseInt(four);
                                                                                                    int e=Integer.parseInt(five);
                                                                                                    int f=Integer.parseInt(six);
                                                                                                    int g=Integer.parseInt(seven);
                                                                                                    int h=Integer.parseInt(eight);
                                                                                                    int i=Integer.parseInt(nine);
                                                                                                    int j=Integer.parseInt(ten);
                                                                                                    int k=Integer.parseInt(eleven);
                                                                                                    int l=Integer.parseInt(twelve);
                                                                                                    int m=Integer.parseInt(thirteen);
                                                                                                    int n=Integer.parseInt(fourteen);
                                                                                                    int o=Integer.parseInt(fifteen);
                                                                                                    int p=Integer.parseInt(sixteen);
                                                                                                    int q=Integer.parseInt(seventeen);
                                                                                                    int r=Integer.parseInt(eighteen);
                                                                                                    int s=Integer.parseInt(nineteen);
                                                                                                    int t=Integer.parseInt(twenty);
                                                                                                    int u=Integer.parseInt(twentyone);
                                                                                                    int v=Integer.parseInt(twentytwo);

                                                                                                    int counter=110000-(a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v);

                                                                                                    DefaultPieDataset pieDataset = new DefaultPieDataset();
                                                                                                    pieDataset.setValue("Processor ="+one,new Integer(one));
                                                                                                    pieDataset.setValue("128GB memory card ="+two,new Integer(two));
                                                                                                    pieDataset.setValue("Transistor 2pc ="+three,new Integer(three));
                                                                                                    pieDataset.setValue("Wireless Mouse ="+four,new Integer(four));
                                                                                                    pieDataset.setValue("250GB HDD ="+five,new Integer(five));
                                                                                                    pieDataset.setValue("PenDrive ="+six,new Integer(six));
                                                                                                    pieDataset.setValue("Battery Charger ="+seven,new Integer(seven));
                                                                                                    pieDataset.setValue("Interactive Display ="+eight,new Integer(eight));
                                                                                                    pieDataset.setValue("Wireless Keyboard ="+nine,new Integer(nine));
                                                                                                    pieDataset.setValue("Inverter ="+ten,new Integer(ten));
                                                                                                    pieDataset.setValue("Water Heater ="+eleven,new Integer(eleven));
                                                                                                    pieDataset.setValue("Projector ="+twelve,new Integer(twelve));
                                                                                                    pieDataset.setValue("Air Purifier ="+thirteen,new Integer(thirteen));
                                                                                                    pieDataset.setValue("CordLess Drill ="+fourteen,new Integer(fourteen));
                                                                                                    pieDataset.setValue("2TB HDD ="+fifteen,new Integer(fifteen));
                                                                                                    pieDataset.setValue("Cordless USB Adapter ="+sixteen,new Integer(sixteen));
                                                                                                    pieDataset.setValue("InkJet Printer ="+seventeen,new Integer(seventeen));
                                                                                                    pieDataset.setValue("Steel cut off Machine ="+eighteen,new Integer(eighteen));
                                                                                                    pieDataset.setValue("Sound bar(Bluetooth) ="+nineteen,new Integer(nineteen));
                                                                                                    pieDataset.setValue("Hitachi ICs ="+twenty,new Integer(twenty));
                                                                                                    pieDataset.setValue("Vaccum Cleaner ="+twentyone,new Integer(twentyone));
                                                                                                    pieDataset.setValue("Wireless Speaker ="+twentytwo,new Integer(twentytwo));
                                                                                                    pieDataset.setValue("Available Inventory Space ="+counter,new Integer(counter));

                                                                                                    JFreeChart chart = ChartFactory.createPieChart3D("PRODUCT QUANTITIES INSTOCK ", pieDataset, true, true, true);
                                                                                                    PiePlot3D w=(PiePlot3D)chart.getPlot();
                                                                                                    ChartFrame frame= new ChartFrame("pie chart",chart);
                                                                                                    frame.setVisible(true);
                                                                                                    frame.setSize(1920,1100);
                                                                                                }}}}}}}}}}}}}}}}}}}}}}

                                                                                            }
                                                                                            catch(Exception e){
                                                                                                JOptionPane.showMessageDialog(null,e);

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
            java.util.logging.Logger.getLogger(ADMINHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADMINHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADMINHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMINHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADMINHOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin1;
    private javax.swing.JButton admin5;
    private javax.swing.JButton admin6;
    private javax.swing.JButton admin7;
    private javax.swing.JButton admin8;
    private javax.swing.JButton admin9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}