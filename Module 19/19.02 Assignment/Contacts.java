/**
 * Purpose: Implementation class to define a contact object
 *
 * @author Jared Campisi
 * @version April 28th 2018
 */
public class Contacts
{
    //instance variables
    private String name;
    private String relation;
    private String birthday;
    private String phoneNumber;
    private String emailAddress;
    
    //constructor for objects of class Contacts
    public Contacts(String name, String relation, 
                    String birthday, String phoneNumber, String emailAddress)
    {
        //initialize instance variables
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public void setRelation(String relation)
    {
        this.relation = relation;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    
    public String getPhone()
    {
        return phoneNumber;
    }
    
    public void setPhone(String phoneNuber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail()
    {
        return emailAddress;
    }
    
    public void setEmail(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    
    public String toString()
    {
        String str = getName() + "   " + getRelation() + "   " + getBirthday() + "   " + getPhone() + "   " + getEmail();
        return str;
    }
}
