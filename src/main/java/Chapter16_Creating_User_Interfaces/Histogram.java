/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter16_Creating_User_Interfaces;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class Histogram extends JPanel{
	private int [] count = new int[26];
	private int HORIZONTAL_BUFFER; //11% of width (total 22%)
	private int VERTICAL_BUFFER_BOT; //15% of height
	private int VERTICAL_BUFFER_TOP; //10% of height
	private int HIST_SPACING; //1% of width (total = 26%)
	private int HIST_WIDTH; //2% of width (total = 52%)
	private int MAX_HIST_HEIGHT; //75% of height
	private int MAX_OCCURENCE = 0;
	
	public Histogram(int [] count){
		this.count = count;
		setPreferredSize(new Dimension(600, 300));

		//setup the 75% column
		for(int i = 0; i < count.length; i++){
			if(count[i] > MAX_OCCURENCE){
				MAX_OCCURENCE = count[i];
			}
		}
	}

	private void setupConstants(){
		HORIZONTAL_BUFFER = (int)(getWidth() * 0.11);
		VERTICAL_BUFFER_TOP = (int)(getHeight() * 0.10);
		VERTICAL_BUFFER_BOT = (int)(getHeight() * 0.15);
		HIST_SPACING = (int)(getWidth() * 0.01);
		HIST_WIDTH = (int)(getWidth() * 0.02);
		MAX_HIST_HEIGHT = (int)(getHeight() * 0.75);
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
	
		setupConstants();
		int currentX = HORIZONTAL_BUFFER;
		
		for(int i = 0; i < count.length; i++){
			//draw a rectangle with the currrent spacings
			int currentHistHeight = (int)((count[i]*1.0)/MAX_OCCURENCE*MAX_HIST_HEIGHT);
			int currentY = VERTICAL_BUFFER_TOP + (MAX_HIST_HEIGHT - currentHistHeight);
			g.drawRect(currentX, currentY, HIST_WIDTH,currentHistHeight);


			//draw in the letter with the current spacings
			currentY = VERTICAL_BUFFER_TOP + MAX_HIST_HEIGHT + 10 + g.getFontMetrics().getHeight();
			g.drawString("" + (char)(i + 65), currentX + HIST_WIDTH/2 - g.getFontMetrics().stringWidth("" + (char)(i+65))/2, currentY);
		
			//move the current x along to the next position
			currentX += HIST_WIDTH + HIST_SPACING;
		}



		
	}
}
