/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class AdditionTable extends JFrame {
    public AdditionTable(){
        add(new AdditionPanel());
    }
    
    public static void main(String[] args) {
        AdditionTable frame = new AdditionTable();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private class AdditionPanel extends JPanel{
        
        
        public AdditionPanel(){
            
        }
        
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            int xCentre = this.getWidth()/2;
            int yCenter = this.getHeight()/2;
            
            String heading = "Addition Table";
            this.setFont(new Font("Arial", Font.BOLD, 20));
            //The graphics object holds the font, background color etc.
            FontMetrics fm = g.getFontMetrics();
            g.drawString(heading, xCentre - fm.stringWidth(heading)/2, fm.getAscent()*2);
            
        }
    }
}
