//An example of appending to a file
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class AppendingToAFile 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String toRead;
		System.out.printf("Please enter name of file to append to: ");
		String outputFileName=keyboard.nextLine();
		
		FileWriter outputFile = new FileWriter(outputFileName, true); 
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		for(int i = 0; i < 5; i++)
		{
			System.out.printf("Enter String to append to the file: ");
			toRead = keyboard.nextLine();
			outputWriter.printf("%s\n", toRead);
		}

		outputWriter.close();
	}
}