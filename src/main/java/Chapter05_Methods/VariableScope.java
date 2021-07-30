/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter05_Methods;

/**
 *
 * @author Server
 */
public class VariableScope {
    public static void main(String[] args) {
        nPrintln("welcome to Java", 5);
    }
    
    public static void nPrintln(String message, int n){
        //this cannot be declared
        //int n = 1;
        for(int i = 0; i < n; i++){
            System.out.println(message);
        }
    }
}
