public class BasicPersonDriver
{
	public static void main(String[] args)
   {
      // call the constructor to create a new person
      BasicPerson p1 = new BasicPerson("Sana", "sana@gmail.com", "123-456-7890");
      BasicPerson p2 = new BasicPerson("Jean", "jean@gmail.com", "404 899-9955");

      BasicPerson.printBasicPersonCounter();
      System.out.printf("Directly getting basicPersonCounter value: %d\n", BasicPerson.basicPersonCounter);
   }
   }