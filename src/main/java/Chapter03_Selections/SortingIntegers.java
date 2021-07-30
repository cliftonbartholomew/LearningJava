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
public class SortingIntegers {
    public static void main (String [] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter in integer 1"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter in integer 2"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter in integer 3"));
        
        int temp = Math.max(num1, num2);
        int max = Math.max(temp, num3);
        
        temp = Math.min(num1, num2);
        int min = Math.min(temp, num3);
        
        if (num1 != max && num1 != min)
            temp = num1;
        
        if (num2 != max && num2 != min)
            temp = num2;
        
        if (num3 != max && num3 != min)
            temp = num3;
        
        num1 = min;
        num2 = temp;
        num3 = max;
        
        System.out.println("Sorted: " + num1 + ", " + num2 + ", " + num3);
    }
}