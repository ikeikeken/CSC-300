import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;
public class IntegersInArrayList
{
  public static void main ( String[] args)
  {
    int sumIter = 0, sumEnhanced = 0;
  	Scanner keyboard = new Scanner(System.in);
  	// Create and populate the list
    ArrayList<Integer> intList = new ArrayList<Integer>();
    System.out.printf("Please enter a seed:\n");
    int seed = keyboard.nextInt();
    Random randy = new Random(seed);
    for (int i=0; i <10; i++)
    {
    	intList.add(randy.nextInt(10,30));
    }
    	
    System.out.printf("%s\n", intList);		

    // Create an iterator for the list
    Iterator<Integer> iterOnNumbers = intList.iterator();

    // Use the iterator to visit each element
    System.out.printf("Using the Iterator:\n");
    while ( iterOnNumbers.hasNext() )//doesn't move the pointer
      sumIter = sumIter + iterOnNumbers.next();
    System.out.printf("The sum of the integers using iterator is %d\n", sumIter);
  
    System.out.printf("\nUsing the Enhanced For loop:\n");
    for ( Integer nextNum : intList )
    	sumEnhanced = sumEnhanced + nextNum;
    System.out.printf("The sum of the integers using enhance for is %d\n", sumEnhanced);
      
  }
}