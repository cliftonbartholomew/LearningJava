/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19_Binary_IO;

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
public class TestFileStream {

	public static void main(String[] args) {
		try {
			//can only read and write bytes (no strings)
			//This is called a byte stream
			FileOutputStream out = new FileOutputStream("temp.dat");

			for (int j = 0; j < 10; j++) {
				out.write(j);
			}

			out.close();

			FileInputStream in = new FileInputStream("temp.dat");

			int val;
			while ((val = in.read()) != -1) {
				System.out.print(val + " ");
			}

			in.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(TestFileStream.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
