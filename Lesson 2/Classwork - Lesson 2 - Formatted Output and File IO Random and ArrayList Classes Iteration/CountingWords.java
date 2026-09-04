import java.util.Scanner;
public class CountingWords 
{
	public static Scanner keyboard = new Scanner(System.in);
	
	public static int wordCount(String msg)
	{
		int words=0; 
		boolean newWord=true, lengthAtLeastOne=false;
		for(int i=0; i < msg.length(); i++)
		{
			char ch = msg.charAt(i);
			if(((ch>='A')&&(ch<='Z'))|| ((ch>='a')&&(ch<='z')))
			{	
				newWord=false;
				lengthAtLeastOne=true;
			}
			if(((ch<'A')||((ch>'Z')&&(ch<'a'))|| (ch>'z') || (i==msg.length()-1)) && (newWord==false) && (lengthAtLeastOne==true))
			{			
				words = words+1;
				newWord = true;
				lengthAtLeastOne =false;
			}	
		}
		return words;
	}
		
	public static void main(String[] args) 
	{
		System.out.printf("Enter a message on one line: ");
		String message = keyboard.nextLine();
		System.out.printf("The message is %s words long.\n", wordCount(message));
			
	}
}