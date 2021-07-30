/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Server
 */
public class TestFileClass {
    public static void main(String[] args) throws Exception{
        File file = new File("testScores.txt");
        
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        
        PrintWriter output = new PrintWriter(file);
        output.print("John Lamly");
        output.println(" 21");
        output.print("Steve Johnson");
        output.println(" 55");
        
        output.close();
        
        Scanner input = new Scanner(file);
        
        int numPeople = 1;
        while(input.hasNext()){
            String name = input.next();
            while(!input.hasNextInt()){
                name += " " + input.next();
            }
            int score = input.nextInt();
            
            System.out.println("Person " + numPeople + ":\n"
                    + "Name: " + name + "\n"
                    + "Score: " + score);
            numPeople++;
        }
        
        input.close();
        
        //Using a dialogue to create a file chooser (instead of hardcoding the file position)
        JFileChooser chooser = new JFileChooser();
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File file2 = chooser.getSelectedFile();
            
            Scanner input2 = new Scanner(file2);
            
            while(input2.hasNext()){
                System.out.println(input2.nextLine());
            }
            
            input2.close();
        }
    }
}
