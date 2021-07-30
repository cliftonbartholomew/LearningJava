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
public class PrintPyramid {
    public static void main (String[] args){
        
        //Get the number of lines from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in the number of lines (0-99)");
        int numLines = input.nextInt();
        int totalColumns = numLines*2 - 1;
        int halfway = numLines;
        /**
         * This is essentially a grid. Down the middle is 1, so you have an n x (n-1) grid
         * on the left and similarly on the right of the 1 column.
         * 
         * This gives n rows and 2n - 1 columns. You must decide what goes in each space.
         */
        
        //On each line
        for(int currentLine = 1; currentLine <= numLines; currentLine++){
            
            //Decide what goes in each column
            for(int column = 1; column <= totalColumns; column++){
                
                /**
                 * IF WITHIN THE MIDDLE PRINTING BAND
                 * if in the first half and within "currentLine - 1" numbers before the middle. 
                 * eg 1 before the middle on line 2 or within 4 before the middle on line 5.
                 **/
                if(column < halfway && column >= halfway - currentLine + 1){
                    //Print descending function
                    System.out.printf(" %-2d ", numLines - column + 1);
                }
                
                /**
                 * IF WITHIN THE MIDDLE PRINTING BAND
                 * if in the second half and within "currentLine - 1" numbers after the middle. 
                 * eg 1 after the middle on line 2 or within 4 after the middle on line 5.
                 **/
                else if (column > halfway && column <= halfway + currentLine - 1 ){
                    //Print ascending function
                    System.out.printf(" %2d ", column - numLines + 1);
                }
                
                //ELSE PRINT SPACES (unless half way)
                else{
                    if(column != halfway){
                        System.out.print("    ");
                    }
                }
                
                if(column == halfway){
                    System.out.print(" 1 ");
                }
            }
        
            //Move to the next line
            System.out.print("\n");
        }
    }
}

