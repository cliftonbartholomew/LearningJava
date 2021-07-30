/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc.Snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Cliftonb
 */
public class GamePanel extends JPanel implements ActionListener{
	//constants
	private static final int MAX_WIDTH = 600;
	private static final int MAX_HEIGHT = MAX_WIDTH;
	private static final int UNIT_SIZE = 25;
	private static final int MAX_UNITS = (MAX_WIDTH/UNIT_SIZE) * (MAX_HEIGHT/UNIT_SIZE);
	
	//apple and snake positions
	private int[] xBodyParts = new int[MAX_UNITS];
	private int[] yBodyParts = new int[MAX_UNITS];
	private int appleX;
	private int appleY;
	private int numBodyParts = 6;
	private char direction = 'R';
	private int applesEaten = 0;

	//utility attributes
	private boolean isRunning = false;
	private Random random;
	private Timer timer;
	private int delay = 75;

	//sets up the panel inside which the game is played
	public GamePanel(){
		setPreferredSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
		setBackground(Color.BLACK);
		//make sure this is only in the frame that you want focussed otherwise events wont be sent to the correct component
		setFocusable(true);
		
		random = new Random();
		timer = new Timer(delay, this);

		//starting position for the head
		xBodyParts[0] = 50;
		yBodyParts[0] = 50;

		addKeyListener(new MyKeyAdapter());
		startGame();
	}	
	//sets the game state to true and start the game timer and makes a new apple
	public void startGame(){
		isRunning = true;	
		timer.start();
		newApple();
	}
	//calls the draw method
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		draw(g);
	}
	//draws the snake, the score, the apple and calls the game over screen if the game is over
	public void draw(Graphics g){
		if(isRunning){
			//draw the snake
			for(int i = 0; i < numBodyParts; i ++){
				if(i == 0){
					g.setColor(Color.DARK_GRAY);
					g.fillOval(xBodyParts[i], yBodyParts[i], UNIT_SIZE, UNIT_SIZE);
				}	
				else{
					g.setColor(Color.LIGHT_GRAY);
					g.fillOval(xBodyParts[i], yBodyParts[i], UNIT_SIZE, UNIT_SIZE);
				}
			}

			//draw the apple
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

			//draw the score
			g.setColor(Color.red);
			g.setFont(new Font("Times New Roman", Font.BOLD, 20) );
			FontMetrics f = g.getFontMetrics();
			g.drawString("SCORE: " + applesEaten, getWidth()/2 - f.stringWidth("SCORE: " + applesEaten)/2, f.getHeight() + 5);

		}
		else{
			gameOver(g);
		}

	}
	//creates new coordinates for the apple
	public void newApple(){
		appleX = random.nextInt(600)/UNIT_SIZE*UNIT_SIZE;
		appleY = random.nextInt(600)/UNIT_SIZE*UNIT_SIZE;
	}
	//moves each body part to where the previous part was.
	//increments the heads current pos based on the current direction
	public void move(){

		//move each body part one position up
		for(int i = numBodyParts; i > 0; i--){
			xBodyParts[i] = xBodyParts[i-1];
			yBodyParts[i] = yBodyParts[i-1];
		}

		switch(direction){
			case 'U' -> yBodyParts[0] -= UNIT_SIZE;
			case 'D' -> yBodyParts[0] += UNIT_SIZE;
			case 'R' -> xBodyParts[0] += UNIT_SIZE;
			case 'L' -> xBodyParts[0] -= UNIT_SIZE;
		}
	}
	//checks if the head is over the apple, increase snake length, increases the score and makes a new apple
	public void checkForApple(){
		if(appleX == xBodyParts[0] && appleY == yBodyParts[0]){
			newApple();
			numBodyParts++;
			applesEaten++;
		}
		
	}
	//checks if the head is in the same position as any of the bodyparts
	//also checks to see if the head has collided with any walls
	//sets game state to false and stops the timer
	public void checkCollisions(){

		for(int i = numBodyParts; i > 0; i--){
			if(xBodyParts[i] == xBodyParts[0] && yBodyParts[i] == yBodyParts[0]){
				isRunning = false;
			}
		}
		if(xBodyParts[0]  >  MAX_WIDTH){
			isRunning = false;
		}
		if(xBodyParts[0]  <  0){
			isRunning = false;
		}
		if(yBodyParts[0] <  0){
			isRunning = false;
		}
		if(yBodyParts[0] >  MAX_HEIGHT){
			isRunning = false;
		}

		if(!isRunning){
			timer.stop();
		}
	}
	
	//draws the game over screen	
	public void gameOver(Graphics g){
		
		//draw the score
		g.setColor(Color.red);
		g.setFont(new Font("Times New Roman", Font.BOLD, 20) );
		FontMetrics f = g.getFontMetrics();
		g.drawString("SCORE: " + applesEaten, getWidth()/2 - f.stringWidth("SCORE: " + applesEaten)/2, f.getHeight() + 5);

		//draw the score
		g.setFont(new Font("Times New Roman", Font.BOLD, 50) );
		f = g.getFontMetrics();
		g.drawString("GAME OVER", getWidth()/2 - f.stringWidth("GAME OVER")/2, getHeight()/2 - f.getHeight()/2);
}

	//the swing timer class calls this method on each tick
	//each tick must move, checkForApple and checkForCollisions 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isRunning){
			move();
			checkCollisions();
			checkForApple();
		}
		repaint();
	}

	//a key listener adapter to register for key events
	//changes direction of snake
	class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e){

			switch(e.getKeyCode()){
				case KeyEvent.VK_UP -> {
					if(direction != 'D'){
						direction = 'U';
					}
				}
				case KeyEvent.VK_DOWN -> {
					if(direction != 'U'){
						direction = 'D';
					}
				}
				case KeyEvent.VK_RIGHT -> {
					if(direction != 'L'){
						direction = 'R';
					}
				}
				case KeyEvent.VK_LEFT -> {
					if(direction != 'R'){
						direction = 'L';
					}
				}
			}
		}
	}
}
