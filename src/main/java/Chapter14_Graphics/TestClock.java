/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class TestClock extends JFrame {
    private Clock c;
    
    public TestClock(){
        c = new Clock();
        add(c);
        setTitle("Clock");
    }
    
    public void tick(){
        c.tick();
    }
    
    public static void main(String[] args) throws InterruptedException {
        TestClock frame = new TestClock();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        while(true){
            frame.tick();
            
            Thread.sleep(1000);
        }
    }
}
