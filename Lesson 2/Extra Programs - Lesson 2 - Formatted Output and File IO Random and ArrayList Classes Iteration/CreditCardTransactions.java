import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreditCardTransactions
{
	public static void main (String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		double mostExpensive =0.0, inputCost;
		String mostExpensiveItem = new String();
		System.out.printf("Please enter credit card transactions file name: ");
		String inputFileName = keyboard.next();
		File inputFile = new File(inputFileName);
		if(!inputFile.exists())
		{
			System.out.printf("The file %s does not exist", inputFileName);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		String item = new String();
		while (inputReader.hasNext())
		{
			item = inputReader.next();
			inputCost = inputReader.nextDouble();
			if (inputCost >= mostExpensive)
			{	
				mostExpensiveItem = item;
				mostExpensive = inputCost;
			}
		}
		inputReader.close();
		
		System.out.printf("The most expensive item is %s at $%01.2f\n", mostExpensiveItem, mostExpensive);
	}
}