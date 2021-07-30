/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14_Graphics;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class TestFigurePanel extends JFrame {
    public TestFigurePanel(){
        this.setLayout(new GridLayout(2, 3));
        this.add(new FigurePanel(FigurePanel.LINE));
        this.add(new FigurePanel(FigurePanel.OVAL, true));
        this.add(new FigurePanel(FigurePanel.OVAL, false));
        this.add(new FigurePanel(FigurePanel.RECTANGLE, false));
        this.add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, true));
        this.add(new FigurePanel(FigurePanel.ROUND_RECTANGLE, false));
    }
    
    public static void main(String[] args) {
        TestFigurePanel frame = new TestFigurePanel();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);//centered frame
        frame.setTitle("TestFigurePanel");
        frame.setVisible(true);
    }
}
