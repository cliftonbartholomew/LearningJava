/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04_Loops;

import java.util.Scanner;

/**
 *
 * @author Server
 */
public class PrintPrimes {
    public static void main (String[] args){
        //Get the number of primes to print
        Scanner input = new Scanner(System.in);
        System.out.println("How many primes to print?");
        int numPrimes = input.nextInt();
        
        int primeCount = 0;
        int currentCandidate = 2;
        
        while(primeCount < numPrimes){
            if(isPrime(currentCandidate)){
                System.out.print(currentCandidate + " ");
                primeCount++;
                if(primeCount % 10 == 0){
                    System.out.println("");
                }
            }
            
            currentCandidate++;
        }
        
        
    }
    
    public static boolean isPrime(int primeCandidate){
        for(int divisor = 2; divisor <= (int) Math.sqrt(primeCandidate); divisor++){
            if(primeCandidate % divisor == 0){
                return false;
            }
        }
        
        return true;
    }
}
