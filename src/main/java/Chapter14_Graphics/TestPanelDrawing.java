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
public class TestPanelDrawing extends JFrame{
    
    public TestPanelDrawing(){
        add(new NewPanel());
    }
    
    
    public static void main(String[] args) {
        TestPanelDrawing frame = new TestPanelDrawing();
        
        frame.setTitle("TestPanelDrawing");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); //center on the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    //This is a nested class. It can be declared private, public, default or protected.
    //Normally, helper classes are declared as nested classes
    private class NewPanel extends JPanel{
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine(0, 0, 50, 50);
            g.drawString("Hello World", 0, 40);
        }
    }
}
