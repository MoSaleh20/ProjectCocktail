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
public class Watermelon extends Fruits {

    public Watermelon() {
    }

    //One gram of Watermelon approximately equals 1.54 ml.
    public Watermelon(double volume, int a, int b, int c) {
        super(volume*1.54, a, b, c);
        name="Watermelon";
    }
    
    //One Liter of Watermelons approximately equals 0.2 kcal.
    @Override
    public double getCalories() {
        return volume*0.2;
    }
    
}
