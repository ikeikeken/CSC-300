import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class SatConstellation
{
	private String satConstellationName;
	private Country country;
	private ArrayList<Satellite> satelliteList = new ArrayList<Satellite>();
	public SatConstellation()
	{
		setSatConstellationName("unknown");
		country = new Country();
	}		
	public SatConstellation(String satConstellationName, String countryName) throws IOException
	{
		setSatConstellationName(satConstellationName);
		country = new Country(countryName);
		createSatellites();
	}
	public void setSatConstellationName(String satConstellationName)
	{
		this.satConstellationName = satConstellationName;
	}
	public String getSatConstellationName()
	{
		return satConstellationName;
	}
	public void createSatellites() throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter file to read in Satellite List from: ");
		String inputFileName = keyboard.next();
		File inputFile = new File(inputFileName);
   	  
		if (!inputFile.exists())
		{
			System.out.printf("The input file %s doesn't exist.\n", inputFileName);
			System.exit(0);
   	  	}
   	  	Scanner inputReader = new Scanner(inputFile);
   	 	while(inputReader.hasNext())
   	 	{
   	 	 	String satName =  inputReader.nextLine();
   	 		satelliteList.add(new Satellite(satName));
   	 	}
   	 	inputReader.close();
   	}
   	public int getNumSatellites()
	{
		return satelliteList.size();
	}
   	public Satellite getSatellite(int i)
   	{
   		if((i < 0) || (i >= satelliteList.size()))
   		{
   			System.out.printf("Satellite doesn't exist\n");
   			return null;
   		}
   		return satelliteList.get(i);
   	}
   	public String toString()
   	{
   		String str = String.format("The name of %s's satellite constellation is %s\n", country.getCountryName(), satConstellationName);
   		for (int i=0; i <satelliteList.size(); i++)
   			str = str + satelliteList.get(i).toString();
   		return str;
   	}
}