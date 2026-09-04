import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class Alphabetize
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void maxSort(String[] x, int size) 
	{ 
		 int swapIndex;
		 String temp;
		 for(int i = (size-1); i >=0; i--)
		{
			swapIndex = max(x, i);
			temp = x[i];
			x[i] = x[swapIndex];
			x[swapIndex] = temp;
			
		}
	}
	public static int max(String [] y, int biggestIndex)
	{
		String maxValue = y[biggestIndex];
		int indexMax = biggestIndex;
		for(int i = 0; i < biggestIndex; i++)
		{
			if (y[i].compareToIgnoreCase(maxValue) >0)
			{
				maxValue = y[i];
				indexMax = i;
			}
		}
		return indexMax;
	}
	
	public static void main (String[] args) throws IOException
	{
		//Set up inpit and ouput files
	    System.out.printf("What is the name of your input file of random last names: ");
	    String inputFileName = keyboard.next();
	    File inputFile = new File(inputFileName);
	    if(!inputFile.exists())
	    {
	    	System.out.printf("The file %s does not exist", inputFileName);
	    	System.exit(0);
	    }
	    Scanner inputReader = new Scanner(inputFile);
	    System.out.printf("What is the name of your output file for the last names: ");
	    String outputFileName = keyboard.next();
	    File outputFile = new File(outputFileName);
	    PrintWriter outputWriter = new PrintWriter(outputFile);
	    
		int sizeOfArray, numOfEntries;
		String input;
		System.out.printf("Please enter the size of the array: ");
		sizeOfArray = keyboard.nextInt();
		String [ ] newArray = new String[sizeOfArray];
		numOfEntries = sizeOfArray;
		
		for(int i = 0; i < sizeOfArray; i++)
		{ 
			if(!inputReader.hasNext())
			{
				numOfEntries = (i);
				break;
			}
			else
			{
				newArray[i] = inputReader.next();
			}
		}
		maxSort(newArray, numOfEntries);
		outputWriter.printf("The ordered list is:\n");
		for(int i=0; i < numOfEntries; i++)
			outputWriter.printf("%s\n", newArray[i]);
		
		inputReader.close();
		outputWriter.close();
		
	}
}
