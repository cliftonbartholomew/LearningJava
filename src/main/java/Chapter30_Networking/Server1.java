/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter30_Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Cliftonb
 */
public class Server1  {
    
    public static void main(String[] args) {
        new Server1();
    }
    
    public Server1(){
        
        try{
            ServerSocket serverSocket = new ServerSocket(8000);
            System.out.println("Server start at " + new Date());
            
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
                
                System.out.println("Radius recieved from client: " + radius + "\n");
                System.out.println("Area found: " + area + "\n");
            }
            
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
}
