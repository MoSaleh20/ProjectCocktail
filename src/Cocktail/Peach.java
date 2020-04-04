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
public class Peach extends Fruits {

    public Peach() {
    }

    //One gram of Peaches approximately equals 0.87 ml.
    public Peach(double volume, int a, int b, int c) {
        super(volume*0.87, a, b, c);
        name="Peach";
    }
    
    //One Liter of Peaches approximately equals 0.75 kcal.
    @Override
    public double getCalories() {
        return volume*0.75;
    }
}
