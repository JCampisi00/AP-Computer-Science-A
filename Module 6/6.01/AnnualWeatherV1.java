/**
 * Annual Weather description:
 * 
 * @author Jared Campisi
 * @version December 27th 2017
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "";
        String state = "";
  
        String [] month = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //initialize with Fahrenheit values
        double [] precipitation ={2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};      //initialize with inch values
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
    
    
        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            
        }
    
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
  
        }
        System.out.println("Average: " + "    Total: ");

    }//end main
}//end class
