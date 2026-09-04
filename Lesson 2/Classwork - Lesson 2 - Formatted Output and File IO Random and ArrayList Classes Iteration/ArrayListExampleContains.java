import java.util.ArrayList;

public class ArrayListExampleContains 
{
   public static void main(String[] args) {
      
      // create an empty array list with an initial capacity
      ArrayList<Integer> arrlist = new ArrayList<>(8);

      // use add() method to add elements in the list
      arrlist.add(20);
      arrlist.add(25);
      arrlist.add(10);
      arrlist.add(15);        
          
      // let us print all the elements available in list
      for (Integer number : arrlist) 
      {
         System.out.printf("Number = %d\n", number);
      }

      // list contains element 10
      boolean retval = arrlist.contains(10); 
        
      if (retval == true) 
      {
         System.out.printf("Element 10 is contained in the list\n");
      } 
      else 
      {
         System.out.printf("Element 10 is not contained in the list\n");
      }
         
      // list does not contain element 30
      boolean retval2 = arrlist.contains(30);
        
      if (retval2 == true) 
      {
         System.out.printf("Element 30 is contained in the list\n");
      } 
      else 
      {
         System.out.printf("Element 30 is not contained in the list\n");    
      }
   }
}