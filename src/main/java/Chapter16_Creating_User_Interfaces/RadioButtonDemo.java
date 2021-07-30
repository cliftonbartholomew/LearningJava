/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Cliftonb
 */
public class RadioButtonDemo extends CheckBoxDemo{
	
	private JRadioButton redButt = new JRadioButton("Red");
	private JRadioButton blueButt = new JRadioButton("Blue");
	private JRadioButton greenButt = new JRadioButton("Green");

	public RadioButtonDemo(){
		JPanel radioPanel = new JPanel(new GridLayout(3,1));
		radioPanel.add(redButt);
		radioPanel.add(blueButt);
		radioPanel.add(greenButt);


		add(radioPanel, BorderLayout.WEST);

		redButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.setBackground(Color.RED);
			}
		});

		blueButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.setBackground(Color.BLUE);
			}
		});

		greenButt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.setBackground(Color.GREEN);
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new RadioButtonDemo();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("RadioButtonDemo");
		frame.setSize(300, 300);
	}
}
