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
public class Apple extends Fruits {

    public Apple() {
    }
    
//One grams of apples approximately equals 2.17 ml.
    public Apple(double volume, int a, int b, int c) {
        super(volume*2.17, a, b, c);
        name="Apple";
    }

    //One Liter of Apples approximately equals 0.24 kcal.
    @Override
    public double getCalories() {
        return volume*0.24;
    }
    
}
