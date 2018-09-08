/**
 * Purpose: defines forest class as a subclass of terrain
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class Forest extends Terrain
{
    private int totalTrees;
    
    public Forest (int l, int w, int numTrees)
    {
        super (l, w);
        
        totalTrees = numTrees;
    }
    
    public String getNumTrees()
    {
        return getTerrainSize() + " and has " + totalTrees + " trees";
    }    
}
