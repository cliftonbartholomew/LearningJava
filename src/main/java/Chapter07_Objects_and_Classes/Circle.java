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
public class Circle {
    //This is a private property of each object
    //Private means inaccessible by circ.radius = 1
    private double radius = 1;
    
    
    //this is a class property denoted by the "static" keyword
    private static int numberOfObjects = 0;
    
    public Circle(){
        numberOfObjects++;
    }
    
    public Circle(double radius){
        this.radius = radius;
        numberOfObjects++;
    }
    
    public double getArea(){
        return Math.pow(this.radius, 2)*Math.PI;
    }
    
    //These methods need to be called through an object instance
    //They are called instance methods
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    //A static method doesnt need an instance of the class to be called
    public static int getNumObjects(){
        return numberOfObjects;
    }
    
    public static Circle [] generateCircleArray(int n){
        Circle [] circles = new Circle [n];
        
        for(int i = 0; i < circles.length; i++){
            circles[i] = new Circle(i + 1);
        }
        
        return circles;
    }
    
    public static void printCircleArray(Circle [] circles){
        for(int i = 0; i < circles.length; i ++){
            System.out.println("Circle " + i + " : radius = " + circles[i].getRadius());
        }
    }
    
    public static double sumAreas(Circle [] circles){
        double sum = 0;
        for(int i = 0; i < circles.length; i ++){
            sum+= circles[i].getArea();
        }
        
        return sum;
    }
}