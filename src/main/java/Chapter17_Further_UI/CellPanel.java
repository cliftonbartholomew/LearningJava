/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter17_Further_UI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Cliftonb
 */
public class CellPanel extends JPanel {

	private char token = ' ';
	private int cellIndex;
	public static final char CIRCLE_PLAYER = 'O';
	public static final char CROSS_PLAYER = 'X';

	public CellPanel(int cellIndex) {
		setBorder(new LineBorder(Color.black, 1));
		this.cellIndex = cellIndex;
	}

	public char getToken() {
		return token;
	}

	public void setToken(char token) {
		this.token = token;
		repaint();
	}

	public int getCellIndex() {
		return cellIndex;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xBuffer = this.getWidth() / 100 * 10;
		int yBuffer = this.getHeight() / 100 * 10;
		switch (this.token) {
			case CROSS_PLAYER -> {
				g.drawLine(xBuffer, yBuffer, this.getWidth() - xBuffer, this.getHeight() - yBuffer);
				g.drawLine(this.getWidth() - xBuffer, yBuffer, xBuffer, this.getHeight() - yBuffer);
			}
			case CIRCLE_PLAYER -> {
				g.drawOval(xBuffer, yBuffer, this.getWidth() - xBuffer * 2, this.getHeight() - yBuffer * 2);
			}
			default -> {
			}
		}
	}

}
