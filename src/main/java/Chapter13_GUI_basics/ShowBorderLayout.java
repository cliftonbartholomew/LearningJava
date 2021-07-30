/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Server
 */
public class ShowBorderLayout extends JFrame {
    public ShowBorderLayout(){
        setLayout(new BorderLayout(5, 10));
        
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("Center"), BorderLayout.CENTER);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("NORTH"), BorderLayout.NORTH);
    }
    
    public static void main(String[] args) {
        ShowBorderLayout frame = new ShowBorderLayout();
        frame.setTitle("ShowBorderLayout");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
