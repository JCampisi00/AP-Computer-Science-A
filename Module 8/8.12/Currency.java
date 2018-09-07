/**
 * Purpose: To convert given currencies to U.S. dollar equivalent
 *
 * @author Jared Campisi
 * @version Februrary 11th 2018
 */
public class Currency
{
    //initializes private instance variables
    private double myCanadaSpent, myWonSpent, myPoundSpent;
    private double equalC, equalSK, equalUK;
    
    //default constructor
    public Currency(double cs, double ws, double ps)
    {
        myCanadaSpent = cs;
        myWonSpent = ws;
        myPoundSpent = ps;
        equalC = 0.0;
        equalSK = 0.0;
        equalUK = 0.0;
    }
    
    //mutator method to calculate the canadian equivalent of US dollar given
    public double calcC()
    {
        equalC = myCanadaSpent * 0.8173;
        return equalC;
    }
    
    //getter method to return the value of canadian conversion
    public double getCalcC()
    {
        return equalC;
    }
    
    //mutator method to calculate the south korean equivalent of US dollar given
    public double calcSK()
    {
        equalSK = myWonSpent * 0.0009909;
        return equalSK;
    }
    
    //getter method to return the value of south korean conversion
    public double getCalcSK()
    {
        return equalSK;
    }
    
    //mutator method to calculate the united kingdom equivalent of US dollar given
    public double calcUK()
    {
        equalUK = myPoundSpent * 1.4213;
        return equalUK;
    }
    
    //getter method to return the value of united kingdom conversion
    public double getCalcUK()
    {
        return equalUK;
    }

    //getter method to return given value
    public double getMyCanadaSpent()
    {
        return myCanadaSpent;
    }
    
    //getter method to return given value
    public double getMyWonSpent()
    {
        return myWonSpent;
    }

    //getter method to return given value
    public double getMyPoundSpent()
    {
        return myPoundSpent;
    }
    
    // returns a String of the object's values.
    public String toString()
    {
        return String.format("%12.2f %14.2f %13.2f", equalC,
                                                     equalSK,
                                                     equalUK);
    }
}
