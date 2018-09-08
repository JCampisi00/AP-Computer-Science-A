/**
* Purpose: to calculate prime numbers within a given range based on user input
*
* @author Jared Campisi
* @version March 19th 2018
*/
import java.util.Scanner;
public class PrimeNumbers
{
    //initializes instance variables
    public static int minLimit;
    public static int maxLimit;
    public static int counter = 0;
        
    //default constructor
    public PrimeNumbers()
    {
            
    }
 
    //collects user input on minimum and maximum values
    public void userInput()
    {
        Scanner in = new Scanner (System.in);
            
        //error trap for invalid input
        try
        {
            System.out.print("Select a lower limit: ");
            this.minLimit = in.nextInt();
                
            System.out.print("Select an upper limit: ");
            this.maxLimit = in.nextInt();
            
            System.out.println("");
            calcPrime();
        }
        catch (Exception error)
        {
            System.out.println("");
            System.out.println("Error! Restarting program...");
            System.out.println("");
            userInput();
        }
    }
        
    //calculates prime numbers
    public void calcPrime()
    {
        for (int index = 0; index < this.maxLimit; index++)
        {
            int prime = 0;                
                
            for (int y = (index - 1); y > 1; y--)
            {
                if (index % y == 0)
                {
                    prime = 1;
                }
                else
                {

                } 
            }
            if (prime == 0 && index > 1)
            {
                System.out.println(index);                    
                this.counter++;
            }
        }
            
        //prints results to the screen
        System.out.println("");
        System.out.println("There are " + this.counter + " prime numbers within your selected range!");
    }
}
