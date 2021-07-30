/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cliftonb
 */
public class TextAreaDemo extends JFrame{
	public TextAreaDemo(){
		DescriptionPanel panel = new DescriptionPanel();
		add(panel);
	}

	public static void main(String[] args) {
		JFrame frame = new TextAreaDemo();
		frame.setTitle("TextAreaDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	public class DescriptionPanel extends JPanel{


		public DescriptionPanel(){
			setLayout(new BorderLayout());

			JTextArea jta = new JTextArea("The hills are alive!! With the sound of music. The"
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "hills are not actually alive, it is just a song that I really like to sing."
				+ "How many lines of code do you think this will be on the text area? Do you think that"
				+ "this will be enough?");
			jta.setLineWrap(true);
			jta.setWrapStyleWord(true);
			jta.setEditable(false);
			JScrollPane textPane = new JScrollPane(jta);
			

			JPanel picturePanel = new JPanel();
			JLabel countryImage = new JLabel("India");
			countryImage.setHorizontalAlignment(JLabel.CENTER);
			countryImage.setHorizontalTextPosition(JLabel.CENTER);
			countryImage.setVerticalTextPosition(JLabel.BOTTOM);
			countryImage.setIcon(new ImageIcon("images/india.png"));
			picturePanel.add(countryImage);


			add(picturePanel, BorderLayout.WEST);
			add(textPane, BorderLayout.CENTER);
		}	



	}	
}
