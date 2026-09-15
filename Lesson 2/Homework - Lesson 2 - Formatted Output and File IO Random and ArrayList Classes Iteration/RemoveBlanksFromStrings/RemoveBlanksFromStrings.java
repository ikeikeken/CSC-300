//Read in the input file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class RemoveBlanksFromStrings
{
    /*
    static String removeBlanks(String input)
    {
        return input.replaceAll("\\s+","");
    }
    */

    static Scanner createFileScanner(String inputFileName) throws IOException
    {
        File inputFile = new File(inputFileName);
        if (!inputFile.exists())
        {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);
        return inputReader;
    }

    static PrintWriter createPrintWriter(String fileName) throws IOException
    {
        FileWriter fw = new FileWriter(fileName,true);
        PrintWriter outputWriter = new PrintWriter(fw);
        return outputWriter;
    }

    static int readInLines(Scanner inputReader, String[] sline)
    {
        int lineCount = 0;
        while (inputReader.hasNextLine() && lineCount < 100)
        {
            sline[lineCount] = inputReader.nextLine();
            lineCount++;
        }
        return lineCount;
    }

    static String[] removeBlanks(String[] sline, int lineCount)
    {
        String[] noBlanks = new String[lineCount];
        for (int i = 0; i < lineCount; i++)
        {
            noBlanks[i] = sline[i].replaceAll("\\s+", "");
        }
        return noBlanks;
    }
    public static void main (String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();
        Scanner inputReader = createFileScanner(inputFileName);

        /*
        File inputFile = new File(inputFileName);
        if(!inputFile.exists())
        {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }
        */

        System.out.printf("Please enter the name of the output file \n");
        String fileName = keyboard.next();

        PrintWriter outputWriter = createPrintWriter(fileName);
        /*
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter outputWriter = new PrintWriter(fw);
        */

        // don't forget to return an int with the number of lines read in.

        //Scanner inputReader = new Scanner(inputFile);

        String[] sline = new String[100];
        int lineCount = readInLines(inputReader, sline);

        /*
        String line;
        String[] sline = new String[100];
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
        */
        String[] noBlanks = removeBlanks(sline, lineCount);
        for (int i = 0; i < lineCount; i++)
        {
            outputWriter.printf("%s\n", noBlanks[i]);
        }
        System.out.printf("Line(s) counted: %d\n",lineCount);

        //no touchy
        inputReader.close();
        outputWriter.close();

    }
}
