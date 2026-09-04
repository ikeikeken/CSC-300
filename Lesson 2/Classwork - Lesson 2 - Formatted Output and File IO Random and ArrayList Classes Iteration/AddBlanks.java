import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class AddBlanks 
{
	public static String addBlanks(String msg)
	{
		String addedBlanksMsg = new String();// creates an empty string of length zero;
		for(int i= 0; i<msg.length();i++)
		{
			addedBlanksMsg = addedBlanksMsg+ msg.charAt(i);
			if(i%4 == 3)
				addedBlanksMsg = addedBlanksMsg +' ';
		}
		return addedBlanksMsg;
	}
			
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String message, inputFileName, outputFileName;
		System.out.printf("Please enter the input file name: ");
		inputFileName = keyboard.next();
		File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
		
		if(!inputFile.exists())
		{
			System.out.println("Input File " + inputFileName + " not found");
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		System.out.printf("Please enter the output file name: ");
		outputFileName = keyboard.next();
		File outputFile = new File (outputFileName); //housekeeping to create target file printer
		PrintWriter outputWriter = new PrintWriter(outputFile);
				
		while (inputReader.hasNext())
		{
			message = inputReader.nextLine();
			outputWriter.printf("%s\n", addBlanks(message));
		}
		inputReader.close();
		outputWriter.close();
	}
}