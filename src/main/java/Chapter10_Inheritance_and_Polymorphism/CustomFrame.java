/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inheritance_and_Polymorphism;

import javax.swing.*;

/**
 *
 * @author Server
 */
public class CustomFrame extends JFrame {
    public CustomFrame(){
        
        JButton jbtOK = new JButton("OK");
        JLabel jLabel = new JLabel("Enter your name");
        JTextField tField = new JTextField("Type name here");
        JCheckBox cBox = new JCheckBox("Bold");
        JRadioButton jrbRed = new JRadioButton("Red");
        JComboBox jcboColor = new JComboBox(new String[]{"Red", "Green", "Blue"});
        
        JPanel panel = new JPanel();
        panel.add(jbtOK);
        panel.add(jLabel);
        panel.add(tField);
        panel.add(cBox);
        panel.add(jrbRed);
        panel.add(jcboColor);
        
        this.add(panel);
        this.setSize(450, 70);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
