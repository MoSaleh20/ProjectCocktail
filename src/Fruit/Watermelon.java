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
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Watermelon extends Fruits {

        Color color= new Color(255,168,54);    

    //One gram of Watermelon approximately equals 1.54 ml.
    public Watermelon(double volume) {
        super(volume*1.54,188,68,69);
        name="Watermelon";

    }
    
    //One Liter of Watermelons approximately equals 0.2 kcal.
    @Override
    public double getCalories() {
        return volume*0.2;
    }
    @Override
      public double getVolume(){
        return volume*1.54;
    }
      @Override
      public Color getColor(){
        return color;
    }
    
}
