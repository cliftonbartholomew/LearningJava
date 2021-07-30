/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter19_Binary_IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
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
public class Copy {

	//args[0] = sourceFile
	//args[1] = targetFile
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("USAGE: java Copy sourceFile targetFile");
		}

		File sourceFile = new File(args[0]);
		File targetFile = new File(args[1]);

		if (!sourceFile.exists()) {
			System.out.println("Source file: " + args[0] + " does not exist.");
			System.exit(0);
		}

		if (!targetFile.exists()) {
			System.out.println("Target file: " + args[1] + " does not exist.");
			System.exit(0);
		}

		try {
			BufferedInputStream sourceStream = new BufferedInputStream(new FileInputStream(sourceFile));
			BufferedOutputStream targetStream = new BufferedOutputStream(new FileOutputStream(targetFile));

			System.out.println("Source file has " + sourceStream.available() + " bytes available.");

			int r;
			while ((r = sourceStream.read()) != -1) {

				targetStream.write(r);
			}
			sourceStream.close();
			targetStream.close();

		} catch (FileNotFoundException ex) {
			Logger.getLogger(Copy.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(Copy.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
