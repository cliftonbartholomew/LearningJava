/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class AdapterDemo extends JFrame{
	public AdapterDemo(){
		//normally when adding an anonymous window listener you would need to
		//implement all the abstract methods. The window adapter implements all 
		//the methods and does nothing in the method by default. You just override 
		//the methods that you want to use.
		this.addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e){
				System.out.println("Window activated");
			}
		});


	}
	public static void main(String[] args) {
		JFrame frame = new AdapterDemo();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
}
