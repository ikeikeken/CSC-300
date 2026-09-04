import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class Reversal 
{
	public static String reverser(String msg)
	{
		String reversedMsg = new String();// creates an empty string of length zero;
		for(int i=(msg.length()-1); i>=0; i--)
		{
			reversedMsg = reversedMsg+ msg.charAt(i); //appends characters in reversed order from the end
		}
		
		return reversedMsg;
	}
			
	public static void main(String[] args) throws IOException
	{
		String message;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file: \n");
		String inputFileName = keyboard.next();
		File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s not found\n", inputFileName);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		
		System.out.printf("Please enter the name of the output file: \n");
		String outputFileName = keyboard.next();
		File outputFile = new File (outputFileName); //housekeeping to create target file printer
		PrintWriter outputWriter = new PrintWriter(outputFile);
				
		while (inputReader.hasNext())
		{
			message = inputReader.nextLine();
			outputWriter.printf("%s\n", reverser(message));
		}
		inputReader.close();
		outputWriter.close();
	}
}