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
public class Grape extends Fruits {

    //One kilo of Grapes approximately equals 2.57 ml.
    public Grape(double volume) {
        super(volume*2.57);
        name="Grape";
        color.setR(76);
        color.setG(68);
        color.setB(94);
        
    }
    
    //One Liter of Grapes approximately equals 0.26 kcal.
    @Override
    public double getCalories() {
        return volume*0.26;
    }
    @Override
      public double getVolume(){
        return volume*2.75;
    }
      @Override
      public Color getColor(){
        return color;
    }
      
}
