/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruit;

import cocktail1.Fruits;
import cocktail1.Color;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Orange extends Fruits {

    //One gram of Oranges approximately equals 1.31 ml.
    public Orange(double volume) {
        super(volume*1.31,255,168,54);
        name="Peach";

    }
    
    //One Liter of Oranges approximately equals 0.36 kcal.
    @Override
    public double getCalories() {
        return volume*0.36;
    }
    @Override
      public double getVolume(){
        return volume*1.31;
    } 
    @Override
      public Color getColor(){
        return color;
    }
      
}
