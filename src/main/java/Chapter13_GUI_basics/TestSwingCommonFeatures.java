/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Server
 */
public class TestSwingCommonFeatures extends JFrame{
    public TestSwingCommonFeatures(){
        
        JPanel top = new JPanel(new FlowLayout());
        JButton butLeft = new JButton("Left");
        JButton butCenter = new JButton("Center");
        JButton butRight = new JButton("Right");
        butLeft.setBackground(Color.WHITE);
        butCenter.setForeground(Color.GREEN);
        butRight.setToolTipText("This is the right button");
        top.add(butLeft);
        top.add(butCenter);
        top.add(butRight);
        top.setBorder(new TitledBorder("Three buttons"));
        
        //test comment
        Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
        Border lineBorder = new LineBorder(Color.BLACK, 2);
        
        JPanel bot = new JPanel(new GridLayout(1,2));
        JLabel redLabel = new JLabel("Red");
        JLabel orangeLabel = new JLabel("Orange");
        redLabel.setForeground(Color.red);
        orangeLabel.setForeground(Color.ORANGE);
        redLabel.setFont(largeFont);
        orangeLabel.setBorder(lineBorder);
        bot.add(redLabel);
        bot.add(orangeLabel);
        bot.setBorder(new TitledBorder("Two Labels"));
        
        this.setLayout(new GridLayout(2,1,5,5));
        this.add(top);
        this.add(bot);
    }
    
    public static void main(String[] args) {
        JFrame frame = new TestSwingCommonFeatures();
        frame.setTitle("Swing Common Features");
        frame.setSize(200, 125);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
