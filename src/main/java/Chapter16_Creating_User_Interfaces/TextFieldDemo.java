/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cliftonb
 */
public class TextFieldDemo extends RadioButtonDemo{
	JTextField userIn = new JTextField("Enter text here");	

	public TextFieldDemo(){
		JPanel fieldPanel = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Enter a new message");

		fieldPanel.add(label);
		fieldPanel.add(userIn);

		add(fieldPanel, BorderLayout.NORTH);

		userIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.setMessage(userIn.getText());
				userIn.requestFocusInWindow();
			}
		});
	}


	public static void main(String[] args) {
		JFrame frame = new  TextFieldDemo();
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("TextFieldDemo");
		frame.setVisible(true);
	}


	
}
