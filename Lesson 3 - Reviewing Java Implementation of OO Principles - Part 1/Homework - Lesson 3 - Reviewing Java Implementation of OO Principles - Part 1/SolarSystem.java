import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class SolarSystem
{
    private String solSystemName;
    private Sun sol;
    private ArrayList<Planet> planetList = new ArrayList<Planet>();

    public SolarSystem()
    {
        setSolSystemName("unknown");

        sol = new Sun();
    }

    public SolarSystem(String solSystemName, String sunName) throws IOException
    {
        setSolSystemName(solSystemName);

        sol = new Sun(sunName);

        createPlanets();
    }

    public void setSolSystemName(String solSystemName)
    {
        this.solSystemName = solSystemName;
    }

    public String getSolSystemName()
    {
        return solSystemName;
    }

    public void createPlanets() throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter file to read in planet list from: ");
        String inputFileName = keyboard.nextLine();

        File inputFile = new File(inputFileName);

        if (!inputFile.exists())
        {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        while (inputReader.hasNextLine())
        {
            String planetName = inputReader.nextLine();

            Planet planet = new Planet(planetName);

            planetList.add(planet);
        }

        inputReader.close();
    }

    public int getNumPlanets()
    {
        return planetList.size();
    }

    public Planet getPlanet(int index)
    {
        if (index < 0 || index >= planetList.size())
        {
            System.out.printf("Planet doesn't exist\n");

            return null;
        }

        return planetList.get(index);
    }

    public String toString()
    {
        String str = String.format("\nThe name of this solar system is %s\n\n",
                solSystemName);

        str += sol.toString();
        str += "\n";

        for (int i = 0; i < planetList.size(); i++)
        {
            str += planetList.get(i).toString();

            str += String.format("Moons of planet %s are:%s\n\n",
                    planetList.get(i).getPlanetName(),
                    planetList.get(i).getMoonsList());
        }

        return str;
    }
}