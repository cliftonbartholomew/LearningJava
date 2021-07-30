/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06_Arrays;

/**
 *
 * @author Server
 */
public class TwoDArray {
    public static void main (String [] args){
        int [][] arr = new int[10][10];
        
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = row*col;
            }
        }
        print2DArray(arr);
    }
    
    public static void print2DArray(int [][] arr){
        for(int row = 0; row < arr.length; row++){
            System.out.print("[");
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]);
                if(col + 1 == arr[row].length){
                    System.out.print("]\n");
                }
                else{
                    if(arr[row][col]/10 > 0){
                        System.out.print(", ");
                    }
                    else{
                        System.out.print(",  ");
                    }
                }
            }
        }
    }
}
