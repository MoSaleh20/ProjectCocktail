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
public class Peach extends Fruits {

    //One gram of Peaches approximately equals 0.87 ml.
    public Peach(double volume) {
        super(volume*0.87,255,203,164);
        name="Peach";

    }
    
    //One ml of Peaches approximately equals 0.75 kcal.
    @Override
    public double getCalories() {
        return volume*0.75;
    }
    @Override
      public double getVolume(){
        return volume*0.87;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
