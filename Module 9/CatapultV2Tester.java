/**
 * Purpose: to calculate the trajectory of a projectile based on launch angles and launch velocities.
 *
 * @author Jared Campisi
 * @version February 13th 2018
 */
public class CatapultV2Tester 
{
    public static void main (String[] args) 
    {
        //initializes 1D arrays
        int [] angle = {40, 45, 50, 55, 60, 65, 70};
        int [] velocity = {20, 25, 30, 35, 40, 45, 50}; //meters per second
        
        //2D array
        CatapultV2 [][] trajectory = new CatapultV2 [7][7];        

        //prints output header to the screen
        System.out.printf("%22s %s\n", "", "Projectile Distance (feet)");
        System.out.printf("\n");
        System.out.printf("%22s %5s\n", "", "How far will the fruit go?");
        System.out.printf("\n");
        System.out.printf("%s %10s %10s %10s %10s %10s %10s %10s\n", "MPH", "40 deg", "45 deg", "50 deg", "55 deg", "60 deg", "65 deg", "70 deg");
        System.out.printf("\n");
        System.out.println("=================================================================================");
        
        //traverses 1D arrays and assigns values to trajectory array
        for(int index = 0; index < trajectory.length; index++) 
        {            
            for(int j = 0; j < trajectory.length; j++)
            {
                trajectory[index][j] = new CatapultV2(velocity[index], angle[j]);
            }
        }
        
        //returns distance calculation and prints result
        for (CatapultV2 [] catapult : trajectory) 
        {
            catapult[0].calcVelocity();            
            System.out.printf("%2.0f ", catapult[0].getVelocity());
            
            for (int j = 0; j < trajectory.length; j++) 
            {
                catapult[j].calcDistance();
                catapult[j].getDistance();
                catapult[j].calcFeet();
                System.out.printf("%10.2f ", catapult[j].getFeet());
            }
            
            System.out.println("");
           
        }
    }

}
