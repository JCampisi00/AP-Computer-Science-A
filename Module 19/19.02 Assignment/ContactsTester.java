/**
 * Purpose: To practice various search and sort algorithms with an array of contacts
 *
 * @author Jared Campisi
 * @version April 28th 2018
 */
public class ContactsTester
{
    //main method
    public static void main (String [] args)
    {
        int test = 0;
        
        Contacts person01 = new Contacts("Robert Bauer", "Friend", "April 10th", "727-123-1234", "Robert.Bauer@fakemail.com");
        Contacts person02 = new Contacts("Christie Vue", "Sister", "March 12th", "727-321-4321", "TheRealLuna2@fakemail.com");
        Contacts person03 = new Contacts("Kerry Bailey", "Friend", "Novem 15th", "727-222-3221", "SuiteLifeBailey@fakemail.com");
        Contacts person04 = new Contacts("Randy Burkey", "Friend", "Decem 25th", "727-111-1111", "MiracleBabyRad@fakemail.com");
        Contacts person05 = new Contacts("Shannon Grut", "Mother", "Octob 15th", "727-333-3333", "CoolMom15@fakemail.com");
        Contacts person06 = new Contacts("Ryan Kirkpat", "Father", "Janua 23rd", "727-444-4444", "EpicDad23@fakemail.com");
        Contacts person07 = new Contacts("Frank Skapur", "Uncle", " Septe 21st", "727-555-5555", "FrankTheTank@fakemail.com");
        Contacts person08 = new Contacts("Ian McMaster", "Friend", "Febru 17th", "727-777-7777", "IanBianLol@fakemail.com");
        Contacts person09 = new Contacts("Aaron Foster", "Uncle", " Augus 09th", "727-888-8888", "FootballPro123@fakemail.com");
        Contacts person10 = new Contacts("Nicholas Goo", "Mentor", "Janua 18th", "727-999-9999", "SaintNick1@fakemail.com");
        
        Contacts [] people = {person01, person02, person03, person04, person05,
                              person06, person07, person08, person09, person10};
                          
        print(people);
        
        people = sortName(people);
        //printSortedPeople(people); //test for sort by name        
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for Christie Vue >>");
        System.out.println("");
        test = binarySearchName(people, "Christie Vue");
        if (test != -1)
        {
            System.out.println(people[test]);
        } 
        else
        {
            System.out.println("Not found. ");
        }
        
        people = sortRelation(people);
        //printSortedPeople(people); //test for sort by relation
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for friends >>");
        System.out.println("");
        test = binarySearchRelation(people, "Friend");
        if (test == -1)
        {
            System.out.println("Not found. " );
        } 
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for January birthdays >>");
        System.out.println("");
        searchBirthday(people, "Janua");
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for phone number 727-123-1234 >>");
        System.out.println("");
        searchPhone(people, "727-123-1234");
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for email address CoolMom15@fakemail.com >>");
        System.out.println("");
        searchEmail(people, "CoolMom15@fakemail.com");
        
        /**
         * The following code is to demonstrate what happens
         * when a particular search criterion is not found
         */
        people = sortName(people);
        //printSortedPeople(people); //test for sort by name
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for Christie Moo >>");
        System.out.println("");
        test = binarySearchName(people, "Christie Moo");
        if (test != -1)
        {
            System.out.println(people[test]);
        } 
        else
        {
            System.out.println("Not found. ");
        }
        
        people = sortRelation(people);
        //printSortedPeople(people); //test for sort by relation
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for grandfather's >>");
        System.out.println("");
        test = binarySearchRelation(people, "Grandfather");
        if (test == -1)
        {
            System.out.println("Not found. " );
        } 
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for July birthdays >>");
        System.out.println("");
        searchBirthday(people, "July");
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for phone number 727-123-1237 >>");
        System.out.println("");
        searchPhone(people, "727-123-1237");
        
        System.out.println("");
        System.out.println("");
        System.out.println("<< searching for email address CuulMum18@fakemail.com >>");
        System.out.println("");
        searchEmail(people, "CuulMum18@fakemail.com");
    }
    
    //method to traverse array and print elements
    public static void print(Contacts [] people)
    {
        for (int index = 0; index < people.length; index++)
        {
            System.out.println(people[index]);
        }
        
        System.out.println("---------------------------------------------------");
    }
    
    //searches the array for a particular contact name 
    //using binary search algorithm
    public static int binarySearchName(Contacts[] people, String toFind )
    {
        int high = people.length;
        int low = -1;
        int probe;

        while (high - low > 1)
        {
            probe = (high + low) / 2;
            if (people[probe].getName().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
        }
        
        if ((low >= 0) && (people[low].getName().compareTo(toFind) == 0 ))
        {
            return low;
        }
        else
        {
            return -1;
        }
    }
    
    //searches the array for a particular contact relationship
    //using binary search algorithm
    public static int binarySearchRelation(Contacts[] r, String toFind)
    {
        int high = r.length;
        int low = -1;
        int probe;

        while (high - low > 1)
        {
            probe = (high + low) / 2;

            if (r[probe].getRelation().compareTo(toFind) > 0)
            {
                high = probe;
            }
            else
            {
                low = probe;
            }
            if (r[probe].getRelation().compareTo(toFind) == 0)
            {
                break;
            }            
        }
        
        if ((low >= 0) && (r[low].getRelation().compareTo(toFind) == 0))
        {
            linearPrintLoc(r, low, toFind);
        }
        else
        {
            return -1;
        }
        return low;
    }
    
    public static void linearPrintLoc(Contacts[] r, int low, String toFind)
    {
        int i;
        int start = low;
        int end = low;

        // find starting point of matches
        i = low - 1;
        while((i >= 0) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            start = i;
            i--;
        }
        // find ending point of matches
        i = low + 1;
        while((i < r.length) && (r[i].getRelation().compareTo(toFind) == 0))
        {
            end = i;
            i++;
        }
        // now print out the matches
        for(i = start; i <= end; i++)
        {
            System.out.println(r[i]);
        }
    }
    
    //searches the array for a particular contact birthday
    //using sequential search algorithm
    public static void searchBirthday(Contacts [] people, String toFind)
    {
        int found = 0;
                        
        for (int index = 0; index < people.length; index++)
        {
            if (people[index].getBirthday().substring(0,5).compareTo(toFind) == 0)
            {               
                System.out.println(people[index]);
                found++;
            }
        }
        if (found == 0)
        { 
            System.out.println("<< Error! Could not find results >>");
            System.out.println("No contacts with birthday " + toFind + " exist within the array!");
            System.out.println("");
        }
    }
    
    //searches the array for a particular contact phone number
    //using sequential search algorithm
    public static void searchPhone(Contacts [] people, String toFind)
    {
        int found = 0;
                        
        for (int index = 0; index < people.length; index++)
        {
            if (people[index].getPhone().compareTo(toFind) == 0)
            {               
                System.out.println(people[index]);
                found++;
            }
        }
        if (found == 0)
        { 
            System.out.println("<< Error! Could not find results >>");
            System.out.println("No contacts with phone number " + toFind + " exist within the array!");
            System.out.println("");
        }
    }
    
    //searches the array for a particular contact email address
    //using sequential search algorithm
    public static void searchEmail(Contacts [] people, String toFind)
    {
        int found = 0;
                        
        for (int index = 0; index < people.length; index++)
        {
            if (people[index].getEmail().compareTo(toFind) == 0)
            {               
                System.out.println(people[index]);
                found++;
            }
        }
        if (found == 0)
        { 
            System.out.println("<< Error! Could not find results >>");
            System.out.println("No contacts with email address " + toFind + " exist within the array!");
            System.out.println("");
        }
    }
    
    //sorts the array by the contact name using insertion sort
    public static Contacts [] sortName(Contacts [] people)
    {
        Contacts [] blankPeople = new Contacts [people.length]; 
        
        for (int index = 0; index < people.length; index++)
        {
            String next = people[index].getName();             
            int n = index;
            int insertIndex = 0;
            
            while (n > 0 && insertIndex == 0 )
            {
                if (next.compareTo(blankPeople[n - 1].getName()) > 0)
                {
                    insertIndex = n;
                }
                else
                {
                    blankPeople[n] = blankPeople[n - 1];
                }
                n--;
            }

            blankPeople[insertIndex] = people[index];  
        }
        return blankPeople;
    }
    
    //sorts the array by the contact relationship using insertion sort
    public static Contacts [] sortRelation(Contacts [] people)
    {
        Contacts [] blankPeople = new Contacts [people.length]; 
        
        for (int index = 0; index < people.length; index++)
        {
            String next = people[index].getRelation();             
            int n = index;
            int insertIndex = 0;
            
            while (n > 0 && insertIndex == 0 )
            {
                if (next.compareTo(blankPeople[n - 1].getRelation()) > 0)
                {
                    insertIndex = n;
                }
                else
                {
                    blankPeople[n] = blankPeople[n - 1];
                }
                n--;
            }

            blankPeople[insertIndex] = people[index];  
        }
        return blankPeople;
    }
    
    //traverses blankPeople and prints output
    public static void printSortedPeople(Contacts [] blankPeople)
    {
        for (int index = 0; index < blankPeople.length; index++)
        {
            System.out.println(blankPeople[index]);
        }
    }
}
