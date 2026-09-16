public class BasePlusCommissionEmployee extends CommissionEmployee
{
	private double baseSalary;
	// five-argument constructor 
	public BasePlusCommissionEmployee(String firstName, String lastName, double grossSales, double commissionPercent, double baseSalary) 
	{ 
		super(firstName, lastName, grossSales, commissionPercent); 
		setBaseSalary(baseSalary);
	} 
	public void setBaseSalary(double baseSalary) 
	{ 
		if (baseSalary < 0.0) 
		{ 
			throw new IllegalArgumentException("Base salary must be >= 0.0"); 
		} 
		this.baseSalary = baseSalary; 
	} 
	public double getBaseSalary() 
	{
		return baseSalary;
	} 
	
	// calculate earnings 
	public double earnings() 
	{
		return baseSalary + super.earnings();
	} 
	@Override 
	public String toString() 
	{
		return String.format("%s %s\n%s: %.2f\n", "Base-salaried", super.toString(), "Base Salary", getBaseSalary());
	}
}

