import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class NameSubstrings
{
     
     public static String [] noFirst(String [] names, int rowsOfNames)
     {
          String [] subNames = new String[rowsOfNames];
          for(int i=0; i < rowsOfNames; i++)
          	  subNames[i] = names[i].substring(1);
          return subNames;
     }

     public static void main (String args []) throws IOException
     {
          
          Scanner keyboard = new Scanner(System.in);
          System.out.printf("Enter the name input file name: ");
          String namesFile = keyboard.next();
          File inputFile = new File(namesFile);
          if (!inputFile.exists())
          {
               System.out.println("Error: "+ namesFile + " not found");
               System.exit(0);
          }
          Scanner inputReader = new Scanner(inputFile);
          //Open a new file for output
          System.out.printf("Enter substring of names output file name: ");
          String outputsubNamesFile = keyboard.next();
          File outputFile= new File(outputsubNamesFile);
		  PrintWriter outputWriter = new PrintWriter(outputFile);
		  
		  String [] nameArray = new String [100];
          String [] subNameArray;
		  int entry = 0;
          while(inputReader.hasNext()) //encrypt the file line by line
          {
               nameArray[entry] = inputReader.next();
               entry = entry + 1;
               
          }
          subNameArray = noFirst(nameArray, entry);
          for(int i = 0; i < entry; i++)
          {
          	  outputWriter.printf("%s\t%s\n", nameArray[i], subNameArray[i]);
          }
          inputReader.close();
          outputWriter.close();
     }
}
