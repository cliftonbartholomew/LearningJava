/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter07_Objects_and_Classes;

import java.util.Random;

/**
 *
 * @author Server
 */
public class RandomClass {
    public static void main(String[] args) {
        Random ran = new Random();
        
        for(int i = 0; i < 10; i++){
            System.out.print(ran.nextInt() + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            System.out.print(ran.nextInt(100) + " ");
        }
        
        //The seed determines the sequence
        //Same seed = same sequence
        //Using the no-arg constructor takes the current time as a seed
        Random ran1 = new Random(3);
        Random ran2 = new Random(3);
        
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            System.out.print(ran1.nextInt(100) + " ");
        }
        
        System.out.println("");
        
        for(int i = 0; i < 10; i++){
            System.out.print(ran2.nextInt(100) + " ");
        }
    }
}
