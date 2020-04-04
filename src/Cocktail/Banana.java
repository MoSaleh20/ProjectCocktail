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
public class Banana extends Fruits {

    public Banana() {
    }
//One gram of Bananas approximately equals 1.58 ml.
    public Banana(double volume, int a, int b, int c) {
        super(volume*1.58, a, b, c);
        name="Banana";
    }
    
    //One ml of Bananas approximately equals 0.56 kcal.
    @Override
    public double getCalories() {
        return volume*0.56;
    }
    
}
