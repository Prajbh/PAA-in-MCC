/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author EGC
 */
public class first extends javax.swing.JFrame {

    /**
     * Creates new form first
     */
     Statement st;
    Connection con;
    int flag=0;
    public first() throws ClassNotFoundException, SQLException {
        initComponents();
        
        Class.forName("com.mysql.jdbc.Driver");
       
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+"privacy","root","root");
             System.out.println("Connected");
             st=con.createStatement();
             
         DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Calendar cj = Calendar.getInstance();
        jTextField3.setText(df.format(cj.getTime()));

          DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = new java.util.Date();
        jTextField2.setText(dateFormat.format(date));
        
        id.setText(signin.uid);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        key = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Efficient Privacy-Aware Authentication Scheme for Mobile Cloud Computing Services");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 0, 890, 40);

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Services Offered", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel4.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("User-ID");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(90, 100, 130, 20);

        id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel4.add(id);
        id.setBounds(260, 90, 289, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Private key");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(90, 160, 130, 20);

        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        jPanel4.add(key);
        key.setBounds(260, 160, 289, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Services Provided");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(16, 38, 108, 17);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "File Upload", "File access" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(187, 35, 130, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(140, 220, 630, 231);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1402922685_clock.png"))); // NOI18N
        jLabel2.setText("TIME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(620, 100, 100, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 110, 160, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1402922470_Calendar.png"))); // NOI18N
        jLabel3.setText("DATE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 100, 30);

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(730, 100, 170, 30);

        jButton1.setText("Provide");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(390, 510, 69, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String up = key.getText();
        String item = (String) jComboBox1.getSelectedItem();
        String uid = id.getText();
        
        //File Upload
        if(item.equalsIgnoreCase("file upload"))
        {
        try
        {
         String query = "select * from registration";
            
             try {
               ResultSet  rs = st.executeQuery(query);
                while (rs.next()) {
                String uid1 = rs.getString("ID");
                String un1 = rs.getString("Name");
                String up1 = rs.getString("pkeys");
                if (up.equalsIgnoreCase(up1) && (item.equalsIgnoreCase("file upload")) && (uid.equalsIgnoreCase(uid1))) {
                    flag = 1;
                    JOptionPane.showMessageDialog(null, "Start to File Uoload...");
                upload f = new upload();
                f.setVisible(true);
                }
                if(flag==0)
                {
                     JOptionPane.showMessageDialog(null, "Incorrect ID or Private Key...");
                }
               
            }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
             }
          
            }
             catch (Exception e) 
            {
               System.out.println(e.getMessage());
             }
        }
        
        //File Access
        else
        {
        try
        {
         String query = "select * from registration";
            
             try {
               ResultSet  rs = st.executeQuery(query);
                while (rs.next()) {
                String uid1 = rs.getString("ID");
                String un1 = rs.getString("Name");
                String up1 = rs.getString("pkeys");
                if (up.equalsIgnoreCase(up1) && (item.equalsIgnoreCase("file access")) && (uid.equalsIgnoreCase(uid1))) {
                    flag = 1;
                    JOptionPane.showMessageDialog(null, "Start to File Access...");
                modify f1 = new modify();
                f1.setVisible(true);
                }
                if(flag==0)
                {
                     JOptionPane.showMessageDialog(null, "Incorrect ID or Private Key...");
                }
               
            }
                 
             } catch (SQLException ex) {
                 Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
             }
          
            }
             catch (Exception e) 
            {
               System.out.println(e.getMessage());
             }
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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new first().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(first.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField key;
    // End of variables declaration//GEN-END:variables
}
