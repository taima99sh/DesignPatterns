/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns;

import Model.Category;
import Model.Meal;
import StrategyPattern.FilterStrategy;
import StrategyPattern.PriceFilter;
import StrategyPattern.RatingFilter;
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
        
        Category salads = new Category(2, "salads") ;
        Category italian = new Category(1, "Italian") ;
        Category sandwich = new Category(3, "Sandwich") ;
        //Sandwich
        
        Meal pizza = new Meal(1, "pizza", 8.5, 33, italian) ;
        Meal risotto = new Meal(2, "Risotto", 8, 40.5, italian) ;
        Meal broccoli = new Meal(3, "Broccoli Salad", 9, 15, salads) ;
        Meal orzo = new Meal(4, "Rainbow Orzo Salad", 7, 21, salads) ;
        Meal beefSandwich = new Meal(5, "beefSandwich", 6, 40, sandwich) ;
        
        ArrayList<Meal> mealsList = new ArrayList<>() ;
        mealsList.add(pizza) ;
        mealsList.add(risotto) ;
        mealsList.add(broccoli) ;
        mealsList.add(orzo) ;
        mealsList.add(beefSandwich) ;
        
        RatingFilter ratingFilter = new RatingFilter();
        ratingFilter.setValue(7.0);
        
        PriceFilter priceFilter = new PriceFilter() ;
        priceFilter.setValue(20.0);
        
        DesignPatterns test = new DesignPatterns();
        
        
         System.out.println("******************rating greater than 7 ***********************");
        for (Meal meal : test.applyFilters(mealsList, ratingFilter)) { 		      
           System.out.println(meal.getName());
           System.out.println(meal.getRate());
      }
        System.out.println("******************price less than 20, rating greater than 7 ***********************");
        for (Meal meal : test.applyFilters(mealsList, ratingFilter, priceFilter)) { 		      
           System.out.println(meal.getName());
           System.out.println(meal.getRate());
      }
        
        
        
        
        // TODO code application logic here
    }
    
    
    public ArrayList<Meal> applyFilters(ArrayList<Meal> arrayList, FilterStrategy ... filters){
        ArrayList<Meal> filteredList = new ArrayList<>(arrayList);
        for (FilterStrategy i: filters) {
            filteredList = i.doFilter(filteredList);
        }
        return filteredList;
    }
}
