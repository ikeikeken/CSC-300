import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class PopulationData
{
	public static void getDataFromFile(ArrayList<Integer> pop, String inputFileName) throws IOException
	{    
   	  //note: will are getting a reference to the array which we then fill.  Main is looking at the same array
     
   	  int index = 0;// used to control the looping 
   	  // Open the file.
      File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
      if(!inputFile.exists())
      {
      	  System.out.printf("Input File %s was not found.\n", inputFileName);
      	  System.exit(0);
      }
      Scanner inputReader = new Scanner(inputFile);
      
		// Read the file contents into the ArrayList.
      while (inputReader.hasNext())
      {
         pop.add(inputReader.nextInt());
      }
   
      // Close the file.
      inputReader.close();
   }  

   public static double getAverageChange(ArrayList<Integer> pop)
   {
   	   int total = 0;
   	   int difference = 0;
   	   for (int i = 0; i < pop.size() - 1; i++)
   	   {
   	   	   difference = pop.get(i + 1) - pop.get(i);
   	   	   total += difference;
   	   }
   	   return (double)(total)/( pop.size() - 1);
   }
     
   public static int getHighestIndex(ArrayList<Integer> pop)
   {
   	   int highest = pop.get(1) - pop.get(0);
   	   int difference = 0;
   	   int index = 0;
   	   for (int i = 1; i < pop.size() - 1; i++)
   	   {
   	   	   difference = pop.get(i + 1) - pop.get(i);
   	   	   if (difference > highest)
   	   	   {
   	   	   	   highest = difference;
   	   	   	   index = i + 1;
   	   	   }
   	   }
   	   return index;
   }  

   public static int getLowestIndex(ArrayList<Integer> pop)
   {
   	   int lowest = pop.get(1) - pop.get(0);
   	   int difference = 0;
   	   int index = 0;
   	   for (int i = 1; i < pop.size() - 1; i++)
   	   {
   	   	   difference = pop.get(i + 1) - pop.get(i);
   	   	   if (difference < lowest)
   	   	   {
   	   	   	   lowest = difference;
   	   	   	   index = i + 1;
   	   	   }
   	   }
   	   return index;
   }  
   
   public static void main(String[] args) throws IOException
   {
      // Constants for the array size.
      final int YEAR_START = 1950;
      final int YEAR_END = 1990;
      
      // Create an array to hold the population data.
      ArrayList<Integer> population = new ArrayList<>();;
      
      Scanner keyboard = new Scanner(System.in);
      System.out.printf("Please enter name of file with Population data: ");
	  String inputFileName = keyboard.next();
     
	  // Get the population data from the file.
      getDataFromFile(population,inputFileName);
      
      double average = getAverageChange(population);
      int greatest = getHighestIndex(population) + YEAR_START;
      int smallest = getLowestIndex(population) + YEAR_START;
		
      // Display the average annual 
      // change in population.
      System.out.printf("The average annual change in population from %d through %d was %,6.2f\n",  
								 YEAR_START, YEAR_END, average);
								 
      // Display the year with the 
      // greatest increase in population.
      System.out.printf("The year with the greatest increase in population from %d through %d was %d\n", YEAR_START, YEAR_END, greatest);
      
      // Calculate and display the year with the 
      // smallest increase in population.
      System.out.printf("The year with the smallest increase in population from %d through %d was %d\n", YEAR_START, YEAR_END, smallest);	
   }
}