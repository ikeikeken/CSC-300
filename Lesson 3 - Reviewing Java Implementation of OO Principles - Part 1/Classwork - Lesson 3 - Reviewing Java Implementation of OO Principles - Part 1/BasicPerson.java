public class BasicPerson
{
   // instance variables
  
   private String name;
   private String email;
   private String phoneNumber;

   // Static counter variable
   public static int basicPersonCounter = 0;

   

   // constructor: construct a Person copying in the data into the instance variables
   public BasicPerson(String initName, String initEmail, String initPhone)
   {
      setName(initName);
      setEmail(initEmail);
      setPhoneNumber(initPhone);
      incrementBasicPersonCounter();
   }
   public void setName(String initName)
   {
   	   name = initName;
   }
   
   public void setEmail(String initEmail)
   {
   	   email = initEmail;
   }
   
   public void setPhoneNumber(String phone)
   {
   	   phoneNumber = phone;
   }
   
   public void incrementBasicPersonCounter()
   {
   	   basicPersonCounter++;
   }
   
   // static method to print out counter
   public static void printBasicPersonCounter() {
        System.out.printf("Person counter: %d\n", basicPersonCounter);
   }
   
}