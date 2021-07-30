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
public class MyString {
    char [] chars;    
    
    public MyString(){
        this.chars = null;
    }
    
    public MyString(char [] chars){
        this.chars = chars.clone();
    }
    
    public char charAt(int index){
        return this.chars[index];
    }
    
    public int length(){
        return this.chars.length;
    }
    
    //Returns a string from begin (inclusive) to end (exclusive)
    public MyString substring(int begin, int end){
        char[] returnChars = new char[end - begin];
        
        int position = 0;
        for(int i = begin; i < end; i ++){
            returnChars[position] = this.chars[i];
            position++;
        }
        
        MyString returnString = new MyString(returnChars);
        return returnString;
    }
}
