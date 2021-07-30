/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Server
 */
public class ReplaceText {
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length != 4){
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(0);
        }
        //Setup the File objects
        File source = new File(args[0]);
        File target = new File(args[1]);
        
        String oldStr = args[2];
        String newStr = args[3];
        
        //Setup the scanner and printwriter objects
        Scanner input = new Scanner(source);
        PrintWriter output = new PrintWriter(target);
        
        while(input.hasNext()){
            //read the next line
            String line = input.nextLine();
            
            //replace the strings and print to the new file
            output.println(line.replaceAll(oldStr, newStr));;
        }
        
        input.close();
        output.close();
        
    }
}
