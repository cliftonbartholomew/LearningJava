/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

/**
 *
 * @author Server
 */
public class CharWrapper {
    public static void main(String[] args) {
        
        //all of the primitive data types have an 'object' wrapper class that gives more functions
        Character character = new Character('a');
        
        System.out.println("Char is : " + character);
        System.out.println("Char is number? " + Character.isDigit(character));
        System.out.println("Char is lowerCase? " + Character.isLowerCase(character));
        
        Integer i = new Integer(5);
        
        i = Integer.parseInt("5");
    
    }
}
