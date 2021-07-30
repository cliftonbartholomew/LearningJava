/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02_Elementary_programming;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Server
 */
public class ComputingLoansUsingDialogues {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        double loanAmount = 0;
        double interestRateAnnual = 0;
        double interestRateMonthly = 0;
        byte numYears = 0;
        String loanAmountString = "";
        String interestRateAnnualString = "";
        String numYearsString = "";
        
        //Getting the loan amount
        loanAmountString = JOptionPane.showInputDialog("Enter the loan amount:");
        loanAmount = Double.parseDouble(loanAmountString);
        
        //Getting the loan period
        numYearsString = JOptionPane.showInputDialog("Number of years for loan: ");
        numYears = (byte)Integer.parseInt(numYearsString);
        
        //Getting the annual percentage
        interestRateAnnualString = JOptionPane.showInputDialog("Annual interest rate: ");
        interestRateAnnual = Double.parseDouble(interestRateAnnualString)/100;
        interestRateMonthly = interestRateAnnual/MONTHS_IN_YEAR;
        
        //System.out.println(loanAmount + " : " + numYears + " : " + interestRateAnnual);
        
        double monthlyRepayment = (loanAmount * interestRateMonthly)/(1 - (1 / Math.pow((1 + interestRateMonthly),numYears * MONTHS_IN_YEAR)));
        double totalRepayment = monthlyRepayment * numYears * MONTHS_IN_YEAR;
        
        monthlyRepayment = (int)(monthlyRepayment * 100) / 100.0;
        totalRepayment = (int)(totalRepayment * 100) / 100.0;
        
        JOptionPane.showMessageDialog(null, "The monthly repayment is: " + monthlyRepayment + "\nThe total repayment is: " + totalRepayment);
    }
}
