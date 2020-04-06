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
public class Mango extends Fruits {


   //One gram of Mangos approximately equals 1.43 ml.
    public Mango(double volume) {
        super(volume*1.43);
        name="Mango";
        color.setR(255);
        color.setG(130);
        color.setB(67);
    }
    
    //One Liter of Mangos approximately equals 0.42 kcal.
    @Override
    public double getCalories() {
        return volume*0.42;
    }
    @Override
      public double getVolume(){
        return volume*1.43;
    }
      @Override
      public Color getColor(){
        return color;
    }
    
}
