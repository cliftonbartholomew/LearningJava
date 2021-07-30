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
 */
public class TestingArrayList {
    public static void main(String[] args) {
        ArrayList<Circle> list = new ArrayList<>();
        
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle(17);
        Circle c4 = new Circle(10);
        
        list.add(c1);
        list.add(c2);
        list.add(c3);
        
        //calls [e0.toString(), e1.toString(), e2.toString()]
        System.out.println("list1 : " + list);
        System.out.println("list1 contains c1: " + list.contains(c1));
        System.out.println("list1 contains c4: " + list.contains(c4));
        
        ArrayList<String> list2 = new ArrayList<>();
        
        list2.add("London");
        list2.add("New York");
        list2.add("England");
        list2.add("America");
        
        System.out.println(list2);
        System.out.println("List2 size: " + list2.size());
        System.out.println("List2 empty?: " + list2.isEmpty());
        System.out.println("List2 index of England: " + list2.indexOf("England"));
        
        //insert at pos 1 and shift the rest
        list2.add(1, "South Africa");
        System.out.println("list2 after inset: " + list2);
        
        
    }
}
