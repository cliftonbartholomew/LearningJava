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
public class AdvanceMathLearningTool {
    public static void main (String[] args){
        final byte NUM_OF_RUNS = 5;
        
        byte currentRun = 0;
        int num1;
        int num2;
        int answer;
        int correctCount = 0;
        String output = "";
        
        Scanner userInput = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        while(currentRun < NUM_OF_RUNS){
            //Generate the random numbers
            num1 = (int)(1 + Math.random()*100);
            num2 = (int)(1 + Math.random()*100);
            //Force num1 to be the larger number
            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            //Prompt the user for an answer
            System.out.println("What is " + num1 + " - " + num2 + "?");
            answer = userInput.nextInt();
            
            //Tell the user if they are correct
            if((num1 - num2) == answer){
                correctCount++;
                System.out.println("You are correct!");
            }
            else{
                System.out.println("You are NOT correct.\n" + num1 + " - " + num2 + " = " + (num1 - num2));
            }
            
            output += "\n" + num1 + " - " + num2 + " = " + (num1 - num2) +
                    (answer == (num1 - num2) ? " Correct" : " Incorrect");
            
            currentRun++;
        }
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        
        System.out.println("\nCorrect count: " + correctCount +
                "\nTest time: " + runTime/1000 +"\n" + output);
    }
}
