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
public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 5, 6);
        Triangle t2 = new Triangle(1.5, 2.5, 3.5);
        
        System.out.println("Triangle 1 area: " + t1.getArea()+ "\n"
                + "\tPerimeter: " + t1.getPerimeter());
        
        System.out.println("Triangle 2 area: " + t2.getArea()+ "\n"
                + "\tPerimeter: " + t2.getPerimeter());
    }
    
}
