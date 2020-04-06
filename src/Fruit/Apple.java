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
public class Apple extends Fruits {
          
//One grams of apples approximately equals 2.17 ml.
    public Apple(double volume) {
        super(volume*2.17,254,37,27);
        name="Apple";
        color.setR(254);
        color.setG(37);
        color.setB(27);
    }

    //One Liter of Apples approximately equals 0.24 kcal.
    @Override
    public double getCalories() {
        return volume*0.24;
    }  
    @Override
      public double getVolume(){
        return volume*2.17;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
