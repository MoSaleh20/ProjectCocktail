/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

import cocktail1.Color;
import cocktail1.Fruits;

/**
 *
 * @author Mohammad Saleh 
 */
public class Almond extends Fruits {

       
       
    //One gram of Almonds approximately equals 1.65 ml.
    public Almond(double volume) {
        super(volume*1.65);
        name="Almond";
        color.setR(255);
        color.setG(234);
        color.setB(203);
    }
    
    //One Liter of Almonds approximately equals 3.5 kcal.
    @Override
    public double getCalories() {
        return volume*3.5;
    }
    @Override
      public double getVolume(){
        return volume*1.65;
    }
      @Override
      public Color getColor(){
        return color;
        
    }
}
