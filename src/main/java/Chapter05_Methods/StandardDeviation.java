/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05_Methods;

/**
 *
 * @author Server
 */
public class StandardDeviation {
    public static void main(String[] args) {
        double [] testNumbers = {2.3, 3.6, 5.8, 6.5, 7.9, 7.6, 7.8, 7.7};
        
        System.out.println("Standard deviation = " + standardDeviation(testNumbers));
    }
    
    public static double standardDeviation(double[] numbers){
        //Calculate the sum of the numbers squared
        double sumSquared = 0;
        for(int i = 0; i < numbers.length; i++){
            sumSquared += numbers[i];
        }
        sumSquared = Math.pow(sumSquared, 2);
        
        //Calculate the sum of the square numbers
        double squaredSum = 0;
        for(int i = 0; i < numbers.length; i++){
            squaredSum = squaredSum + Math.pow(numbers[i], 2);
        }
        
        return Math.sqrt((squaredSum - (sumSquared/numbers.length))/(numbers.length - 1));
    }
}
