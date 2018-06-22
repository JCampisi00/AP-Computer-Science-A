/**
 * Purpose: To practice exception handling
 *
 * @author Jared Campisi
 * @version May 1st 2018
 */
public class StudentDataTester
{
    //main method
    public static void main (String [] args)
    {
        System.out.println("First   Last               Scores                 Final Grade");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        double [] student01Scores = {85.35, 97.45, 76.93, 58.21, 95.10};
        String grade01 = StudentData.calcGrade(student01Scores);
        
        double [] student02Scores = {45.75, 33.25, 67.23, 51.14, 74.50};
        String grade02 = StudentData.calcGrade(student02Scores);
        
        double [] student03Scores = {95.56, 93.24, 99.19, 85.54, 87.30};
        String grade03 = StudentData.calcGrade(student03Scores);
        
        double [] student04Scores = {75.23, 77.67, 85.45, 72.12, 82.10};
        String grade04 = StudentData.calcGrade(student04Scores);
        
        double [] student05Scores = {67.47, 65.25, 74.27, 61.15, 76.10};
        String grade05 = StudentData.calcGrade(student05Scores);
        
        StudentData student01 = new StudentData("Ryan", "Williams", student01Scores, grade01);
        System.out.println(student01.toString(student01Scores));
                        
        StudentData student02 = new StudentData("Yani", "Martinez", student02Scores, grade02);
        System.out.println(student02.toString(student02Scores));
        
        StudentData student03 = new StudentData("Mary", "Ackerman", student03Scores, grade03);
        System.out.println(student03.toString(student03Scores));
        
        StudentData student04 = new StudentData("John", "Bradford", student04Scores, grade04);
        System.out.println(student04.toString(student04Scores));
        
        StudentData student05 = new StudentData("Elen", "Flanagon", student05Scores, grade05);
        System.out.println(student05.toString(student05Scores));
        
        /**
         *   The purpose of the following section is to demonstrate 
         *   that all exception throws work properly in this program.
         *   Uncomment each code segment that you would like to test
         *   
        */
       
        /**
         * Shows what happens when array of scores is empty
         */
        //double [] testGrades1 = {};
        //String test = StudentData.calcGrade(testGrades1);
        
        /**
         * Shows what happens when first name is blank
         */
        //StudentData student06 = new StudentData("", "Flanagon", student05Scores, grade05);
        //System.out.println(student06.toString(student05Scores));
        
        /**
         * Shows what happens when last name is blank
         */
        //StudentData student07 = new StudentData("Elen", "", student05Scores, grade05);
        //System.out.println(student07.toString(student05Scores));
    }
}
