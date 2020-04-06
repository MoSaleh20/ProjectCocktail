/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;


/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public abstract class Ingredients {
    protected String name;
    protected double calories;
    protected Color color;
 
    
    public Ingredients(String name,int a,int b,int c) {
        this.name = name;
        calories = 0;
        color = new Color(a,b,c);
        
    }

    public void setCalories(double calories) {
        if(calories > 0)
            this.calories = calories;
    }

    public String getName() {
         return name;
    }
    
    public abstract double getCalories();
    public abstract double getVolume();
    public abstract Color getColor();
    
    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "name=" + name + ", calories=" + calories + ", color=" + color + '}';
    }
  
}
