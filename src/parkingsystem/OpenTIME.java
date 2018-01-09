/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingsystem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Patrick Dale
 */
public class OpenTIME {
    
    public static int delay=1000;
    public static int ot1=0,ot2=0,ot3=0,ot4=0,ot5=0,ot6=0,ot7=0,ot8=0,ot9=0,ot10=0,ot11=0,ot12=0,ot13=0,ot14=0,ot15=0,ot16=0,ot17=0,ot18=0,ot19=0,ot20=0,ot21=0,ot22=0;
    
    public static Timer time1 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot1++;
            if(ot1<60){
            Parking.t1.setText(""+ot1+"m");
            }
            else if(ot1==60){
            Parking.t1.setText(""+1+"h");
            }
            else if(ot1>60){
            Parking.t1.setText(""+(int)ot1/60+"h"+ot1%60+"m");
            }
        }
        });
    
     public static Timer time2 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot2++;
            if(ot2<60){
            Parking.t2.setText(""+ot2+"m");
            }
            else if(ot2==60){
            Parking.t2.setText(""+1+"h");
            }
            else if(ot2>60){
            Parking.t2.setText(""+(int)ot2/60+"h"+ot2%60+"m");
            }
        }
        });
     public static Timer time3 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot3++;
            if(ot3<60){
            Parking.t3.setText(""+ot3+"m");
            }
            else if(ot3==60){
            Parking.t3.setText(""+1+"h");
            }
            else if(ot3>60){
            Parking.t3.setText(""+(int)ot3/60+"h"+ot3%60+"m");
            }
        }
        });
     public static Timer time4 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot4++;
            if(ot4<60){
            Parking.t4.setText(""+ot4+"m");
            }
            else if(ot4==60){
            Parking.t4.setText(""+1+"h");
            }
            else if(ot4>60){
            Parking.t4.setText(""+(int)ot4/60+"h"+ot4%60+"m");
            }
        }
        });
     public static Timer time5 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot5++;
            if(ot5<60){
            Parking.t5.setText(""+ot5+"m");
            }
            else if(ot5==60){
            Parking.t5.setText(""+1+"h");
            }
            else if(ot5>60){
            Parking.t5.setText(""+(int)ot5/60+"h"+ot5%60+"m");
            }
        }
        });
     public static Timer time6 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot6++;
            if(ot6<60){
            Parking.t6.setText(""+ot6+"m");
            }
            else if(ot6==60){
            Parking.t6.setText(""+1+"h");
            }
            else if(ot6>60){
            Parking.t6.setText(""+(int)ot6/60+"h"+ot6%60+"m");
            }
        }
        });
     public static Timer time7 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot7++;
            if(ot7<60){
            Parking.t7.setText(""+ot7+"m");
            }
            else if(ot7==60){
            Parking.t7.setText(""+1+"h");
            }
            else if(ot7>60){
            Parking.t7.setText(""+(int)ot7/60+"h"+ot7%60+"m");
            }
        }
        });
     public static Timer time8 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot8++;
            if(ot8<60){
            Parking.t8.setText(""+ot8+"m");
            }
            else if(ot8==60){
            Parking.t8.setText(""+1+"h");
            }
            else if(ot8>60){
            Parking.t8.setText(""+(int)ot8/60+"h"+ot8%60+"m");
            }
        }
        });
     public static Timer time9 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot9++;
            if(ot9<60){
            Parking.t9.setText(""+ot9+"m");
            }
            else if(ot9==60){
            Parking.t9.setText(""+1+"h");
            }
            else if(ot9>60){
            Parking.t9.setText(""+(int)ot9/60+"h"+ot9%60+"m");
            }
        }
        });
     public static Timer time10 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot10++;
            if(ot10<60){
            Parking.t10.setText(""+ot10+"m");
            }
            else if(ot10==60){
            Parking.t10.setText(""+1+"h");
            }
            else if(ot10>60){
            Parking.t10.setText(""+(int)ot10/60+"h"+ot10%60+"m");
            }
        }
        });
     public static Timer time11 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot11++;
            if(ot11<60){
            Parking.t11.setText(""+ot11+"m");
            }
            else if(ot11==60){
            Parking.t11.setText(""+1+"h");
            }
            else if(ot11>60){
            Parking.t11.setText(""+(int)ot11/60+"h"+ot11%60+"m");
            }
        }
        });
     
     public static Timer time12 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot12++;
            if(ot12<60){
            Parking.t12.setText(""+ot12+"m");
            }
            else if(ot12==60){
            Parking.t12.setText(""+1+"h");
            }
            else if(ot12>60){
            Parking.t12.setText(""+(int)ot12/60+"h"+ot12%60+"m");
            }
        }
        });
     public static Timer time13 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot13++;
            if(ot13<60){
            Parking.t13.setText(""+ot13+"m");
            }
            else if(ot13==60){
            Parking.t13.setText(""+1+"h");
            }
            else if(ot13>60){
            Parking.t13.setText(""+(int)ot13/60+"h"+ot13%60+"m");
            }
        }
        });
     public static Timer time14 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot14++;
            if(ot14<60){
            Parking.t14.setText(""+ot14+"m");
            }
            else if(ot14==60){
            Parking.t14.setText(""+1+"h");
            }
            else if(ot14>60){
            Parking.t14.setText(""+(int)ot14/60+"h"+ot14%60+"m");
            }
        }
        });
     public static Timer time15 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot15++;
            if(ot15<60){
            Parking.t15.setText(""+ot15+"m");
            }
            else if(ot15==60){
            Parking.t15.setText(""+1+"h");
            }
            else if(ot15>60){
            Parking.t15.setText(""+(int)ot15/60+"h"+ot15%60+"m");
            }
        }
        });
     public static Timer time16 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot16++;
            if(ot16<60){
            Parking.t16.setText(""+ot16+"m");
            }
            else if(ot16==60){
            Parking.t2.setText(""+1+"h");
            }
            else if(ot16>60){
            Parking.t16.setText(""+(int)ot16/60+"h"+ot16%60+"m");
            }
        }
        });
     public static Timer time17 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot17++;
            if(ot17<60){
            Parking.t17.setText(""+ot17+"m");
            }
            else if(ot17==60){
            Parking.t17.setText(""+1+"h");
            }
            else if(ot17>60){
            Parking.t17.setText(""+(int)ot17/60+"h"+ot17%60+"m");
            }
        }
        });
     public static Timer time18 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot18++;
            if(ot18<60){
            Parking.t18.setText(""+ot18+"m");
            }
            else if(ot18==60){
            Parking.t18.setText(""+1+"h");
            }
            else if(ot18>60){
            Parking.t18.setText(""+(int)ot18/60+"h"+ot18%60+"m");
            }
        }
        });
     public static Timer time19 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot19++;
            if(ot19<60){
            Parking.t19.setText(""+ot19+"m");
            }
            else if(ot19==60){
            Parking.t19.setText(""+1+"h");
            }
            else if(ot19>60){
            Parking.t19.setText(""+(int)ot19/60+"h"+ot19%60+"m");
            }
        }
        });
     public static Timer time20 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot20++;
            if(ot20<60){
            Parking.t20.setText(""+ot20+"m");
            }
            else if(ot20==60){
            Parking.t20.setText(""+1+"h");
            }
            else if(ot20>60){
            Parking.t20.setText(""+(int)ot20/60+"h"+ot20%60+"m");
            }
        }
        });
      public static Timer time21 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot21++;
            if(ot21<60){
            Parking.t21.setText(""+ot21+"m");
            }
            else if(ot21==60){
            Parking.t21.setText(""+1+"h");
            }
            else if(ot21>60){
            Parking.t21.setText(""+(int)ot21/60+"h"+ot21%60+"m");
            }
        }
        });
       public static Timer time22 = new Timer(delay,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ot22++;
            if(ot22<60){
            Parking.t22.setText(""+ot22+"m");
            }
            else if(ot22==60){
            Parking.t22.setText(""+1+"h");
            }
            else if(ot22>60){
            Parking.t22.setText(""+(int)ot22/60+"h"+ot22%60+"m");
            }
        }
        });
     
  
    
    public static void StartOpenTime(){
        if(Parking.BUTTON==Parking.p1){
            time1.start();
        }
        else if(Parking.BUTTON==Parking.p2){
            time2.start();
        }
        else if(Parking.BUTTON==Parking.p3){
            time3.start();
        }
        else if(Parking.BUTTON==Parking.p4){
            time4.start();
        }
        else if(Parking.BUTTON==Parking.p5){
            time5.start();
        }else if(Parking.BUTTON==Parking.p6){
            time6.start();
        }else if(Parking.BUTTON==Parking.p7){
            time7.start();
        }else if(Parking.BUTTON==Parking.p8){
            time8.start();
        }else if(Parking.BUTTON==Parking.p9){
            time9.start();
        }else if(Parking.BUTTON==Parking.p10){
            time10.start();
        }else if(Parking.BUTTON==Parking.p11){
            time11.start();
        }else if(Parking.BUTTON==Parking.p12){
            time12.start();
        }else if(Parking.BUTTON==Parking.p13){
            time13.start();
        }
        else if(Parking.BUTTON==Parking.p14){
            time14.start();
        }
        else if(Parking.BUTTON==Parking.p15){
            time15.start();
        }else if(Parking.BUTTON==Parking.p16){
            time16.start();
        }else if(Parking.BUTTON==Parking.p17){
            time17.start();
        }else if(Parking.BUTTON==Parking.p18){
            time18.start();
        }else if(Parking.BUTTON==Parking.p19){
            time19.start();
        }else if(Parking.BUTTON==Parking.p20){
            time20.start();
        }
        else if(Parking.BUTTON==Parking.p21){
            time21.start();
        }
        else if(Parking.BUTTON==Parking.p22){
            time22.start();
        }    
       
    }  
    public static void StopOpenTime(){
        if(Parking.BUTTON==Parking.p1){
            time1.stop();
        }
        else if(Parking.BUTTON==Parking.p2){
            time2.stop();
        }
        else if(Parking.BUTTON==Parking.p3){
            time3.stop();
        }
        else if(Parking.BUTTON==Parking.p4){
            time4.stop();
        }
        else if(Parking.BUTTON==Parking.p5){
            time5.stop();
        }
        else if(Parking.BUTTON==Parking.p6){
            time6.stop();
        }
        else if(Parking.BUTTON==Parking.p7){
            time7.stop();
        }
        else if(Parking.BUTTON==Parking.p8){
            time8.stop();
        }
        else if(Parking.BUTTON==Parking.p8){
            time8.stop();
        }
        else if(Parking.BUTTON==Parking.p9){
            time9.stop();
        }
        else if(Parking.BUTTON==Parking.p10){
            time10.stop();
        }
        else if(Parking.BUTTON==Parking.p11){
            time11.stop();
        }
        else if(Parking.BUTTON==Parking.p12){
            time12.stop();
        }
        else if(Parking.BUTTON==Parking.p13){
            time13.stop();
        }
        else if(Parking.BUTTON==Parking.p14){
            time14.stop();
        }
        else if(Parking.BUTTON==Parking.p15){
            time15.stop();
        }
        else if(Parking.BUTTON==Parking.p16){
            time2.stop();
        }
        else if(Parking.BUTTON==Parking.p17){
            time17.stop();
        }
        else if(Parking.BUTTON==Parking.p18){
            time18.stop();
        }
        else if(Parking.BUTTON==Parking.p19){
            time19.stop();
        }
        else if(Parking.BUTTON==Parking.p20){
            time20.stop();
        }
        else if(Parking.BUTTON==Parking.p21){
            time21.stop();
        }
        else if(Parking.BUTTON==Parking.p22){
            time22.stop();
        }
    }
    
    public static void ResetOpenTime(){
        if(Parking.BUTTON==Parking.p1){
            Parking.t1.setText("");
            ot1=0;
        }
        else if(Parking.BUTTON==Parking.p2){
            Parking.t2.setText("");
            ot2=0;
        }
        else  if(Parking.BUTTON==Parking.p3){
            Parking.t3.setText("");
            ot3=0;
        }
        else  if(Parking.BUTTON==Parking.p4){
            Parking.t4.setText("");
            ot4=0;
        }
        else  if(Parking.BUTTON==Parking.p5){
            Parking.t5.setText("");
            ot5=0;
        }
        else  if(Parking.BUTTON==Parking.p5){
            Parking.t5.setText("");
            ot5=0;
        }
        else  if(Parking.BUTTON==Parking.p6){
            Parking.t6.setText("");
            ot6=0;
        }
        else  if(Parking.BUTTON==Parking.p7){
            Parking.t7.setText("");
            ot7=0;
        }
        else  if(Parking.BUTTON==Parking.p8){
            Parking.t8.setText("");
            ot8=0;
        }
        else  if(Parking.BUTTON==Parking.p9){
            Parking.t9.setText("");
            ot9=0;
        }
        else  if(Parking.BUTTON==Parking.p10){
            Parking.t10.setText("");
            ot10=0;
        }
        else  if(Parking.BUTTON==Parking.p11){
            Parking.t11.setText("");
            ot11=0;
        }
        else  if(Parking.BUTTON==Parking.p12){
            Parking.t12.setText("");
            ot12=0;
        }
        else  if(Parking.BUTTON==Parking.p13){
            Parking.t13.setText("");
            ot13=0;
        }
        else  if(Parking.BUTTON==Parking.p14){
            Parking.t14.setText("");
            ot14=0;
        }
        else  if(Parking.BUTTON==Parking.p15){
            Parking.t15.setText("");
            ot15=0;
        }
        else  if(Parking.BUTTON==Parking.p16){
            Parking.t16.setText("");
            ot16=0;
        }
        else  if(Parking.BUTTON==Parking.p17){
            Parking.t17.setText("");
            ot17=0;
        }
        else  if(Parking.BUTTON==Parking.p18){
            Parking.t18.setText("");
            ot18=0;
        }
        else  if(Parking.BUTTON==Parking.p19){
            Parking.t19.setText("");
            ot19=0;
        }
        else  if(Parking.BUTTON==Parking.p20){
            Parking.t20.setText("");
            ot20=0;
        }
        else  if(Parking.BUTTON==Parking.p21){
            Parking.t21.setText("");
            ot21=0;
        }
        else  if(Parking.BUTTON==Parking.p22){
            Parking.t22.setText("");
            ot22=0;
        }
        
        
    }
    
    public static void GetOpenTime(){    
        if(Parking.BUTTON==Parking.p1){
            Parking.timeout1=(float)ot1/60;
        }
        
        else if(Parking.BUTTON==Parking.p2){
            Parking.timeout2=(float)ot2/60;
        }
        else if(Parking.BUTTON==Parking.p3){
            Parking.timeout3=(float)ot3/60;
        }
        else if(Parking.BUTTON==Parking.p4){
            Parking.timeout4=(float)ot4/60;
        }
        else if(Parking.BUTTON==Parking.p5){
            Parking.timeout5=(float)ot5/60;
        }
        else if(Parking.BUTTON==Parking.p6){
            Parking.timeout6=(float)ot6/60;
        }
        else if(Parking.BUTTON==Parking.p7){
            Parking.timeout7=(float)ot7/60;
        }
        else if(Parking.BUTTON==Parking.p8){
            Parking.timeout8=(float)ot8/60;
        }
        else if(Parking.BUTTON==Parking.p9){
            Parking.timeout9=(float)ot9/60;
        }
        else if(Parking.BUTTON==Parking.p10){
            Parking.timeout10=(float)ot10/60;
        }
        else if(Parking.BUTTON==Parking.p11){
            Parking.timeout11=(float)ot11/60;
        }
        else if(Parking.BUTTON==Parking.p12){
            Parking.timeout12=(float)ot12/60;
        }
        else if(Parking.BUTTON==Parking.p13){
            Parking.timeout13=(float)ot13/60;
        }
        else if(Parking.BUTTON==Parking.p14){
            Parking.timeout14=(float)ot14/60;
        }
        else if(Parking.BUTTON==Parking.p15){
            Parking.timeout15=(float)ot15/60;
        }
        else if(Parking.BUTTON==Parking.p16){
            Parking.timeout16=(float)ot16/60;
        }
        else if(Parking.BUTTON==Parking.p17){
            Parking.timeout17=(float)ot17/60;
        }
        else if(Parking.BUTTON==Parking.p18){
            Parking.timeout18=(float)ot18/60;
        }
        else if(Parking.BUTTON==Parking.p19){
            Parking.timeout19=(float)ot19/60;
        }
        else if(Parking.BUTTON==Parking.p20){
            Parking.timeout20=(float)ot20/60;
        }
        else if(Parking.BUTTON==Parking.p21){
            Parking.timeout21=(float)ot21/60;
        }
        else if(Parking.BUTTON==Parking.p22){
            Parking.timeout22=(float)ot22/60;
        }
        
        
}   
}
    

