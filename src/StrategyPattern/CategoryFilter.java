/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

import Model.Meal;
import java.util.ArrayList;

/**
 *
 * @author macair
 */
public class CategoryFilter extends Filter<Integer> implements FilterStrategy {
    
    @Override
    public ArrayList<Meal> doFilter(ArrayList<Meal> mealsList) {
        if (value == null) {
            return mealsList;
        } else {
            ArrayList<Meal> newList = new ArrayList() ;
            for(int i = 0 ; i < mealsList.size(); i++){
                double categoryID = mealsList.get(i).getCategory().getId();
                if( value == categoryID)
                    newList.add(mealsList.get(i));
            }
            return newList;
        }
    }
    
}
