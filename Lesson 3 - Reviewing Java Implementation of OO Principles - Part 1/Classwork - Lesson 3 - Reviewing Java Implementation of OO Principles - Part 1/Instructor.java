public class Instructor
{
   private String lastName;     // Last name   
   private String firstName;    // First name
   private String officeNumber; // Office number

   public Instructor(String lName, String fName, String office)
   {
      setLastName(lName);
      setFirstName(fName);
      setOfficeNumber(office);
   }
   
   public Instructor(Instructor object2)
   {
      setLastName(object2.lastName);
      setFirstName(object2.firstName);
      setOfficeNumber(object2.officeNumber);
   }
   
   public void setLastName(String lName)
   {
   	   lastName = lName;
   }
   
   public void setFirstName(String fName)
   {
   	   firstName = fName;
   }
   
   public void setOfficeNumber(String offNum)
   {
   	   officeNumber = offNum;
   }
   
   public String getLastName()
   {
   	   return lastName;
   }
   
   public String getFirstName()
   {
   	    return firstName;
   }
   
   public String getOfficeNumber()
   {
   	   return officeNumber;
   }


   public String toString()
   {
      // Create a string representing the object.
      String str = String.format("Last Name: %s\nFirst Name: %s\n", lastName, firstName);
      str = str + String.format("Office Number: %s\n",officeNumber);
      // Return the string.
      return str;
   }
}