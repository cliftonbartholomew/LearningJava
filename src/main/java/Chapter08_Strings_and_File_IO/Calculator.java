/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter08_Strings_and_File_IO;

/**
 *
 * @author Server
 */
public class Calculator {
    public static void main(String[] args) {
        if(args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
        
        switch(args[1].charAt(0)){
            case '+' ->  {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            case '-' ->  {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            case '*' ->  {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            }
            case '/' ->  {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
           
        }
    }
    
}
