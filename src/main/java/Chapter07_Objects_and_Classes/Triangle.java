/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter07_Objects_and_Classes;

/**
 *
 * @author Server
 */
public class Triangle {
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
    
    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    
    public double getArea(){
        double s = (this.side1 + this.side2 + this.side3)/2;
        
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }
    
    public void setSide1(double side1){
        this.side1 = side1;
    }
    
    public void setSide2(double side2){
        this.side2 = side2;
    }
    
    public void setSide3(double side3){
        this.side3 = side3;
    }
    
    public double getSide1(){
        return this.side1;
    }
    
    public double getSide2(){
        return this.side2;
    }
    
    public double getSide3(){
        return this.side3;
    }
}


/**
 * UML
 * 
 * Triangle
 * ----------------------
 * - side1 : double
 * - side2 : double
 * - side3 : double
 * 
 * ----------------------
 * + Triangle()
 * + Triangle(side1 : double, side2: double, side3: double)
 * + getSide1() : double
 * + getSide2() : double
 * + getSide3() : double
 * + getArea() : double
 * + getPerimeter() : double
 * + setSide1(side1 : double)
 * + setSide2(side2 : double)
 * + setSide3(side3 : double)
 * 
 * 
*/