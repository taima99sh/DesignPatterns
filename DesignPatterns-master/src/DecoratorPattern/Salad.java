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
public class Salad extends Additions{
    
    Order order;

    public Salad(Order order) {
        this.order = order;
    }

    @Override
    public String getDescription() {
        return order.getDescription() + ",Salad ";
    }

    @Override
    public double price() {
        return 3.5 + order.price();
    }
    
}
