//encrypts a message using a Caesar Cypher Reading From an input file
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class CaesarCipherFromFile 
{
	public static Scanner keyboard = new Scanner(System.in); //Note this is global for the class
	public static String encrypt(String msg, int shift)
	{
		String encryptedMessage = new String();// creates an empty string of length zero;
		msg = msg.toUpperCase();  
		for(int i=0; i < msg.length(); i++)
		{
			char ch = msg.charAt(i);
			if(ch >= 'A' && ch <='Z')  // only including letters, no punctuation or numbers or whitespace
			{
				int oldPositionInAlphabet = ch - 'A';
				int newPositionInAlphabet = (oldPositionInAlphabet + shift)%26;
				encryptedMessage = encryptedMessage +(char)(newPositionInAlphabet +'A');
			}
		}
		return encryptedMessage;
	}
			
	public static void main(String[] args) throws IOException
	{
		//Create the input file
		System.out.printf("Please enter name of file to encrypt: ");
		String inputFileName=keyboard.next();
		
		File inputFile = new File(inputFileName); //housekeeping to create target file input scanner
		
		if(!inputFile.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFileName);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		
		// Create the Output File
		System.out.printf("Please enter name of file to write encryption to: ");
		String outputFileName=keyboard.next();
		File outputFile = new File (outputFileName); //housekeeping to create target file printer
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		System.out.print("Enter an integer in the range of 0-25 ");
		int shift = keyboard.nextInt();
		
		while (inputReader.hasNext())
		{
			String message = inputReader.nextLine();
			
			outputWriter.printf("%s\n", encrypt(message, shift));
		}
		inputReader.close();
		outputWriter.close();
	}
}