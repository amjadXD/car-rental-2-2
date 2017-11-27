/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.rental;

import javax.swing.JFrame;

/**
 *
 * @author mbp
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
public static MainFrame f;
    public static void main(String[] args) {
        f=new MainFrame();
      f.setLocation(100, 50);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }
    
    
}
