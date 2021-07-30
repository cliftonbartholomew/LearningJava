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
public class ArraySearch {
    
    public static void main(String [] args){
        int [] list = new int[100];
        
        for(int i = 0; i < list.length; i ++){
            list[i] = i;
        }
        
        System.out.println("Linearly find 15 : " + linearSearch(list, 15));
        System.out.println("Binarily find 15 : " + binarySearch(list, 15));
        System.out.println("Linearly find 75 : " + linearSearch(list, 76));
        System.out.println("Binarily find 75 : " + binarySearch(list, 76));


    }
    
    public static int linearSearch(int [] list, int key){
        int count = 0;
        for(int i = 0; i < list.length; i ++){
            if(key == list[i]){
                //System.out.println("The search took " + count + " loops");
                return i;
            }
            
            count++;
        }
        
        //System.out.println("The search took " + count + " loops");
        
        //if key is not found, return -1
        return -1;
    }
    
    public static int binarySearch(int[] list, int key){
        int highIndex = list.length - 1;
        int lowIndex = 0;
        int currentIndex = 0;
        
        while(highIndex >= lowIndex){
            currentIndex = (lowIndex + highIndex)/2;
            if(list[currentIndex] == key){
                return currentIndex;
            }
            else if(list[currentIndex] < key){
                lowIndex = currentIndex + 1;
            }
            else if(list[currentIndex] > key){
                highIndex = currentIndex - 1;
            }
        }

        return -currentIndex - 1;
    }
}
