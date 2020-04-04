/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Milk extends Ingredients {
    public double volume;
    public Color colormilk;
    
    public Milk() {
    }

    public Milk(double volume,int a, int b, int c) {
        this.volume=volume;
//        this.colormilk.setR(a);
//         this.colormilk.setR(b);
//        this.colormilk.setR(c);
    }
    
    public double getCalories(){
        return volume*30;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
