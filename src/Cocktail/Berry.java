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
public class Berry extends Fruits {

    //One gram of Berries approximately equals 1.6 ml.
    public Berry(double volume, int a, int b, int c) {
        super(volume*1.6, a, b, c);
        name="Berry";
    }

    public Berry() {
    }
    
    //One Liter of Berries approximately equals 0.36 kcal.
    @Override
    public double getCalories() {
        return volume*0.36;
    }
}
