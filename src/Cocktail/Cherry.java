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
public class Cherry extends Fruits {

    public Cherry() {
    }

    //One gram of Cherries approximately equals 1.71 ml.
    public Cherry(double volume, int a, int b, int c) {
        super(volume*1.71, a, b, c);
        name="Cherry";
    }
    
    //One Liter of Cherries approximately equals 0.37 kcal.
 @Override
    public double getCalories() {
        return volume*0.37;
    }   
}
