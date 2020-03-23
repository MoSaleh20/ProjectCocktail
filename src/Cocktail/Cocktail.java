package Cocktail;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 97259
 */
public class Cocktail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Cup cup=new Cup(31);
        Blender blender=new Blender(100);
        Fruits fruit=new Fruits("Apple",20.0,10,11,123);
        Milk milk=new Milk("milk",15.0,237,242,251);
        Sugar sugar=new Sugar("sugar",10.2);
        blender.Add(fruit, milk, sugar);
        blender.Blend(fruit.colorfruit, milk.colormilk);
        System.out.println("Fruits Volume = "+fruit.getVolume());
        System.out.println("Milk Volume = "+milk.getVolume());

        System.out.println("blender before pour: "+blender.getInfo());
        blender.Pour(cup);
        System.out.println("blender after pour: "+blender.getInfo());
        System.out.println("cup: "+cup.getInfo());
    }
    
}
