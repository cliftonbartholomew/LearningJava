/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class SimpleEventDemo extends JFrame{
	public SimpleEventDemo(){
		JButton okButton = new JButton("OK");
		JButton cnclButton = new JButton("Cancel");

		JPanel p = new JPanel();
		p.add(okButton);
		p.add(cnclButton);

		this.add(p);


		ListenerClass listener = new ListenerClass();
		okButton.addActionListener(listener);
		cnclButton.addActionListener(listener);
	}	

	public static void main(String[] args) {
		JFrame frame = new SimpleEventDemo();
		frame.setSize(200, 150);
		frame.setTitle("Handle Event");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
		
	//This class is declared WITHIN the scope of the outer class.
	//It is an inner class. Static = it does not refer to any specific class of the outerclass.
	//Private inner classes are "helper" classes whose objects are not used outside the outerclass.
	private static class ListenerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("The " + e.getActionCommand() + " button is clicked at: " + new Date(e.getWhen()));
		}
	}
}

