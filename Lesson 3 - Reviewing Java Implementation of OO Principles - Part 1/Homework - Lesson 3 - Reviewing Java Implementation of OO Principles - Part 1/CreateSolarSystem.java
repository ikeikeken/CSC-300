//Kenny Huynh
//CSC-300

import java.util.Scanner;
import java.io.IOException;

public class CreateSolarSystem
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter the name of the Solar System: ");
        String solarSystemName = keyboard.nextLine();

        System.out.printf("Please enter the name of the Sun: ");
        String sunName = keyboard.nextLine();

        SolarSystem solarSystem = new SolarSystem(solarSystemName, sunName);

        System.out.printf("%s", solarSystem);

        if (solarSystem.getNumPlanets() > 1)
        {
            Planet firstPlanet = solarSystem.getPlanet(0);

            boolean planetFound = false;

            for (int i = 1; i < solarSystem.getNumPlanets(); i++)
            {
                if (firstPlanet.equals(solarSystem.getPlanet(i)))
                {
                    System.out.printf("%s", solarSystem.getPlanet(i));

                    System.out.printf("equals the first planet in the ArrayList\n");

                    planetFound = true;
                }
            }

            if (!planetFound)
            {
                System.out.printf("There is no planet that matches the first planet\n\n");
            }

            Planet lastPlanet =
                    solarSystem.getPlanet(solarSystem.getNumPlanets() - 1);

            lastPlanet.setPlanetName(firstPlanet.getPlanetName());
            lastPlanet.setPlanetTons(firstPlanet.getPlanetTons());

            if (lastPlanet.equals(firstPlanet))
            {
                System.out.printf("%s", lastPlanet);

                System.out.printf("and equals the first planet in the ArrayList\n");
            }
        }
        else
        {
            System.out.printf("There are no planets to compare\n");
        }
    }
}