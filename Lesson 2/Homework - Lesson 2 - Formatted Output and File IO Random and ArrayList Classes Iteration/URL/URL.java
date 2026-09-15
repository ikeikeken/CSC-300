//Read in the input file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class URL
{
    static String extractName(String url)
    {
        int start = url.indexOf(".") + 1;
        int end = url.lastIndexOf(".");
        String name = url.substring(start, end);
        return name;
    }

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

    public static void main (String[] args) throws IOException
    {
        //String inputFileName = "urlInput.txt";
        //String fileName = "urlOutput.txt";

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Please enter the name of the file to read in data from: ");
        String inputFileName = keyboard.next();
        Scanner inputReader = createFileScanner(inputFileName);

        System.out.printf("Please enter the name of the output file \n");
        String fileName = keyboard.next();
        PrintWriter outputWriter = createPrintWriter(fileName);

        while (inputReader.hasNextLine())
        {
            String url = inputReader.nextLine();
            String name = extractName(url);

            outputWriter.printf("%s %s\n", url, name);
        }

        //no touchy
        inputReader.close();
        outputWriter.close();
    }
}
