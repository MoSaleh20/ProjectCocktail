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
public class Lemon extends Fruits {

    public Lemon() {
    }

    //One gram of Lemons approximately equals 2.46 ml.
    public Lemon(double volume, int a, int b, int c) {
        super(volume*2.46, a, b, c);
        name="Lemon";
    }  
    
    //One Liter of Lemons approximately equals 0.19 kcal.
    @Override
    public double getCalories() {
        return volume*0.19;
    }
    
}
