/**
 * Purpose: Implementation class to define a student data object
 *
 * @author Jared Campisi
 * @version May 1st 2018
 */
public class StudentData
{
    //instance variables
    private String firstName;
    private String lastName;
    private double [] score;
    private static String grade;
    
    //constructor for objects of class StudentData
    public StudentData(String firstName, String lastName, double [] score, String grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.grade = grade;
        
        if (firstName.isEmpty())
        {
            throw new IllegalArgumentException("Error! The Student must have a first name");
        }
        else if (lastName.isEmpty())
        {
            throw new IllegalArgumentException("Error! The Student must have a last name");
        }
        
        calcGrade(score);
    }
    
    public String getNameFirst()
    {
        return firstName;
    }
    
    public void setNameFirst(String firstName)
    {
        this.firstName = firstName;
    }
    
    public String getNameLast()
    {
        return lastName;
    }
    
    public void setNameLast(String lastName)
    {
        this.lastName = lastName;
    }
    
    public double [] getScore()
    {
        return score;
    }
    
    public void setScore(double [] score)
    {
        this.score = score;
    }
    
    public String getGrade()
    {
        return grade;
    }
    
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    //calculates the course average based on an array 
    //of scores and returns the equivalent letter grade
    public static String calcGrade(double [] score)
    {
        double points = 0.0;
        double total = 0.0;
        int count = 0;
        
        for (int index = 0; index < score.length; index++)
        {
            points += score[index];
            count++;
        }
        
        total = (points / count);
        
        if (total < 60)
        {
            grade = "F";
        }
        else if (total < 70 && total > 59.99)
        {
            grade = "D";
        }
        else if (total < 80 && total > 69.99)
        {
            grade = "C";
        }
        else if (total < 90 && total > 79.99)
        {
            grade = "B";
        }
        else if (total > 89.99)
        {
            grade = "A";
        }
        else
        {
            //throws exception if scores array is empty
            throw new IllegalArgumentException("Error! The array cannot be empty");
        }
        
        return grade;
    }
    
    //converts array of scores into a string
    public String stringScore(double[] scores)
    {
        String s = " ";
        for (int index = 0; index < scores.length; index++)
        {
            s += scores[index] + "  ";
        }
        
        return s;
    }
    
    public String toString(double [] scores)
    {
        String str = getNameFirst() + " " + getNameLast() + "   " + stringScore(scores) + "   " + getGrade();
        return str;
    }
}
