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
public class SudokuSolver {

    public static void main (String [] args){
        //input the puzzle (row at a time?)
        int [][] puzzle = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 3, 0, 0, 0, 0, 1, 6, 0},
        {0, 6, 7, 0, 3, 5, 0, 0, 4},
        {6, 0, 8, 1, 2, 0, 9, 0, 0},
        {0, 9, 0, 0, 8, 0, 0, 3, 0},
        {0, 0, 2, 0, 7, 9, 8, 0, 6},
        {8, 0, 0, 6, 9, 0, 3, 5, 0},
        {0, 2, 6, 0, 0, 0, 0, 9, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        
        //get the blanks
        int [][] blanks = getBlankCoords(puzzle);
	int count = 0;
        
        //System.out.println(checkPuzzle(puzzle));
        printPuzzle(puzzle);
        System.out.println("");
        
        //cycle forwards and backwards through the blanks
        for(int i = 0; i < blanks.length; i ++){
            //you cannot increment a 9
            if(puzzle[blanks[i][0]][blanks[i][1]] == 9){
                puzzle[blanks[i][0]][blanks[i][1]] = 0;
                i-=2;
                continue;
            }
            else{
                //incrememnt the current blank
                puzzle[blanks[i][0]][blanks[i][1]] ++;
            }
            
            
            //printPuzzle(puzzle);
            //System.out.println("");
	    count++;
            
            if(!checkPuzzle(puzzle)){
                if(i == 0){
                    i--;
                }
                else if(puzzle[blanks[i][0]][blanks[i][1]] == 9){
                    puzzle[blanks[i][0]][blanks[i][1]] = 0;
                    i-=2;    
                }
                else{
                    i--;
                }
                
            }
        }
        
        printPuzzle(puzzle);
	System.out.println("");
	System.out.println("Number of loops: " + count);
    }
    
    public static boolean checkPuzzle(int [][] puzzle){
        return check3x3Valid(puzzle) && checkColsValid(puzzle) && checkRowsValid(puzzle);
    }
    
    public static boolean check3x3Valid(int [][] puzzle){
        //dont use the 0 position, 1 - 9 represents the count for that number
        int [] block = new int [10];
        
        //check each block for 1-9
        int [][] threeBy3 = {
            {0, 0}, {0, 1}, {0, 2}, 
            {1, 0}, {1, 1}, {1, 2},
            {2, 0}, {2, 1}, {2, 2}
        };
        /**
         * Block numbering
         * 1   2   3 (0)
         * 4   5   6 (1)
         * 7   8   9 (2)
         *(0) (1) (2)
         */
        int rowMin;
        int rowMax;
        
        int colMin;
        int colMax;
        
        for(int blockNum = 0; blockNum < threeBy3.length; blockNum ++){
            rowMin = threeBy3[blockNum][0]*3;
            rowMax = threeBy3[blockNum][0]*3 + 3;
            
            colMin = threeBy3[blockNum][1]*3;
            colMax = threeBy3[blockNum][1]*3 + 3;
            
            for(int row = rowMin; row < rowMax; row ++){
                for(int col = colMin; col < colMax; col ++){
                    block[puzzle[row][col]]++;
                }
            }
            
            //System.out.println("Block: " + blockNum + Arrays.toString(block));
            if(isDuplicateCount(block)){
                return false;
            }
            
            Arrays.fill(block, 0);
        }
        
        return true;
    }
    
    public static boolean checkColsValid(int [][] puzzle){
        //dont use the 0 position, 1 - 9 represents the count for that number
        int [] block = new int [10];
        
        //check each col for 1-9
        for(int col = 0; col < puzzle[0].length; col ++){
            for(int row = 0; row < puzzle.length; row ++){
                block[puzzle[row][col]]++;
            }
            
            //System.out.println("Col: " + col + Arrays.toString(block));
            if(isDuplicateCount(block)){
                return false;
            }
            
            Arrays.fill(block, 0);
        }
        
        
        return true;
    }
    
    public static boolean checkRowsValid(int [][] puzzle){
        //dont use the 0 position, 1 - 9 represents the count for that number
        int [] block = new int [10];
        
        //check each row for 1-9
        for(int row = 0; row < puzzle.length; row ++){
            for(int col = 0; col < puzzle[row].length; col ++){
                block[puzzle[row][col]]++;
            }
            
            //System.out.println("Row: " + row + Arrays.toString(block));
            if(isDuplicateCount(block)){
                return false;
            }
            
            Arrays.fill(block, 0);
        }
        
        return true;
    }
    
    public static boolean isDuplicateCount(int [] block){
        //skip the 0 (empty) counter
        for(int i = 1; i < block.length; i++){
            if(block[i] > 1 ){
                return true;
            }
        }
        return false;
        
    }
 
    public static int [][] getBlankCoords(int [][] puzzle){
        //get the number of blanks
        int count = 0;
        
        for(int row = 0; row < puzzle.length; row ++){
            for(int col = 0; col < puzzle[row].length; col ++){
                if(puzzle[row][col] == 0){
                    count ++;
                }
            }
        }
        
        //populate the return array
        int [][] blanks = new int [count][2];
        count = 0;
        
        for(int row = 0; row < puzzle.length; row ++){
            for(int col = 0; col < puzzle[row].length; col ++){
                if(puzzle[row][col] == 0){
                    blanks[count][0] = row;
                    blanks[count][1] = col;
                    count ++;
                }
            }
        }
        
        return blanks;
    }
    
    public static void printPuzzle(int [][] puzzle){
        for(int row = 0; row < puzzle.length; row ++){
            System.out.print("[");
            for(int col = 0; col < puzzle[row].length; col++){
                if(col == puzzle[row].length - 1){
                    System.out.print(puzzle[row][col]);
                }
                else{
                    System.out.print(puzzle[row][col] + " , ");
                }
                
            }
            System.out.println("]");
        }
    }
}
