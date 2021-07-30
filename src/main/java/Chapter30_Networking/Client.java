/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter30_Networking;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Cliftonb
 */
public class Client extends JFrame {
    private JTextField jtf = new JTextField();
    
    private JTextArea jta = new JTextArea();
    
    //IO Streams
    private DataOutputStream toServer;
    private DataInputStream fromServer;
    
    public static void main(String[] args) {
        new Client();
    }
    
    public Client(){
        JPanel p = new JPanel();
        
        p.setLayout(new BorderLayout());
        p.add(new JLabel("Enter radius: "), BorderLayout.WEST);
        p.add(jtf, BorderLayout.CENTER);
        jtf.setHorizontalAlignment(JTextField.RIGHT);
        
        setLayout(new BorderLayout());
        add(p, BorderLayout.NORTH);
        add(new JScrollPane(jta), BorderLayout.CENTER);
        
        jtf.addActionListener(new TextFieldListener());
        
        setTitle("Client");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        try{
            //Create a socket to connect to the server
            //Socket socket = new Socket("localhost", 8000);
            Socket socket = new Socket("150.136.242.120", 8000);
            //Socket socket = new Socket("drake.Armstrong.edu", 8000);
            
            //create the IOStreams from the socket
            fromServer = new DataInputStream(socket.getInputStream());
            toServer = new DataOutputStream(socket.getOutputStream());
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
    
    
    private class TextFieldListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
                //Get the radius from the text field
                double radius = Double.parseDouble(jtf.getText().trim());

                //send to server
                toServer.writeDouble(radius);
                toServer.flush();
                
                //receive response from server
                double area = fromServer.readDouble();
                
                //Display to the text area
                jta.append("Radius is " + radius + "\n");
                jta.append("Area recieved from the server is " + area + "\n");
            }
            
            catch (IOException ex){
                System.err.println(ex);
            }
        }
    }
}
