/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc.Snake;

import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class SnakeFrame extends JFrame{
	public SnakeFrame(){
		add(new GamePanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		pack();
		setResizable(false);
		setLocationRelativeTo(null);

		setVisible(true);
	}
	
}
