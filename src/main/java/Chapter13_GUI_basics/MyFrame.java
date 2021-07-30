/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import javax.swing.*;
/**
 *
 * @author Server
 */
public class MyFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        
        JButton b1 = new JButton("HEY!");
        //a button is always centered and takes up the whole frame with the 
        //default layout manager
        frame.add(b1);
                
        //if not set, the frame is only shows the title bar
        frame.setSize(400, 300);
        
        //the frame is not displayed until this function is called
        frame.setVisible(true);
        
        //this centers the frame on the screen
        frame.setLocationRelativeTo(null);
        
        //tells the application to terminate when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
    }
}
