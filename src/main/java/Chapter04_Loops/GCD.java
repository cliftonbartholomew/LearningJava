/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04_Loops;

import javax.swing.JOptionPane;

/**
 *
 * @author Server
 */
public class GCD {
    public static void main (String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second integer"));
        
        int GCD = 0;
        
        for(int i = 1; i <= num1 && i <= num2; i ++){
            if(num1 % i == 0 && num2 % i == 0){
                GCD = i;
            }
        }
        
        System.out.println("Num1 : " + num1 + "\nNum2 : " + num2 + "\nGCD: " + GCD);
    }
}
