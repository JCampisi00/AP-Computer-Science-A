/**
 * Purpose: To calculate the points of a circle using Java's math class
 *
 * @author Jared Campisi
 * @version January 5th 2018
 */
import java.util.Scanner;
public class CirclePoints
{
    public static void main (String [] args)
    { 
        //declares and initializes variables
        double radius = 0.0;
        double valueX = 1.0;
        double valueY = 0.0;
        double increment = 0.1;
        int square = 2;
        int counter = 0;
        
        Scanner in = new Scanner(System.in);
        
        //collects user input
        System.out.print("Please enter a radius: ");
        double radiusChoice = in.nextDouble();
        
        radius = radiusChoice;
        
        //output header
        System.out.println("");
        System.out.println("Points on a Circle with a Radius of " + radius);
        System.out.printf("%5s     %5s     %5s     %5s\n", "X1","Y1","X2","Y2");
        System.out.println("****************************************");
        
        //calculates x and y, prints output
        for(counter = 0; counter < 21; counter++)
        {
            System.out.printf("%5.2f     %5.2f     %5.2f     %5.2f\n" , valueX, valueY, valueX, (valueY * - 1));
            valueX -= increment;
            valueY = Math.sqrt((Math.pow(radius, square) - Math.pow(valueX, square)));           

        }
    }
}
