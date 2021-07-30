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
public class SortingArrays {

    public static void main(String[] args) {
        int [] list = {1, 8, 6, 7, 4, 2};
        
        for(int element: list){
            System.out.print(element + " ");
        }
        System.out.println("");
        
        insertionSort(list);
        
        for(int element: list){
            System.out.print(element + " ");
        }
    }
    public static void selectionSort(int [] list){
        for(int i = list.length - 1; i > 0; i --){
            int largest = list[i];
            int largestIndex = i;
            
            for(int j = 0; j < i; j ++){
                if(list[j] > largest){
                    largest = list[j];
                    largestIndex = j;
                }
            }
            
            list[largestIndex] = list[i];
            list[i] = largest;
        }
    }
    
    public static void insertionSort(int [] list){
        for(int i = 1; i < list.length; i ++){
            
            int nextItem = list[i];
            int j;
            for(j = i - 1; j >= 0; j--){
                //find the place where it is 
                if(list[j] > nextItem){
                    list[j + 1] = list[j];                   
                }
                else{
                    break;
                }
            }
            
            list[j+1] = nextItem;
        }
    }
}
