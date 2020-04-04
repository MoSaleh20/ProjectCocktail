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
public class Mango extends Fruits {

    public Mango() {
    }

   //One gram of Mangos approximately equals 1.43 ml.
    public Mango(double volume, int a, int b, int c) {
        super(volume*1.43, a, b, c);
        name="Mango";
    }
    
    //One Liter of Mangos approximately equals 0.42 kcal.
    @Override
    public double getCalories() {
        return volume*0.42;
    }
    
}
