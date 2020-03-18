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
public class Blender {
    private double calories;
    private double capacity;
    private String color;
    private String contents;
    private double volume=0;
    private Color colorblender;

    public Blender(double capacity) {
        this.capacity = capacity;
    }
    
    public String Add(Fruits fruit,Milk milk,Sugar sugar){
    if  (volume<capacity)
    {
        this.volume=fruit.getVolume()+milk.getVolume();
        this.calories=fruit.getCalories()+milk.getCalories();
        this.contents=fruit.getVolume()+" of "+fruit.getName()+" and "+milk.getVolume()+" of "+milk;
        return "added";
    }
    return "over capacity";
    }
    
    
    public void Blend(Color fr,Color mlk){
        this.colorblender.R=Math.round((fr.R+mlk.R)/2);
        this.colorblender.G=Math.round((fr.G+mlk.G)/2);
        this.colorblender.B=Math.round((fr.B+mlk.B)/2);
        
    }
    
    public void Pour(Cup cup){
        if (this.volume>0)
            {
            if(this.volume>=cup.capacity)
                        {
                double temp=this.calories;
                double x=volume/calories;
                cup.volume=cup.capacity;
                this.volume=this.volume-cup.capacity;
                this.calories=temp-(x*cup.volume);
                cup.calories=temp-this.calories;
                        }
            else
                        {
                cup.volume=this.volume;
                cup.calories=this.calories;
                this.volume=0;
                this.calories=0;
                        }
            }
            this.contents="Empty";
    }
    
    public String getInfo(){        
        return "Volume = "+volume+"\n"+
                   "Calories = "+calories+"\n"+
                   "Color = "+colorblender.R;
        
    }
    
}
