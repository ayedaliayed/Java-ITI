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
public class City {
    private String name;
     private String code;
    private String country_Code;
    private String population;
    private String captial;
    public City()
    {
        
    }
    public City(String name,String code,String country_code ,String captial,String population)
    {
        this.name=name;
        this.code=code;
        this.country_Code=country_Code;
        this.population=population;
        this.captial=captial;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry_Code() {
        return country_Code;
    }

    public void setCountryID(String Country_Code) {
        this.country_Code = Country_Code;
    }

    
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
    
}
