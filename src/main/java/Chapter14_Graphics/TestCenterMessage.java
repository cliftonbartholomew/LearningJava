/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Cliftonb
 */
public class TestCenterMessage extends JFrame{

    public TestCenterMessage() {
        CenterMessage messagePanel = new CenterMessage();
        add(messagePanel);
        messagePanel.setBackground(Color.white);
        messagePanel.setFont(new Font("Californian FB", Font.BOLD, 30));        
    }
    
    public static void main(String[] args) {
        TestCenterMessage frame = new TestCenterMessage();
        
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    
    
    //A panel which displays Hello World centered
    private class CenterMessage extends JPanel{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            //get the current font metrics (graphics holds the current font)
            FontMetrics fm = g.getFontMetrics();
            
            //get the metric details from fm
            int stringWidth = fm.stringWidth("Hello World");
            int stringAscent = fm.getAscent();
            
            //left most baseline point
            int xPos = this.getWidth()/2 - stringWidth/2;
            int yPos = this.getHeight()/2 + stringAscent/2;
            
            g.drawString("Hello World", xPos, yPos);
            
            
        }
    }
}
