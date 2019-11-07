/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;


/**
 *
 * @author Reza
 */
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("tittle");
                JPanel p = new JPanel();
                JButton b = new JButton("press me");
                
                p.add (b);
                f.setContentPane(p);
                
                f.show();
                       
        
                
    }
    
}
