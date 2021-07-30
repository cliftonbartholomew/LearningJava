/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter03_Selections;

/**
 *
 * @author Server
 */
public class ConditionalExpressionsAndPrintf {
    public static void main(String[] args){
        int num1 = 71;
        int num2 = 25;
        int max = (num1 > num2) ? num1 : num2;
        
        System.out.println("Max : " + max);
        System.out.println(num1 % 2 == 0 ? "Your number is even" : "Your number is odd");
        
        String string1 = "four";
        float float1 = 56545.5677f;
        
        /** %-10s :
         *  % means its a special code
         *  - means left aligned (default is right aligned)
         *  10 means that the must be 10 spaces reserved for the variable in the printout
         *         (Note: if it is longer than 10 spaces, it is resized)
         *  s  means string (b - boolean, c - char, d - int, f - float/double, e - scientific notation)
         */
        System.out.printf("%-10s%-10d%-10.5f", string1, num1, float1);
        
        
    }
}
