/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19_Binary_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class TestObjectOutputStream {

	public static void main(String[] args) {
		try {
			//ObjectStreams can do all the above AND read and write objects (only objects which implement the
			//serializable interface (conceptually can the object be serialized - it doesnt make sense for a thread object
			//to be serialized, therefore it does not implement the serializable interface).
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.dat"));

			out.writeUTF("String");
			out.writeDouble(234.234);
			out.writeObject(new Date());

			out.close();

			ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.dat"));

			System.out.println("String: " + in.readUTF());
			System.out.println("Double: " + in.readDouble());
			Date d = (Date) (in.readObject());
			System.out.println("Date: " + d.toString());

			in.close();

		} catch (IOException ex) {
			Logger.getLogger(TestObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(TestObjectOutputStream.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
