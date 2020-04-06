

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cocktail1;

import Fruit.*;
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
                                                            Fruits fruit1=new Apple(in.nextDouble());
                                                            blender.Add(fruit1);
                                                            break;
                                                  case 2:
                                                            System.out.println("How many Grams? "); 
                                                            Fruits fruit2=new Banana(in.nextDouble());
                                                            blender.Add(fruit2);
                                                            break;
                                                  case 3:   
                                                            System.out.println("How many Grams? "); 
                                                            Fruits fruit3=new Almond(in.nextDouble());
                                                            blender.Add(fruit3);
                                                            break;
                                                  case 4:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit4=new Mango(in.nextDouble());
                                                            blender.Add(fruit4);
                                                            break;
                                                  case 5:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit5=new Berry(in.nextDouble());
                                                            blender.Add(fruit5);
                                                            break;
                                                  case 6:   
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit6=new Cherry(in.nextDouble());
                                                            blender.Add(fruit6);
                                                            break;
                                                  case 7:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit7=new Orange(in.nextDouble());
                                                            blender.Add(fruit7);
                                                            break;
                                                  case 8:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit8=new Grape(in.nextDouble());
                                                            blender.Add(fruit8);
                                                            break;
                                                  case 9:   
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit9=new Peach(in.nextDouble());
                                                            blender.Add(fruit9);
                                                            break;
                                                  case 10:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit10=new Pineapple(in.nextDouble());
                                                            blender.Add(fruit10);
                                                            break;
                                                  case 11:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit11=new Melon(in.nextDouble());
                                                            blender.Add(fruit11);
                                                            break;
                                                  case 12:
                                                            System.out.println("How many Grams? ");
                                                            Fruits fruit12=new Watermelon(in.nextDouble());
                                                            blender.Add(fruit12);
                                                            break;
                                                  case 13:
                                                      System.out.println("How many Grams? ");
                                                            Fruits fruit13=new Lemon(in.nextDouble());
                                                            blender.Add(fruit13);
                                                            break;
                                                  case 14:
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
        System.out.println("Resources for Volume, Calories and Color: www.schemecolor.com, www.aqua-calc.com");
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
        System.out.println("1. Add Apples");
        System.out.println("2. Add Bananas");
        System.out.println("3. Add Almond");
        System.out.println("4. Add Mango");
        System.out.println("5. Add Berry");
        System.out.println("6. Add Cherry");
        System.out.println("7. Add Orange");
        System.out.println("8. Add Grape");
        System.out.println("9. Add Peach");
        System.out.println("10. Add Pineapple");
        System.out.println("11. Add Melon/Cantaloupe");
        System.out.println("12. Add Watermelon");      
        System.out.println("12. Add Lemon");
        System.out.println("12. Add Strawberry");
        System.out.println("0. That's Enough");
        
    }

}


//
//       Scanner in = new Scanner(System.in);
//        
//        System.out.println("Enter blender capacity:");
//        Blender blender=new Blender(in.nextDouble());
//        System.out.println("Enter cup capacity: ");
//        Cup cup=new Cup(in.nextDouble());
//        
//        int choice,choice1 = 0;
//        do{
//            menu();
//           choice = in.nextInt();
//            switch(choice){
//                case 1:             
//                         int count=0;
//                            do{
//                                count++;
//                            menu1();
//                            choice1 = in.nextInt();
//                            switch(choice1){
//                                                  case 1:
//                                                            System.out.println("How many Grams? "); 
//                                                            Fruits fruit1=new Apple(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit1));
//                                                            break;
//                                                  case 2:
//                                                            System.out.println("How many Grams? "); 
//                                                            Fruits fruit2=new Banana(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit2));
//                                                            break;
//                                                  case 3:   
//                                                            System.out.println("How many Grams? "); 
//                                                            Fruits fruit3=new Almond(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit3));
//                                                            break;
//                                                  case 4:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit4=new Mango(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit4));
//                                                            break;
//                                                  case 5:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit5=new Berry(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit5));
//                                                            break;
//                                                  case 6:   
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit6=new Cherry(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit6));
//                                                            break;
//                                                  case 7:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit7=new Orange(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit7));
//                                                            break;
//                                                  case 8:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit8=new Grape(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit8));
//                                                            break;
//                                                  case 9:   
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit9=new Peach(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit9));
//                                                            break;
//                                                  case 10:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit10=new Pineapple(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit10));
//                                                            break;
//                                                  case 11:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit11=new Melon(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit11));
//                                                            break;
//                                                  case 12:
//                                                            System.out.println("How many Grams? ");
//                                                            Fruits fruit12=new Watermelon(in.nextDouble(),10,11,123);
//                                                            System.out.println(blender.Add(fruit12));
//                                                            break;
//                                                  case 13:count=10;}                                           
//                                        } while(count!=10);
//                                        break;
//                case 2:
//                                        System.out.println("How many millilitres? ");
//                                        try{
//                                        Milk milk=new Milk(in.nextDouble(),237,242,251);
//                                        blender.Add(milk);
//                                        }
//                                        catch(Exception e){
//                                            e.getMessage();
//                                        }                                                                    
//                    break;
//                 case 3:
//                                        Sugar sugar=new Sugar();
//                                        blender.Add(sugar);
//                    break;
//                 case 4:
//                                        System.out.println("blender before pour: \n"+blender.getInfo());
//                                        blender.Pour(cup);
//                                        System.out.println("blender after pour: \n"+blender.getInfo());
//                                        System.out.println("cup : \n"+cup.getInfo());
//                case 5: System.exit(0);
//        }} while(true);
//    }
//    
//

