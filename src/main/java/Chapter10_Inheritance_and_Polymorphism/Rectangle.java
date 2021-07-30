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
public class Rectangle extends GeometricObject {
    private double length;
    private double breadth;

    public Rectangle(){
        this(1.0, 1.0);
    }
    
    public Rectangle(double length, double breadth){
        super();
        //the above doesnt need to be called explicitly. it is called non-the-less
        //it must be the FIRST thing called in the constructor
        
        this.length = length;
        this.breadth = breadth;
    }
    
    public Rectangle(double length, double breadth, String color, boolean filled, Date dateCreated){
        super(color, filled, dateCreated);
        this.length = length;
        this.breadth = breadth;
    }
    
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    
    
    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + breadth * 2;
    }
    
    @Override
    public String toString(){
        return "shape: rectangle" + "\ndate created: " + this.getDateCreated() + "\nfilled? : " + this.isFilled() + "\nlength: " + this.length + "\nbreadth: " + this.breadth;
    }
    
    @Override
    //NB when you want to override the equals function from the object class, you must
    //use the Object type in param list. Otherwise it will overload the method and not override
    public boolean equals(Object o){
        //check if the object is an instanceof the Circle class
        if(o instanceof Rectangle){
            //you then cast type the object to a circle
            return ((Rectangle)o).getLength() == this.length && ((Rectangle)o).getBreadth() == this.breadth;
        }
        else{
            return false;
        }
    }
}
