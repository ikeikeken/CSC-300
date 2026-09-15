//Read in the input file
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Polling
{
    static Scanner keyboard = new Scanner(System.in);
    static Random randii;
    static PrintWriter outputWriter;

    static ArrayList<String> readCauses() throws IOException
    {
        System.out.printf("Please enter name of file to read causes from: ");
        String inputFileName = keyboard.next();

        File inputFile = new File(inputFileName);
        if (!inputFile.exists())
        {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        ArrayList<String> causes = new ArrayList<String>();

        while (inputReader.hasNext())
        {
            String cause = inputReader.nextLine();
            causes.add(cause);
        }

        inputReader.close();

        return causes;
    }

    static int[][] performSurvey(ArrayList<String> causesList, int numPolled) throws IOException
    {
        int[][] polling = new int[causesList.size()][numPolled];

        for (int pollee = 0; pollee < numPolled; pollee++)
        {
            outputWriter.printf("Pollee %d Record\n", pollee + 1);

            for (int cause = 0; cause < causesList.size(); cause++)
            {
                polling[cause][pollee] = randii.nextInt(1, 11);

                outputWriter.printf("The ranking for cause %s: is %d\n",
                        causesList.get(cause),
                        polling[cause][pollee]);
            }

            outputWriter.printf("\n");
        }

        return polling;
    }

    static int[] calcCausesSums(int[][] pollResults)
    {
        int[] causesSum = new int[pollResults.length];

        for (int row = 0; row < pollResults.length; row++)
        {
            causesSum[row] = 0;

            for (int column = 0; column < pollResults[row].length; column++)
            {
                causesSum[row] += pollResults[row][column];
            }
        }

        return causesSum;
    }

    static double[] calcAverage(int[] causesSum, int numPolled)
    {
        double[] averageForCause = new double[causesSum.length];

        for (int i = 0; i < causesSum.length; i++)
        {
            averageForCause[i] = (double) causesSum[i] / numPolled;
        }

        return averageForCause;
    }

    static int findMaxCause(double[] average)
    {
        int maxIndex = 0;

        for (int i = 1; i < average.length; i++)
        {
            if (average[i] > average[maxIndex])
            {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static int findMinCause(double[] average)
    {
        int minIndex = 0;

        for (int i = 1; i < average.length; i++)
        {
            if (average[i] < average[minIndex])
            {
                minIndex = i;
            }
        }

        return minIndex;
    }

    static void reportResults(ArrayList<String> causesList,
                              int[][] pollResults,
                              double[] averageForCause,
                              int[] causesSum) throws IOException
    {
        outputWriter.printf("Polling Results\n");

        outputWriter.printf("%-32s%-30s%s\n",
                "Cause",
                "Polled Person",
                "Average");

        outputWriter.printf("%20s", "");

        for (int i = 0; i < pollResults[0].length; i++)
        {
            outputWriter.printf("%5d", i + 1);
        }

        outputWriter.printf("\n");

        for (int row = 0; row < pollResults.length; row++)
        {
            outputWriter.printf("%-20s", causesList.get(row));

            for (int column = 0; column < pollResults[row].length; column++)
            {
                outputWriter.printf("%5d", pollResults[row][column]);
            }

            outputWriter.printf("%12.2f\n", averageForCause[row]);
        }

        int maxCause = findMaxCause(averageForCause);
        int minCause = findMinCause(averageForCause);

        outputWriter.printf("\n");

        outputWriter.printf("The cause %s with an average rating of %.2f is the highest rated cause\n",
                causesList.get(maxCause),
                averageForCause[maxCause]);

        outputWriter.printf("\n");

        outputWriter.printf("The cause %s with an average rating of %.2f is the lowest rated cause\n",
                causesList.get(minCause),
                averageForCause[minCause]);
    }

    public static void main(String[] args) throws IOException
    {
        System.out.printf("Please enter a seed for Random: ");
        int seed = keyboard.nextInt();

        randii = new Random(seed);

        ArrayList<String> causesList;
        causesList = readCauses();

        System.out.printf("Please enter number of users to be polled: ");
        int numPolled = keyboard.nextInt();

        System.out.printf("Please enter name of file to write poll results to: ");
        String fileName = keyboard.next();

        FileWriter fw = new FileWriter(fileName);
        outputWriter = new PrintWriter(fw);

        int[][] pollResults = performSurvey(causesList, numPolled);

        int[] causesSum = calcCausesSums(pollResults);

        double[] averageForCause = calcAverage(causesSum, numPolled);

        reportResults(causesList, pollResults, averageForCause, causesSum);

        //no touchy
        outputWriter.close();
        keyboard.close();
    }
}