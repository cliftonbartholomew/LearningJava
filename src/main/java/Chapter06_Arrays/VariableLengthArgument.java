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
public class VariableLengthArgument {
    public static void main (String [] args){
        //sum can be called with an array
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("Array sum : " + sum(arr));
        
        //OR sum can be called with as many arguements as you want
        //they MUST all be of the same type
        System.out.println("Number sum : " + sum(1, 2, 3, 4, 5));
        
        System.out.println("GCD: " + gcd(108, 72, 24, 36));
    }
    
    
    public static int sum(int... numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i ++){
            sum += numbers[i];
        }
        
        return sum;
    }
    
    //you can create a variable length function with other parameters, as long as the variable 
    // length parameter is the last one
    public static int multiply(int firstNum, int secondNum, int... otherNums){
        int product = firstNum * secondNum;
        
        for(int i = 0; i < otherNums.length; i++){
            product *= otherNums[i];
        }
        
        return product;
    }
    
    public static int gcd(int... numbers){
        int max = 0;
        for(int element : numbers){
            if(element > max){
                max = element;
            }
        }
        
        int gcd = 1;
        boolean isCommonDivisor;
        for(int i = 2; i < max/2; i++){
            isCommonDivisor = true;
            
            for(int element : numbers){
                if(element % i != 0){
                    isCommonDivisor = false;
                    break;
                }
            }
            
            if(isCommonDivisor){
                gcd = i;
            }
        }
        return gcd;
    }
}
