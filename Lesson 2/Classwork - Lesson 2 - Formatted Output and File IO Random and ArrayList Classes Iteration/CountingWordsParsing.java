import java.util.Scanner;
public class CountingWordsParsing 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String [] wordArray;
		String message;
		
		System.out.printf("Single space example\n");
		System.out.printf("Enter a message on one line: ");
		message = keyboard.nextLine();
		wordArray = message.split(" ");
		System.out.printf("The message is %d words long.\n", wordArray.length);
		for(int i = 0; i<wordArray.length; i++)
			System.out.printf("%s ", wordArray[i]);
		
		System.out.printf("\nSingle character various types example\n");
		System.out.printf("Enter a message on one line: ");
		message = keyboard.nextLine();
		wordArray = message.split("[ .,?!]");
		System.out.printf("The message is %d words long.\n", wordArray.length);
		for(int i = 0; i<wordArray.length; i++)
			System.out.printf("%s ", wordArray[i]);
		
		System.out.printf("\nMulti space example\n");
		System.out.printf("Enter a message on one line: ");
		message = keyboard.nextLine();
		wordArray = message.split(" +");
		System.out.printf("The message is %d words long.\n", wordArray.length);
		for(int i = 0; i<wordArray.length; i++)
			System.out.printf("%s ", wordArray[i]);
		
		System.out.printf("\nMulti character example\n");
		System.out.printf("Enter a message on one line: ");
		message = keyboard.nextLine();
		wordArray = message.split("[ .,?!]+");
		System.out.printf("The message is %d words long.\n", wordArray.length);
		for(int i = 0; i<wordArray.length; i++)
			System.out.printf("%s ", wordArray[i]);
	}
}