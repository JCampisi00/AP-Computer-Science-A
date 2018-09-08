/**
 * @purpose: To calculate the net CO2 emissions of given households
 *
 * @author Jared Campisi
 * @version February 4th 2018 - Updated for 14.05 on March 18th 2018
 *
 */
public class CO2FromWasteU
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;

   /**
    * Constructor for objects of type CO2FromWaste
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    */
   //local variables updated to same name as instance variables
   //as requested by 14.05 rubric
   CO2FromWasteU(int myNumPeople, boolean myPaper, boolean myPlastic, boolean myGlass, boolean myCans)
   {
       this.myNumPeople = myNumPeople; 
       this.myPaper = myPaper;
       this.myPlastic = myPlastic;
       this.myGlass = myGlass;
       this.myCans = myCans;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
        this.myEmissions = (this.myNumPeople * 1018);
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           this.myReduction += (184.0 * this.myNumPeople);
       }

       if(myPlastic)
       {
           this.myReduction += (25.6 * this.myNumPeople);
       }
       
       if(myGlass)
       {
           this.myReduction += (46.6 * this.myNumPeople);
       }
       
       if(myCans)
       {
           this.myReduction += (165.8 * this.myNumPeople);
       }
   }

   /**
    * Mutator method to calculate the net emissions (no parameters)
    */
   public void calcNetWasteReduction()
   {
        calcGrossWasteEmission();
        calcWasteReduction();
        
        this.myNetEmissions = (this.myEmissions - this.myReduction); 
   }

   /**
    * Getter method to return the number of people (no parameters)
    */
   public int getNumPeople()
   {
       return this.myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no parameters)
    */
   public boolean getPaper()
   {
       return this.myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no parameters)
    */
   public boolean getGlass()
   {
       return this.myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no parameters)
    */
   public boolean getPlastic()
   {
       return this.myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no parameters)
    */
   public boolean getCans()
   {
       return this.myCans;
   }

   /**
    * Getter method to return the total emissions (no parameters)
    */
   public double getEmissions()
   {
       return this.myEmissions;
   }

   /**
    * Getter method to return the reduction amount (no parameters)
    */
   public double getReduction()
   {
       return this.myReduction;
   }

   /**
    * Getter method to return the net emissions (no parameters)
    */
   public double getNetEmissions()
   {
       return this.myNetEmissions;
   }
}
