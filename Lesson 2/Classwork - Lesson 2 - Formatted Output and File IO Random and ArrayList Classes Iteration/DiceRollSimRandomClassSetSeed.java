import java.util.Scanner;
import java.util.Random;
public class DiceRollSimRandomClassSetSeed
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int [ ] rollCounter = new int[11];
		int diceValue1, diceValue2, rollValue;
		System.out.printf("Please enter the seed for the random generator: ");
		long seed = keyboard.nextLong();;
		Random randy = new Random();
		randy.setSeed(seed);
		for (int i =0; i<100000; i++)
		{ 
			diceValue1 = randy.nextInt(1, 7);
			diceValue2 = randy.nextInt(1, 7);
			rollValue = diceValue1+diceValue2;
			rollCounter[rollValue-2] = rollCounter[rollValue-2] +1;
		}
		System.out.println("Roll\tCount");
		for (int i =0; i<rollCounter.length; i++)
			System.out.printf("%3d%9d\n", (i+2), rollCounter[i]);
	}
}
