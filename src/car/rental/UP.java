package car.rental;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.media.j3d.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import sun.audio.*;
import javax.sound.sampled.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class UP extends javax.swing.JPanel {

  public static FirstFrame ff;
    public UP() {
        initComponents();
        ff=new FirstFrame ();
        setLayout(new BorderLayout());
         jLabel1.setIcon(new ImageIcon(UP.class.getResource("amjad.png")));

        setSize(200,1000);
        jButton2.setIcon(new ImageIcon(UP.class.getResource("e53-128.png")));
        jButton1.setIcon(new ImageIcon(UP.class.getResource("in1.png")));
        jButton1.setRolloverIcon(new ImageIcon(UP.class.getResource("d.png ")));
        jButton2.setRolloverIcon(new ImageIcon(UP.class.getResource("dd.png ")));


        jButton2.setOpaque(false);
jButton2.setContentAreaFilled(false); //to make the content area transparent
jButton2.setBorderPainted(false);
        jButton1.setOpaque(false);
jButton1.setContentAreaFilled(false); //to make the content area transparent
jButton1.setBorderPainted(false);
//ImageIcon b=new ImageIcon(getClass().getResource("d.png"));
        //jButton2.setRolloverIcon(b);
 }
   public class shi extends Thread
   {
       public void run()
       {
           while (true)
           {
               if(MainFrame.p.getX()==0)
                       return;
            try 
            {
                Thread.sleep(1);
            } catch (InterruptedException ex) 
            {}
            MainFrame.p.setLocation(MainFrame.p.getX()-1, MainFrame.p.getY());
            MainFrame.p1.setLocation(MainFrame.p1.getX()-1, MainFrame.p1.getY());

           }
       
       }
       
   }
   
   
   public class sound extends Thread
   {
       public void run()
       {
           try {
               Thread.sleep(2);
           } catch (InterruptedException ex)    
           {}
           
        
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        amjad = new javax.swing.JLabel();
        la = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(160, 440, 80, 90);

        jButton2.setBackground(new java.awt.Color(10, 10, 4));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(40, 430, 80, 90);

        Username.setText("User Name");
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        add(Username);
        Username.setBounds(100, 260, 170, 20);

        password.setText("Password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        add(password);
        password.setBounds(100, 320, 170, 20);
        add(amjad);
        amjad.setBounds(50, 250, 40, 40);
        add(la);
        la.setBounds(50, 310, 50, 40);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(0, 0, 330, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
CarRental.f.setVisible(false);
ff.setVisible(true);
ff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//shi s=new shi();
//s.start();

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
shi s=new shi();
s.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
password.setText("");
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
      password.setBackground(Color.WHITE);
        if(password.getText().equals("Password"))
      {
          password.setText("");
      }
    }//GEN-LAST:event_passwordFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFocusLost

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
    if(password.getText().length()<9)
    {
        password.setBackground(Color.red);
        password.setText("");
        JOptionPane.showConfirmDialog(null, "enter password");
    }
    

    }//GEN-LAST:event_passwordFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        password.setText("Password");
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Username;
    private javax.swing.JLabel amjad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel la;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
