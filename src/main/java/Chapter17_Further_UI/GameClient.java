/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter17_Further_UI;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;

/**
 *
 * @author Cliftonb
 */
public class GameClient {

	//IO Streams
	private DataOutputStream toServer;
	private DataInputStream fromServer;

	GameFrame frame;

	int playerNum;

	public GameClient() {
	}

	public void connectToServer() {
		//Try connecting to the server
		try {
			//Create a socket to connect to the server
			Socket socket = new Socket("102.130.115.40", 8000);

			//create the IOStreams from the socket
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
			frame.setStatus("Connected to server successfully");
			setPlayerNumber();
		} catch (IOException ex) {
			System.err.println(ex);
			frame.setStatus("Failed to connected to server");
		}
	}

	private void setPlayerNumber() {
		try {
			toServer.writeBytes("playerNumRequest");
			playerNum = fromServer.readInt();
			frame.setStatus("Successfully connected, you are player " + playerNum);
		} catch (IOException e) {
			System.err.println("Failed to get player number from server");
			frame.setStatus("Failed to get player number from server");
		}

	}

	public void initialiseFrame() {
		//setup the gameframe
		frame = new GameFrame();
		frame.setLocationRelativeTo(null);
		frame.setTitle("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GameClient client = new GameClient();
		client.initialiseFrame();
		client.connectToServer();
	}

}
