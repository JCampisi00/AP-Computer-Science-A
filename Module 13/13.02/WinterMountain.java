/**
 * Purpose: defines wintermountain class as a subclass of mountain
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    
    public WinterMountain (int l, int w, int numMount, double temp)
    {
        super (l, w, numMount);
        
        temperature = temp;
    }
    
    public String getTemp()
    {
        return getNumMount() + " and temperature " + temperature + " degrees";
    }
}
