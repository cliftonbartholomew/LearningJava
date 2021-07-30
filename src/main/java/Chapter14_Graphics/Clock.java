/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.*;
/**
 *
 * @author Cliftonb
 */
public class Clock extends JPanel{
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    //default clock set to the current time
    public Clock() {
        Calendar calendar = new GregorianCalendar();
        
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }
    
    public Clock(int s, int m, int h){
        second = s;
        minute = m;
        hour = h;
    }
    
    public void tick(){
        second++;
        if(second == 60){
            second = 0;
            minute++;
            
            if(minute == 60){
                minute = 0;
                hour++;
                
                if(hour == 12){
                    hour = 0;
                }
            }
        }
        
        
        this.repaint();
    }
    
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        //draw centered circle
        int xCentre = this.getWidth()/2;
        int yCentre = this.getHeight()/2;
        int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);
        
        g.setColor(Color.black);
        g.drawOval(xCentre - radius, yCentre - radius, radius*2, radius*2);
        
        //add labels (3,6,9,12)
        g.drawString("12", xCentre - 5, yCentre - radius + 12);
        g.drawString("9", xCentre - radius + 3, yCentre + 5);
        g.drawString("3", xCentre + radius - 10, yCentre + 3);
        g.drawString("6", xCentre - 3, yCentre + radius - 3);
        
        int secHandLength = (int)(radius*0.85);
        int minHandLength = (int)(radius*0.7);
        int hourHandLength = (int)(radius*0.5);
        
        //add second hand
        g.setColor(Color.red);
        int xEnd = (int)(xCentre + secHandLength * Math.sin(second * Math.PI * 2 / 60));
        int yEnd = (int)(yCentre - secHandLength * Math.cos(second * Math.PI * 2 / 60));
        g.drawLine(xCentre, yCentre, xEnd, yEnd);
        
        //add minute hand
        g.setColor(Color.black);
        xEnd = (int)(xCentre + minHandLength * Math.sin(minute * Math.PI * 2 / 60));
        yEnd = (int)(yCentre - minHandLength * Math.cos(minute * Math.PI * 2 / 60));
        g.drawLine(xCentre, yCentre, xEnd, yEnd);
        
        //add hour hand
        xEnd = (int)(xCentre + hourHandLength * Math.sin((hour%12 + minute/60.0) * Math.PI * 2 / 12));
        yEnd = (int)(yCentre - hourHandLength * Math.cos((hour%12 + minute/60.0) * Math.PI * 2 / 12));
        g.drawLine(xCentre, yCentre, xEnd, yEnd);
        
    }
}
