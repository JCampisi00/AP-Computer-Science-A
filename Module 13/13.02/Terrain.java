/**
 * Purpose: defines terrain class
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */

public class Terrain
{
    // instance variables
    private int length, width;

    // Constructor for objects of class Terrain
    public Terrain(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return " has dimensions " + length + " X " + width;
    }
}
