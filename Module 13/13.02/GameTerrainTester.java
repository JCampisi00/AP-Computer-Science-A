/**
 * Purpose: to instantiate instances of defined terrains and print output
 *
 * @author Jared Campisi
 * @version March 3rd 2018
 */
public class GameTerrainTester
{
    public static void main (String [] args)
    {
        //instantiates instance of terrain class and prints output
        Terrain land = new Terrain(135, 532);
        System.out.println("Land" + land.getTerrainSize());
        
        System.out.println("");
        
        //instantiates instance of mountain class and prints output
        Mountain mount = new Mountain(453, 721, 3);
        System.out.println("Mountain Land" + mount.getNumMount());
        
        System.out.println("");
        
        //instantiates instance of wintermountain class and prints output
        WinterMountain winter = new WinterMountain(397, 543, 5, 19.6);
        System.out.println("Winter Mountain Land" + winter.getTemp());
        
        System.out.println("");
        
        //instantiates instance of forest class and prints output
        Forest trees = new Forest(888, 333, 1096);
        System.out.println("Forest Land" + trees.getNumTrees());
        
        System.out.println("");
        
        //my 2 custom terrains
        //instantiates instance of lava class and prints output
        Lava vulcan = new Lava(975, 555, 17);
        System.out.println("Lava Land" + vulcan.getNumVolcano());
        
        System.out.println("");
        
        //instantiates instance of space class and prints output
        Space planet = new Space(1344, 4321, 93, 23.7, 101325);
        System.out.println("Space Land" + planet.getPressure());
    }
}
