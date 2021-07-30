/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Server
 */
public class FontAndColor {
    public static void main(String[] args) {
        Color c = new Color(128, 100, 100);
        JButton b = new JButton("Butt");
        Font f = new Font("Serif", Font.BOLD, 16);
        b.setFont(f);
        b.setBackground(c);
        
        JFrame frame = new JFrame("Test Color and Font");
        frame.add(b);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
        
    }
}
