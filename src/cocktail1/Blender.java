/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail1;

import java.util.ArrayList;

/**
 *
 * @authors AhmadHoryzat & MohammadSaleh  
 */
public class Blender {
    private double calories;
    private double capacity;
    private double volume;
    private Color colorblender;
    private boolean[] blendDetector; 
    ArrayList<Ingredients> ingredients = new ArrayList<>();
    
    public Blender(double capacity){
        this.capacity = capacity;
        calories = 0;
        volume = 0;
        blendDetector = new boolean[]{false , false , false};
        colorblender = new Color(0, 0, 0);
    }

    public boolean isBlendDetector() {
        return blendDetector[0] && blendDetector[1];
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public void add(Sugar sugar){
        ingredients.add(sugar);
    }
    
    public void Add(Fruits fruit){
        try{
            if(volume == capacity)
                throw new Exception("The blender is full!");
            if ((capacity - volume) < fruit.getVolume())
                throw new Exception("No enough space in the blender!");
            ingredients.add(fruit);
            volume += fruit.getVolume();
            calories += fruit.getCalories();
            blendDetector[0] = true;  
        }catch(Exception er) {
                System.out.println(er.getMessage());
        } 
    }   

    public void add(Milk milk){
        try{
            if(volume == capacity)
                throw new Exception("The blender is full!");
            if ((capacity - volume) < milk.getVolume())
                throw new Exception("No enough space in the blender!");
            ingredients.add(milk);
            volume += milk.getVolume();
            calories += milk.getCalories();
            blendDetector[1] = true;  
        }catch(Exception er) {
                System.out.println(er.getMessage());
        }
    }
    
    
    public void Blend(){
        blendDetector[2]=true;
       double sumVol = 0;
       double sumCal = 0;
       int r = 0;
       int g = 0;
       int b = 0;
       int i = 0 ;
       if(blendDetector[0] && blendDetector[1]){
           int index = ingredients.size();
           int[] rList = new int[index];
           int[] gList = new int[index];
           int[] bList = new int[index];
           double[] ingrVolume = new double[index];
       

           for(Ingredients ing : ingredients){
               sumCal += ing.getCalories();
               sumVol += ing.getVolume();
               ingrVolume[i] = ing.getVolume();
               rList[i] = ing.color.getR();
               gList[i] = ing.color.getG();
               bList[i] = ing.color.getB();
               i++;     
            }
       
            //mix(sum) colors of ingredients according to their volumes
            for(int j = 0; j< index; j++){ 
               r += (int) (rList[j] * ingrVolume[j] / sumVol); 
               g += (int) (gList[j] * ingrVolume[j] / sumVol);
               b += (int) (bList[j] * ingrVolume[j] / sumVol);
            }
       
            volume = sumVol;
            calories = sumCal;
            colorblender = new Color(r, g, b);
            System.out.println("blender before pour: \n" + getInfo());
        }else{ 
            System.out.println("Your cocktail must contain fruits and milk!");
           }
    }
    
    public void Pour(Cup cup){
        try{
            if (blendDetector[2]){
            if(this.volume == 0){
                throw new Exception("Blender is empty!");
            }
            if(this.volume >= cup.getCapacity())
                cup.setVolume(cup.getCapacity());
            else if(this.volume > 0)
                cup.setVolume(volume);
        
            this.volume -= cup.getVolume();
            cup.setCalories(cup.getVolume() * 0.2); 
            this.calories -= cup.getCalories();
            System.out.println("blender after pour: \n"+this.getInfo());
                    System.out.println("cup : \n"+cup.getInfo());}
            else 
                throw new Exception("Please blend before pour!");
            
        }catch(Exception er){
            System.out.println(er.getMessage());
        }
    }
    
    public String getInfo(){   
        return "Volume = " + volume  + "\n"  
                +  colorblender.getInfo()  + "\n" 
                + "Calories = " + calories + "\n";
    }                
    
}
