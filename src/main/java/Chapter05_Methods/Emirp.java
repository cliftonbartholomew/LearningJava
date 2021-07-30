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
public class Emirp {
    public static void main (String [] args){

        int numEmirps = 0;
        int n = 2;
        
        while(numEmirps < 100){
            if(isPrime(n) && isReversePrime(n)){
                System.out.printf("%10d", n);
                numEmirps++;
                if(numEmirps%10 == 0){
                    System.out.println("");
                }
            }
            n++;
            
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
    
    //Checks if a primes digits are reversed and its still a prime
    //e.g. 13 will return true since 31 is prime
    public static boolean isReversePrime(int prime){
        String result = "";
        
        while(prime != 0){
            result += prime%10;
            prime /= 10;
        }
        
        return isPrime(Integer.parseInt(result));
    }
}
