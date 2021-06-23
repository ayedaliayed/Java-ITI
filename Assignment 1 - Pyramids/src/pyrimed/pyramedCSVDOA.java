/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyrimed;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ayed Ali
 */
public class pyramedCSVDOA {
    List<l>l;//error
    public pyramedCSVDOA(){             //the constractor
    File file=new File("E:\\ITI\\Java\\assi\\pyramids.csv");
    List<String>lines=new ArrayList<>();
   
        try {
            lines=Files.readAllLines(file.toPath());
        } catch (IOException ex) {
            Logger.getLogger(pyramedCSVDOA.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        for(int index=1;index<lines.size();index++)
        {
            String line=lines.get(index);
            String [] fileds=line.split(",");
           
            pyrimed p=new pyrimed(fileds[0],fileds[2],fileds[4],fileds[7]);
            System.out.println(p);
        }
       
        
    
    
    
    
}
}