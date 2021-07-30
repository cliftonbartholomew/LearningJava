/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter17_Further_UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cliftonb
 */
public class GameFrame extends JFrame {

	private CellPanel[] panels = new CellPanel[9];
	private char player = CellPanel.CROSS_PLAYER;
	private char[] gridStatus = new char[9];
	private boolean running = false;
	private JLabel status;

	public GameFrame() {
		JPanel gridPanel = new JPanel();
		JPanel infoPanel = new JPanel();

		//setup the status text line
		infoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		status = new JLabel("Current players turn: " + player);
		infoPanel.add(status);

		//add the 2 main panels to the Frame
		setLayout(new BorderLayout());
		add(gridPanel, BorderLayout.CENTER);
		add(infoPanel, BorderLayout.SOUTH);

		//setup the play area grid
		gridPanel.setLayout(new GridLayout(3, 3));
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new CellPanel(i);
			panels[i].addMouseListener(new MouseAdapter() {

				//add a click listener to each of the game panels
				public void mouseClicked(MouseEvent e) {
					CellPanel panelClicked = (CellPanel) (e.getComponent());
					if (panelClicked.getToken() == ' ' && running == true) {
						panelClicked.setToken(player);
						gridStatus[panelClicked.getCellIndex()] = player;
						changePlayer();
						checkGame();
					}
				}
			});
			gridPanel.add(panels[i]);
		}

		//set up the grid status into a char array for ease of calculation
		for (int i = 0; i < gridStatus.length; i++) {
			gridStatus[i] = ' ';
		}
		//start the game.
		running = true;
	}

	private void checkGame() {
		boolean circlePlayerWins = checkRowsForWinner(CellPanel.CIRCLE_PLAYER) || checkColsForWinner(CellPanel.CIRCLE_PLAYER) || checkDiagsForWinner(CellPanel.CIRCLE_PLAYER);
		boolean crossPlayerWins = checkRowsForWinner(CellPanel.CROSS_PLAYER) || checkColsForWinner(CellPanel.CROSS_PLAYER) || checkDiagsForWinner(CellPanel.CROSS_PLAYER);

		if (circlePlayerWins) {
			status.setText("Player 2 WINS!!!");
			running = false;
		} else if (crossPlayerWins) {
			status.setText("Player 1 WINS!!!");
			running = false;
		}

	}

	private boolean checkRowsForWinner(char player) {
		int[] rowCount = {0, 0, 0};
		for (int i = 0; i < gridStatus.length; i++) {
			if (panels[i].getToken() == player) {
				rowCount[i / 3]++;
			}
		}
		for (int i = 0; i < rowCount.length; i++) {
			if (rowCount[i] == 3) {
				return true;
			}
		}
		return false;

	}

	private boolean checkColsForWinner(char player) {
		int[] colCount = {0, 0, 0};
		for (int i = 0; i < gridStatus.length; i++) {
			if (panels[i].getToken() == player) {
				colCount[i % 3]++;
			}
		}
		for (int i = 0; i < colCount.length; i++) {
			if (colCount[i] == 3) {
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagsForWinner(char player) {
		if (panels[0].getToken() == player && panels[4].getToken() == player && panels[8].getToken() == player) {
			return true;
		} else if (panels[2].getToken() == player && panels[4].getToken() == player && panels[6].getToken() == player) {
			return true;
		}
		return false;
	}

	private void changePlayer() {
		if (this.player == CellPanel.CIRCLE_PLAYER) {
			this.player = CellPanel.CROSS_PLAYER;
		} else if (this.player == CellPanel.CROSS_PLAYER) {
			this.player = CellPanel.CIRCLE_PLAYER;
		}
		status.setText("Current players turn: " + player);
	}

	public String getStatus() {
		return status.getText();
	}

	public void setStatus(String status) {
		this.status.setText(status);
	}

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.setTitle("Client");
		frame.setLocationRelativeTo(null);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
