/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

/**
 *
 * @author ghada
 */
public class Meals extends Order{

    public Meals() {
    description = "Meal";
    }

    @Override
    public double price() {
        return 11.5;
    }
    
    
    
}
