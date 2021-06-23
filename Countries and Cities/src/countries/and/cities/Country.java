/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countries.and.cities;

/**
 *
 * @author Ayed Ali
 */
public class Country {
    private String country;
    private String code;
    public Country()
    {
        
    }
    public Country(String country,String code)
    {
        this.code=code;
        this.country=country;
    }
    public String getCountry()
    {
        return country;
    }
    public String getCode()
    {
        return code;
    }
    public void  setCountry(String  country)
    {
        this.country=country;
    }
    public void setCode(String code)
    {
        this.code=code;
    }

    void add(Country country) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
