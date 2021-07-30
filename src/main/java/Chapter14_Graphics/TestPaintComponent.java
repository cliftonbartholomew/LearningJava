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
public class TestPaintComponent extends JFrame{
    
    public TestPaintComponent(){
        add(new NewLabel("Banner"));
    }
    
    public static void main(String[] args){
        TestPaintComponent frame = new TestPaintComponent();
        frame.setTitle("TestGetGraphics");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null); // center on frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    //Creating an extended class allows us to override the paintcomponent method.
    class NewLabel extends JLabel{
        public NewLabel(String text){
            super(text);
        }
        
        //whenever the component is displayed or resized, the paintcomponent method is called.
        protected void paintComponent(Graphics g){
            super.paintComponent(g);//do all the normal painting of a label
            g.drawLine(0, 0, 50, 50);//add a line
        }
    }
}
