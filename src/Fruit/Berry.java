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
public class Berry extends Fruits {

    //One gram of Berries approximately equals 1.6 ml.
    public Berry(double volume) {
        super(volume*1.6,31,48,80);
        name="Berry";
    }

    //One Liter of Berries approximately equals 0.36 kcal.
    @Override
    public double getCalories() {
        return volume*0.36;
    }
    @Override
      public double getVolume(){
        return volume*1.60;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
