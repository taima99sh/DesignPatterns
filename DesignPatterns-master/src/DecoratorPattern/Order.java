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
public abstract class Order {
    String description ="Unknown Order";

    public String getDescription() {
        return description;
    }
    
    public abstract double price();
    
}
