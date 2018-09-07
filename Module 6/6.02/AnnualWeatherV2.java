/**
 * Purpose: To calculate the average temperature and precipitation of various Florida cities in a year
 * 
 * @author Jared Campisi
 * @version January 1st 2018
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static void main (String [] args)
    {
        
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        
        String city = "Orlando"; //Pensacola - 2nd set of data
        String state = "Florida"; 
        String tempChoice = "";
        String precipChoice = "";
        String temp = "";
        String precip = "";
  
        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        
        double [] temperature = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0}; //initialize with Fahrenheit values
        //2nd data set 
        //double [] temperature = {52.0, 54.9, 61.0, 66.9, 74.6, 80.6, 82.6, 82.2, 78.7, 69.5, 60.7, 54.1};
        
        double [] precipitation = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3}; //initialize with inch values 
        //2nd data set
        //double [] precipitation = {5.3, 4.7, 6.4, 3.9, 4.4, 6.4, 8.0, 6.9, 5.8, 4.1, 4.5, 4.0};
    
        //initialize to F
        String tempLabel = "F";
        //initialize to in
        String precipLabel = "in."; 
        
        //user input
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        tempChoice = in.nextLine();
        
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        precipChoice = in.nextLine();
        
        //processes user input and performs necessary conversions
        for (int index = 0; index < temperature.length; index++) 
        {
            if (tempChoice.equals("f") || tempChoice.equals("F")) 
            {
                tempLabel = "F";
            }

            else if (tempChoice.equals("c") || tempChoice.equals("C"))
            {
                temperature[index] = temperature[index] - 32;
                temperature[index] = (0.555) * (temperature[index]);
                
                tempLabel = "C";
            }
            
        }
                for (int index = 1; index < precipitation.length; index++) 
                {
                    if (precipChoice.equals("i") || precipChoice.equals("I")) 
                    {
                        precipLabel = "in.";
                    }
                    else if (precipChoice.equals("c") || precipChoice.equals("C")) 
                    {
            
                        precipitation[index] = precipitation[index] * 2.54;
                        
                        precipLabel = "cm";
                    } 
                    
        }
        
        double total = 0.0;
        
        for(int index = 0; index < temperature.length; index++) 
        {
            total += temperature[index];
        }
        
        //Calculates the average temperature
        double avgT = total / 12;
        total = 0.0;
        
        for(int index = 0; index < precipitation.length; index++) 
        {
            total += precipitation[index];
        }
        double totalP = total;
        
        //Output: display table of weather data including average and total
        System.out.println("");
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println("");
        System.out.println("***************************************************");
        
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.printf("%-10s%10.1f%20.1f\n", month[index], temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.print("       Average: ");
        System.out.printf("%.1f", avgT);
        System.out.printf("%15s", " Total: ");
        System.out.printf("%.1f", total);
        
    }
    
}
