/**
 * Purpose: to calculate the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @author Jared Campisi
 * @version February 13th 2018
 */
public class CatapultV2 
{
    //initializes private instance variables
    private double distance;
    private double velocity;
    private double MPH;
    private double angle; 
    private double feet;

    //default constructor
    public CatapultV2(double vel, double ang) 
    {
        velocity = vel;
        angle = ang;
    }
    
    //mutator method to calculate distance
    public void calcDistance()
    {
        distance = (Math.pow(velocity, 2) * Math.sin(2 * Math.toRadians(angle)) / 9.8);
    }
    
    //mutator method to convert distance to feet
    public void calcFeet()
    {
        feet = distance * 3.28084;
    }
    
    //mutator method to convert velocity to miles per hour
    public void calcVelocity()
    {
        MPH = velocity * 2.23694;
    }

    //getter method to return value of distance
    public double getDistance()
    {
        return distance;
    }
    
    //getter method to return value of distance in feet
    public double getFeet()
    {
        return feet;
    }
    
    //getter method to return value of velocity
    public double getVelocity()
    {
        return MPH;
    }
    
}
