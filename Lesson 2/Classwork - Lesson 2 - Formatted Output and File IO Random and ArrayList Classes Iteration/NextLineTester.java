import java.util.Scanner;
public class NextLineTester 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String message1 = null, message2 =null;
		int shift1, shift2;
		System.out.printf("Enter a message on one line: ");
		message1 = keyboard.nextLine();
		System.out.printf("Enter a shift value: ");
		shift1 = keyboard.nextInt();
		System.out.printf("The message %s shifts %d\n", message1, shift1);
		
		System.out.printf("Enter a shift value: ");
		shift2 = keyboard.nextInt();
		System.out.printf("Enter a message on one line: ");
		//keyboard.nextLine();
		message2 = keyboard.nextLine();
		System.out.printf("The message %s shifts %d\n", message2, shift2);
	}
}