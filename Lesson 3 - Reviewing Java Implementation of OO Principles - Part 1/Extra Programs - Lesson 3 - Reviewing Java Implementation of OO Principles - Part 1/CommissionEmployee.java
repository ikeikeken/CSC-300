public class CommissionEmployee
{
	private final String firstName;
	private final String lastName;
	private double grossSales;
	private double commissionPercent; // As a percentage
	
	//constructor 
	public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionPercent) 
	{ 
		// implicit call to Object constructor occurs here 
		
		this.firstName = firstName; 
		this.lastName = lastName; 
		setGrossSales(grossSales);
		setCommissionPercent(commissionPercent); 
	} 
	
	// set gross sales amount 
	public void setGrossSales(double grossSales) 
	{ 
		if (grossSales < 0.0) 
		{ 
			throw new IllegalArgumentException("Gross sales must be >= 0.0"); 
		} 
		this.grossSales = grossSales; 
	} 
	
	public void setCommissionPercent(double commissionPercent) 
	{ 
		if (commissionPercent < 0.0 || commissionPercent > 100.0) 
		{ 
			throw new IllegalArgumentException( "Commission rate must be >= 0.0 and <= 100.0"); 
		} 
		this.commissionPercent = commissionPercent; 

} 
	public String getFirstName() 
	{
		return firstName;
	} 
	public String getlastName() 
	{
		return lastName;
	} 

	// return gross sales amount 
	public double getGrossSales() 
	{
		return grossSales;
	}
	
	public double getCommissionPercent() 
	{
		return commissionPercent;
	} 
	
	// calculate earnings 
	public double earnings() 
	{ 
		return (getCommissionPercent()/100.0) * getGrossSales(); 
	} 
	// return String representation of CommissionEmployee object 
	@Override 
	public String toString() 
	{ 
		return String.format("%s: %s %s\n%s: %.2f\n%s: %.2f%%\n", "Commission Employee", getFirstName(), getlastName(), "Gross Sales", getGrossSales(), "Commission Percent", getCommissionPercent()); 
	} 
}





