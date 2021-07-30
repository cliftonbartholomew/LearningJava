/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11_Abstract_classes_and_interfaces;

/**
 *
 * @author Server
 */
public class TestInterfaces {
    public static void main(String[] args) {
        //you cannot instantiate an instance of an interface, but it can
        //be a data type. Any class that implements the interface can be 
        //referenced by the variable.
        Edible stuff = new Duck();
        eat(stuff);
        
        stuff = new Brocolli();
        eat(stuff);
        
        stuff = new Chicken();
        eat(stuff);
    }
    
    public static void eat(Edible stuff){
        System.out.println(stuff.howToEat());
    }
    
}
