/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Cliftonb
 */
public class ButtonDemo extends JFrame{
	protected MessagePanel textPanel = new MessagePanel();

	public ButtonDemo(){
		setLayout(new BorderLayout());

		setBackground(Color.white);

		textPanel.setIsCentered(false);

		JPanel buttonPanel = new JPanel(new FlowLayout());
		JButton leftButton = new JButton("<--");
		JButton rightButton = new JButton("-->") ;

		leftButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.moveLeft();
			}
		});
		rightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPanel.moveRight();
			}
		});


		buttonPanel.add(leftButton);
		buttonPanel.add(rightButton);

		//Mnemonic keys allow the user to use alt and the letter as a shortcut
		leftButton.setMnemonic('L');
		rightButton.setMnemonic('R');
		leftButton.setToolTipText("Move text left");
		rightButton.setToolTipText("Move text right");

		add(buttonPanel, BorderLayout.SOUTH);
		add(textPanel, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		JFrame frame = new ButtonDemo();
		frame.setTitle("ButtonDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
