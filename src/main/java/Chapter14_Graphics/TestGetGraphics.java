/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Graphics;

/**
 *
 * @author Cliftonb
 */
public class TestGetGraphics extends JFrame{
    private JLabel jlblBanner = new JLabel("Banner");
    
    public TestGetGraphics(){
        this.add(jlblBanner);
        System.out.println(jlblBanner.getGraphics());
    }
    
    public static void main(String[] args){
        TestGetGraphics frame = new TestGetGraphics();
        frame.setTitle("TestGetGraphics");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // center on frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Test message");
        
        Graphics graphics = frame.jlblBanner.getGraphics();
        graphics.drawLine(0, 0, 50, 50);//this line is not persistant. To make it persistant, add it in the paintComponent method
    }
}
