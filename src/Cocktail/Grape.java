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
public class Grape extends Fruits {

    public Grape() {
    }

    //One kilo of Grapes approximately equals 2.57 ml.
    public Grape(double volume, int a, int b, int c) {
        super(volume*2.57, a, b, c);
        name="Grape";
    }
    
    //One Liter of Grapes approximately equals 0.26 kcal.
    @Override
    public double getCalories() {
        return volume*0.26;
    }
}
