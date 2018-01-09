/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsystem;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Dale
 */
public class ChangeRate extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangeRate
     */
    public ChangeRate() {
        initComponents();
        Current.setText(""+Rate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        old = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Current = new javax.swing.JLabel();
        NewRate = new javax.swing.JTextField();

        setClosable(true);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Change Rate");

        old.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        old.setText("Current Rate: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("New Rate: ");

        Current.setBackground(new java.awt.Color(0, 0, 0));

        NewRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(old)
                                .addComponent(jLabel6))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Current, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NewRate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(old, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static float Rate(){
        float rate=0;
        
        com.mysql.jdbc.Connection cn;
        ResultSet rs;
        com.mysql.jdbc.Statement st;
        String url;
        rs=null;
            try {
                url = "jdbc:mysql://localhost:3306/pcrs";
                Class.forName("com.mysql.jdbc.Driver");
                cn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, "root","");
                st = (com.mysql.jdbc.Statement) cn.createStatement();
                rs = st.executeQuery("Select * From rate_hour Where perhour= 'rate'  ");
                rs.first();
                rate=rs.getFloat("rate");
                
            }
             catch (SQLException ex) {
                //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
                
            } catch (ClassNotFoundException ex) {
                //1 Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return rate;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equalsIgnoreCase(NewRate.getText())){
            JOptionPane.showMessageDialog(null, "Input Rate","System Message",JOptionPane.ERROR_MESSAGE);
        }
        else{
        float rate=Float.parseFloat(NewRate.getText());
        int answer;
        answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to change the rate?","System Message",JOptionPane.YES_NO_OPTION);
        if(answer==JOptionPane.YES_OPTION){
       
            try {
            com.mysql.jdbc.Connection cn;
            com.mysql.jdbc.Statement st;
            String url;
            url = "jdbc:mysql://localhost:3306/pcrs";
            Class.forName("com.mysql.jdbc.Driver");
            cn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, "root","");
            st = (com.mysql.jdbc.Statement) cn.createStatement();
             st.executeUpdate("UPDATE rate_hour SET rate = '"+ rate +"'Where perhour = 'rate' ");
            JOptionPane.showMessageDialog(null, "Rate Changed","System Message",JOptionPane.INFORMATION_MESSAGE);
            NewRate.setText("");
            this.setVisible(false);
           
           
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //Logger.getLogger(frameTerminateEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewRateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Current;
    private javax.swing.JTextField NewRate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel old;
    // End of variables declaration//GEN-END:variables
}
