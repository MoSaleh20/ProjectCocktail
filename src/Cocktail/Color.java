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
public class Color {
    private int R,G,B;

    public int getR() {
        return R;
    }

    public void setR(int R) {
        if (R>=0 & R<=255)
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        if (G>=0 & G<=255)
         this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        if (B>=0 & B<=255)
        this.B = B;
    }

    public Color(int R, int G, int B) {
        if (R>=0 & R<=255)
        this.R = R;
        
        if (G>=0 & G<=255)
        this.G = G;
        
        if (B>=0 & B<=255)
        this.B = B;
    }
    
}
