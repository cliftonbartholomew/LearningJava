/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13_GUI_basics;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Server
 */
public class SudokuGrid extends JFrame{
    
    public SudokuGrid(){
        this.setLayout(new GridLayout(3, 3));
        
        JPanel[] panels = new JPanel[9];
        
        for(int i = 0; i < 9; i ++){
            panels[i] = new JPanel(new GridLayout(3,3, 1, 1));
            panels[i].setBorder(new LineBorder(Color.BLACK, 2));
            
            JTextField[] fields = new JTextField[9];
            for(int j = 0; j < 9; j++){
                fields[j] = new JTextField(1);
                panels[i].add(fields[j]);
            }
            this.add(panels[i]);
        }
    }
    
    public static void main(String[] args) {
        SudokuGrid grid = new SudokuGrid();
        grid.setTitle("SudokuGrid");
        grid.setSize(600, 600);
        grid.setLocationRelativeTo(null);
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid.setVisible(true);
    }
}
