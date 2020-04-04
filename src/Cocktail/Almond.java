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
public class Almond extends Fruits {

    public Almond() {
    }

    //One gram of Almonds approximately equals 1.65 ml.
    public Almond(double volume, int a, int b, int c) {
        super(volume*1.65, a, b, c);
        name="Almond";
    }
    
    //One ml of Almonds approximately equals 3.5 kcal.
    @Override
    public double getCalories() {
        return volume*3.5;
    }
    
}
