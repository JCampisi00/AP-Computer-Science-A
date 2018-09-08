/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Poly Morphism - Updated by Jared Campisi
 * @version 06/13/17 - Updated March 7th 2018
 */

public class Oval2 extends Circle2
{
    // instance variables
    private int radius2;

    // Constructor for objects of class Oval
    public Oval2(int x, int y, int rad1, int rad2)
    {
        // call superclass
        super(x, y, rad1);

        // initialize instance variables
        radius2 = rad2;
    }

    public int getRadius2()
    {
        return radius2;
    }
    
    //returns name of shape
    public String getName()
    {
        return "Oval";
    }
}
