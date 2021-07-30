/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

/**
 *
 * @author Server
 */
public class GetTo24 {
    public static void main (String[] args){
        final int NUM_PERMUTATIONS = 24;
        final int OPERATOR_COMBINATIONS = 256;
        final int NUM_SYMBOLS = 4;
        
        //These are the numbers on the number plate
        int [] numbers = {7, 7, 7 , 7};
        
        int [][] numberPermutations = new int [NUM_PERMUTATIONS][NUM_SYMBOLS];
        int [][] operatorPermutations = new int [OPERATOR_COMBINATIONS][NUM_SYMBOLS];
        int answer = 0;
        String answerString = "";
        
        //set up the operations array
        int operatorRow = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k ++){
                    for(int l = 0; l < 4; l++){
                        operatorPermutations[operatorRow][0] = i;
                        operatorPermutations[operatorRow][1] = j;
                        operatorPermutations[operatorRow][2] = k;
                        operatorPermutations[operatorRow][3] = l;
                        operatorRow ++;
                    }
                }
            }
        }
        
        //Set up number permutation arrays        
        String [] numPermsArray = {"0123", "0132", "0213", "0231", 
            "0312", "0321", "1023", "1032", 
            "1203", "1230", "1302", "1320", 
            "2013", "2031", "2103", "2130", 
            "2301", "2310", "3012", "3021", 
            "3102", "3120", "3201", "3210"};

        for(int row = 0; row < NUM_PERMUTATIONS; row++){
            for(int col = 0; col < NUM_SYMBOLS; col++){
                numberPermutations[row][col] = Integer.parseInt(numPermsArray[row].substring(col,col+1));
            }
        }
        
        //For each permutations of numbers
        for(int numPerm = 0; numPerm < NUM_PERMUTATIONS; numPerm++){
            //For each combination of operators
            for(int operatorCom = 0; operatorCom < OPERATOR_COMBINATIONS; operatorCom++){
                
                //initialise the answer set
                answer = numbers[numberPermutations[numPerm][0]];
                answerString = "(((" + numbers[numberPermutations[numPerm][0]];
                
                //combine the current numbersPerm and operationsComb into an answer
                for(int calculation = 1; calculation < 4; calculation++){
                    
                    switch(operatorPermutations[operatorCom][calculation]){
                        //0 is +
                        case 0 -> {
                            answer += numbers[numberPermutations[numPerm][calculation]];
                            answerString += " + " + numbers[numberPermutations[numPerm][calculation]] + ")";
                        }
                        //1 is - 
                        case 1 -> {
                            answer -= numbers[numberPermutations[numPerm][calculation]];
                            answerString += " - " + numbers[numberPermutations[numPerm][calculation]] + ")";
                        }
                        //2 is *
                        case 2 -> {
                            answer *= numbers[numberPermutations[numPerm][calculation]];
                            answerString += " * " + numbers[numberPermutations[numPerm][calculation]] + ")";
                        }
                        //3 is /
                        case 3 -> {
                            //ONLY if it divides fully
                            if(answer % numbers[numberPermutations[numPerm][calculation]] == 0){
                                answer /= numbers[numberPermutations[numPerm][calculation]];
                                answerString += " / " + numbers[numberPermutations[numPerm][calculation]] + ")";
                            }
                            //else this combination/permutation doesnt work
                            else{
                                answer = 0;
                                break;
                            }
                        }
                    }
                }
                //Stop if there is an answer
                if(answer == 24){
                    break;
                }
            }
            //Stop if there is an answer
            if(answer == 24){
                break;
            }
            
        }
        
        System.out.println(answerString);
        
    }
            
}
