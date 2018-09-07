/**
 * Purpose: to calculate the area and volume of a gaming console, based on given information
 *
 * @author Jared Campisi
 * @version January 23rd 2018
 */
public class ConsoleV3
{
    //default constructor
    public ConsoleV3()
    {
    
    }
    
    //calculates the area of a gaming console
    public double calcConsoleArea (int h1, int w1, int l1)
    {
        return (2 * (h1 * w1)) + (2 * (h1 * l1)) + (2 * (w1 * l1));
    }
    
    //calculates the volume of a gaming console
    public double calcVolume (int h1, int w1, int l1)
    {
        return (h1 * w1 * l1);
    }
    
    //main method
    public static void main (String [] args)
    {
        //variables
        int hight, width, length;
        double consoleArea, volume;
        
        hight = 12;
        width = 6;
        length = 9;
        consoleArea = 0;
        volume = 0;
        
        //object
        ConsoleV3 console = new ConsoleV3();
        
        consoleArea = console.calcConsoleArea (hight, width, length);
        volume = console.calcVolume (hight, width, length);
        
        //prints results to the screen
        System.out.printf("%20s\n", "Gaming Console");
        System.out.println("=================================");
        System.out.printf(" Console Area = %5.2f", consoleArea);
        System.out.print(" inches^2");
        System.out.println("");
        System.out.printf(" Console Volume = %5.2f", volume);
        System.out.print(" inches^3");
        
    }
}
