import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class FileHeadDisplay
{
   public static void main(String[] args) throws IOException
   {
   	   
       Scanner keyboard = new Scanner(System.in);
       int lineCount; 
       String line;
       System.out.printf("Please enter name of file to read from: ");
	   String inputFileName=keyboard.next();
	   File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
		
	   if(!inputFile.exists())
	   {
	   	   System.out.printf("Input File %s was not found.\n", inputFileName);
	   	   System.exit(0);
	   }
	   Scanner inputReader = new Scanner(inputFile);
	   
	   System.out.printf("Please enter name of file to write to: ");
	   String outputFileName=keyboard.next();
	   File outputFile = new File(outputFileName); //housekeeping to create target file input scanner
	   PrintWriter outputWriter = new PrintWriter(outputFile);
	   
	   lineCount = 1;
	   
	   while (inputReader.hasNext() && lineCount <= 5)
	   {
	   	   line = inputReader.nextLine();
	   	   System.out.printf("%s\n",line);
	   	   outputWriter.printf("%s\n",line);
	   	   lineCount++;
	   }
      inputReader.close();
      outputWriter.close();
   }
}