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
public class LargeSearch {
    public static void main(String[] args) {
        int [] bigList = new int[10_000_000];
        
        int key = (int)(Math.random()*10000);
        
        for(int i = 0; i < bigList.length; i++){
            bigList[i] = (int)(Math.random()*10000);
        }
        
        Arrays.sort(bigList);
        
        long startTime = System.currentTimeMillis();
        int returnIndex = Arrays.binarySearch(bigList, key);
        //int returnIndex = linearSearch(bigList, key);
        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime);
        
        System.out.println("Key : " + key + " was found at : " + returnIndex + " in : " + executionTime + " milliseconds");
        System.out.println("Start: " + startTime);
        System.out.println("End: " + endTime);
    }
    
    public static int linearSearch(int [] list, int key){
        for(int i = 0; i < list.length; i ++){
            if(list[i] == key){
                return i;
            }
        }
        return -1;
    }
}
