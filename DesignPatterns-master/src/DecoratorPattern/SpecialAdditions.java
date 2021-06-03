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
public class SpecialAdditions extends Additions{
    Order order;

    public SpecialAdditions(Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ",SpecialAdditions ";
    }

    @Override
    public double price() {
        return 10 + order.price();
    }
    
    
    
}
