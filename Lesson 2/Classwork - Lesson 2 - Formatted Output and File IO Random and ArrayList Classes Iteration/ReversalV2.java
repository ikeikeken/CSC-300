import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class ReversalV2 
{
	public static String reverser2(String msg)
	{
		String reversedMsg = new String();// creates an empty string of length zero;
		for(int i=0; i<msg.length(); i++)
		{
			reversedMsg = msg.charAt(i) + reversedMsg; //inserts characters at beginning going from beginning to end
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
			outputWriter.printf("%s\n", reverser2(message));
		}
		inputReader.close();
		outputWriter.close();
	}
}