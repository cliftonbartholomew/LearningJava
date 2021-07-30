/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Server
 */
public class TestPanels extends JFrame{
    public TestPanels(){
        JPanel numberGrid = new JPanel();
        //set the grid layout for the new panel
        numberGrid.setLayout(new GridLayout(4, 3));
        
        //add the numbers 1 through 9 to the grid
        for(int i = 1; i <= 9; i++){
            numberGrid.add(new JButton("" + i));
        }
        
        //add buttons to the 4th row
        numberGrid.add(new JButton("0"));
        numberGrid.add(new JButton("Start"));
        numberGrid.add(new JButton("Stop"));
        
        //you can add the layout manager as a constructor parameter 
        //default is flowlayout
        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        rightPanel.add(numberGrid, BorderLayout.CENTER);
        rightPanel.setBorder(new LineBorder(Color.BLACK, 2));
        this.setLayout(new BorderLayout());
        this.add(rightPanel, BorderLayout.EAST);
        this.add(new JButton("Food to be placed here"), BorderLayout.CENTER);
        
        
    }
    
    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("The Front View of a Microwave Oven");
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
