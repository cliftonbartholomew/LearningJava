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
public class ComputingLoans {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        double loanAmount = 0;
        double interestRateAnnual = 0;
        double interestRateMonthly = 0;
        byte numYears = 0;
        Scanner userInput = new Scanner(System.in);
        
        //Getting the loan amount
        System.out.println("Loan amount: ");
        loanAmount = userInput.nextDouble();
        
        //Getting the loan period
        System.out.println("Loan number of years: ");
        numYears = userInput.nextByte();
        
        //Getting the annual percentage
        System.out.println("Annual interest rate: ");
        interestRateAnnual = userInput.nextDouble()/100;
        interestRateMonthly = interestRateAnnual/MONTHS_IN_YEAR;
        
        //System.out.println(loanAmount + " : " + numYears + " : " + interestRateAnnual);
        
        double monthlyRepayment = (loanAmount * interestRateMonthly)/(1 - (1 / Math.pow((1 + interestRateMonthly),numYears * MONTHS_IN_YEAR)));
        double totalRepayment = monthlyRepayment * numYears * MONTHS_IN_YEAR;
        
        monthlyRepayment = (int)(monthlyRepayment * 100) / 100.0;
        totalRepayment = (int)(totalRepayment * 100) / 100.0;
        
        System.out.println("The monthly repayment is: " + monthlyRepayment);
        System.out.println("The total repayment is: " + totalRepayment);
    }
}
