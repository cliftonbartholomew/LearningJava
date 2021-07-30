/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter06_Arrays;
import java.util.Arrays;
/**
 *
 * @author Server
 */
public class ArrayClass {
    public static void main (String [] args){
        //Sort
        int [] list1 = {1, 2, 6, 4, 5, 2, 7, 5, 9 , 1};
        Arrays.sort(list1);
        System.out.println("list 1 : " + Arrays.toString(list1));
        System.out.println("list 1 address : " + list1);
        
        //Fill
        int [] list2 = new int [10];
        Arrays.fill(list2, 3);
        System.out.println("list 2 : " + Arrays.toString(list2));  
        
        //Search
        System.out.println("Search list 1: " + Arrays.binarySearch(list1, 7));
                
       //copy and compare
       int [] list3 = Arrays.copyOf(list1, list1.length);
        System.out.println("list 3 : " + Arrays.toString(list3));
        System.out.println("list 3 address : " + list3);
        System.out.println("list 3 == list 1? " + Arrays.equals(list1, list3));
                
    }
    
}
