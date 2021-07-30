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
public class TriangleFrame extends JFrame {
    public TriangleFrame(){
        add(new TrianglePanel());
    }
    
    public static void main(String[] args) {
        TriangleFrame frame = new TriangleFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private class TrianglePanel extends JPanel{
        
        
        public TrianglePanel(){
            
        }
        
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            this.setFont(new Font("Arial", Font.BOLD, 8));
            
            
            this.setFont(new Font("Arial", Font.BOLD, 12));
            //The graphics object holds the font, background color etc.
            FontMetrics fm = g.getFontMetrics();
            
            int spacing = 3;
            int currentX = 0;
            int currentY = 0;
            int fontHeight = fm.getHeight();
            int fontWidth = fm.stringWidth("88");
            
            int triangleLength = Math.min(getHeight(), getWidth())/(fontHeight + spacing);
            for(int row = 1; row < triangleLength + 1; row ++){
                currentY = row * fm.getAscent() + row*spacing;
                currentX = spacing;
                for(int col = 1; col < triangleLength + 1 - row; col ++){
                    g.drawString("" + col, currentX, currentY);
                    if(col < 10)
                        currentX += spacing + fontWidth/2;
                    else
                        currentX += spacing + fontWidth;
                }
            }
        }
    }
}
