import java.util.Scanner;
import java.util.Random;
public class RandomArrayBoolean 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void booleanFull(boolean x[][])
	{
		Random randy = new Random();
		for (int i=0;i<x.length;i++)
		{
			for(int j =0; j<x[i].length;j++)
			{
				x[i][j] = randy.nextBoolean();
			}
		}
	}
	public static double calcPercent(boolean [][] x)
	{
		double percentage;
		int total=0;
		for (int i=0;i<x.length;i++)
		{
			for(int j =0; j<x[i].length;j++)
			{
				if (x[i][j] ==true)
					total = total + 1;
			}
		}
		percentage= (100.0*total)/(x.length*x[0].length);
		return percentage;
	}
	
	public static void main(String[] args) 
	{
		boolean [][] bArray;
		double percent;
		int numRows,numCols;
		System.out.printf("The number of rows and columns in the array: ");
		numRows= keyboard.nextInt();
		numCols = keyboard.nextInt();
		bArray=new boolean [numRows][numCols];
		booleanFull(bArray);
		percent=calcPercent(bArray);
		for (int i=0;i<bArray.length;i++)
		{
			for(int j =0; j<bArray[0].length;j++)
			{
				System.out.printf("%6b", bArray[i][j]);
			}
			System.out.printf("\n");
		}
		
		System.out.printf("The percent that are true is: %01.2f%%\n", percent);
	}
}