/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03_Selections;

/**
 *
 * @author Server
 */
public class RandomUpperCase {
    public static void main (String[] args){
        for(int i = 0; i < 100; i++)
            System.out.println("Char: " + (char)(65 + (int)(Math.random()*24)));
        
    }
}
