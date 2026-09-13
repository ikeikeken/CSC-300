//Read in the input file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main
{
    public static void main (String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();
        File inputFile = new File(inputFileName);
        if(!inputFile.exists())
        {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        System.out.printf("Please enter the name of the output file \n");
        String fileName = keyboard.next();

        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter outputWriter = new PrintWriter(fw);

        Scanner inputReader = new Scanner(inputFile);
        String line;
        while (inputReader.hasNext())
        {
            line = inputReader.nextLine();
            System.out.printf("%s\n", line);
            outputWriter.printf("%s\n", line); //rights to file
        }

        //no touchy
        inputReader.close();
        outputWriter.close();

    }
}