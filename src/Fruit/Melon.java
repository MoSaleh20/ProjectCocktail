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
public class Melon extends Fruits {

    //One gram of Melon approximately equals 1.34 ml.
    public Melon(double volume) {
        super(volume*1.34);
        name="Melon";
        color.setR(234);
        color.setG(177);
        color.setB(74);
    }
    
    //One Liter of Melons approximately equals 0.25 kcal.
    @Override
    public double getCalories() {
        return volume*0.25;
    }
    @Override
      public double getVolume(){
        return volume*1.34;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
