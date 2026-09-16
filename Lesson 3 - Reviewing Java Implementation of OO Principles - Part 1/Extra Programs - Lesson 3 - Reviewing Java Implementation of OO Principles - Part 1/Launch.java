import java.util.Scanner;
import java.io.IOException;
public class Launch
{
	public static void main(String [] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter the name of the Country: ");
		String countrytName = keyboard.nextLine();
		System.out.printf("Please enter the name of the Satellite Constellation ");
		String constellationName = keyboard.nextLine();
		SatConstellation constellation = new SatConstellation(constellationName, countrytName);
		System.out.printf("%s\n", constellation );//Print the solar system
		int numSatellites = constellation.getNumSatellites();
		boolean flag = false;
		if(numSatellites>1)
		{
			Satellite satellite0 = constellation.getSatellite(0);
			
			for(int i = 1; i< numSatellites; i++)
			{
				if(satellite0.equals(constellation.getSatellite(i)))
				{
					System.out.printf("%s equals the first satellite in the ArrayList\n", constellation.getSatellite(i).getSatelliteName());
					flag = true;
				}
			}

			if(flag == false)
				System.out.printf("There is no satellite that matches the first satellite\n");
			
			constellation.getSatellite(numSatellites-1).setSatelliteName(satellite0.getSatelliteName());
			constellation.getSatellite(numSatellites-1).setSatelliteOrbitHeight(satellite0.getSatelliteOrbitHeight());
			
			System.out.printf("%sand equals the first satellite in the ArrayList\n", constellation.getSatellite(numSatellites-1));
		}
		else
			System.out.printf("There are no satellites to compare\n");
	}
}