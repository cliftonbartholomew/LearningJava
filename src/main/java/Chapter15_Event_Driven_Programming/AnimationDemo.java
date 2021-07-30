/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cliftonb
 */
public class AnimationDemo extends JFrame{
	public AnimationDemo(){
		add(new AnimationPanel("Hello"));
	}	

	public static void main(String[] args) {
		JFrame frame = new AnimationDemo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 500);
		frame.setTitle("AnimationDemo");
		frame.setVisible(true);
	}
	static class AnimationPanel extends JPanel{
		private int x = 5;
		private int y = 30;
		private String message = "Hello";
		
		public AnimationPanel(String message){
			this.message = message;

			Timer timer = new Timer(10, new ActionListener(){
				public void actionPerformed(ActionEvent e){
					repaint();
				}
			});

			timer.start();
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);

			x += 1;
			g.drawString(message, x, y);
		}
	}	
}
