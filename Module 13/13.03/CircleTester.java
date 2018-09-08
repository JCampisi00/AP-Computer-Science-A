/**
 * Purpose: to demonstrate polymorphism 
 *
 * @author Jared Campisi
 * @version March 7th 2018
 */
import java.util.ArrayList;
public class CircleTester
{
    public static void showCenter (Circle2 circ)
    {
        System.out.println("For this " + circ.getName() + " the " + circ.getCenter());
    }
    
    public static void main (String [] args)
    {
        //initalizes circles arrayList
        ArrayList <Circle2> circles = new ArrayList();
        
        //instantiates instances of various circle classes
        Circle2 circle = new Circle2(9, 6, 5);
        Circle2 cylinder = new Cylinder2(7, 4, 2, 6);
        Circle2 oval = new Oval2(8, 2, 2, 4);
        Oval2 ovalCylinder = new OvalCylinder2(3, 2, 7, 4, 5);
        
        //assigns objects to the circles arrayList
        circles.add(circle);
        circles.add(cylinder);
        circles.add(oval);
        circles.add(ovalCylinder);
        
        //for each loop - traverses circles array and passes each object to the getCenter method before calling it
        for (Circle2 c : circles)
        {
            showCenter(c); 
        }
    }
}
