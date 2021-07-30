/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

import java.io.File;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Server
 */
public class CountLetterFromFile {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        
        int [] letters = new int[26];
        
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File textFile = chooser.getSelectedFile();
            
            Scanner input = null;
            try{
                input = new Scanner(textFile);    
            }
            catch(Exception e){
                System.out.println("File not found");
            }
            
            while(input != null && input.hasNext()){
                String line = input.nextLine();
                for(int i = 0; i < line.length(); i ++){
                    if(Character.isLetter(line.charAt(i))){
                        int alphaPosition = (int)(Character.toLowerCase(line.charAt(i)) - 'a');
                        letters[alphaPosition] ++;
                    }
                }
                
            }
            
            input.close();
        }
        
        int sum = 0;
        for(int count : letters){
            sum += count;
        }
        
        for(int i = 0; i < letters.length; i ++){
            System.out.println((char)((i) + (int)('a')) + " : " + letters[i] + " : " + Math.round(((double)(letters[i])/sum*100)) + "%");
        }
        
    }
}
