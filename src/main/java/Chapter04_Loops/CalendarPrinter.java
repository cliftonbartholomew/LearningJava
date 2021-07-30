/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04_Loops;

import java.util.Scanner;

/**
 *
 * @author Server
 */
public class CalendarPrinter {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //input the year
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        
        //input first week day of the year
        System.out.println("Enter the first day of the week (Note: 0 - Mon; 6 - Sun");
        int currentWeekDay = input.nextInt();
        
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December"};
        int [] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int month = 0; month < 12; month++){
            System.out.println(printMonth(months[month], year, daysPerMonth[month], currentWeekDay));
            currentWeekDay = (currentWeekDay + daysPerMonth[month]) % 7;
        }
        
    }
    
    public static String printMonth(String monthName, int year, int numDaysInMonth, int startDay){
        final int TOTAL_SPACES = 33;
        //grid is 7 columns with 3 chars, and 2 spaces inbetween each column. 
        //Total = 7x3 + 6x2 = 33 spaces
        //Between 4 - 6 rows printed
        
        //Create header
        String header = monthName + " " + year;
        String leadTrailSpaces = "";
        for(int i = 0; i < (TOTAL_SPACES - header.length())/2; i ++){
            leadTrailSpaces += " ";
        }
        //add equal spaces on each side of the header to make 33 columns
        header = leadTrailSpaces + header + leadTrailSpaces;
        String underline = "---------------------------------";
        String weekDays = "Mon  Tue  Wed  Thu  Fri  Sat  Sun";
        
        //Add header to calendar return string, incl underline and week day names
        String calendar = header + "\n" + underline + "\n" + weekDays + "\n";
        
        int dayCount = 0;
        int week = 1;
        while(dayCount < numDaysInMonth){
            //for each day in the week, write the current day number
            for(int i = 0; i < 7; i++){
                if(dayCount < startDay && week == 1 && i < startDay){
                    calendar += "   ";
                }
                else if(dayCount < numDaysInMonth){
                    dayCount++;
                    if(dayCount < 10){
                        calendar += " " + dayCount + " ";
                    }
                    else{
                        calendar += dayCount + " ";
                    }
                }
                //add two spaces between each 3
                calendar += "  ";
                
            }
            week++;
            //add a new line after each week
            calendar += "\n";
        }
        return calendar;
    }
}
