/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

import java.io.FileNotFoundException;

/**
 *
 * @author Server
 */
public class PassingArgsToMain {
    public static void main (String [] args) throws FileNotFoundException{
        
//        String[] test = {"one", "two", "three"};
//        
//        ExampleArgs.main(test);
//        
//        String[] test2 = {"3" , "+", "4"};
//        Calculator.main(test2);
        
        String [] test3 = {"test.txt", "testReplace.txt", "the", "\\$\\$\\$"};
        
        ReplaceText.main(test3);
    }
}
