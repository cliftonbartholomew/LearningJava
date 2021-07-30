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
public abstract class GeometricObject {
    protected String color;
    private boolean filled;
    private final Date dateCreated;
    
    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }
    
    public GeometricObject(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }    
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
}
