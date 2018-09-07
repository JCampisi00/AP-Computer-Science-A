/**
 * Purpose: to calculate the area and volume of a gaming console, based on given information
 *
 * @author Jared Campisi
 * @version January 30th 2018
 */
public class ConsoleV7
{
    private double height;
    private double weight;
    private double length;
    
    //default constructor
    public ConsoleV7(double h1, double w1, double l1)
    {
        height = h1;
        weight = w1;
        length = l1;
    }
    
    //calculates the area of a gaming console
    public double calcConsoleArea (int h1, int w1, int l1)
    {
        return (2 * (h1 * w1)) + (2 * (h1 * l1)) + (2 * (w1 * l1));
    }    
    public double calcConsoleArea (double h1, double w1, double l1)
    {
        return (2 * (h1 * w1)) + (2 * (h1 * l1)) + (2 * (w1 * l1));
    }
    
    //calculates the volume of a gaming console
    public double calcVolume (int h1, int w1, int l1)
    {
        return (h1 * w1 * l1);
    }
    
    
}
