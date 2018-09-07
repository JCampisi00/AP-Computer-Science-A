/**
 * @purpose: This class prints the results of the CO2FootprintV2 class to the screen
 *
 * @author Jared Campisi
 * @version February 3rd 2018
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
        //declaration of variables
        double gallonsOfGas = 2410;

        //invoke default constructor
        CO2FootprintV2 footprint = new CO2FootprintV2(gallonsOfGas);
        
        //call methods
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        //print the results to the screen
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}
