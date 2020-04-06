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
public class Sugar extends Ingredients {

    public Sugar() {
        super("sugar");
    }
      
    @Override
    public double getCalories(){
       return 10;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo(); 
    }
    @Override
      public Color getColor(){
        return color;
}}
