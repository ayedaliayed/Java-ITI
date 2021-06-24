/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Point;

/**
 *
 * @author NMP-Amr
 */
public class Rectangle extends ClosedShape{
  
   private int width,height;
    public double computeArea(){
        return width*height;
    }
    public int computeArea(int w,int h){
        return 0;
    }
     public double computeCircum(){
        return 2*(width+height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width>0)
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height>0)
        this.height = height;
    }

    @Override
    public String toString()
    {
        return " Rectangle width ="+width+" and Height= "+height;
    }
    
}
