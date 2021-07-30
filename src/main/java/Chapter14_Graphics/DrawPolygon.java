/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class DrawPolygon extends JFrame {
    public DrawPolygon(int numSides){
        setTitle("DrawPolygon");
        add(new PolyPanels(numSides));
    }
    
    public static void main(String[] args) {
        DrawPolygon frame = new DrawPolygon(5);
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    class PolyPanels extends JPanel{
        private int numSides = 4;
        
        public PolyPanels(){
        }
        
        public PolyPanels(int numSides){
            this.numSides = numSides;
        }
        
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            
            int xCenter = this.getWidth()/2;
            int yCenter = this.getHeight()/2;
            int radius = (int)(Math.min(xCenter, yCenter) * 0.9);
            
            Polygon poly = new Polygon();
            
            for(int i = 0; i < numSides; i++){
                int x = (int)(xCenter + radius * Math.cos(i * 2 * Math.PI/numSides));
                int y = (int)(yCenter - radius * Math.sin(i * 2 * Math.PI/numSides));
                poly.addPoint(x , y);
            }
            
            g.drawPolygon(poly);
        }
    }
}
