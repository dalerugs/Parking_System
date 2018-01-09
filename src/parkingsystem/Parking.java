package parkingsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrick Dale
 */
public class Parking extends javax.swing.JInternalFrame {
    
    public static javax.swing.JButton BUTTON;
    DecimalFormat dt = new DecimalFormat("#.#");
    DecimalFormat da = new DecimalFormat("#");
    public static float timeout1=0,timeout2=0,timeout3=0,timeout4=0,timeout5=0,
            timeout6=0,timeout7=0,timeout8=0,timeout9=0,timeout10=0,timeout11=0,
            timeout12=0,timeout13=0,timeout14=0,timeout15=0,timeout16=0,
            timeout17=0,timeout18=0,timeout19=0,timeout20=0,timeout21=0,
            timeout22=0;
    
     static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;

    /**
     * Creates new form NewJInternalFrame
     */
    
    public Parking() {
        initComponents();
        Visible();
    }
    
    private void save(Date date, float amount){
   
        try{
        Class.forName("com.mysql.jdbc.Driver");
        url = "jdbc:mysql://localhost:3306/pcrs";
        connection = DriverManager.getConnection(url, "root", "");
        st = connection.createStatement();
        
        st.executeUpdate("Insert into sales("
                            + "date, amount"
                            + ") VALUES ('"
                            + date + "','"
                            + amount + " ')");
            
        }
        catch(Exception exc){
        }
    }
    
     private Date date() {
      java.util.Date utilDate = new java.util.Date();
      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
      return sqlDate;
   }
     private float amount(float time){
        float total;
        float rate=ChangeRate.Rate();
            total=time*rate;
            return total;
        
    }
     
     private float GetTime(){
        if(BUTTON==p1){
            return timeout1;
        }
        else if(BUTTON==p2){
            return timeout2;
        }
        else if(BUTTON==p3){
            return timeout3;
        }
        else if(BUTTON==p4){
            return timeout4;
        }
        else if(BUTTON==p5){
            return timeout5;
        }
        else if(BUTTON==p6){
            return timeout6;
        }
        else if(BUTTON==p7){
            return timeout7;
        }
        else if(BUTTON==p8){
            return timeout8;
        }
        else if(BUTTON==p9){
            return timeout9;
        }
        else if(BUTTON==p10){
            return timeout10;
        }
        else if(BUTTON==p11){
            return timeout11;
        }
        else if(BUTTON==p12){
            return timeout12;
        }
        else if(BUTTON==p13){
            return timeout13;
        }
        else if(BUTTON==p14){
            return timeout14;
        }
        else if(BUTTON==p15){
            return timeout15;
        }
        else if(BUTTON==p16){
            return timeout16;
        }
        else if(BUTTON==p17){
            return timeout17;
        }
        else if(BUTTON==p18){
            return timeout18;
        }
        else if(BUTTON==p19){
            return timeout19;
        }
        else if(BUTTON==p20){
            return timeout20;
        }
        else if(BUTTON==p21){
            return timeout21;
        }
        else if(BUTTON==p22){
            return timeout22;
        }
        else
            return 0;
     }
    
    
    private void Visible(){
        IN.setVisible(false);
        out2.setVisible(false);
        Out.setVisible(false);
}
    
    private void SetTimeAmount(){
        if(BUTTON==p1){
            TimeOut.setText(""+dt.format(timeout1));
            Amount.setText(""+da.format(amount(timeout1)));
        }
        else if(BUTTON==p2){
            TimeOut.setText(""+dt.format(timeout2));
            Amount.setText(""+da.format(amount(timeout2)));
        }
        else if(BUTTON==p3){
            TimeOut.setText(""+dt.format(timeout3));
            Amount.setText(""+da.format(amount(timeout3)));
        }
        else if(BUTTON==p4){
            TimeOut.setText(""+dt.format(timeout4));
            Amount.setText(""+da.format(amount(timeout4)));
        }
        else if(BUTTON==p5){
            TimeOut.setText(""+dt.format(timeout5));
            Amount.setText(""+da.format(amount(timeout5)));
        }
        else if(BUTTON==p6){
            TimeOut.setText(""+dt.format(timeout6));
            Amount.setText(""+da.format(amount(timeout6)));
        }
        else if(BUTTON==p7){
            TimeOut.setText(""+dt.format(timeout7));
            Amount.setText(""+da.format(amount(timeout7)));
        }
        else if(BUTTON==p8){
            TimeOut.setText(""+dt.format(timeout8));
            Amount.setText(""+da.format(amount(timeout8)));
        }
        else if(BUTTON==p9){
            TimeOut.setText(""+dt.format(timeout9));
            Amount.setText(""+da.format(amount(timeout9)));
        }
        else if(BUTTON==p10){
            TimeOut.setText(""+dt.format(timeout10));
            Amount.setText(""+da.format(amount(timeout10)));
        }
        else if(BUTTON==p11){
            TimeOut.setText(""+dt.format(timeout11));
            Amount.setText(""+da.format(amount(timeout11)));
        }
        else if(BUTTON==p12){
            TimeOut.setText(""+dt.format(timeout12));
            Amount.setText(""+da.format(amount(timeout12)));
        }
        else if(BUTTON==p13){
            TimeOut.setText(""+dt.format(timeout13));
            Amount.setText(""+da.format(amount(timeout13)));
        }
        else if(BUTTON==p14){
            TimeOut.setText(""+dt.format(timeout14));
            Amount.setText(""+da.format(amount(timeout14)));
        }
        else if(BUTTON==p15){
            TimeOut.setText(""+dt.format(timeout15));
            Amount.setText(""+da.format(amount(timeout15)));
        }
        else if(BUTTON==p16){
            TimeOut.setText(""+dt.format(timeout16));
            Amount.setText(""+da.format(amount(timeout16)));
        }
        else if(BUTTON==p17){
            TimeOut.setText(""+dt.format(timeout17));
            Amount.setText(""+da.format(amount(timeout17)));
        }
        else if(BUTTON==p18){
            TimeOut.setText(""+dt.format(timeout18));
            Amount.setText(""+da.format(amount(timeout18)));
        }
        else if(BUTTON==p19){
            TimeOut.setText(""+dt.format(timeout19));
            Amount.setText(""+da.format(amount(timeout19)));
        }
        else if(BUTTON==p20){
            TimeOut.setText(""+dt.format(timeout20));
            Amount.setText(""+da.format(amount(timeout20)));
        }
        else if(BUTTON==p21){
            TimeOut.setText(""+dt.format(timeout21));
            Amount.setText(""+da.format(amount(timeout21)));
        }
        else if(BUTTON==p22){
            TimeOut.setText(""+dt.format(timeout22));
            Amount.setText(""+da.format(amount(timeout22)));
        }
       
    }
    
    private void Empty(){
        if(BUTTON==p1){
            timeout1=0;
        }
        else if(BUTTON==p2){
            timeout2=0;
        }
        else if(BUTTON==p3){
            timeout3=0;
        }
        else if(BUTTON==p4){
            timeout4=0;
        }else if(BUTTON==p5){
            timeout5=0;
        }else if(BUTTON==p6){
            timeout6=0;
        }else if(BUTTON==p7){
            timeout7=0;
        }else if(BUTTON==p8){
            timeout8=0;
        }else if(BUTTON==p9){
            timeout9=0;
        }else if(BUTTON==p10){
            timeout10=0;
        }else if(BUTTON==p11){
            timeout11=0;
        }else if(BUTTON==p12){
            timeout12=0;
        }else if(BUTTON==p13){
            timeout13=0;
        }else if(BUTTON==p14){
            timeout14=0;
        }else if(BUTTON==p15){
            timeout15=0;
        }else if(BUTTON==p16){
            timeout16=0;
        }else if(BUTTON==p17){
            timeout17=0;
        }else if(BUTTON==p18){
            timeout18=0;
        }else if(BUTTON==p19){
            timeout19=0;
        }else if(BUTTON==p20){
            timeout20=0;
        }else if(BUTTON==p21){
            timeout21=0;
        }else if(BUTTON==p22){
            timeout22=0;
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        p2 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        p14 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        p16 = new javax.swing.JButton();
        p15 = new javax.swing.JButton();
        p20 = new javax.swing.JButton();
        p17 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        p18 = new javax.swing.JButton();
        p22 = new javax.swing.JButton();
        p19 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        IN = new javax.swing.JPanel();
        Inbut = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        PnoIn = new javax.swing.JTextField();
        out2 = new javax.swing.JPanel();
        OK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PnoOut = new javax.swing.JTextField();
        TimeOut = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        Out = new javax.swing.JPanel();
        OutBut = new javax.swing.JButton();
        CancelEx = new javax.swing.JButton();

        jLabel4.setText("jLabel1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        p2.setBackground(null);
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });

        p1.setBackground(null);
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });

        p4.setBackground(null);
        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.png"))); // NOI18N
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });

        p3.setBackground(null);
        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });

        p6.setBackground(null);
        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.png"))); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });

        p5.setBackground(null);
        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });

        p8.setBackground(null);
        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/8.png"))); // NOI18N
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });

        p7.setBackground(null);
        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7.png"))); // NOI18N
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });

        p10.setBackground(null);
        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });

        p9.setBackground(null);
        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9.png"))); // NOI18N
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });

        p12.setBackground(null);
        p12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/12.png"))); // NOI18N
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });

        p11.setBackground(null);
        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.png"))); // NOI18N
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });

        p14.setBackground(null);
        p14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/14.png"))); // NOI18N
        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14ActionPerformed(evt);
            }
        });

        p13.setBackground(null);
        p13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13.png"))); // NOI18N
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });

        p16.setBackground(null);
        p16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/16.png"))); // NOI18N
        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16ActionPerformed(evt);
            }
        });

        p15.setBackground(null);
        p15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/15.png"))); // NOI18N
        p15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15ActionPerformed(evt);
            }
        });

        p20.setBackground(null);
        p20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20.png"))); // NOI18N
        p20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p20ActionPerformed(evt);
            }
        });

        p17.setBackground(null);
        p17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/17.png"))); // NOI18N
        p17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p17ActionPerformed(evt);
            }
        });

        p21.setBackground(null);
        p21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/21.png"))); // NOI18N
        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });

        p18.setBackground(null);
        p18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/18.png"))); // NOI18N
        p18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18ActionPerformed(evt);
            }
        });

        p22.setBackground(null);
        p22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/22.png"))); // NOI18N
        p22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p22ActionPerformed(evt);
            }
        });

        p19.setBackground(null);
        p19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/19.png"))); // NOI18N
        p19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19ActionPerformed(evt);
            }
        });

        IN.setBackground(new java.awt.Color(255, 255, 255));

        Inbut.setText("IN");
        Inbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InbutActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        PnoIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PnoIn.setBorder(null);
        PnoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnoInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INLayout = new javax.swing.GroupLayout(IN);
        IN.setLayout(INLayout);
        INLayout.setHorizontalGroup(
            INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INLayout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(PnoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(INLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Inbut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        INLayout.setVerticalGroup(
            INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(INLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inbut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        out2.setBackground(new java.awt.Color(255, 255, 255));

        OK.setText("OK ");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jLabel1.setText("TIME:");

        jLabel2.setText("AMOUNT:");

        PnoOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PnoOut.setBorder(null);
        PnoOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PnoOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout out2Layout = new javax.swing.GroupLayout(out2);
        out2.setLayout(out2Layout);
        out2Layout.setHorizontalGroup(
            out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TimeOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, out2Layout.createSequentialGroup()
                        .addComponent(PnoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        out2Layout.setVerticalGroup(
            out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(out2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnoOut, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(out2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Out.setBackground(java.awt.Color.white);

        OutBut.setText("Out");
        OutBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutButActionPerformed(evt);
            }
        });

        CancelEx.setText("Cancel");
        CancelEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OutLayout = new javax.swing.GroupLayout(Out);
        Out.setLayout(OutLayout);
        OutLayout.setHorizontalGroup(
            OutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(OutBut, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelEx, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        OutLayout.setVerticalGroup(
            OutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(OutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CancelEx, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(OutBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(p21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(out2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, Short.MAX_VALUE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(p17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(t19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(p20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(out2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
    BUTTON=p2;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P2");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P2");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p2ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
           BUTTON=p4;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P4");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P4");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p4ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        BUTTON=p6;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P6");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P6");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p6ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        BUTTON=p8;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P8");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P8");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p8ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        BUTTON=p10;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P10");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P10");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p10ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        BUTTON=p12;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P12");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P12");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p12ActionPerformed

    private void p14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14ActionPerformed
        BUTTON=p14;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P14");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P14");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p14ActionPerformed

    private void p16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16ActionPerformed
        BUTTON=p16;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P16");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P16");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p16ActionPerformed

    private void p20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p20ActionPerformed
        BUTTON=p20;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P20");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P20");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p20ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        BUTTON=p21;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P21");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P21");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p21ActionPerformed

    private void p22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p22ActionPerformed
        BUTTON=p22;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P22");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P22");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p22ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        BUTTON=p1;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P1");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P1");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
            BUTTON=p3;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P3");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P3");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p3ActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        BUTTON.setBackground(null);
        save(date(),(float)amount(GetTime()));
        Empty();
        Visible();
    }//GEN-LAST:event_OKActionPerformed

    private void PnoOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnoOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnoOutActionPerformed

    private void PnoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PnoInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PnoInActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        Visible();        // TODO add your handling code here:
    }//GEN-LAST:event_CancelActionPerformed

    private void InbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InbutActionPerformed
       
            
            OpenTIME.StartOpenTime();
            BUTTON.setBackground(Color.GREEN);
            Visible();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_InbutActionPerformed

    private void OutButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutButActionPerformed

            Visible();
            BUTTON.setBackground(Color.RED);
                OpenTIME.StopOpenTime();
                OpenTIME.GetOpenTime();
                OpenTIME.ResetOpenTime();
            SetTimeAmount();
            out2.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_OutButActionPerformed

    private void CancelExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelExActionPerformed
        Visible();
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelExActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        BUTTON=p5;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P5");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P5");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p5ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        BUTTON=p7;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P7");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P7");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p7ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        BUTTON=p9;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P9");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P9");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p9ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        BUTTON=p11;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P11");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P11");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p11ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        BUTTON=p13;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P13");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P13");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p13ActionPerformed

    private void p15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15ActionPerformed
        BUTTON=p15;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P15");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P15");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p15ActionPerformed

    private void p17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p17ActionPerformed
        BUTTON=p17;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P17");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P17");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p17ActionPerformed

    private void p18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18ActionPerformed
        BUTTON=p18;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P18");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P18");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p18ActionPerformed

    private void p19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19ActionPerformed
        BUTTON=p19;
        
        if(BUTTON.isBackgroundSet()){
            Visible();
            Out.setVisible(true);
            PnoOut.setText("P19");
        }
        else{
            BUTTON.setBackground(null);
            IN.setVisible(true);
            out2.setVisible(false);
            PnoIn.setText("P19");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_p19ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CancelEx;
    private javax.swing.JPanel IN;
    private javax.swing.JButton Inbut;
    private javax.swing.JButton OK;
    public static javax.swing.JPanel Out;
    private javax.swing.JButton OutBut;
    private javax.swing.JTextField PnoIn;
    private javax.swing.JTextField PnoOut;
    private javax.swing.JLabel TimeOut;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel out2;
    public static javax.swing.JButton p1;
    public static javax.swing.JButton p10;
    public static javax.swing.JButton p11;
    public static javax.swing.JButton p12;
    public static javax.swing.JButton p13;
    public static javax.swing.JButton p14;
    public static javax.swing.JButton p15;
    public static javax.swing.JButton p16;
    public static javax.swing.JButton p17;
    public static javax.swing.JButton p18;
    public static javax.swing.JButton p19;
    public static javax.swing.JButton p2;
    public static javax.swing.JButton p20;
    public static javax.swing.JButton p21;
    public static javax.swing.JButton p22;
    public static javax.swing.JButton p3;
    public static javax.swing.JButton p4;
    public static javax.swing.JButton p5;
    public static javax.swing.JButton p6;
    public static javax.swing.JButton p7;
    public static javax.swing.JButton p8;
    public static javax.swing.JButton p9;
    public static javax.swing.JLabel t1;
    public static javax.swing.JLabel t10;
    public static javax.swing.JLabel t11;
    public static javax.swing.JLabel t12;
    public static javax.swing.JLabel t13;
    public static javax.swing.JLabel t14;
    public static javax.swing.JLabel t15;
    public static javax.swing.JLabel t16;
    public static javax.swing.JLabel t17;
    public static javax.swing.JLabel t18;
    public static javax.swing.JLabel t19;
    public static javax.swing.JLabel t2;
    public static javax.swing.JLabel t20;
    public static javax.swing.JLabel t21;
    public static javax.swing.JLabel t22;
    public static javax.swing.JLabel t3;
    public static javax.swing.JLabel t4;
    public static javax.swing.JLabel t5;
    public static javax.swing.JLabel t6;
    public static javax.swing.JLabel t7;
    public static javax.swing.JLabel t8;
    public static javax.swing.JLabel t9;
    // End of variables declaration//GEN-END:variables
}
