/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Abstract_classes_and_interfaces;

/**
 *
 * @author Server
 */
public class GenericSort {
    
    public static void main(String[] args) {
        //Using the Integer wrapper class
        Integer [] intArray = {3, 6, 1};
        Double [] doubleArray = {3.4, 6.7, 1.5};
        String [] stringArray = {"James", "Steve", "John"};
        
        sort(intArray);
        sort(doubleArray);
        sort(stringArray);
        
        printList(intArray);
        printList(doubleArray);
        printList(stringArray);
        
    }
    
    
    
    //a generic sort function using the comparable interface
    public static void sort(Comparable[] list){
        Comparable currentMin;
        int currentMinIndex;
        
        for(int i = 0; i < list.length; i ++){
            currentMin = list[i];
            currentMinIndex = i;
            
            for(int j = i; j < list.length; j++){
                if(list[j].compareTo(currentMin) < 0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
        }
    }
    
    //a generic print list function
    public static void printList(Object [] list){
        for(Object o: list){
            System.out.print(o + " ");
        }
        System.out.println("");
    }
}
