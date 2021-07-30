/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Abstract_classes_and_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Server
 */
public class HandleEvent extends JFrame {
    public HandleEvent(){
        //Create two buttons
        JButton okButton = new JButton("OK");
        JButton cnclButton = new JButton("Cancel");
        
        //create a panel to hold the buttons
        JPanel p = new JPanel();
        p.add(okButton);
        p.add(cnclButton);
        
        this.add(p);
        
        OKListenerClass listener1 = new OKListenerClass();
        CancelListenerClass listener2 = new CancelListenerClass();
        
        okButton.addActionListener(listener1);
        cnclButton.addActionListener(listener2);
    }
    
    public static void main(String[] args) {
        JFrame frame = new HandleEvent();
        frame.setTitle("Handle Event");
        frame.setSize(200, 200);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class OKListenerClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("OK Button Clicked");
        System.out.println(e);
    }
    
}

class CancelListenerClass implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Cancel Button Clicked");
    }

}
