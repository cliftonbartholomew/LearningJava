/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09_Objects_practice;

import java.util.Arrays;

/**
 *
 * @author Server
 */
public class StackOfIntegers {
    private int [] stack;
    private static final int DEFAULT_SIZE = 16;
    private int size;
    
    public StackOfIntegers(){
        this(DEFAULT_SIZE);
    }
    
    public StackOfIntegers(int size){
        this.stack = new int[size];
        this.size = 0;
    }
    
    public void push(int value){
        if(stack.length == size){
            this.stack = Arrays.copyOf(this.stack, this.size*2);
        }
        
        this.stack[size++] = value;
    }
    
    public int pop(){
        //returns (size - 1) and then reduces the size, making the array at size
        //is no longer referenced
        return stack[--size];
    }
    
    public int peek(){
        return stack[size - 1];
    }
    
    public boolean empty(){
        return this.size == 0;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public String toString(){
        String s = "{";
        for(int i = 0; i < this.size; i++){
            if(i != size - 1){
                s += this.stack[i] + ", ";
            }
            else{
                s += this.stack[i] + "}";
            }
        }
        return s;
    }
}
