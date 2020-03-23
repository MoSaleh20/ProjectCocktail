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
public class Sugar extends Ingredients {

      public Sugar() {
    }

    public Sugar(String name, double volume) {
        super(name);
        
        this.calories=volume*38;
    }
    
}
