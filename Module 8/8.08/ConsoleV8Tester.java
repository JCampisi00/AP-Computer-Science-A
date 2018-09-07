/**
 * Purpose: to calculate the area and volume of a gaming console, based on given information
 *
 * @author Jared Campisi
 * @version February 3rd 2018
 */
public class ConsoleV8Tester
{
    public static void main (String [] args)
    {
        //initializes variables
        int counter = 0;
        double min = Integer.MAX_VALUE; 
        double max = Integer.MIN_VALUE;
        double minVolume = Integer.MAX_VALUE;
        double maxVolume = Integer.MIN_VALUE;
        double h1, width, length, area, volume, average, volumeAvg, avg = 0, volAvg = 0;
        double getConsoleArea, getVolume;
        
        //initializes array of objects
        ConsoleV8 [] console = {new ConsoleV8 (12, 6, 9), new ConsoleV8 (10, 8, 12),
        new ConsoleV8 (15, 5, 7), new ConsoleV8 (8, 8, 10), new ConsoleV8 (12, 10, 10)};
        
        //prints results header to the screen
        System.out.printf("%45s\n", "Gaming Console");
        System.out.println("");
        System.out.printf("%18s %8s %15s %10s %12s\n", "Height", "Width", "Length", "Area", "Volume");
        System.out.println("========================================================================");
        
        //calls methods
        for (int index = 0; index < console.length; index++)
        {
            console[index].getConsoleArea();
            console[index].getVolume();
        }        
        for(int index = 0; index < console.length; index++)
        {
            console[index].calcConsoleArea();
            console[index].calcVolume();
        }

        //prints results to the screen
        for(int index = 0; index < console.length; index++)
        {
            System.out.println("  " + index + " " +  console[index]);
        }

        System.out.println("========================================================================");
        
        //finds minimum and maximum values
        for (int index = 0; index < console.length; index++)
        {
            if (console[index].getConsoleArea() < min)
            {
                min = console[index].getConsoleArea();
            }
            
            if (console[index].getConsoleArea () > max)
            {
                max = console[index].getConsoleArea();
            }
            
            if (console[index].getVolume() < minVolume)
            {
                minVolume = console[index].getVolume();
            }
            if (console[index].getVolume() > maxVolume)
            {
                maxVolume = console[index].getVolume();
            }
        }
        
        //calculates averages
        for (int index = 0; index < console.length; index++)
        {
            avg += console[index].getConsoleArea();
        }        
        for (int index = 0; index < console.length; index++)
        {
            volAvg += console[index].getVolume();
        }        
        average = (avg / console.length);
        volumeAvg = (volAvg / console.length);
        
        //prints final results to screen
        System.out.printf("%45s %9s %10s\n", "Minimum: ", min, minVolume);
        System.out.printf("%45s %9s %10s\n", "Maximum: ", max, maxVolume);
        System.out.printf("%45s %9s %10s\n", "Average: ", average, volumeAvg);
        
    }
}
