import java.util.Random;
public class Satellite
{
	public static Random randy = new Random(4);
	private String satelliteName;
	private int satelliteOrbitHeight;
	public Satellite()
	{
		setSatelliteName("unknown");
	}
	
	public Satellite(String satelliteName)
	{
		setSatelliteName(satelliteName);
		setSatelliteOrbitHeight(randy.nextInt(160, 371));
	}
	public void setSatelliteName(String satelliteName)
	{
		this.satelliteName = satelliteName;
	}
	public String getSatelliteName()
	{
		return satelliteName;
	}
	public void setSatelliteOrbitHeight(int satelliteOrbitHeight)
	{
		this.satelliteOrbitHeight = satelliteOrbitHeight;
	}
	public int getSatelliteOrbitHeight()
	{
		return satelliteOrbitHeight;
	}
	public String toString()
	{
		return String.format("The satellite named %s has a maximum orbital height of %,d miles \n", satelliteName, satelliteOrbitHeight);
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Satellite))
			return false;
		else
		{
			Satellite tempSatellite = (Satellite)obj;
			if (satelliteName.equals(tempSatellite.satelliteName) && satelliteOrbitHeight == (tempSatellite.satelliteOrbitHeight))
				return true;
			else
				return false;
		}
	}
}