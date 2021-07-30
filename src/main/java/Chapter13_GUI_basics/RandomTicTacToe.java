/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Server
 */
public class RandomTicTacToe extends JFrame {
    public RandomTicTacToe(){
        this.setLayout(new GridLayout(3,3));
        
        JLabel[] labels = new JLabel[9];
        for(int i = 0; i < labels.length; i ++){
            if(i % 2 == 0)
                labels[i] = new JLabel(new ImageIcon("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\LearningCode\\images\\image1.png"));    
            
            else
                labels[i] = new JLabel(new ImageIcon("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\LearningCode\\images\\image2.png"));    
            
            labels[i].setBorder(new LineBorder(Color.BLACK, 1));  
            this.add(labels[i]);
            
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new RandomTicTacToe();
        frame.setTitle("TicTacToe");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
