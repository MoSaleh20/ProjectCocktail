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
 * @author 97259
 */
public class Pineapple extends Fruits {

    //One gram of Pineapples approximately equals 0.99 ml.
    public Pineapple(double volume) {
        super(volume*0.99);
        name="Pineapple";
        color.setR(255);
        color.setG(255);
        color.setB(101);
    }
    
    //One Liter of Pineappless approximately equals 0.83 kcal.
    @Override
    public double getCalories() {
        return volume*0.83;
    }
    @Override
      public double getVolume(){
        return volume*0.99;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
