/* CoinPurseTester
   Anderson, Franceschi Modified by Rosenthal
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
public class CoinPurseTester 
{
	public static void main( String [] args ) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file: ");
		String inputFileName = keyboard.nextLine();
		File inputFile = new File(inputFileName);
		if(!inputFile.exists())
	    {
	    	System.out.printf("The file %s does not exist", inputFileName);
	    	System.exit(0);
	    }
	    Scanner inputReader = new Scanner(inputFile); 
	    
	    ArrayList<CoinPurse> purseList = new ArrayList<>();
	    int quarters, dimes, nickels, pennies;
	    CoinPurse tempCoinPurse;
	    while(inputReader.hasNextInt())
	    {
	    	quarters = inputReader.nextInt();
	    	dimes = inputReader.nextInt();
	    	nickels = inputReader.nextInt();
	    	pennies = inputReader.nextInt();
	    	tempCoinPurse = new CoinPurse(quarters, dimes, nickels, pennies);
	    	purseList.add(tempCoinPurse);
	    }
	    int numPurses = purseList.size();
	    
		for(int i=0; i < numPurses; i++)
		{
			System.out.printf("Coin purse %d has the following coins and values:\n", (i+1));
			System.out.printf("%s", purseList.get(i));
			System.out.printf("Money from quarters is $%.2f\n", purseList.get(i).moneyFromQuarters());
			System.out.printf("Money from dimes is $%.2f\n", purseList.get(i).moneyFromDimes());
			System.out.printf("Money from nickels is $%.2f\n", purseList.get(i).moneyFromNickels());
			System.out.printf("Money from pennies is $%.2f\n", purseList.get(i).moneyFromPennies());
			System.out.printf("Total money is $%.2f\n\n", purseList.get(i).totalAmount());
		}
		for(int i=1; i<numPurses; i++)
		{
			if ( purseList.get(0).equals( purseList.get(i)) )
			  System.out.printf( "Purse 1 and Purse %d are equal\n", (i+1) );
			else
			  System.out.printf( "Purse 1 and Purse %d are not equal\n", (i+1) );
		}
	}
}