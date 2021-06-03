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
public class Beverage extends Additions {
    Order order;

    public Beverage(Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ",Beverage ";
    }

    @Override
    public double price() {
        return 2.5 + order.price();
    }
    
    
}
