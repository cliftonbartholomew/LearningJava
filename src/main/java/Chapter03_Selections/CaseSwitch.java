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
public class CaseSwitch {
    public static void main(String[] args){
        int test = 2;
        
        switch (test){
            case 0: System.out.println("Zero");
                    break;
            case 1: System.out.println("One");
                    break;
            case 2: System.out.println("Two");
                    break;
            case 3: System.out.println("Three");
                    break;
            default: System.out.println("Default");
                    break;
            
                
        }
    }
}
