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
public class TestQueue {
    public static void main(String[] args) {
        QueueOfIntegers q = new QueueOfIntegers(5);
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        
        //when an object is used in place of a string. The toString() method is called
        System.out.println("Queue: " + q);
        System.out.println("");
        
        System.out.println("Pop 1:" + q.dequeue());
        System.out.println("Queue: " + q.toString());
        System.out.println("");
        
        System.out.println("Pop 2:" + q.dequeue());
        System.out.println("Queue: " + q.toString());
        System.out.println("");
        
        q.enqueue(5);
        q.enqueue(6);
        
        System.out.println("Queue: " + q.toString());
        System.out.println("");

        
        q.enqueue(7);
        q.enqueue(8);
        
        System.out.println("Queue: " + q.toString());
        System.out.println("");
        
        q.dequeue();
        q.dequeue();
        q.enqueue(9);
        q.enqueue(10);
        
        System.out.println("Queue: " + q.toString());
        System.out.println("");
        
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        
        System.out.println("Queue: " + q.toString());
        System.out.println("");
        
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        
        System.out.println("Queue: " + q.toString());
        System.out.println("");
    }
}
