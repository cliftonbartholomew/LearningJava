/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inheritance_and_Polymorphism;

import java.util.Date;

/**
 *
 * @author Server
 */
public class TestPolymorphismCasting {
    public static void main(String[] args) {
        GeometricObject [] shapes = new GeometricObject[5];
        
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Rectangle(7, 12);
        shapes[3] = new Circle(5, "blue", false, new Date());
        shapes[4] = new Circle(10);
        
        
        System.out.println("toString demo:");
        for(GeometricObject o: shapes){
            //if the toString is overridden, it is called when expecting a string
            System.out.println(o);
            System.out.println("");
        }
        
        System.out.println("polymorphism demo:");
        for(GeometricObject o: shapes){
            System.out.println("Area of shape:" + o.getArea());
        }
        
        System.out.println("");
        System.out.println("equals demo:");
        System.out.println("shapes[0].equals(shapes [1])? : " + shapes[0].equals(shapes [1]));
        System.out.println("shapes[1].equals(shapes [2])? : " + shapes[1].equals(shapes [2]));
        System.out.println("shapes[2].equals(shapes [3])? : " + shapes[2].equals(shapes [3]));
        
        System.out.println("");
        System.out.println("Test polymorphic casting - change all circles to radius 15");
        for(GeometricObject o: shapes){
            changeStats(o, 15);
        }
        for(GeometricObject o: shapes){
            //if the toString is overridden, it is called when expecting a string
            System.out.println(o);
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Test polymorphic casting - change all ractangles to lenght and breadth 15");
        for(GeometricObject o: shapes){
            changeStats(o, 15, 15);
        }
        for(GeometricObject o: shapes){
            //if the toString is overridden, it is called when expecting a string
            System.out.println(o);
            System.out.println("");
        }
    }
    
    public static void changeStats(GeometricObject o, int radius){
        if(o instanceof Circle){
            System.out.println("changing the circles radius");
            ((Circle)o).setRadius(radius);
        }
        else{
            System.out.println("This object is not a Circle");
        }
    }
    
    public static void changeStats(GeometricObject o, int length, int breadth){
        if(o instanceof Rectangle){
            System.out.println("changing the rectangle length and breath");
            ((Rectangle)o).setLength(length);
            ((Rectangle)o).setBreadth(breadth);
        }
        else{
            System.out.println("This object is not a rectangle");
        }
    }
}
