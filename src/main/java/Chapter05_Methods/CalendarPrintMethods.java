/*
 * Note: The spacing between columns does not work....
 */
package Chapter05_Methods;

import java.util.Scanner;

/**
 *
 * @author Server
 */
public class CalendarPrintMethods{
    public static void main (String[] args){
//        Scanner input = new Scanner(System.in);
//        
//        //input the year
//        System.out.println("Enter the year: ");
//        int year = input.nextInt();
        
        int year = 1993;
        printYear(year);
    }
    
    //Prints an adjustably spaced month header
    public static void printMonthHeader(int year, int month){
        final int COLUMN_WIDTH = 3;//must be odd
        final int SPACE_BETWEEN_COLS = 2;
        final int NUM_COLS = 7;
        final int TOTAL_SPACES = NUM_COLS * COLUMN_WIDTH + (NUM_COLS - 1) * SPACE_BETWEEN_COLS;
        
        //Create the centered header title
        String header = getMonthName(month) + " " + year;
        
        String leadTrailSpaces = "";
        for(int i = 0; i < (TOTAL_SPACES - header.length())/2; i ++){
            leadTrailSpaces += " ";
        }
        
        header = leadTrailSpaces + header + leadTrailSpaces;
        
        //Create the underline
        String underline = "";
        for(int i = 0; i < TOTAL_SPACES; i++){
            underline += "-";
        }
        
        //Create the weekday title
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        String weekDayTitle = "";
        for(int i = 0; i < NUM_COLS; i ++){
            weekDayTitle += weekDays[i];
            for(int j = 0; j < SPACE_BETWEEN_COLS; j++){
                weekDayTitle += " ";
            }
        }
        
        //Print out the header
        System.out.println(header + "\n" + underline + "\n" + weekDayTitle);
    }
     
    public static void printMonth(int year, int month){
        final int COLUMN_WIDTH = 3; //must be odd
        final int SPACE_BETWEEN_COLS = 2;
        final int NUM_COLS = 7;
        final int TOTAL_SPACES = NUM_COLS * COLUMN_WIDTH + (NUM_COLS - 1) * SPACE_BETWEEN_COLS;
        
        String colBufferLeft = "";
        for(int i = 0; i < COLUMN_WIDTH - 3; i ++){
            colBufferLeft += " ";
        }
        String colBufferRight = colBufferLeft + " ";
        
        String spaceBetweenCols = "";
        for(int i = 0; i < SPACE_BETWEEN_COLS; i ++){
            spaceBetweenCols += " ";
        }
        
        String emptyCol = "";
        for(int i = 0; i < COLUMN_WIDTH; i ++){
            emptyCol += " ";
        }
        
        printMonthHeader(year, month);
        
        int numDaysInMonth = getNumDaysInMonth(year, month);
        int firstDayOfMonth = getFirstDayOfMonth(year, month);
        
        String calendar = "";
        int dayCount = 0;
        int week = 1;
        
        while(dayCount < numDaysInMonth){
            //for each day in the week, write the current day number
            for(int i = 0; i < 7; i++){
                if(dayCount < firstDayOfMonth && week == 1 && i < firstDayOfMonth){
                    calendar += emptyCol;
                }
                else if(dayCount < numDaysInMonth){
                    dayCount++;
                    if(dayCount < 10){
                        calendar += colBufferRight + dayCount + colBufferRight;
                    }
                    else{
                        calendar += colBufferLeft + dayCount + colBufferRight;
                    }
                }
                //add two spaces between each 3
                calendar += spaceBetweenCols;
                
            }
            week++;
            //add a new line after each week
            calendar += "\n";
        }
        System.out.println(calendar);
    }
    
    public static void printYear(int year){
        for(int month = 0; month < 12; month++){
            printMonth(year, month);
            System.out.println("");
        }
    }
    
    //returns true if the year is a leap year
    public static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    
    
    //returns the name of the month
    //month - 0 -> January; 1 -> February ...
    public static String getMonthName(int month){
        switch(month){
            case 0 -> {
                return "January";
            }
            case 1 -> {
                return "February";
            }
            case 2 -> {
                return "March";
            }
            case 3 -> {
                return "April";
            }            
            case 4 -> {
                return "May";
            }
            case 5 -> {
                return "June";
            }
            case 6 -> {
                return "July";
            }
            case 7 -> {
                return "August";
            }
            case 8 -> {
                return "September";
            }
            case 9 -> {
                return "October";
            }
            case 10 -> {
                return "November";
            }
            case 11 -> {
                return "December";
            }
            default -> {
                return null;
            }
        }
    }
    
    //returns number of days in month
    //month - 0 -> January; 1 -> February ...
    public static int getNumDaysInMonth(int year, int month){
        return switch (month) {
            case 0, 2, 4, 6, 7, 9, 11 -> 31;
            case 3, 5, 8, 10 -> 30;
            case 1 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };
    
    }
    
    //returns the total number of days since 01/01/1800 until the lest day of the previous month
    public static int getTotalNumDaysBeforeMonth(int year, int month){
        int totalNumDays = 0;
        for(int currentYear = 1800; currentYear < year; currentYear++){
            totalNumDays += isLeapYear(currentYear) ? 366 : 365;
        }
        
        for(int currentMonth = 0; currentMonth < month; currentMonth++){
            totalNumDays += getNumDaysInMonth(year, currentMonth);
        }
        return totalNumDays;
    }

    //returns the day of the week the month starts 
    //return 0 -> Mon; 1 -> Tue....
    public static int getFirstDayOfMonth(int year, int month){
        //This day was a Wednesaday
        final int START_DAY_JAN_1_1800 = 2;
        
        return (getTotalNumDaysBeforeMonth(year, month) + START_DAY_JAN_1_1800) % 7;
    }
    
}
