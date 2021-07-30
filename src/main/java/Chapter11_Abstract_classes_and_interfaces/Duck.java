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
public class Duck implements Edible{

    @Override
    public String howToEat() {
        return "Roast it";
    }
    
}
