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
public class ImageViewer extends JPanel{
    
    //imageIcon cannot be resized
    private java.awt.Image image;
    private boolean isStretched = true;
    private int xCoord = 0;
    private int yCoord = 0;
    
    public ImageViewer() {
    }
    
    
    public ImageViewer(Image image){
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        this.repaint();
    }

    public boolean isStretched() {
        return isStretched;
    }

    public void setStretched(boolean isStretched) {
        this.isStretched = isStretched;
        this.repaint();
    }

    public int getxCoord() {
        return xCoord;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
        this.repaint();
    }

    public int getyCoord() {
        return yCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
        this.repaint();
    }
    
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        if(image != null){
            if(isStretched()){
                g.drawImage(image, xCoord, yCoord,getSize().width, getSize().height, this);
            }
            else{
                g.drawImage(image, xCoord, yCoord, this);
            }
        }
    }
    
}
