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
public abstract class ClosedShape implements Common{
  protected  Point vertix;
    
    
    public abstract double computeCircum();
    
}
