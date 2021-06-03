/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author macair
 */
public abstract class Filter<V> {
    
     V value ;

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
