/**
 * Purpose: defines space class a subclass of wintermountain
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class Space extends WinterMountain
{
    private double pressure1;
    
    public Space(int l, int w, int numMount, double temp, double pressure)
    {
        super (l, w, numMount, temp);
        
        pressure1 = pressure;
    }
    
    public String getPressure()
    {
        return getTemp() + " and pressure " + pressure1 + " pascals";
    }
}
