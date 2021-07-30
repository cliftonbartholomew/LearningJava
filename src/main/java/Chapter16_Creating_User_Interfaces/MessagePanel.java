/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class MessagePanel extends JPanel{
	private String message = "Welcome to Java";
	private int xPos = 20;
	private int yPos = 20;
	private int interval = 10;
	private boolean isCentered = true;

	public MessagePanel(){
		setBackground(Color.white);
	}	


	public MessagePanel(String message){
		this();
		this.message = message;	
	}	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		repaint();
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
		repaint();
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
		repaint();
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
		repaint();
	}

	public boolean isIsCentered() {
		return isCentered;
	}

	public void setIsCentered(boolean isCentered) {
		this.isCentered = isCentered;
		repaint();
	}

	public void moveLeft(){
		xPos-= interval;
		repaint();
	}

	public void moveRight(){
		xPos += interval;
		repaint();
	}

	public void moveUp(){
		yPos += interval;
		repaint();
	}

	public void moveDown(){
		yPos -= interval;
		repaint();
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);

		//print out the message string at the current coords
		if(isCentered){
			FontMetrics fm = g.getFontMetrics();
			
			int stringWidth = fm.stringWidth(message);
			int stringHeight = fm.getAscent();

			xPos = getWidth()/2 - stringWidth/2;
			yPos = getHeight()/2 + stringHeight/2;
		}

		g.drawString(message, xPos, yPos);
	}

}
