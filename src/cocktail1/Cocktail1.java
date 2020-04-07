

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cocktail1;

import Fruit.Orange;
import Fruit.Mango;
import Fruit.Watermelon;
import Fruit.Strawberry;
import Fruit.Banana;
import Fruit.Pineapple;
import java.util.Scanner;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh
 */
public class Cocktail1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        System.out.println("Resources for Volume, Calories and Color: www.schemecolor.com, www.aqua-calc.com");
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter blender capacity:");
        Blender blender = new Blender(in.nextDouble());
        System.out.println("Enter cup capacity: ");
        Cup cup=new Cup(in.nextDouble());
        
        int choice,choice1;
        do{
            menu();
            choice = in.nextInt();
            switch(choice){
                case 1:   
                    
                    
                    
                    
                    
                    int count=0;
                            do{
                                count++;
                            menu1();
                            choice1 = in.nextInt();
                            switch(choice1){
                                                  case 1:
                                                            System.out.println("How many Grams? "); 
                                                            Fruits fruit2=new Banana(in.nextDouble());
                                                            blender.Add(fruit2);
                                                            break;
                                                  case 2:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit4=new Mango(in.nextDouble());
                                                            blender.Add(fruit4);
                                                            break;
                                                  case 3:   
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit7=new Orange(in.nextDouble());
                                                            blender.Add(fruit7);
                                                            break;
                                                  case 4:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit10=new Pineapple(in.nextDouble());
                                                            blender.Add(fruit10);
                                                            break;
                                                  case 5:
                                                           System.out.println("How many Grams? ");
                                                            Fruits fruit12=new Watermelon(in.nextDouble());
                                                            blender.Add(fruit12);
                                                            break;
                                                  case 6:   
                                                              System.out.println("How many Grams? ");
                                                            Fruits fruit14=new Strawberry(in.nextDouble());
                                                            blender.Add(fruit14);
                                                            break;
                                                  
                                                
                                                  case 0: count=10;}                                           
                                        } while(count!=10);
                                        break;
                    
                    
                   
                   
                                                          
                case 2:
                    System.out.println("How mush in millilitres? ");
                    Milk milk = new Milk(in.nextDouble(), 5, 6, 7);               
                    blender.add(milk);
                                                                                                                    
                    break;
                case 3:
                    Sugar sugar=new Sugar();
                    blender.add(sugar);
                                        
                    break;
                case 4:
                        blender.Blend();
                        
 
                    break;
                case 5:
                    
                    blender.Pour(cup);
                
                    
                        
                    break;
                case 6:
                    System.exit(0);
        }} while(true);
    
    }
    public static void menu(){
        System.out.println("Please Enter your choice");
        System.out.println("1. Add Fruit");
        System.out.println("2. Add Milk");
        System.out.println("3. Add Sugar");
        System.out.println("4. Blend");
        System.out.println("5. Pour");
        System.out.println("6. Exit");
        
    }
    
    public static void menu1(){
        System.out.println("Please Enter your choice");     
        System.out.println("1. Add Bananas");      
        System.out.println("2. Add Mango");      
        System.out.println("3. Add Orange");  
        System.out.println("4. Add Pineapple");
        System.out.println("5. Add Watermelon");      
        System.out.println("6. Add Strawberry");
        System.out.println("0. Enough Fruits");
    }

}

