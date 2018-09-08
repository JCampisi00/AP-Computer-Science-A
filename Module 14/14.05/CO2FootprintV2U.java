/**
 * @purpose: This class calculates the total number of pounds of CO2 emitted each year
 * It contains mutator methods to calculate the total number of metric tons of CO2 emitted
 * It contains getter methods getTonsCO2() & getPoundsCO2()
 * Private instance variables include myGallonsUsed, myTonsCO2, & myPoundsCO2
 * 
 * @author Jared Campisi 
 * @version February 3rd 2018 - Updated for 14.05 on March 18th 2018
 */
public class CO2FootprintV2U
{
    private double myGallonsUsed;
    private double myTonsCO2;
    private double myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons of gass used
     * Precondition: gallons is a positive value
     */
    //local variable updated to same name as instance variable
    //as requested by 14.05 rubric
    CO2FootprintV2U(double myGallonsUsed)
    {
        this.myGallonsUsed = myGallonsUsed;
    }

    /**
     * Mutator method to calculate the total tons of CO2 emitted (no parameters) 
     */
    public void calcTonsCO2()
    {
        this.myTonsCO2 = (8.78 * Math.pow(10, -3)) * this.myGallonsUsed;
    }

    /**
     * Mutator method to calculate the total pounds of CO2 emitted (no paramters)
     */
    public void convertTonsToPounds()
    {
        this.myPoundsCO2 = this.myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of the total gallons used
     * @return the total gallons of gas used
     */
    public double getGallons()
    {
        return this.myGallonsUsed;
    }

    /**
     * Getter method to return the value of the total tons of CO2 emitted
     * @return the total tons of CO2 emitted
     */
    public double getTonsCO2()
    {
        return this.myTonsCO2;
    }

    /**
     * Getter method to return the value of the total pounds of CO2 emitted
     * @return the total pounds of CO2 emitted
     */
    public double getPoundsCO2()
    {
        return this.myPoundsCO2;
    }
}
