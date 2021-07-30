/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06_Arrays;

/**
 *
 * @author Server
 */
public class CoutingOccurenceOfLetters {
    
    public static void main(String[] args){
        //Generate 100 random letters
        char [] letters = generateRandomCharArray(100);
        printCharArray(letters);
        
        int [] alphaCount = countChars(letters);
        printCountArray(alphaCount);
        
    }
    
    public static char getRandomLowerCaseLetter(){
        return (char)((int)(Math.random()*26) + 97);
    }
    
    public static int[] countChars(char [] array){
        //int arrays initialise to 0
        int [] alphaCount = new int[26];
        for(char letter : array){
            alphaCount[(int)(letter) - 97]++;
        }
        
        return alphaCount;
    }
    
    public static char[] generateRandomCharArray(int length){
        char [] array = new char[length];
        
        for(int i = 0; i < length; i ++){
            array[i] = getRandomLowerCaseLetter();
        }
        
        return array;
    }
    
    public static void printCharArray(char [] array){
        for(int i = 0; i < array.length; i++){
            if((i + 1) % 20 == 0){
                System.out.println(array[i]);
            }
            else System.out.print(array[i]);
            
        }
        
    }
    
    public static void printCountArray(int [] count){
        for(int i = 0; i < count.length; i ++){
            System.out.print((char)(i + 97) + " : " + count[i] + "     ");
            if((i + 1) % 5 == 0 && i != 0){
                System.out.println("");
            }
        }
    }
}
