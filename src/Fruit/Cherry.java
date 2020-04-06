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
public class Cherry extends Fruits {

    //One gram of Cherries approximately equals 1.71 ml.
    public Cherry(double volume) {
        super(volume*1.71,101,0,12);
        name="Cherry";

    }
    
    //One Liter of Cherries approximately equals 0.37 kcal.
 @Override
    public double getCalories() {
        return volume*0.37;
    }   
    @Override
      public double getVolume(){
        return volume*1.71;
    }
      @Override
      public Color getColor(){
        return color;
    }
}
