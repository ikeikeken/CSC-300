import java.util.Random;
public class DiceRollSimRandomClass
{
	public static void main (String[] args)
	{
		int [ ] rollCounter = new int[11];
		int diceValue1, diceValue2, rollValue;
		Random randy = new Random();
		for (int i =0; i<100000; i++)
		{ 
			diceValue1 = randy.nextInt(1, 7);
			diceValue2 = randy.nextInt(1, 7);
			rollValue = diceValue1+diceValue2;
			rollCounter[rollValue-2] = rollCounter[rollValue-2] +1;
		}
		System.out.println("Roll   Count");
		for (int i =0; i<rollCounter.length; i++)
			System.out.printf("%3d%9d\n", (i+2), rollCounter[i]);
	}
}
