/**
 * Purpose: defines mountain class as a subclass of terrain
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class Mountain extends Terrain
{
    private int totalM;
    
    public Mountain (int l, int w, int numMount)
    {
        super (l, w);
        
        totalM = numMount;
    }
    
    public String getNumMount()
    {
        return getTerrainSize() + " and has " + totalM + " mountains";
    }
}
