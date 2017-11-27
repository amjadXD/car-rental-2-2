/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental;


import java.awt.BorderLayout;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author amjad
 */
public class FirstFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstFrame
     */
    //public static JLabel jLabel1;
     public static Booking book; 
     public static customer g;
     public static car Car;
     public static employee ew;
     public static SettingPanel ss;
    public FirstFrame() {
        initComponents();
        
        ss =new SettingPanel();
        setLocation(100,50);
        jLabel1.setIcon(new ImageIcon(FirstFrame.class.getResource("amjad221.png")));
        jLabel1.setSize(1100, 620);
                Car=new car();
                g=new customer();
               
                jLabel1.setLayout(null);
                ew=new employee();
                book=new Booking();
        setSize(jLabel1.getSize());
        setLayout(new BorderLayout());
        add(jLabel1,BorderLayout.CENTER);
        showicon.setIcon(new ImageIcon(FirstFrame.class.getResource("showicon1.png")));
        logout.setIcon(new ImageIcon(FirstFrame.class.getResource("logout312.png")));
        caricon.setIcon(new ImageIcon(FirstFrame.class.getResource("Black_car.png")));
        custicon.setIcon(new ImageIcon(FirstFrame.class.getResource("customer_1.png")));
        empicon.setIcon(new ImageIcon(FirstFrame.class.getResource("personal.png")));
        calendericon.setIcon(new ImageIcon(FirstFrame.class.getResource("run1.png")));
        settingicon.setIcon(new ImageIcon(FirstFrame.class.getResource("gear-set.png")));

        settingicon.setOpaque(false);
        settingicon.setContentAreaFilled(false); //to make the content area transparent
        settingicon.setBorderPainted(false);
        custicon.setOpaque(false);
        custicon.setContentAreaFilled(false); //to make the content area transparent
        custicon.setBorderPainted(false);
        empicon.setOpaque(false);
        empicon.setContentAreaFilled(false); //to make the content area transparent
        empicon.setBorderPainted(false);
        calendericon.setOpaque(false);
        calendericon.setContentAreaFilled(false); //to make the content area transparent
        calendericon.setBorderPainted(false);
        caricon.setOpaque(false);
        caricon.setContentAreaFilled(false); //to make the content area transparent
        caricon.setBorderPainted(false);
         logout.setOpaque(false);
        logout.setContentAreaFilled(false); //to make the content area transparent
        logout.setBorderPainted(false);
          showicon.setOpaque(false);
        showicon.setContentAreaFilled(false); //to make the content area transparent
        showicon.setBorderPainted(false);
        caricon.setLocation(1150, 10);
        custicon.setLocation(1150, 120);
        empicon.setLocation(1150, 230);
        calendericon.setLocation(1150,340);
        settingicon.setLocation(1150, 450);
        showicon.setLocation(950, 460);
        logout.setLocation(40, 470);
        
    }

    private void setVisabel(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
       public class shi1 extends Thread
   {
           
   JButton a;        
   public shi1(JButton b)
   {
   a=b;
   
   }
       public void run()
       {
           while (true)
           {
               if(a.getX()==980)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            a.setLocation(a.getX()-1, a.getY());
           }
       
       }
       
   }
       
     public class shi2 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(custicon.getX()==980)
                       return;
            try 
            {
                Thread.sleep(2);
            } catch (InterruptedException ex) 
            {}
            custicon.setLocation(custicon.getX()-1, custicon.getY());
           }
       
       }
       
   }
          public class shi44 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(showicon.getX()==850)
                       return;
            try 
            {
                Thread.sleep(3);
            } catch (InterruptedException ex) 
            {}
            showicon.setLocation(showicon.getX()-1, showicon.getY());
           }
       
       }
       
   }
                public class shi34 extends Thread
   {
                    JButton a;
                    public shi34(JButton b)
                    {
                        a=b;
                    }
       public void run()
       {
           
           for(int i=0;i<100;i++) 
           {
              
            try 
            {
                Thread.sleep(3);
            } catch (InterruptedException ex) 
            {}
            a.setLocation(a.getX()+1, a.getY());
           }
       
       }
       
   }
     public class shi3 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(empicon.getX()==980)
                       return;
            try 
            {
                Thread.sleep(3);
            } catch (InterruptedException ex) 
            {}
            empicon.setLocation(empicon.getX()-1, empicon.getY());
           }
       
       }
       
   }
   
     public class shi5 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(settingicon.getX()==980)
                       return;
            try 
            {
                Thread.sleep(5);
            } catch (InterruptedException ex) 
            {}
            settingicon.setLocation(settingicon.getX()-1, settingicon.getY());
           }
       
       }
       
   }
   
     public class shi4 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(calendericon.getX()==980)
                       return;
            try 
            {
                Thread.sleep(4);
            } catch (InterruptedException ex) 
            {}
            calendericon.setLocation(calendericon.getX()-1, calendericon.getY());
           }
       
       }
       
   }
   
public class shisetting extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(ss.getY()>=70)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            ss.setLocation(ss.getX(), ss.getY()+1);
           }
       
       }
       
   }
public class shicar extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(Car.getY() >=70)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            Car.setLocation(Car.getX(), Car.getY()+1);
           }
       
       }
       
   }
     public class shicar1 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(FirstFrame.Car.getY()>=1100)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            FirstFrame.Car.setLocation(FirstFrame.Car.getX(), FirstFrame.Car.getY()+1);
           }
       
       }
       
   }

public class shicustomer extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(g.getY() >=70)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            g.setLocation(g.getX(), g.getY()+1);
           }
       
       }
       
   }
public class shicustomer1 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(g.getY() >=1100)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            g.setLocation(g.getX(), g.getY()+1);
           }
       
       }
       
   }
public class book1 extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(book.getY() >=1100)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            book.setLocation(book.getX(), book.getY()+1);
           }
       
       }
       
   }

public class shisetting1 extends Thread
{
  public void run()
  {
      while(true)
      {
     
       if(FirstFrame.ss.getY()>=1100)
           return;
          try{
              Thread.sleep(1);
              
          } catch (InterruptedException ex) {}
          FirstFrame.ss.setLocation(FirstFrame.ss.getX(), FirstFrame.ss.getY()+1);
      }
      
      
  }
    
    
}
public class shiemployee extends Thread
{
  public void run()
  {
      while(true)
      {
     
       if(ew.getY()>=50)
           return;
          try{
              Thread.sleep(1);
              
          } catch (InterruptedException ex) {}
          ew.setLocation(ew.getX(), ew.getY()+1);
      }
      
      
  }
    
    
}
public class shiemployee1 extends Thread
{
  public void run()
  {
      while(true)
      {
     
       if(ew.getY()>=1100)
           return;
          try{
              Thread.sleep(1);
              
          } catch (InterruptedException ex) {}
          ew.setLocation(ew.getX(), ew.getY()+1);
      }
      
      
  }
    
    
}
public class shicalender extends Thread
{
  public void run()
  {
      while(true)
      {
     
       if(book.getY()>=100)
           return;
          try{
              Thread.sleep(1);
              
          } catch (InterruptedException ex) {}
          book.setLocation(book.getX(), book.getY()+1);
      }
      
      
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

        caricon = new javax.swing.JButton();
        custicon = new javax.swing.JButton();
        empicon = new javax.swing.JButton();
        calendericon = new javax.swing.JButton();
        settingicon = new javax.swing.JButton();
        showicon = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        caricon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariconActionPerformed(evt);
            }
        });
        getContentPane().add(caricon);
        caricon.setBounds(640, 30, 120, 120);

        custicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custiconActionPerformed(evt);
            }
        });
        getContentPane().add(custicon);
        custicon.setBounds(270, 120, 130, 120);

        empicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empiconActionPerformed(evt);
            }
        });
        getContentPane().add(empicon);
        empicon.setBounds(650, 150, 110, 110);

        calendericon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calendericonActionPerformed(evt);
            }
        });
        getContentPane().add(calendericon);
        calendericon.setBounds(650, 260, 120, 110);

        settingicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingiconActionPerformed(evt);
            }
        });
        getContentPane().add(settingicon);
        settingicon.setBounds(310, 390, 120, 120);

        showicon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showiconActionPerformed(evt);
            }
        });
        getContentPane().add(showicon);
        showicon.setBounds(520, 380, 140, 110);

        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(40, 410, 140, 90);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 1300, 830);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custiconActionPerformed
       // setVisible(false);
              
                jLabel1.add(g);
                g.setSize(340,500);
                g.setLocation(400, -500);
        shicustomer s=new shicustomer();
        s.start();
        if(book.getY()>=100)
        {
            book1 bb=new book1();
            bb.start();
        }
         if(Car.getY()>=70)
        {
            shicar1 ss1=new shicar1();
            ss1.start();
            
        }
      
            if(ew.getY()>=50)
            {
                shiemployee1 s3= new shiemployee1();
                s3.start();
                
            }
               if(ss.getY()>=70 )
        {
            shisetting1 c=new shisetting1();
            c.start();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_custiconActionPerformed

    private void showiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showiconActionPerformed
       
        if(showicon.getX()>850)
       {
        showicon.setIcon(new ImageIcon(FirstFrame.class.getResource("next.png")));
        
        shi44 s6=new shi44();
        s6.start();
        shi1 s1=new shi1(caricon);
        s1.start();
        shi2 s2=new shi2();
        s2.start();
        shi3 s3=new shi3();
        s3.start();
        shi4 s4=new shi4();
        s4.start();
        shi5 s5=new shi5();
        s5.start();
       }
       // if(showicon.getX()==850)
        else{
            shi34 ss =new shi34(this.calendericon);
             ss.start();
              shi34 ss1 =new shi34(this.caricon);
             ss1.start();
              shi34 ss2 =new shi34(this.custicon);
             ss2.start();
              shi34 ss3 =new shi34(this.empicon);
             ss3.start();
              shi34 ss4 =new shi34(this.settingicon);
             ss4.start();
              shi34 ss5 =new shi34(this.showicon);
             ss5.start();
            

        showicon.setIcon(new ImageIcon(FirstFrame.class.getResource("showicon1.png")));
        
        
        
        }
    }//GEN-LAST:event_showiconActionPerformed

    private void settingiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingiconActionPerformed
        ss.setSize(250 ,250);
        jLabel1.add(ss);
        ss.setLocation(400, -250);
        shisetting s=new shisetting();
        s.start();
    
        if(Car.getY()>=100)
        {
            shicar1 ss1=new shicar1();
            ss1.start();
            
        }
        if(book.getY()>=100)
        {
            book1 bb=new book1();
            bb.start();
        }
          if(g.getY()>=50)
     {
        shicustomer1 s2=new shicustomer1();
        s2.start();
     }
            if(ew.getY()>=50)
            {
                shiemployee1 s3= new shiemployee1();
                s3.start();
                
            }
    }//GEN-LAST:event_settingiconActionPerformed

    private void cariconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariconActionPerformed
        Car.setSize(300, 500);
        jLabel1.add(Car);
        Car.setLocation(400, -450);
        shicar s=new shicar();
        s.start();
        if(ss.getY()>=70 )
        {
            shisetting1 c=new shisetting1();
            c.start();
        }
     if(g.getY()>=50)
     {
        shicustomer1 s2=new shicustomer1();
        s2.start();
     }
            if(ew.getY()>=50)
            {
                shiemployee1 s3= new shiemployee1();
                s3.start();
                
            }
            if(book.getY()>=100)
        {
            book1 bb=new book1();
            bb.start();
        }
       // if(Car.getY()==200)
        //{
          //  shisetting1 t=new shisetting1();
            //t.start();
        //}
    }//GEN-LAST:event_cariconActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       if(showicon.getX()==850)
       {
           showicon.setLocation(950, 460);
           
       }
        UP.ff.setVisible(false);
        CarRental.f.setVisible(true);
       caricon.setLocation(1150, 10);
        custicon.setLocation(1150, 120);
        empicon.setLocation(1150, 230);
        calendericon.setLocation(1150,340);
        settingicon.setLocation(1150, 450);
        ss.setLocation(-760, -800);
        Car.setLocation(-705, -800);
        g.setLocation(-666,-800);
        ew.setLocation(-666, -800);
       

    }//GEN-LAST:event_logoutActionPerformed

    private void calendericonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendericonActionPerformed
      book.setSize(400,400);
      book.setLocation(400,-400);
      jLabel1.add(book);
      shicalender s=new shicalender();
      s.start();
   
       if(ew.getY()>=50)
            {
                shiemployee1 s3= new shiemployee1();
                s3.start();
                
            }
                  if(ss.getY()>=70 )
        {
            shisetting1 c=new shisetting1();
            c.start();
        }
     if(g.getY()>=50)
     {
        shicustomer1 s2=new shicustomer1();
        s2.start();
     }
         if(Car.getY()>=70)
        {
            shicar1 ss1=new shicar1();
            ss1.start();
            
        }
        
    }//GEN-LAST:event_calendericonActionPerformed

    private void empiconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empiconActionPerformed
       ew.setSize(320,500);
       ew.setLocation(400, -500);
       jLabel1.add(ew);
       shiemployee s=new shiemployee();
       s.start();
       if(book.getY()>=100)
        {
            book1 bb=new book1();
            bb.start();
        }
               if(ss.getY()>=70 )
        {
            shisetting1 c=new shisetting1();
            c.start();
        }
     if(g.getY()>=50)
     {
        shicustomer1 s2=new shicustomer1();
        s2.start();
     }
         if(Car.getY()>=70)
        {
            shicar1 ss1=new shicar1();
            ss1.start();
            
        }
    }//GEN-LAST:event_empiconActionPerformed

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
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calendericon;
    private javax.swing.JButton caricon;
    private javax.swing.JButton custicon;
    private javax.swing.JButton empicon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton settingicon;
    private javax.swing.JButton showicon;
    // End of variables declaration//GEN-END:variables
}
