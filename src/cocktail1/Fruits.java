/*
 * To change  this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public abstract class Fruits extends Ingredients {
    protected double volume;
   
    public Fruits( double volume,int r, int g, int b) {
        super("fruit", r, g, b);
        this.volume= volume;
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
