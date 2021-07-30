/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03_Selections;

import javax.swing.JOptionPane;

/**
 *
 * @author Server
 */
public class Lottery {
    public static void main (String [] args){
        int lotteryNumber = (int)(Math.random()*100);
        
        int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter in your guess"));
        
        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;
        
        int lotteryDigit1 = lotteryNumber/10;
        int lotteryDigit2 = lotteryNumber%10;
        
        //If correct = win 1000
        if(guess == lotteryNumber){
            
            System.out.println("Your choice: " + guess +
                    "\nLottery number: " + lotteryNumber + 
                    "\nCorrect guess! You win: $1000");
        }
        
        //If both numbers correct = win 100
        else if(guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1){
            
            System.out.println("Your choice: " + guess +
                    "\nLottery number: " + lotteryNumber + 
                    "\nYou guessed the correct digits! You win: $100");
        }
     
        //If one number correct = win 10
        else if(guessDigit1 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || 
                guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1){
            
            System.out.println("Your choice: " + guess +
                    "\nLottery number: " + lotteryNumber + 
                    "\nYou guessed one correct digit! You win: $10");
        }
        
        //Else lose
        else{
            System.out.println("Your choice: " + guess +
                    "\nLottery number: " + lotteryNumber + 
                    "\nYour guess is WRONG! You Lose!");
        }
        
        
                
                
    }
}
