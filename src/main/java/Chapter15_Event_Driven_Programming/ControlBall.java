/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Event_Driven_Programming;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class ControlBall extends JFrame {
	private BallCanvas canvas = new BallCanvas();	
	private JButton enlarge = new JButton("Enlarge");
	private JButton shrink = new JButton("Shrink");
	
	public ControlBall(){
		
		JPanel p = new JPanel();
		p.add(enlarge);
		p.add(shrink);

		this.setLayout(new BorderLayout());
		this.add(p,BorderLayout.SOUTH);
		this.add(canvas, BorderLayout.CENTER);

		enlarge.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				canvas.enlarge();
			}	
		});
		
		shrink.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				canvas.shrink();
			}	
		});
	}

	public static void main(String[] args) {
		JFrame frame = new ControlBall();
		frame.setTitle("ControlBall");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	private class BallCanvas extends JPanel{
		private int size = 3;

		public void enlarge(){
			size += 3;
			this.repaint();
		}
		
		public void shrink(){
			size-=3;
			this.repaint();
		}

		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			int xCentre = this.getWidth()/2;
			int yCentre = this.getHeight()/2;
			g.drawOval(xCentre - size, yCentre - size, size*2, size*2);
		}
	}
}
