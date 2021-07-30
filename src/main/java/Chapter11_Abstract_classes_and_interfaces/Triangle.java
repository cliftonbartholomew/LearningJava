/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Abstract_classes_and_interfaces;

import Chapter10_Inheritance_and_Polymorphism.GeometricObject;

/**
 *
 * @author Server
 */
public class Triangle extends GeometricObject implements Comparable{ 
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle(){
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override //from GeometricObject
    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3)/2;
        
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    @Override //from GeometricObject
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override //from Comparable - NB it must use the OBJECT as a parameter to override it (otherwise it overloads, similar
    //to the equals method in the object class
    public int compareTo(Object o) {
        if(this.getArea() > ((Triangle)o).getArea()){
            return 1;
        }
        else if(this.getArea() < ((Triangle)o).getArea()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
