/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter02_Elementary_programming;

/**
 *
 * @author Server
 */
public class CurrentTime {
    public static void main(String [] args){
        long totalMillis = System.currentTimeMillis();
        
        long totalSecs, totalMins, totalHours;
        int currentSecs, currentMins, currentHours;
        
        totalSecs = totalMillis/1000;
        currentSecs = (int)totalSecs % 60;
        
        totalMins = totalSecs/60;
        currentMins = (int)totalMins % 60;
        
        totalHours = totalMins/60;
        currentHours = (int)totalHours % 24;
        
        System.out.printf("Current time: %d:%d:%d GMT", currentHours, currentMins, currentSecs);
        
    }
}
