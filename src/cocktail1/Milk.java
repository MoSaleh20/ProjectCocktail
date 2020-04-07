/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public class Milk extends Ingredients {
    private double volume;
    public Milk(double volume,int r, int g, int b) {
        super("milk", r, g, b);
        this.volume = volume;

    }
    
    @Override
    public double getCalories(){
        return volume * 0.2;
    }

    @Override
    public double getVolume() {
        return volume;
    }
    
    @Override
    public Color getColor() {
        return color;
    }

    public void setVolume(double volume) {
        if(volume > 0)
            this.volume = volume;
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + "volume=" + volume + '}';
    }
}
