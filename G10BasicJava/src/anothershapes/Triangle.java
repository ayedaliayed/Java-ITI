/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anothershapes;

import java.awt.Point;
import shapes.ClosedShape;

/**
 *
 * @author NMP-Amr
 */
public class Triangle extends ClosedShape{
int base,height;
double angles[]=new double[3];
String type;
    @Override
    public double computeArea() {
        return 0.5*base*height;
    }

    @Override
    public double computeCircum() {
        vertix=new Point(5,10);
        return 0;
    }
    
    
}
