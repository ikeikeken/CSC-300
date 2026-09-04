import java.util.*;
public class DiceRollSim
{
	public static void main (String[] args)
	{
		int [ ] roll_counter = new int[11];
		int dice_value1, dice_value2, roll_value;;
				
		for (int i =0; i<100000; i++)
		{ 
			dice_value1 = (int)(6*Math.random() + 1);
			dice_value2 = (int)(6*Math.random() + 1);
			roll_value = dice_value1+dice_value2;
			roll_counter[roll_value-2] = roll_counter[roll_value-2] +1;
		}
		System.out.printf("Roll\tCount\n");
		for (int i =0; i<roll_counter.length; i++)
			System.out.printf("%3d\t%3d\n", (i+2),roll_counter[i]);
	}
}
