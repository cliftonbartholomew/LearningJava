/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

import java.util.Scanner;

/**
 *
 * @author Server
 */
public class CountLetters {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = in.nextLine();
        
        printLetterCount(countLetters(input.toLowerCase()));
    }
    
    //each position in the return char is a letter A - 0; B - 1 etc.
    //string must be lowercase
    public static int[] countLetters(String s){
        int[] letterCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                //you can use a char to index an array
                letterCount[s.charAt(i) - 'a']++;
            }
        }
        
        return letterCount;
    }
    
    public static void printLetterCount(int[] letterCount){
        for(int i = 0; i < letterCount.length; i++){
            if(letterCount[i] != 0){
                System.out.println((char)(i + 'a') + " count = " + letterCount[i]);
            }
        }
    }
}
