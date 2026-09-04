import java.util.Scanner;
import java.util.ArrayList;
public class CharacterArrayListExample
{
	public static ArrayList<Character> intoArrayList(StringBuilder sb)
	{
		char cx;
		ArrayList<Character> charList = new ArrayList<Character>();
		for(int i = 0; i < sb.length(); i++)
			{
				cx = sb.charAt(i);
				charList.add(cx); // These two seps could be done as one step
			}
			return charList;
	}
	public static int charSum(ArrayList<Character> cList)
	{
		int sum = 0;
		for (int i = 0; i < cList.size(); i++)
		{
			sum = sum + cList.get(i);
		}
		return sum;
	}
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.printf("Please enter a String of any length:\n");
		String str1 = new String(keyboard.nextLine());
		StringBuilder sbNew = new StringBuilder(str1);
		ArrayList<Character> myCharList = intoArrayList(sbNew);
		int sumCharsUnicodeValues = charSum(myCharList);
		for(int i = 0; i < myCharList.size(); i++)
		{
			System.out.printf("%5s", myCharList.get(i));
		}
		System.out.printf("\n");
		for(int i = 0; i < myCharList.size(); i++)
		{
			System.out.printf("%5d", (int)myCharList.get(i));
		}
		System.out.printf("\n");
		System.out.printf("The sum of the Unicode values is %d\n", sumCharsUnicodeValues);
	}
}