/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Poly Morphism - Updated by Jared Campisi
 * @version 06/13/17 - Updated March 7th 2018
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
    
    //returns name of shape
    public String getName()
    {
        return "OvalCylinder";
    }
}
