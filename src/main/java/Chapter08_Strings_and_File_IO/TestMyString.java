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
public class TestMyString {
    public static void main(String[] args) {
        char[] chars = {'t','e','s','t'};
        MyString s = new MyString(chars);
        
        System.out.println("Length: " + s.length());
        System.out.println("Substring: " + String.valueOf(s.substring(0, 2)));
    }
}
