/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class TestButtonIcons extends JFrame{
	
	public static void main(String[] args) {
		JFrame frame = new TestButtonIcons();
		frame.setLocationRelativeTo(null);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public TestButtonIcons(){
		ImageIcon usIcon = new ImageIcon("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\LearningCode\\images\\america.png");
		ImageIcon saIcon = new ImageIcon("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\LearningCode\\images\\south africa.png");
		ImageIcon itIcon =  new ImageIcon("C:\\Users\\Cliftonb\\Documents\\NetBeansProjects\\LearningCode\\images\\italy.png");

		JButton but = new JButton("Click it", usIcon);
		but.setPressedIcon(saIcon);
		but.setRolloverIcon(itIcon);
		add(but);
	}
}
