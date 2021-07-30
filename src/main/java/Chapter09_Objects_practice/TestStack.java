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
public class TestStack {
    public static void main(String[] args) {
        StackOfIntegers s = new StackOfIntegers(5);
        
        s.push(5);
        s.push(12);
        s.push(55);
        s.push(23);
        s.push(44);
        s.push(32);
        
        System.out.println("Current stack : " + s.toString() + "\nsize : "+ s.getSize());
        
        System.out.println("Pop 1 : " + s.pop() );
        
        System.out.println("Current stack : " + s.toString() + "\nsize : "+ s.getSize());
        
        System.out.println("Peek 1 : " + s.peek());
        
        System.out.println("Current stack : " + s.toString() + "\nsize : "+ s.getSize());
        
    }
    
}
