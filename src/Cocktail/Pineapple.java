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
public class Pineapple extends Fruits {

    public Pineapple() {
    }

    //One gram of Pineapples approximately equals 0.99 ml.
    public Pineapple(double volume, int a, int b, int c) {
        super(volume*0.99, a, b, c);
        name="Pineapple";
    }
    
    //One Liter of Pineappless approximately equals 0.83 kcal.
    @Override
    public double getCalories() {
        return volume*0.83;
    }
}
