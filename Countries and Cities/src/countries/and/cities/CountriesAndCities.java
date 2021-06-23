/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package countries.and.cities;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import sun.applet.Main;

/**
 *
 * @author Ayed Ali
 */
public class CountriesAndCities {
    
    public static List <City> read_City_File()
    {
         List<City> city=new ArrayList<>();
          try
        {
            File file=new File("E:\\cities.csv");
            Scanner sc=new Scanner(file);
            sc.next();
            while(sc.hasNext())
            {
             String line=sc.next();
             String [] fields=line.split(",",-1);
             for (int i=0;i<fields.length;i++)
             {
                 if(fields[i].isEmpty())
                 {
                     fields[i]="";
                 }
             }
             String code= fields[0];
             String name= fields[1];
             String country_COde= fields[2];
             String captial= fields[3];
             String population= fields[4];
             
             City c=new City(name,code ,country_COde,captial,population);
             
             city.add(c); 
            }
            sc.close();
         
        }
         catch (FileNotFoundException e)
        {
            System.out.println("Citry File Not Found" + e);
        }
         return city; 
    }
    public static List <Country> read_Country_File()
    {
         List<Country> country=new ArrayList<>();
          try
        {
            File file = new File("E:\\ITI\\Java\\Assiment\\countries.csv");
            Scanner sc=new Scanner(file);
            sc.next();
            while(sc.hasNext())
            {
             String line=sc.next();
             String [] fields=line.split(",",-1);
             for (int i=0;i<fields.length;i++)
             {
                 if(fields[i].isEmpty())
                 {
                     fields[i]="";
                 }
             }
             String code= fields[0];
             String name= fields[1];
             Country c=new Country(name,code);
             country.add(c); 
            }
            
         
        }
         catch (FileNotFoundException e)
        {
            System.out.println("Country File Not Found" + e);
        }
         return country; 
    }
    
    public static void main(String[] args) {
       List<City> city=new ArrayList<>();
        List<Country>country=new ArrayList<>();
        city=read_City_File();
        country=read_Country_File();
        Map <String, List<City>> Country_City_Map = new HashMap<>();
        for(Country c1:country)
        {
            List <City> City_Lists = new ArrayList<>();
            for(City c2 : city)
            {
                if(c1.getCode().equals(c2.getCountry_Code()))
                    City_Lists.add(c2);
            }
            City_Lists.sort(Comparator.comparing(City::getPopulation));
            Country_City_Map.put(c1.getCode(), City_Lists); 
            Country_City_Map.forEach((k, v) -> System.out.println("Country=" + k + ", Cities=" + v.toString()));
        }
       
        
        
        
       
        
    }
    
    
      
    
       
            
    
}

