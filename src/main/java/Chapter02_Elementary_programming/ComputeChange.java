/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02_Elementary_programming;

import java.util.Scanner;

/**
 *
 * @author Server
 */
public class ComputeChange {
    public static void main(String [] args){
        //Create a new scanner
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter in a monetary amount: ");
        double moneyAmount = userInput.nextDouble();
        
        int remainingAmount = (int) (moneyAmount * 100);
        
        int numTwoHundreds = remainingAmount / 20000;
        remainingAmount %= 20000;
        
        int numOneHundreds = remainingAmount / 10000;
        remainingAmount %= 10000;
        
        int numFifties = remainingAmount / 5000;
        remainingAmount %= 5000;
        
        int numTwenties = remainingAmount / 2000;
        remainingAmount %= 2000;
        
        int numTens = remainingAmount / 1000;
        remainingAmount %= 1000;
        
        int numFives = remainingAmount / 500;
        remainingAmount %= 500;
        
        int numTwos = remainingAmount / 200;
        remainingAmount %= 200;
        
        int numOnes = remainingAmount / 100;
        remainingAmount %= 100;
        
        int numFiftyC = remainingAmount / 50;
        remainingAmount %= 50;
        
        int numTwentyC = remainingAmount / 20;
        remainingAmount %= 20;
        
        int numTenC = remainingAmount / 10;
        remainingAmount %= 10;
        
        System.out.printf("The amount of : " + moneyAmount + 
                " is made up of the following increments:" +
                "\nR200:\t%d" +
                "\nR100:\t%d" +
                "\nR50:\t%d" +
                "\nR20:\t%d" +
                "\nR10:\t%d" +
                "\nR5:\t%d" +
                "\nR2:\t%d" +
                "\nR1:\t%d" +
                "\n50c:\t%d" +
                "\n20c:\t%d" +
                "\n10c:\t%d",
                numTwoHundreds, numOneHundreds, numFifties, numTwenties, numTens,
                numFives, numTwos, numOnes, numFiftyC, numTwentyC, numTenC);
        
        
        
        
    }
}
