/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter09_Objects_practice;

/**
 *
 * @author Server
 */
public class QueueOfIntegers {
    private int[] queue;
    private int size;
    private int capacity;
    private int back;
    
    private static final int DEFAULT_SIZE = 16;
    
    public QueueOfIntegers(){
        this(DEFAULT_SIZE);
    }
    
    public QueueOfIntegers(int capacity){
        queue = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
        this.back = 0;
    }
    
    public void enqueue(int value){
        //move back forward only if there is atleast one element
        if(size != 0){
            this.back++;
        }
        
        //extend the array if it has reached capacity
        if(back == capacity){
            int[] temp = new int[this.capacity*2];
            System.arraycopy(this.queue, 0, temp, 0, this.capacity);
            this.capacity *= 2;
            this.queue = temp;
        }
        
        this.queue[back] = value;
        this.size++;
    }
    
    public int dequeue(){
        //throw error if dequeue on an empty queue
        if(size != 0){
            int temp = this.queue[0];
            
            //shift everything one up in the queue
            for(int i = 0; i < this.size - 1; i ++){
                this.queue[i] = this.queue[i + 1];
            }
            
            size --;
            back --;
            return temp;
        }
        
        //else throw index out of bounds
        return 0;
    }
    
    public int peek(){
        return queue[0];
    }
    
    public boolean empty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    @Override
    public String toString(){
        if(size == 0)
            return "";
        
        String s = "{";
        for(int i = 0; i < this.size - 1; i++){
            s += this.queue[i] + ", ";
        }
        s += this.queue[this.size - 1] + "}";
        return s;
    }   
}
