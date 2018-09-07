/**
 * @purpose: To print the results of the net CO2 emissions of given households
 *
 * @author Jared Campisi
 * @version Februrary 4th 2018
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       //initializes arraylist and multiple objects
       ArrayList <CO2FromWaste> waste = new ArrayList <CO2FromWaste> ();
       
       waste.add(new CO2FromWaste(5, true, false, true, true));
       waste.add(new CO2FromWaste(1, false, true, false, true));
       waste.add(new CO2FromWaste(2, true, true, true, true));
       waste.add(new CO2FromWaste(3, true, true, false, true));
       waste.add(new CO2FromWaste(4, false, false, false, false));
       waste.add(new CO2FromWaste(9, false, true, true, false));

       for(CO2FromWaste dataRecord : waste)
       {
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       //prints results to the screen
       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWaste dataRecord;

       for(int index = 0; index < waste.size(); index++)
       {
           dataRecord = waste.get(index);
           System.out.printf("%5d %8d %10b %10b %9b" + " %9b %12.1f %13.1f %12.1f\n", index,
           dataRecord.getNumPeople(), dataRecord.getPaper(),
           dataRecord.getPlastic(), dataRecord.getGlass(),
           dataRecord.getCans(), dataRecord.getEmissions(),
           dataRecord.getReduction(), dataRecord.getNetEmissions());

       }
       
       System.out.println("|-------|--------|---------|-----------|---------|---------|------------|-------------|------------|");
   }
}
