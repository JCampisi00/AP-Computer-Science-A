/**
 * Purpose: To estimate the value of Pi by using the Monte Carlo method
 *
 * @author Jared Campisi
 * @version January 12th 2018
 */
import java.util.Scanner;
import java.util.Random;
public class EstimatePi
{
    //method to collect user input
    public static int userInput(String title)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.printf("%s", "How many " + title + "? ");
        
        return in.nextInt();
    }
    
    //method to calculate the value of pi
    public static double calcPi(int darts)
    {
        Random rand = new Random();
        
        int numHits = 0;
        int miss = 0;
        int value = 4;
        
        for(int index = 0; index < darts; index++)
        {
            double pointX = rand.nextDouble();
            double pointY = rand.nextDouble();
            
            if ((Math.pow(pointX, 2) + Math.pow(pointY, 2)) <= 1)
            {
                numHits++;
            }
            else
            {
                miss++;
            }            
        }
               
        return (double) numHits / darts * value;
    }
    
    //method to print the results to the screen
    public static double[] printResults(int trials, int darts)
    {
        double[] trial = new double[trials];
        
        for(int index = 0; index < trials; index++)
        {
            trial[index] = calcPi(darts);
            System.out.printf("%-5s%s%2d%s%s%.6f%n", "Trial ", "[", index + 1, "]", ": pi == ",  trial[index]);
        }
        
        return trial;
    }
    
    //method to calculate the average pi for all trials
    public static double calcPi(double[] trial)
    {
        double total = 0.0;
        
        for (double pi: trial)
        {
            total += pi;
        }
        
        return total / trial.length;
    }
    
        //main method
        public static void main(String[] args)
        {
            int darts2 = userInput("darts per trial");
            int trials2 = userInput("trials");       
            double[] trial = printResults(trials2, darts2);
            double pi = calcPi(trial); 
            
            System.out.printf("%-10s%.6f%n", "Estimate of pi == ", pi);
        }
}
