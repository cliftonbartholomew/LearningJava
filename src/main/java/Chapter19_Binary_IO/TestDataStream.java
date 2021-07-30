/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19_Binary_IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class TestDataStream {

	public static void main(String[] args) {
		try {
			//a wrapper for the fileoutputstream
			//FileOutputStream -> FilteredOutputStream -> DataOutputStream
			//FilteredOutput = converted to a specific type (numbers, no encoding; strings, UTF or ASCII encoding)
			//DataOutputStream further extends the filteredoutput stream
			DataOutputStream out = new DataOutputStream(new FileOutputStream("data\\temp.dat"));

			//The above could be improved using buffers.
			//DataOutputStream out = new BufferedInputStream(new FileOutputStream("temp.dat"));
			//Input buffer streams read as much data as they can each time they read (normally around 512 bytes)
			//Output buffer streams write to the file only when their buffer is fill (or flush() is called)
			//The buffers allow for less reading and writing to the harddrive so that it can be done more efficiently
			out.writeUTF("John");
			out.writeDouble(45.234);
			out.writeUTF("Jim");
			out.writeDouble(234.324);
			out.writeUTF("Steve");
			out.writeDouble(234.23);

			out.close();

			DataInputStream in = new DataInputStream(new FileInputStream("temp.dat"));

			//The above could be improved using buffers.
			//DataOutputStream out = new BufferedInputStream(new FileOutputStream("temp.dat"));
			System.out.println("Person 1: " + in.readUTF() + " " + in.readDouble());
			System.out.println("Person 2: " + in.readUTF() + " " + in.readDouble());
			System.out.println("Person 3: " + in.readUTF() + " " + in.readDouble());

			in.close();

		} catch (FileNotFoundException ex) {
			Logger.getLogger(TestDataStream.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(TestDataStream.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
