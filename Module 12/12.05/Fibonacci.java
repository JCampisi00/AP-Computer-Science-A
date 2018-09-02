/**
 * Purpose: to calculate and print a fibonacci number based on user input
 *
 * @author Jared Campisi
 * @version February 27th 2018
 */
import java.util.Scanner;
public class Fibonacci
{
    //initializes private instance variable
    private int fib;
    
    //default constructor
    public Fibonacci()
    {
        
    }
    
    //method to collect and verify user input
    public static void userInput()
    {        
        System.out.print("Enter a number (0-40): ");
        Scanner in = new Scanner(System.in);        
        String userPick = in.next();
        
        if (userPick.equals("q") || userPick.equals("Q"))
        {
            System.out.println("");
            System.out.println("Thanks for using my generator, I hope to see you again soon!");
        }
                
        else
        {                                                                        
            //error trap for invalid input; I found try/catch in java API
            try 
            {
                int choice = Integer.parseInt(userPick);
                int fib = calcFib(choice);
            
                //checks to see if user input is within the correct range
                if (choice > 40 || choice < 0)
                {
                    System.out.println("Hey! The number you have entered is out of range, please try again!");
                }
                
                else
                {
                    System.out.println("Fibonacci number: " + fib);
                }
                //allows user to try again           
                userInput(); 
                
            } 
            
            //if a user enters a non integer value - catch the resulting error and print a message 
            catch (NumberFormatException error) 
            {
                System.out.println("Hey! That's an invalid character, please try again!");
                
                userInput();
            }
            
            //if a user enters an integer value outside of the given range - catch the resulting error and print a message
            catch (StackOverflowError err)
            {
                System.out.println("Hey! The number you have entered is out of range, please try again!");
                
                userInput();
            }
                                  
        }
                       
    }
    
    //method to calculate fibonacci number
    public static int calcFib (int choice)
    {
        //base cases
        if (choice == 0)
        {
            return 0;
        }
        
        if (choice == 1)
        {
            return 1;
        }
        
        //recursive call
        else
        {        
            return calcFib(choice - 1) + calcFib(choice - 2);
        }
    }    
}
