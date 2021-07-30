/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class MouseLIstenerDemo extends JFrame{
	
	public MouseLIstenerDemo(){
		this.add(new MoveMessagePanel("Hello"));
		setSize(300, 300);
		setTitle("MouseListenerDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		JFrame frame = new MouseLIstenerDemo();
		frame.setVisible(true);
	}
	//this is declared static so that it is not a member class
	private static class MoveMessagePanel extends JPanel{
		private int x = 0;
		private int y = 0;
		private String message = "Welcome to Java";

		public MoveMessagePanel(String s){
			message = s;
			
			this.addMouseMotionListener(new MouseMotionAdapter(){
				public void mouseDragged(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}	
//				public void mouseMoved(MouseEvent e){
//					x = e.getX();
//					y = e.getY();
//					repaint();
//				}	
			});
			this.addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					x = e.getX();
					y = e.getY();
					repaint();
				}	
			});

		}

		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString(message, x, y);
		}
	}
}
