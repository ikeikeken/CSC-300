import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
public class ReverseOrderIntegersWithArrayList
{
	
	public static void main (String [] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the file name containing a list of integers: ");
	    String inputFileName = keyboard.next();
	    File inputFile = new File(inputFileName);
	    int tempInt, currentSize;
	    boolean valueEntered = false;
	    if(!inputFile.exists())
	    {
	    	System.out.printf("The file %s does not exist\n", inputFileName);
	    	System.exit(0);
	    }
	    Scanner inputReader = new Scanner(inputFile);
	    
	    ArrayList<Integer> numberList = new ArrayList<Integer>();
	    if(!inputReader.hasNext())
	    	System.out.printf("The file %s has no entries\n", inputFileName);
	    else 
	    {
	   
	    	tempInt = inputReader.nextInt();
	    	numberList.add(tempInt);
			//Now that we have entered the first number the rest can be added directly into their spot
	    	while (inputReader.hasNext())
	    	{
	    		tempInt = inputReader.nextInt();
	    		currentSize = numberList.size();
	    		for (int i=0; i < currentSize; i++)
	    		{
	    			if (tempInt > numberList.get(i)) //Checking to see if it needs to be inserted in middle
	    			{
	    				numberList.add(i, tempInt);
	    				valueEntered = true;
	    				break;
	    			}
	    		}
	    		if(valueEntered == false) //Number will be added to the end.
	    		{
	    			numberList.add(tempInt);	
	    		}
	    		valueEntered = false;
	    	}
	    }
	    inputReader.close();
	    System.out.printf("Output Using Enhanced For:\n");
	    for(Integer nextNum: numberList)
	    	System.out.printf("%d\n", nextNum);
	    
	    // Create an iterator for the list
	    Iterator<Integer> iterOnNumbers = numberList.iterator();
	    System.out.printf("Output Using The Iterator:\n");
	    while ( iterOnNumbers.hasNext() )//doesn't move the pointer
	    	System.out.printf("%d\n", iterOnNumbers.next());
	    
	}
}		