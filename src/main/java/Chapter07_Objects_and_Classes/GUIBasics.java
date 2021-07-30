/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter07_Objects_and_Classes;

import javax.swing.*;

/**
 *
 * @author Server
 */
public class GUIBasics {
    public static void main(String[] args) {
        JButton jbutOK = new JButton("OK");

        JLabel jlblName = new JLabel("Enter your name: ");

        JTextField jtfName = new JTextField("Type name here");

        JCheckBox jchkBox = new JCheckBox("Bold");

        JRadioButton jrbRed = new JRadioButton("Red");

        JComboBox jcboColor = new JComboBox(new String []{"Red", "Green", "Blue"});

        JPanel panelOne = new JPanel();
        
        panelOne.add(jbutOK);
        panelOne.add(jlblName);
        panelOne.add(jtfName);
        panelOne.add(jchkBox);
        panelOne.add(jrbRed);
        panelOne.add(jcboColor);
        
        JFrame frame = new JFrame();    
        frame.add(panelOne);
        frame.setTitle("Show GUI Componen");
        frame.setSize(450, 100);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
