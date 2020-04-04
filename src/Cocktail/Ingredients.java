/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public abstract class Ingredients {
    protected String name;
    protected double calories=0;
            
    public Ingredients() {
    }

    

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getName() {
         return name;
    }
    public abstract double getCalories();
    
    public void setName(String name) {
        this.name = name;
    }

    
}
