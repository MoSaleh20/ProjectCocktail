/*
 * To change  this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

/**
 *
 * @author MohammadSaleh & Ahmad Horyzat
 */
public class Fruits extends Ingredients {
    public double volume=0;
    public Color colorfruit;
    
    public Fruits() {

    }

    public Fruits(String name, double volume,int a, int b, int c) {
        super(name);
        this.volume=volume;
         this.calories=volume*60;
//        this.colorfruit.setR(a);
//        this.colorfruit.setR(b);
//        this.colorfruit.setR(c);
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
}
