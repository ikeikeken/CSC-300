//Hard Coded input file
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TestFileInput
{
	public static void main (String[] args) throws IOException
	{
		File inputFile = new File("quotations.txt");//This is hard code, not the best apoproach
		if(!inputFile.exists())
		{
			System.out.printf("File quotations.txt not found.\n");
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		String line;
		while (inputReader.hasNext())
		{
			line = inputReader.nextLine();
			System.out.printf("%s\n", line);
		}
		inputReader.close();
	}
}