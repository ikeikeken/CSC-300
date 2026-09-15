//Read in the input file
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class OrdersRandomIntegers
{
    static PrintWriter createPrintWriter(String fileName) throws IOException
    {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter outputWriter = new PrintWriter(fw);
        return outputWriter;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter a seed for the Random generator: ");
        int seed = keyboard.nextInt();

        Random randii = new Random(seed);

        int tempInt;
        int counter;

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        tempInt = randii.nextInt(3, 26);
        numberList.add(tempInt);

        //generate 20 more random numbers and put them in order
        for (int i = 0; i < 20; i++)
        {
            tempInt = randii.nextInt(3, 26);

            for (counter = 0; counter < numberList.size(); counter++)
            {
                if (tempInt < numberList.get(counter)) {
                    numberList.add(counter, tempInt);
                    break;
                }
            }

            if (counter == numberList.size())
            {
                numberList.add(tempInt);
            }
        }

        System.out.printf("Enter output file name: ");
        String fileName = keyboard.next();

        PrintWriter outputWriter = createPrintWriter(fileName);
        //createPrintWriter(fileName);
        //FileWriter fw = new FileWriter(fileName);
        //PrintWriter outputWriter = new PrintWriter(fw);

        outputWriter.printf("Output Using ArrayList to String:\n");
        outputWriter.printf("%s\n\n", numberList);

        outputWriter.printf("Output Using Enhanced For:\n");

        for (Integer number : numberList)
        {
            outputWriter.printf("%d ", number);
        }
        outputWriter.printf("\n\n");

        outputWriter.printf("Output Using The Iterator:\n");
        Iterator<Integer> iterator = numberList.iterator();
        while (iterator.hasNext())
        {
            outputWriter.printf("%d ", iterator.next());
        }
        outputWriter.printf("\n");

        //no touchy
        outputWriter.close();
        keyboard.close();
    }
}