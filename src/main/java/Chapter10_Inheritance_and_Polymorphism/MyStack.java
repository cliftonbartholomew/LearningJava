/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inheritance_and_Polymorphism;

import java.util.ArrayList;

/**
 *
 * @author Server
 * Creating a stack with ArrayList 
 * Note: this is not inheritance (an is-a relationship)
 * Note: this is composition (a has-a relationship)
 */
public class MyStack {
    private ArrayList stack;
    
    public MyStack(){
        stack = new ArrayList();
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public Object pop(){
        Object o = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return o;
    }
    
    public Object peek(){
        return stack.get(stack.size() - 1);
    }
    
    public Object push(Object o){
        stack.add(o);
        return o;
    }
    
    public int search(Object o){
        return stack.lastIndexOf(o);
    }
    
    public String toString(){
        return "stack" + stack.toString();
    }
}
