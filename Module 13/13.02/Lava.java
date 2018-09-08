/**
 * Purpose: defines lava class as a subclass of terrain 
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class Lava extends Terrain
{
    private int totalVolcano;
    
    public Lava (int l, int w, int numVolcano)
    {
        super (l, w);
        
        totalVolcano = numVolcano;
    }
    
    public String getNumVolcano()
    {
        return getTerrainSize() + " and has " + totalVolcano + " volcanoes";
    }
}
