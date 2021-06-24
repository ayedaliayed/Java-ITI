/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import common.Common;
import java.awt.Point;

/**
 *
 * @author NMP-Amr
 */
public class Circle extends ClosedShape{
 
   private  double radius;
    
    public void setRadius(double radius)
    {
        if(radius>0)
            this.radius=radius;
        
    }
    public double getRadius()
    {
        return radius;
    }
    public double computeArea(){
        return Common.pi*radius*radius;
    }
     public double computeCircum(){
        return 2*Common.pi*radius;
    }
}
