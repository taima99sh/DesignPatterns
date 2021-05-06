/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import Model.Meal;
import StrategyPattern.FilterStrategy;
import java.util.ArrayList;

/**
 *
 * @author macair
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public ArrayList<Meal> applyFilters(ArrayList<Meal> arrayList, FilterStrategy ... filters){
        ArrayList<Meal> filteredList = new ArrayList<>(arrayList);
        for (FilterStrategy f: filters) {
            filteredList = f.doFilter(filteredList);
        }
        return filteredList;
    }
}
