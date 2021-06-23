/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package betterstring;
interface testSating { 
boolean test(String s1, String s2);
}
/**
 *
 * @author Ayed Ali
 */
public class BetterString {
    public static String betterString(String s1,String s2,testSating l)
{
     //testString t=(s1,s2)-> s1.length>s2.length;
      testSating t = l;
      if(t.test(s1, s2))
          return s1; 
      else
        return s2; 
      
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="jjdd";
        String string2="kkkkkkkasd";
        System.out.println("First test "+ betterString(string1,string2,(s1,s2) -> s1.length()>s2.length()));
        System.out.println("second test "+betterString(string1, string2, (s1, s2) -> true));
         
    }
    
}
