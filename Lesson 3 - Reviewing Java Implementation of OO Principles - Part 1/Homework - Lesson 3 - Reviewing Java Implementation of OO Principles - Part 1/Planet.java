//Kenny Huynh
//CSC-300
import java.util.Random;
import java.util.ArrayList;

public class Planet
{
    private static Random randyPlanet = new Random(11);

    private String planetName;
    private int planetTons;
    private ArrayList<Moon> moonsList = new ArrayList<Moon>();

    public Planet()
    {
        setPlanetName("unknown");
    }

    public Planet(String planetName)
    {
        setPlanetName(planetName);

        setPlanetTons(randyPlanet.nextInt(10000000, 80000001));

        createMoons(randyPlanet.nextInt(1, 6));
    }

    public void setPlanetName(String planetName)
    {
        this.planetName = planetName;
    }

    public void setPlanetTons(int planetTons)
    {
        this.planetTons = planetTons;
    }

    public String getPlanetName()
    {
        return planetName;
    }

    public int getPlanetTons()
    {
        return planetTons;
    }

    public void createMoons(int numMoons)
    {
        for (int i = 1; i <= numMoons; i++)
        {
            String moonName = planetName + "-Moon" + i;

            Moon moon = new Moon(moonName);

            moonsList.add(moon);
        }
    }

    public ArrayList<Moon> getMoonsList()
    {
        return moonsList;
    }

    public String toString()
    {
        String str = String.format("The planet named %s weighs %,d tons\n",
                                   planetName, planetTons);

        return str;
    }

    public boolean equals(Object object2)
    {
        if (object2 instanceof Planet)
        {
            Planet planet2 = (Planet)object2;

            if (planetName.equals(planet2.planetName) &&
                planetTons == planet2.planetTons)
            {
                return true;
            }
        }

        return false;
    }
}
