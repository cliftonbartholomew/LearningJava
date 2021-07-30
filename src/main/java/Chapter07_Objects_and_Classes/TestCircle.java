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
public class TestCircle {
    public static void main(String[] args) {
        Circle circ = new Circle();
        Circle circ2 = new Circle(5.6);
        
        System.out.println("Area : " + circ.getArea());
        
        circ.setRadius(5);
        
        System.out.println("Area : " + circ.getArea());
        
        System.out.println("Num objects: " + Circle.getNumObjects());
        
        Circle [] circles = Circle.generateCircleArray(4);
        
        Circle.printCircleArray(circles);
        
        System.out.println("Sum areas : " + Circle.sumAreas(circles));
    }
}
