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
public class CheckPalindrome_StringBuffer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = in.nextLine();
        input = filter(input);
        if(input.equalsIgnoreCase(reverse(input))){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is NOT a palindrome");
        }
    }
    
    public static String filter(String s){
        StringBuilder alphaOnly = new StringBuilder(s.length());
        
        for(int i = 0; i < s.length(); i ++){
            if(Character.isAlphabetic(s.charAt(i))){
                alphaOnly.append(s.charAt(i));
            }
        }
        
        return alphaOnly.toString();
    }
    
    public static String reverse(String s){
        StringBuilder buffer = new StringBuilder(s);
        buffer.reverse();
        return buffer.toString();
    }
    
}
