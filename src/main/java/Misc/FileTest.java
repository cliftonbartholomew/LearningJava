/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.io.File;

/**
 *
 * @author Cliftonb
 */
public class FileTest {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Cliftonb\\Documents");
		File [] files = f.listFiles();
		for(File s:files){
			System.out.println(s.getName() + " \t\t\tisFolder? : " + s.isDirectory());
			System.out.println("");
		}
	}
	
}
