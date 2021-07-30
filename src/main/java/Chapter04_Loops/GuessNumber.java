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
public class GuessNumber {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int numberToGuess = (int)(1 + Math.random()*100);
        
        int guess = 0;
        System.out.println("Enter your guess: ");

        while(numberToGuess != guess){
            
            guess = input.nextInt();
            
            if(guess == numberToGuess){
                break;
            }
            else if(guess < numberToGuess){
                System.out.println("Your number is TOO LOW - guess again!");
            }
            else{
                System.out.println("Your number is TOO HIGH - guess again!");
            }
        }
        
        System.out.println("YOU GUESSED " + numberToGuess + " correctly! Well done!");
    }
}
