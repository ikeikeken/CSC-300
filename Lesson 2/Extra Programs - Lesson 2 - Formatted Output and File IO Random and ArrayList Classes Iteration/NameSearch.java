import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class NameSearch
{  
   private static String[] getArray(String inputFileName) throws IOException
   {  	   
   	   File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
   	   if(!inputFile.exists())
   	   {
   	   	   System.out.printf("Input File %s was not found.\n", inputFileName);
   	   	   System.exit(0);
   	   }
      
      int arraySize = getNumNames(inputFile);
      String [] nameArray = new String [arraySize];
      
      // Create the necessary objects for file input.
      Scanner inputReader = new Scanner(inputFile);

      // Read the items from the file.
      for (int i = 0; i < arraySize; i++)
      {
         nameArray[i] = inputReader.nextLine();
      }

      // Close the file.
      inputReader.close();

      return nameArray;
   }

   

    private static int getNumNames(File fileName) throws IOException
   {  	   
   	   String input; // for dummy reading in of the lines
   	   Scanner inputReader = new Scanner(fileName);
      int count = 0;
      while (inputReader.hasNext())
      {
         count++;
         input = inputReader.nextLine();
      }

      // Close the file.
      inputReader.close();

      return count;
   }
    
   /*
      The isFound method returns true if the item is found in
      the array. Otherwise, it returns false.
   */
   
   private static boolean isFound(String item, String[] array)
   {
      boolean status = false; // Set the status to false.

      // Search the array for the item.
      for (String items : array)
      {
         // If the item is found, set status to true.
         if (items.equalsIgnoreCase(item))
         {
            status = true;
         }
      }

      // Return the status.
      return status;
   }
	
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
   	  String boyName;   //holds the name of a boy
      String girlName;  //holds the name of a girl
      String boyFileName; //holds the name of the boy's file
      String girlFileName; //holds the name of the boy's file
      String [] boyNames; //The array of boy names
      String [] girlNames; // The array og girl names
      String findAnotherName; //indicate you want to find another name

      // Create an array filled with boy names from the file.
      System.out.printf("Please enter the name of the boy's file: ");
      boyFileName = keyboard.nextLine();
      
      boyNames = getArray(boyFileName);

      // Create an array filled with girl names from the file.
      
      System.out.printf("Please enter the name of the girl's's file: ");
      girlFileName = keyboard.nextLine();
      
      girlNames = getArray(girlFileName);
      
      System.out.printf("Do you want to search for names? Enter Y or N: ");
      findAnotherName = keyboard.nextLine();
      while(findAnotherName.equalsIgnoreCase("y"))
      {
		  // Get the boy's name as input from the user.
		  System.out.printf("Enter a boy's name, or N if you do not wish to enter a boy's name: ");
		  boyName = keyboard.nextLine();
	
		  // Get the girl's name as input from the user.
		  System.out.printf("Enter a girl's name, or N if you do not wish to enter a girl's name: ");
		  girlName = keyboard.nextLine();
	
		  // Display the result for the boy's name entered by user.
		  if (boyName.equalsIgnoreCase("N"))
		  {
			 System.out.printf("You chose not to enter a boy's name.\n");
		  }
		  else if (isFound(boyName, boyNames))
		  {
			 System.out.printf("%s is one of the most popular boy's names.\n", boyName);
		  }
		  else
		  {
			 System.out.printf("%s is not one of the most popular " +
							   "boy's names.\n", boyName);
		  }
	
		  // Display the result for the girl's name entered by user.
		  if (girlName.equalsIgnoreCase("N"))
		  {
			 System.out.printf("You chose not to enter a girl's name.\n");
		  }
		  else if (isFound(girlName, girlNames))
		  {
			 System.out.printf("%s is one of the most popular girl's names.\n", girlName);
		  }
		  else
		  {
			 System.out.printf("%s is not one of the most popular girl's names.\n", girlName);
		  }
		  System.out.printf("Do you want to search for names? Enter Y or N: ");
		  findAnotherName = keyboard.nextLine();
	  }
   }
}