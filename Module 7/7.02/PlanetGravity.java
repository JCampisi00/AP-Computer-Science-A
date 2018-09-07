/**
 * Purpose: To calculate the gravity of different planets
 *
 * @author Jared Campisi
 * @version January 9th 2018
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
public class PlanetGravity
{
    //method to calculate the gravity on each planet
    public static double [] gravityCalc (double [] mass, double [] diameter)
    {   
        int index = 0;
        double univGravConstant = (6.67e-11);
        double [] gravity = new double[8]; 
        
        for(index = 0; index < gravity.length; index++)
        {
            double radius = (diameter[index] * 1000) / 2;
            gravity[index] = (univGravConstant * mass[index]) / Math.pow(radius, 2);
        }
        return gravity; 
    }
    //method to print the results to the screen
    public static void printResults (String [] planets, double [] diameter, double [] mass, double[] gravity)
    {
        System.out.printf("%35s\n","Planetary Data");
        System.out.printf("%-11s%-15s%13s%13s\n","Planet","Diameter (Km)","Mass (Kg)","g (m/s^2)");
        System.out.println("=====================================================");        
        
        for(int index = 0; index <= 7; index++)
        {
            System.out.printf("%-14s %-14.0f %5.2e %11.2f\n", planets[index], diameter[index], mass[index], gravity[index]);
        }
    }
    //method to write results to a text file
    public static void writeResults (double [] gravity) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("gravData.txt"));
        
        for(int index = 0; index < gravity.length; index++)
        {
            outFile.printf("%-10.2f\n", gravity[index]);
            outFile.println("");
        }        
        
        outFile.close();   
    }
        //main method
        public static void main (String [] args) throws IOException
        {
            String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
            double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
            double[] mass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
            double[] gravity = gravityCalc (mass, diameter);
        
            printResults(planets, diameter, mass, gravity);
            writeResults(gravity); 
        }
}
