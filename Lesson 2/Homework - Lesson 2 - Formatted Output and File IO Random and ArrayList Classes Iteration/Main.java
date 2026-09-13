//Read in the input file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main
{
    static String removeBlanks(String input)
    {
        return input.replaceAll("\\s+","");
    }
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
        String[] sline = new String[100];
        // don't forget to return an int with the number of lines read in.
        Scanner inputReader = new Scanner(inputFile);
        String line;
        int lineCount = 0;
        while (inputReader.hasNext())
        {
            sline[lineCount] = inputReader.nextLine();
            //System.out.printf("COMING IN\n");
           // System.out.printf("%s\n", sline[lineCount]); //to see screen. remember to comment out

            sline[lineCount] = removeBlanks(sline[lineCount]);
            //System.out.printf("COMING OUT\n");
            //System.out.printf("%s\n", sline[lineCount]); //to see screen. remember to comment out
            outputWriter.printf("%s\n", sline[lineCount]); //rights to file
            lineCount++;
        }

        System.out.printf("Line(s) counted: %d\n",lineCount);

        //no touchy
        inputReader.close();
        outputWriter.close();

    }
}