/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Server
 */
public class TestImageIcon extends JFrame {
    private ImageIcon icon = new ImageIcon("C:\\Users\\Server\\Documents\\NetBeansProjects\\Fiddle\\image1.png");
    
    public TestImageIcon(){
        this.add(new JLabel(icon));
    }
    
    public static void main(String[] args) {
        JFrame frame = new TestImageIcon();
        frame.setTitle("TestImageIcon");
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
