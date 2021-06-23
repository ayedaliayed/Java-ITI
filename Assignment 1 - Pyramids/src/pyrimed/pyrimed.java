/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pyrimed;

/**
 *
 * @author Ayed Ali
 */
public class pyrimed {
   private String pharaoh,modern_name,site;
   private String hight;
    public pyrimed( String pharaoh,String modern_name,String site,String hight)
    {
        this.pharaoh=pharaoh;
        this.modern_name=modern_name;
        this.site=site;
        this.hight=hight;
    }
    public String getHight()
    {
        return hight;
    }
     public String getModern_name()
    {
        return modern_name ;
    }
      public String getPharaoh()
    {
        return pharaoh ;
    }
         public String egtSite()
    {
        return site ;
    }
    public void setHight(String hight)
    {
        this.hight=hight;
    }
        public void setModer_name(String modern_name)
    {
        this.modern_name=modern_name;
    }
            public void setSite(String site)
    {
        this.site=site;
    }
   public void setParaoh(String pharaoh)
    {
        this.pharaoh=pharaoh;
    }
   @Override
   public String toString()
{
    return "Name: "+pharaoh+"\n The mondern name is :"+modern_name+"\n The site is :"+
            site+"\n The hight is "+hight+"\n------------------------------------------------------------------\n";
}
    
}
