/**
 * Purpose: To convert given currencies to U.S. dollar equivalent
 *
 * @author Jared Campisi
 * @version Februrary 11th 2018
 */
import java.util.ArrayList;
public class CurrencyTester
{
    public static void main (String [] args)
    {
        //arraylist
        ArrayList <Currency> currencyObj = new ArrayList <Currency> ();
        
        currencyObj.add(new Currency(100.54, 123.21, 157.21));
        currencyObj.add(new Currency(200.59, 127.86, 865.21));
        currencyObj.add(new Currency(432.51, 777.51, 896.21));
        currencyObj.add(new Currency(233.22, 543.26, 543.21));
        currencyObj.add(new Currency(999.99, 654.86, 765.21));
        currencyObj.add(new Currency(123.14, 244.15, 754.21));
        currencyObj.add(new Currency(105.54, 947.25, 356.21));
        currencyObj.add(new Currency(677.64, 355.54, 145.21));
        currencyObj.add(new Currency(643.94, 654.75, 654.21));
        currencyObj.add(new Currency(154.25, 257.57, 642.21));

        Currency dataRecord;

        for(int index = 0; index < currencyObj.size(); index++)
        {
            dataRecord = currencyObj.get(index);
            dataRecord.calcC();
            dataRecord.calcSK();
            dataRecord.calcUK();
        }

        //Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("%15s %10s\n", "", "Currency Converter");
        System.out.printf("%5s %5s\n", "", "given currency values converted to U.S. dollar equivalent");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        System.out.printf("%s %12s %12s %14s\n", "Index", "Canadian $", "Won", "Pounds");
        System.out.printf("%s", "========================================================");
        System.out.println("");

        //calls methods
        for(int index = 0; index < currencyObj.size(); index++)
        {
            System.out.println("  " + (index) + " " +  currencyObj.get(index)); 
        }       
        
    }
}
