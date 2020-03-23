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
//        this.colorblender.setR(Math.round((fr.getR()+mlk.getR())/2));
//        this.colorblender.setG(Math.round((fr.getG()+mlk.getG())/2));
//        this.colorblender.setB(Math.round((fr.getB()+mlk.getB())/2));
//        
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
        return "Volume = "+volume+"\n"+
                   "Calories = "+calories+"\n";
//                   "Color = "+colorblender.getR();
        
    }
    
}
