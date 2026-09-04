//encrypts a message using a Caesar Cypher
import java.util.Scanner;
public class CaesarCipher 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static String encrypt(String msg, int shift)
	{
		String encryptedMessage = new String();// creates an empty string of length zero;
		msg = msg.toUpperCase();  //Converts to upper case
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
	public static void main(String[] args) 
	{
		System.out.printf("Enter a message on one line: ");
		String message = keyboard.nextLine();
		System.out.printf("Enter an integer in the range of 0-25: ");
		int shift = keyboard.nextInt();
		System.out.printf("The encrypted message is %s\n", encrypt(message, shift));
		System.out.printf("The pre-encrypted message is %s\n", message);
	}
}