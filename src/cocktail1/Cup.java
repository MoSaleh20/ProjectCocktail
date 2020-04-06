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
public class Cup {
    private double calories;
    private double capacity;
    private double volume;

    public Cup(double capacity) {
          this.capacity = capacity;
          volume = 0;
          calories = 0;
    }
    
    public void setCalories(double calories){
        if(calories > 0)
            this.calories = calories;
    }
    public double getCalories() {
        return volume * 0.2;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity > 0)
            this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if(volume >= 0)
            this.volume = volume;
    }
    
    public String getInfo(){        
        return "Volume = "+this.volume+" "+
                   "Calories = "+this.calories+"\n";
        
    }
}
