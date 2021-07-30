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
public class forEachLoopArrays {
    public static void main(String[] args) {
        int [] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        
        int total = 0;
        for(int element: numbers){
            total += element;
        }
        
        /**
         * This has the same effect as:
         * 
         * for(int i = 0; i < numbers.length; i ++){
         *     total += numbers[i];
         * }
         * 
         * But is neater and easier to read
         */
        
        System.out.println("Sum is: " + total);
                
    }
}
