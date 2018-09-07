/**
 * Purpose: to calculate and print data for hurricanes in a given range
 *
 * @author Jared Campisi
 * @version January 7th 2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class HurricaneSelector
{
    public static void main(String [] args) throws IOException
    {
        //welcome message
        System.out.println("       Welcome to my Hurricane Data Program!");
        
        //declares and initializes variables
        int startYear = 0;
        int endYear = 0;
        int minYear = 1995;
        int maxYear = 2015;
        
        int index = 0;
        int counter = 0;
        int arrayLength = 1000;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        double catTotal = 0;
        double pressureTotal = 0;
        double windTotal = 0;
                                
        //initializes arrays
        int year[];
        year = new int[arrayLength];        
        String month[];
        month = new String[arrayLength];        
        int pressure[];
        pressure = new int[arrayLength];        
        double wind[];
        wind = new double[arrayLength];        
        String name[];
        name = new String[arrayLength];        
        int[] category = new int[arrayLength];
        
        Scanner in = new Scanner(System.in);
        
        //collects and verifies user input
        while(startYear < minYear || startYear > maxYear)
        {
            System.out.print("Please enter a starting year between 1995 and 2015: ");
            startYear = in.nextInt();
                  
            if(startYear >= 1995 && startYear <= 2015)
            {
                System.out.print("Please enter an ending year between 1995 and 2015: ");
                endYear = in.nextInt();
            }
            else
                System.out.println("You have entered an invalid year, please try again.");
        }       
        if(endYear < 1995 || endYear > 2015)
        {
            System.out.println("You have entered an invalid year, please try again.");            
            while(endYear < 1995 || endYear > 2015)
            {
                System.out.print("Please enter an ending year between 1995 and 2015: ");
                endYear = in.nextInt();
                
                if(endYear >= 1995 && endYear <= 2015)
                {
                    System.out.println("Please wait while we calculate your results...");
                }
                else
                    System.out.println("You have entered an invalid year, please try again.");
            } 
                
        }
        
        //scans text file and assigns data to arrays
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);

        while(inFile.hasNext())
        {
            year[index] = inFile.nextInt();            
            month[index] = inFile.next();            
            pressure[index] = inFile.nextInt();  
            wind[index] = (double) (inFile.nextDouble() * 1.15078);
            name[index] = inFile.next();
                        
            index++;
                       
        }
        
        inFile.close();
        
        //calculates total pressure
        for(index = 0; index < year[index]; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {
                pressureTotal += pressure[index];
            }
        }
        
        //calculates total wind speed
        for(index = 0; index < year[index]; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {
                windTotal += wind[index];
            }
        }
        
        //assigns each hurricane to a category and counts
        for(index = 0; index < year[index]; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {    
                if(wind[index] >= 74 && wind[index] <= 95)
                {    
                    category[index] = 1;
                    cat1++;
                    counter++;
                }
                if(year[index] < startYear || year[index] > endYear)
                {
                    cat1--;
                } 
                else if(wind[index] >= 96 && wind[index] <= 110)
                {
                    category[index] = 2;
                    cat2++;
                    counter++;
                    if(year[index] < startYear || year[index] > endYear)
                    {
                        cat2--;
                    }  
                }
                else if(wind[index] >= 111 && wind[index] <= 129)
                {
                    category[index] = 3;
                    cat3++;
                    counter++;
                    if(year[index] < startYear || year[index] > endYear)
                    {
                        cat3--;
                    } 
                }
                else if(wind[index] >= 130 && wind[index] <= 156)
                {
                    category[index] = 4;
                    cat4++;
                    counter++;
                    if(year[index] < startYear || year[index] > endYear)
                    {
                        cat4--;
                    } 
                }
                else if(wind[index] >= 157)
                {
                    category[index] = 5;
                    cat5++;
                    counter++;
                    if(year[index] < startYear || year[index] > endYear)
                    {
                        cat5--;
                    } 
                }                
                catTotal += category[index];                
            }
        }
        //finds min and max values of categories in a given range
        int catMin = Integer.MAX_VALUE;
        int catMax = Integer.MIN_VALUE;
        
        for(index = 0; index < category.length; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {
                if(category[index] < catMin)
                {
                    catMin = category[index];
                }
                if(category[index] > catMax)
                {
                    catMax = category[index];
                }
            }
        }
        //finds min and max values of pressure in a given range
        int pressureMin = Integer.MAX_VALUE;
        int pressureMax = Integer.MIN_VALUE;
        
        for(index = 0; index < pressure.length; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {
                if(pressure[index] < pressureMin)
                {
                    pressureMin = pressure[index];
                }
                if(pressure[index] > pressureMax)
                {
                    pressureMax = pressure[index];
                }
            }
        }
        //finds min and max values of wind speed in a given range
        double windMin = Double.MAX_VALUE;
        double windMax = Double.MIN_VALUE;
        
        for(index = 0; index < wind.length; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
            {
                if(wind[index] < windMin)
                {
                    windMin = wind[index];
                }
                if(wind[index] > windMax)
                {
                    windMax = wind[index];
                }
            }
        }
        
        //prints output
        System.out.println("");
        System.out.println("           Hurricanes " + startYear + " - " + endYear);
        System.out.println("");
        System.out.println("Year     Hurricane          Category     Pressure (mb)       Wind Speed (mph)");
        System.out.println("===================================================================================");
        
        for(index = 0; index < year[index]; index++)
        {
            if(year[index] >= startYear && year[index] <= endYear)
                System.out.printf("%d%5s%-13s%10d%16d%18.2f\n", year[index], "", name[index], category[index], pressure[index], wind[index]);
        }
        
        System.out.println("===================================================================================");
        
        //calculates averages
        double catAvg = catTotal / counter;
        double pressureAvg = pressureTotal / counter;
        double windAvg = windTotal / counter;        
        
        //prints summary
        System.out.printf("%s%22.2f%16.2f%15.2f\n", "     Average:", catAvg, pressureAvg, windAvg);
        System.out.printf("%s%18s%d%13s%-16d%s%1.2f\n", "     Minimum:", "", catMin, "", pressureMin, "", windMin);
        System.out.printf("%s%18s%d%12s%-16d%s%1.2f\n", "     Maximum:", "", catMax, "", pressureMax, "", windMax);
        
        System.out.println("");
        System.out.println("Summary of Categories: ");
        System.out.println("  Cat 1: " + cat1);
        System.out.println("  Cat 2: " + cat2);
        System.out.println("  Cat 3: " + cat3);
        System.out.println("  Cat 4: " + cat4);
        System.out.println("  Cat 5: " + cat5);
        
        //prints summary to text file
        PrintWriter outFile = new PrintWriter(new File("summary.txt"));
        
        outFile.printf("%s%22.2f%16.2f%15.2f\n", "     Average:", catAvg, pressureAvg, windAvg);
        outFile.println("");
        outFile.printf("%s%18s%d%13s%-16d%s%1.2f\n", "     Minimum:", "", catMin, "", pressureMin, "", windMin);
        outFile.println("");
        outFile.printf("%s%18s%d%12s%-16d%s%1.2f\n", "     Maximum:", "", catMax, "", pressureMax, "", windMax);
        
        outFile.println("");
        outFile.println("Summary of Categories: ");
        outFile.println("  Cat 1: " + cat1);
        outFile.println("  Cat 2: " + cat2);
        outFile.println("  Cat 3: " + cat3);
        outFile.println("  Cat 4: " + cat4);
        outFile.println("  Cat 5: " + cat5);
        
        outFile.close( );

    }
}
