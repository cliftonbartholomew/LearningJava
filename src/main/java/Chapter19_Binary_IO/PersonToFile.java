/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19_Binary_IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cliftonb
 */
public class PersonToFile {

	public static void main(String[] args) {
		Person p = new Person("Steve", 21, 45.5, 45.5, "34234234234");

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data\\people.dat"));
			out.writeObject(p);
			out.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(PersonToFile.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(PersonToFile.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
