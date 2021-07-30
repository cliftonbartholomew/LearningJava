/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class FigurePanel extends JPanel{
    //Define constants
    
    public static final int LINE = 1;
    public static final int RECTANGLE = 2;
    public static final int ROUND_RECTANGLE = 3;
    public static final int OVAL = 4;
    
    private int type = 1;
    private boolean filled = false;
    
    
    //Constructor with the above default fields 
    public FigurePanel(){
    }
    
    public FigurePanel(int type){
        this.type = type;
    }
    
    public FigurePanel(int type, boolean filled){
        this.type = type;
        this.filled = filled;
    }
    
    //What you want in the panel is drawn in the paintComponent() method and NOT
    //in the constructor. Constructor sets up objects, paint component continually
    //sets up graphics
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int width = this.getWidth();
        int height = this.getHeight();
        
        switch(this.type){
            case LINE:
                g.setColor(Color.BLACK);
                g.drawLine(10, 10, width - 10, height - 10); //full width and height of the panel
                g.drawLine(0, height - 10, width - 10, 10);
                break;
            case RECTANGLE:
                g.setColor(Color.blue);
                if(filled){
                    g.fillRect((int)(0.1 * width), (int)(0.1 * height), (int)(width*0.9), (int)(height*0.9));                    
                }
                else{
                    g.drawRect((int)(0.1 * width), (int)(0.1 * height), (int)(width*0.9), (int)(height*0.9));
                }
                break;
            case ROUND_RECTANGLE:
                g.setColor(Color.red);
                if(filled){
                    g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(width*0.9), (int)(height*0.9), 20, 20);
                }
                else{
                    g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(width*0.9), (int)(height*0.9), 20,20);
                }
                break;
            case OVAL:
                g.setColor(Color.orange);
                if(filled){
                    g.fillOval(0, 0, width, height);
                }
                else{
                    g.drawOval(0, 0, width, height);
                }
                break;
        }
    }
    
    
    public void setType(int type){
        this.type = type;
        //calls the paintComponent() method.
        //this is why fields are private, setting the fields often needs
        //
        this.repaint();
    }
    
    public int getType(){
        return this.type;
    } 
    
    public void setFilled(boolean filled){
        this.setFilled(filled);
        this.repaint();
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public Dimension getPrefferedSize(){
        return new Dimension(80, 80);
    }
    
}
