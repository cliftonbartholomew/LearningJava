/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class TestWindowEvent extends JFrame{
	public TestWindowEvent(){
		this.addWindowListener(new WindowListener(){
			public void windowClosing(WindowEvent e){
				System.out.println("Window Closed at " + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowOpened(WindowEvent e){
				System.out.println("Window opened at "  + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowIconified(WindowEvent e){
				System.out.println("Window iconified at " + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowDeiconified(WindowEvent e){
				System.out.println("Window deiconified at "  + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowClosed(WindowEvent e){
				System.out.println("Window closed at "  + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowActivated(WindowEvent e){
				System.out.println("Window activated at "  + new java.util.Date(System.currentTimeMillis()));

			}
			public void windowDeactivated(WindowEvent e){
				System.out.println("Window deactivated at "  + new java.util.Date(System.currentTimeMillis()));

			}
		});
	}	

	public static void main(String[] args) {
		JFrame frame = new TestWindowEvent();
		frame.setTitle("TestWindowEvent");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
}
