import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class CreateBusiness
{
	public static void main(String [] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file with employee name and data: \n");
	
		String inputFileName = keyboard.next();
		File inputFile = new File(inputFileName);
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFileName);
			System.exit(0);
		}
		
		Scanner inputReader = new Scanner(inputFile);
		//Create the output file
		System.out.printf("Please enter the name of the output file: ");
		String outputFileName = keyboard.next();
		File outputFile = new File (outputFileName);
		PrintWriter outputWriter = new PrintWriter(outputFile);
		Business myBusiness = new Business(keyboard, inputReader, outputWriter);
	}
}