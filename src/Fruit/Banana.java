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
public class Banana extends Fruits {
            
//One gram of Bananas approximately equals 1.58 ml.
    public Banana(double volume) {
        super(volume*1.58);
        name="Banana";
        color.setR(254);
        color.setG(229);
        color.setB(40);
    }
    
    //One ml of Bananas approximately equals 0.56 kcal.
    @Override
    public double getCalories() {
        return volume*0.56;
    }
    @Override
      public double getVolume(){
        return volume*1.58;
    }
    @Override
      public Color getColor(){
        return color;
    }
}
