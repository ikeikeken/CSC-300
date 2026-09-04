import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class CollegeTranscript
{
	public static void main (String[] args) throws IOException
	{
		double gpaSum =0.0, gpa;
		int numberOfGrades = 0, lineLength;
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the input file for the transcripts: ");
		String inputFileName = keyboard.nextLine();
		File inputFile = new File(inputFileName);
		
		if(!inputFile.exists())
		{
			System.out.printf("%s file not found\n", inputFileName);
			System.exit(0);
		}
		Scanner inputReader = new Scanner(inputFile);
		String line;
		while (inputReader.hasNext())
		{
			line = inputReader.nextLine();
			lineLength = line.length();
			numberOfGrades = numberOfGrades +1;
			switch (line.charAt(lineLength-1))
			{
				case 'A':
						gpaSum = gpaSum + 4.0;
						break;
				case 'B':
						gpaSum = gpaSum + 3.0;
						break;
				case 'C':
						gpaSum = gpaSum + 2.0;
						break;
				case 'D':
						gpaSum = gpaSum + 1.0;
						break;
				case 'F':
						gpaSum = gpaSum + 0.0;
						break;
			}
		}
		inputReader.close();
		gpa = gpaSum/numberOfGrades;
		System.out.printf("The GPA is %01.2f\n", gpa);
	}
}