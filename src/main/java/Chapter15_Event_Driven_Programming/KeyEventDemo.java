/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class KeyEventDemo extends JFrame{
	private KeyboardPanel panel = new KeyboardPanel();

	public KeyEventDemo(){
		add(panel);

		panel.setFocusable(true);
	}	

	public static void main(String[] args) {
		JFrame frame = new KeyEventDemo();
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("KeyEventDemo");
		frame.setVisible(true);
	}
	static class KeyboardPanel extends JPanel {
		private int x = 100;
		private int y = 100;
		private char keyChar = 'A';

		public KeyboardPanel(){
			addKeyListener(new KeyAdapter(){
				public void keyPressed(KeyEvent e){
					switch(e.getKeyCode()){
						case KeyEvent.VK_DOWN : 
							y +=10;
							break;
						case KeyEvent.VK_UP : 
							y -=10;
							break;
						case KeyEvent.VK_LEFT : 
							x -=10;
							break;
						case KeyEvent.VK_RIGHT : 
							x +=10;
							break;
						default:
							keyChar = e.getKeyChar();
					}			
					repaint();
				}

			});
		}
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
			g.drawString(String.valueOf(keyChar), x, y);
		}
	}
}
