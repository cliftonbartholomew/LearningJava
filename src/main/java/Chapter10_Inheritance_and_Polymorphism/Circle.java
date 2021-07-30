/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inheritance_and_Polymorphism;
//test
import java.util.Date;

/**
 *
 * @author Server
 */
public class Circle extends GeometricObject {
    private double radius;
    
    public Circle(){
        this(1.0);
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled, Date dateCreated){
        super(color, filled, dateCreated);
        this.radius = radius;
    }
    
    public void test(){
        //test if this can access superclass fields (only if protected, not private)
        System.out.println("Test" + super.color);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
    
    @Override
    public String toString(){
        return "circle: " + this.radius;
    }
    
    @Override
    //NB when you want to override the equals function from the object class, you must
    //use the Object type in param list. Otherwise it will overload the method and not override
    public boolean equals(Object o){
        //check if the object is an instanceof the Circle class
        if(o instanceof Circle){
            //you then cast type the object to a circle
            return ((Circle)o).getRadius() == this.radius;
        }
        else{
            return false;
        }
    }
    
}
