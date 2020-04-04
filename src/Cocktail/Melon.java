/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author 97259
 */
public class Melon extends Fruits {

    public Melon() {
    }

    //One gram of Melon approximately equals 1.34 ml.
    public Melon(double volume, int a, int b, int c) {
        super(volume*1.34, a, b, c);
        name="Melon";
    }
    
    //One Liter of Melons approximately equals 0.25 kcal.
    @Override
    public double getCalories() {
        return volume*0.25;
    }
    
}
