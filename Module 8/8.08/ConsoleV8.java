/**
 * Purpose: to calculate the area and volume of a gaming console, based on given information
 *
 * @author Jared Campisi
 * @version February 3rd 2018
 */
public class ConsoleV8
{
    private double height, width, length, area, volume;
    
    //default constructor
    public ConsoleV8(double h1, double w1, double l1)
    {
        height = h1;
        width = w1;
        length = l1;
        area = 0.0;
        volume = 0.0;
    }
    
    //mutator method to calculate the area of the console
    public void calcConsoleArea ()
    {
        area = (2 * (height * width)) + (2 * (height * length)) + (2 * (width * length));
    }    

    //getter method to return the value of the area of the console
    public double getConsoleArea ()
    {
        return area;
    }
    
    //mutator method to calculate the volume of the console
    public void calcVolume ()
    {
        volume = (height * width * length);
    }

    //getter method to return the value of the volume of the console
    public double getVolume ()
    {
        return volume;
    }
    
    //returns a String of the object's values
    public String toString()
    {
    	return String.format("%12s %9s %14s %13s %10s\n", height, width, length, area, volume);
    }
}
