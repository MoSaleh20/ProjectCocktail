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
public class Cup {
    public double calories;
     public double capacity;
    private String contents;
    public double volume=0;

    public Cup(double capacity) {
          this.capacity = capacity;
    }
    
    
    
    public String getInfo(){        
        return "Volume = "+this.volume+"\n"+
                   "Calories = "+this.calories+"\n";
        
    }
    
}
