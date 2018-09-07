/**
 * Purpose: To calculate weight on different planets based on user input
 *
 * @author Jared Campisi
 * @version January 10th 2018
 */
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class PlanetWeight
{
    //method to read results from a text file
    public static double [] readResults () throws IOException
    {
       int index = 0;        
       File data = new File("gravData.txt");
       Scanner inFile = new Scanner(data);
       
       double[] gravity = new double[8]; 
       
       while (inFile.hasNext())
       {
           gravity[index] = inFile.nextDouble();
           index++;
       }
       
       inFile.close(); 
       
       return gravity;  
    }    
    //method to calculate a persons weight on each planet    
    public static double [] weightCalc (double [] gravity, int userWeight) throws IOException
    {
        double [] mass = new double[8];  
        double [] grams = new double[8];
        double [] kg = new double[8];
        double [] weight = new double[8];
        int index = 0;
        double gram = 453.59237;
               
        for(index = 0; index < gravity.length; index++)
        {            
            grams[index] = (userWeight) * (gram);
            kg[index] = grams[index] / 1000;
            
            mass[index] = kg[index];
            
            weight[index] = mass[index] * (gravity[index] / 9.8) * 2.20462;
            
            //System.out.println(weight[index]); //used for testing purposes
        }
               
        return weight; 
    }        
    //method to print the results to the screen
    public static void printResults (String [] planets, double [] gravity, double [] weight)
    {
        System.out.println("");
        System.out.printf("%35s\n","My Weight on the Planets");
        System.out.println("");
        System.out.println("Planet     g (m/s^2)     Weight (pounds)");
        System.out.println("--------------------------------------------------");        
        
        for(int index = 0; index < gravity.length; index++)
        {
            System.out.printf("%-10s%10.2f%10.2f\n", planets[index], gravity[index], weight[index]);
        }
    }
        //main method
        public static void main (String [] args) throws IOException
        {             
            Scanner in = new Scanner (System.in);
        
            System.out.print("Please enter your weight in pounds: ");
            int userWeight = in.nextInt(); 
        
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            double[] gravity = readResults();            
            double [] weight = weightCalc(gravity, userWeight);
            
            printResults(planets, gravity, weight); 
                         
        }
}
