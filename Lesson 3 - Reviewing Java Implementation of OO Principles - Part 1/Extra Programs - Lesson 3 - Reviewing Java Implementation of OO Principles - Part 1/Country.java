import java.util.Random;
public class Country
{
	private String countryName;
	
	public Country()
	{
		setCountryName("unknown");
	}
	public Country(String countName)
	{
		setCountryName(countName);
		
	}
	public void setCountryName(String countryName)
	{
		this.countryName = countryName;
	}
	public String getCountryName()
	{
		return countryName;
	}
	public String toString()
	{
		return String.format("The Country is named %s\n", countryName);
	}
}