import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class AlphabetizeV2
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void maxSort(String[] x, int size) 
	{ 
		 int swap_index;
		 String temp;
		 for(int i = (size-1); i >=0; i--)
		{
			swap_index = max(x, i);
			temp = x[i];
			x[i] = x[swap_index];
			x[swap_index] = temp;
			
		}
	}
	
	public static int max(String [] y, int biggest_index)
	{
		String max_value = y[biggest_index];
		int index_max = biggest_index;
		for(int i = 0; i < biggest_index; i++)
		{
			if (y[i].compareToIgnoreCase(max_value) >0)
			{
				max_value = y[i];
				index_max = i;
			}
		}
		return index_max;
	}
	
	public static void main (String[] args) throws IOException
	{
		//Set up input and ouput files
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
	    
		int size_of_array, no_of_entries;
		String input;
		System.out.printf("Please enter the size of the array:\n");
		size_of_array = keyboard.nextInt();
		String [ ] newArray = new String[size_of_array];
		
		no_of_entries = 0;
		while (inputReader.hasNext() && (no_of_entries <size_of_array))
		{
			newArray[no_of_entries] = inputReader.next();
			no_of_entries = no_of_entries+1;
		}
		maxSort(newArray, no_of_entries);
		outputWriter.printf("The ordered list of names is:\n");
		for(int i=0; i < no_of_entries; i++)
			outputWriter.printf("%s\n", newArray[i]);
		
		inputReader.close();
		outputWriter.close();
		
	}
}
