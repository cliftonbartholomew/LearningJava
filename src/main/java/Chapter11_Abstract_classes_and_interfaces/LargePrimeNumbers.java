/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Abstract_classes_and_interfaces;

import Chapter04_Loops.PrintPrimes;
import java.math.BigInteger;
/**
 *
 * @author Server
 */
public class LargePrimeNumbers {
    public static void main(String[] args) {
        BigInteger i = new BigInteger(Long.MAX_VALUE + "2");
        
      
        int numPrimesFound = 0;
        int numRun =  0;
        while(numPrimesFound < 5){
            if(isPrime(i)){
                System.out.println("Num " + numPrimesFound + ":" + i);
                numPrimesFound ++;
            }
            i = i.add(new BigInteger("1"));
            numRun++;
            System.out.println("Run: " + numRun);
        }
        
    }
    
    
    public static boolean isPrime(BigInteger primeCandidate){
        System.out.println("primeCandidate: " + primeCandidate);
        for(BigInteger divisor = BigInteger.TWO; divisor.compareTo(primeCandidate.sqrt()) == -1; divisor = divisor.add(BigInteger.ONE)){
            System.out.println(divisor);
            if(primeCandidate.mod(divisor).compareTo(BigInteger.ZERO) == 0){
                return false;
            }
        }
        
        return true;
    }
}
