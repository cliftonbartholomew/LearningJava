/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class DrawArcs extends JFrame{
    private ArcsPanel panel = new ArcsPanel();
    
    public DrawArcs(){
        this.setTitle("DrawArcs");
        this.add(panel);
        this.setSize(250, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public void tick(){
        panel.setOffset(panel.getOffset() + 1);
    }
    
    public static void main(String[] args) throws InterruptedException{
        DrawArcs frame = new DrawArcs();
        
        int refreshRate = 150;
        
        while(true){
            Thread.sleep(20);
            frame.tick();
            
        }
        
    }
    
    private class ArcsPanel extends JPanel{
        private int offset = 0;
        
        //add offset to the current offset
        //Note: offset can only be a value between 0 - 90
        public void setOffset(int offset){
            this.offset = offset%90;
            this.repaint();
        }
        
        public int getOffset(){
            return this.offset;
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            int xCenter = this.getWidth()/2;
            int yCenter = this.getHeight()/2;
            
            int radius = (int)(Math.min(this.getWidth(), this.getHeight()) * 0.4);//0.5 means it touches the sides on the panel
            
            int x = xCenter - radius;
            int y = yCenter - radius;
            
            g.fillArc(x, y, radius*2, radius*2, 0 + offset, 30);
            g.fillArc(x, y, radius*2, radius*2, 90 + offset, 30);
            g.fillArc(x, y, radius*2, radius*2, 180 + offset, 30);
            g.fillArc(x, y, radius*2, radius*2, 270 + offset, 30);
        }
    }
}
