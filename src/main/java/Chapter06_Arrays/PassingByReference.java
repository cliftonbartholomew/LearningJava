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
public class PassingByReference {
    public static void main(String[] args) {
        int [] array = {1, 4, 5, 2, 77, 12};
        
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println("");
        
        
        //The array that is passed is ACTUALLY edited
        //the reference to the array is passed, NOT a copy of the array.
        sort(array);
        
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println("");
        
    }
    
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int max = arr[0];
            int maxIndex = 0;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > max){
                    max = arr[j];
                    maxIndex = j;
                }
            }

            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = max;
            arr[maxIndex] = temp;
        }
    }
}
