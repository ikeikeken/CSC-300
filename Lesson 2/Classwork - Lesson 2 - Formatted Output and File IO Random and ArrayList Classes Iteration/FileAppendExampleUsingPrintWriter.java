import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppendExampleUsingPrintWriter 
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the output file \n");
		String fileName = keyboard.next();
        String dataToAppend = "This is new appended random integer - ";
        Random randy = new Random();

        FileWriter fw = new FileWriter(fileName, true); // true for append mode
        PrintWriter outputWriter = new PrintWriter(fw);
        outputWriter.printf("%s %d\n", dataToAppend, randy.nextInt(5,30));
        outputWriter.close();
    }
}