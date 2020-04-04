/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cocktail;

import java.util.ArrayList;


/**
 *
 * @author MohammadSaleh & AhmadHoryzat
 */
public class Blender {
    private double calories;
    private double capacity;
    private String contents;
    private double volume=0;
    private Color colorblender;
    private boolean BlendDetector=false; 
    
    private ArrayList<Ingredients> ingredient=new ArrayList<>();

    
    
    public Blender(double capacity) {
        this.capacity = capacity;
    }

    public String Add(Sugar sugar){
//    if  (volume<capacity)
//    {
////        this.volume=fruit.getVolume()+milk.getVolume();
        this.calories+=sugar.getCalories();
        this.ingredient.add(sugar);
        return "Added";
       
////        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
////        return "added";
//    }
//       return "over capacity";
    }
    
    public boolean Add(Milk milk){
        
    if  (volume<capacity)
        if ((capacity-volume)>milk.getVolume())
    {
        this.volume+=milk.getVolume();
        this.calories+=milk.getCalories();
        this.ingredient.add(milk);

//        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
        return true;
    }
    return false;
    }
    
    public String Add(Fruits fruit){
        double Space = this.capacity - this.volume;
        if  (Space>0)       
            if (Space>fruit.getVolume())
    {
        this.volume+=fruit.getVolume();
        this.calories+=fruit.getCalories();
        this.ingredient.add(fruit);
        return "added";
        
    }
    return "over capacity";
    }
    
    public void Blend(){
            BlendDetector=true;
//        this.colorblender.setR(Math.round((fr.getR()+mlk.getR())/2));
//        this.colorblender.setG(Math.round((fr.getG()+mlk.getG())/2));
//        this.colorblender.setB(Math.round((fr.getB()+mlk.getB())/2));
            double SumCal=0;
            double SumColor=0;
            double SumVol=0;
            for(Ingredients i:ingredient){
                
            try{
            SumCal+=i.getCalories();
            SumVol+=i.getVolume();}
            catch(Exception e){
                e.get
            }
            
            }
                
             
    }
    
    public void Pour(Cup cup){
        double x=this.calories/volume;
        if (this.volume>0)
            {
            if(this.volume>=cup.capacity)
                        {
                cup.volume=cup.capacity;
                this.volume-=cup.capacity;
                this.calories=this.volume*x;
                cup.calories=cup.volume*x;
                        }
            else
                        {
                cup.calories=this.calories;
                cup.volume=this.volume;
                this.volume=0;
                this.calories=0;
                        }
            }
            this.contents="Empty";
    }
    
    public String getInfo(){        
        if (BlendDetector)
                    return "Volume = "+volume+"\n"+
                     "Calories = "+calories+"\n";
//                   "Color = "+colorblender.getR();
        else 
                    return "Contents ="+contents+"\n"+
                   "Volume = "+volume+"\n"+
                   "Calories = "+calories+"\n";
    }
    
}
