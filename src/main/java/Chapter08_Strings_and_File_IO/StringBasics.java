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
public class StringBasics {
    public static void main(String[] args) {
        //Strings are not primitive data types, they are objects with methods
        
        //literal assignment
        String s1 = "Welcome to java";
        String s2 = "Welcome to java";
        
        //explicit object assignment
        String s3 = new String("Welcome to java");
        
        //s1 and s2 - string literals are interned (they both point to the same object in memory).
        //s1 and s2 hold memory lo
        System.out.println("s1 == s2? " + (s1 == s2));
        
        //since the "new" operator is used, new memory is alocated.
        System.out.println("s2 == s3? " + (s2 == s3));
        
        // == compares the memory location, .equals compares the actual strings
        System.out.println("s2.equals(s3)? " + s2.equals(s3));
        
        //+ is the shortform for "concat"
        //it returns a new string object, with a new memory position
        String s4 = s3 + s2;
        String s5 = s3.concat(s2);
        
        printStrings(s1, s2, s3, s4, s5);
        
        //strip parts of a string
        String htmlWelcome = s1.substring(0, 11) + "HTML";
        
        //split strings with a delimeter
        //useful for working through lines in a text file or parsing textfiles/websites/general crawling stuff
        String [] tokens = s1.split(" ");
        
        printStrings(tokens);
        
        String s6 = "Java is cool";
        String s7 = "Java is fun";
        String s8 = "Java is wonderful";
        
        //matches is much for powerful than equals
        System.out.println("s1 matches Java.* ? " + s1.matches("Java.*"));
        System.out.println("s6 matches Java.* ? " + s6.matches("Java.*"));
        System.out.println("s7 matches Java.* ? " + s7.matches("Java.*"));
        System.out.println("s8 matches Java.* ? " + s8.matches("Java.*"));
        
        //contains is useful for searching
        System.out.println("s1 contains \"to\" ? " + s1.toLowerCase().contains("to"));
        System.out.println("s6 contains \"at\" ? " + s6.toLowerCase().contains("at"));
        
        //converts primitive types into strings
        System.out.println(String.valueOf(5.66));
        
        //converts strings to a double
        System.out.println(Double.parseDouble("5.66"));
    }
    
    public static void printStrings(String... str){
        for(int i = 0; i < str.length; i++){
            System.out.println("s" + i + ": " + str[i]);
        }
        
        System.out.println("----------------------------------------------");
    }
}
