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
public class Sugar extends Ingredients {

      public Sugar() {
          this.calories=10;
    }
      
      @Override
      public double getCalories(){
        return calories;
    }
      
@Override
      public double getVolume(){
        return 0;
    }
      
}
