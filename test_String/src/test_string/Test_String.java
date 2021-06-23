/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test_string;
import java.lang.Character;

/**
 *
 * @author Ayed Ali
 */
public class Test_String {
public static boolean test_string(String s)
{
    boolean b;
   // char[] ch = new char[s.getChars(srcBegin, srcEnd, dst, dstBegin)];
    for (int i=0;i<s.length();i++)
    {
        if(!Character.isLetter(s.charAt(i)))
        { b=false;
            return b;}
    }
    return true;
}

  
    public static void main(String[] args) {
        // TODO code application logic here
        String s="asdjjjjjjjjjj";
        boolean res= test_string(s);
        if(res)
            System.out.println("the string contain charchter only");
        else
            System.out.println("the string not contain charchter only");
       
    
    }
    
}