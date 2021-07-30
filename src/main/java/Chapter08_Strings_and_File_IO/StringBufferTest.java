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
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer();
        s.append("Welcome ");
        s.append("to ");
        s.append("Java");
        
        System.out.println(s);
        System.out.println("Limit: " + s.capacity());
        System.out.println("Length: " + s.length());
        
        s.append("!!!!!");
        
        System.out.println(s);
        System.out.println("Limit: " + s.capacity());
        System.out.println("Length: " + s.length());
    }
}
