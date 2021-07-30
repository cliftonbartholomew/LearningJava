/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter30_Networking;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cliftonb
 */
public class Server extends JFrame {
    private JTextArea jta = new JTextArea();
    
    public static void main(String[] args) {
        new Server();
    }
    
    public Server(){
        setLayout(new BorderLayout());
        add(new JScrollPane(jta), BorderLayout.CENTER);
        
        setTitle("Server");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        try{
            ServerSocket serverSocket = new ServerSocket(8000);
            jta.append("Server start at " + new Date());
            
            //Listen for a connection (this is a blocking method, code stops until a connection is made)
            Socket socket = serverSocket.accept();
            
            //Create the data input and output streams (only once a connection is made)
            DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
            
            while(true){
                //Read input from the client
                double radius = inputFromClient.readDouble();
                
                //do math on the client input
                double area = Math.PI * Math.pow(radius, 2);
                
                //send output to the client
                outputToClient.writeDouble(area);
                
                jta.append("Radius recieved from client: " + radius + "\n");
                jta.append("Area found: " + area + "\n");
            }
            
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
}
