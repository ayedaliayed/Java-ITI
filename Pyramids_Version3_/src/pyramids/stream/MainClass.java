package pyramids.stream;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class MainClass 
{
    public static void main(String[] args) 
    {
        List <Pyramid> Pyramids = new ArrayList<>();
        
        try
        {
            PyramidCSVDAO pDAO = new PyramidCSVDAO();
            Pyramids = pDAO.readPyramidsFromCSV("‪E:\\ITI\\Java\\assi\\pyramids.csv");
            double Means = Pyramids.stream()
                .filter(p -> p.getHeight() > 0)
                .mapToDouble(Pyramid::getHeight)
                .average()
                .getAsDouble();            
            for (Pyramid p : Pyramids)
            {   
                if (p.getHeight() <= 0.0)
                {
                    p.setHeight(Means);
                }
            }
            List <Double> Heights = Pyramids.stream()
                    .map(Pyramid::getHeight)
                    .sorted()
                    .collect(toList());
            double median = 0 ;
            double firstQuartile = 0;
            double thirdQuartile = 0;
            if (Heights.size() % 2 == 0)
            {
                int index2 = Heights.size()/2;
                int index1 = (Heights.size()/2) -1;
                median = (Heights.get(index1) + Heights.get(index2)) /2;
                if (index1 % 2 == 0)
                {
                    int index11 = (int)index1 /2;
                    int index12 = (int)(index1/2) - 1;
                    firstQuartile = (Heights.get(index11) + Heights.get(index12)) /2;
                    thirdQuartile = (Heights.get((int)(index1+index11)) + Heights.get((int)(index1+index12))) /2;
                   
                }
                else
                {
                    int indexx = (int) index1/2;
                    firstQuartile = Heights.get(indexx);
                    thirdQuartile = Heights.get((int)(index1+indexx));
                }
            }
            else
            {
                int index = Heights.size()/2;
                median = Heights.indexOf(index);
                
                if (index % 2 == 0)
                {
                    int index11 = index /2;
                    int index12 = (index/2) - 1;
                    firstQuartile = (Heights.get(index11) + Heights.get(index12)) /2;
                    thirdQuartile = (Heights.get((int)(index+index11)) + Heights.get((int)(index+index12))) /2;
 
                }
                else
                {
                    int indexx = index/2;
                    firstQuartile = Heights.get(indexx);
                    thirdQuartile = Heights.get((int)(index+indexx));
                }
            }
            System.out.println("The Height = " + Heights);
            System.out.println("The Mean = " + Means);
            System.out.println("The Median = " + median);
            System.out.println("The First Quartile = " + firstQuartile);
            System.out.println("The Third Quartile = " + thirdQuartile);
        }
        catch (NullPointerException e)
        {
            System.out.println("File Not Found" + e);
        }
    }
}