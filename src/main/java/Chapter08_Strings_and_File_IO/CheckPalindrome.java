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
public class CheckPalindrome {
    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        
        while(low < high){
            if(s.charAt(high) != s.charAt(low)){
                return false;                
            }
            
            low++;
            high--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //reads in the whole line as a string
        //scanner.nextInt() reads in the next integer
        String input = scanner.nextLine();
        
        if(isPalindrome(input.toLowerCase())){
            System.out.println(input + " is a palindrome");
        }
        else{
            System.out.println(input + " is NOT a palindrome");
        }
    }
}
