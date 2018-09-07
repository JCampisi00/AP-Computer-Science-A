/**
 * Purpose: to calculate the area and volume of a gaming console, based on given information
 *
 * @author Jared Campisi
 * @version January 30th 2018
 */
public class ConsoleV7Tester
{
    public static void main (String [] args)
    {
        //variables
        int height, width, length, height2, width2, length2, height3, width3, length3;
        double consoleArea, volume, consoleArea2, volume2, consoleArea3, volume3;
        
        height = 12; width = 6; length = 9;
        height2 = 10; width2 = 8; length2 = 12;
        height3 = 15; width3 = 5; length3 = 7;
        consoleArea = 0; volume = 0;
        
        //object
        ConsoleV7 overload = new ConsoleV7(height, width, length);
        ConsoleV7 overload2 = new ConsoleV7(height2, width2, length2);
        ConsoleV7 overload3 = new ConsoleV7(height3, width3, length3);
        
        consoleArea = overload.calcConsoleArea (height, width, length);
        volume = overload.calcVolume (height, width, length);
        consoleArea2 = overload2.calcConsoleArea (height2, width2, length2);
        volume2 = overload2.calcVolume (height2, width2, length2);
        consoleArea3 = overload3.calcConsoleArea (height3, width3, length3);
        volume3 = overload3.calcVolume (height3, width3, length3);
        
        //prints results to the screen
        System.out.printf("%20s\n", "Gaming Console");
        System.out.println("=================================");
        System.out.printf(" Console #1 Area = %5.2f", consoleArea);
        System.out.print(" inches^2");
        System.out.println("");
        System.out.printf(" Console #1 Volume = %5.2f", volume);
        System.out.print(" inches^3");
        System.out.println("");
        System.out.printf(" Console #2 Area = %5.2f", consoleArea2);
        System.out.print(" inches^2");
        System.out.println("");
        System.out.printf(" Console #2 Volume = %5.2f", volume2);
        System.out.print(" inches^3");
        System.out.println("");
        System.out.printf(" Console #3 Area = %5.2f", consoleArea3);
        System.out.print(" inches^2");
        System.out.println("");
        System.out.printf(" Console #3 Volume = %5.2f", volume3);
        System.out.print(" inches^3");
    }
}
