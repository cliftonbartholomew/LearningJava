/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Cliftonb
 */
public class SixFlags extends JFrame {
    public SixFlags(){
        Image image1 = new ImageIcon("images/italy.png").getImage();
        Image image2 = new ImageIcon("images/algeria.png").getImage();
        Image image3 = new ImageIcon("images/danish.png").getImage();
        Image image4 = new ImageIcon("images/khazak.png").getImage();
        Image image5 = new ImageIcon("images/south africa.png").getImage();
        Image image6 = new ImageIcon("images/america.png").getImage();
        
        setLayout(new GridLayout(2, 3, 5, 5));
        add(new ImageViewer(image1));
        add(new ImageViewer(image2));
        add(new ImageViewer(image3));
        add(new ImageViewer(image4));
        add(new ImageViewer(image5));
        add(new ImageViewer(image6));
        
    }
    
    public static void main(String[] args) {
        SixFlags frame = new SixFlags();
        frame.setSize(400, 320);
        frame.setTitle("Six Flags");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
