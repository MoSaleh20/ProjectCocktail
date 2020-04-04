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
public class Orange extends Fruits {

    public Orange() {
    }

    //One gram of Oranges approximately equals 1.31 ml.
    public Orange(double volume, int a, int b, int c) {
        super(volume*1.31, a, b, c);
        name="Peach";
    }
    
    //One Liter of Oranges approximately equals 0.36 kcal.
    @Override
    public double getCalories() {
        return volume*0.36;
    }
}
