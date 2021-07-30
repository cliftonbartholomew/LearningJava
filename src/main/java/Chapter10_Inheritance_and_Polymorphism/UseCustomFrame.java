/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10_Inheritance_and_Polymorphism;

import javax.swing.*;
/**
 *
 * @author Server
 */
public class UseCustomFrame  {
    public static void main(String[] args) {
        JFrame frame1 = new CustomFrame();
        frame1.setTitle("Window 1");
        frame1.setLocation(200, 200);
        frame1.setVisible(true);
        
        JFrame frame2 = new CustomFrame();
        frame2.setTitle("Window 2");
        frame2.setLocation(200, 300);
        frame2.setVisible(true);
    }
}
