/**
 * @purpose: This class calculates the total number of pounds of CO2 emitted each year
 * It contains mutator methods to calculate the total number of metric tons of CO2 emitted
 * It contains getter methods getTonsCO2() & getPoundsCO2()
 * Private instance variables include myGallonsUsed, myTonsCO2, & myPoundsCO2
 * 
 * @author Jared Campisi
 * @version February 3rd 2018
 */
public class CO2FootprintV2
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons of gass used
     * Precondition: gallons is a positive value
     */
    CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate the total tons of CO2 emitted (no parameters) 
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to calculate the total pounds of CO2 emitted (no paramters)
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of the total gallons used
     * @return the total gallons of gas used
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the value of the total tons of CO2 emitted
     * @return the total tons of CO2 emitted
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the value of the total pounds of CO2 emitted
     * @return the total pounds of CO2 emitted
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
