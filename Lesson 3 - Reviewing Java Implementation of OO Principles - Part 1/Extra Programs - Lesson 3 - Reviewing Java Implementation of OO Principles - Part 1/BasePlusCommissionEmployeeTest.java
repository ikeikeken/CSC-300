import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
public class BasePlusCommissionEmployeeTest 
{ 
	public static void main(String[] args) throws IOException
	{ 
		String firstName;
		String lastName ;
		double grossSales;
		double commissionPercent;
		double baseSalary;
		
		ArrayList<CommissionEmployee> commOnlyEmp = new ArrayList<>();
		ArrayList<BasePlusCommissionEmployee> basePlusCommEmp = new ArrayList<>();

		Scanner keyboard = new Scanner(System.in);
		
		// Create Scanner for Inputs For Commission Only 
		System.out.printf("Please enter the name of the input file with Commission Only Salespersons Data: \n");

		String inputFileNameCommOnly = keyboard.next();
		File inputFileCommOnly = new File(inputFileNameCommOnly);
		if(!inputFileCommOnly.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFileNameCommOnly);
			System.exit(0);
		}
		Scanner inputReaderCommOnly = new Scanner(inputFileCommOnly);
		
		//Read in the Commision Only Employee Data and place into an ArrayList
		while(inputReaderCommOnly.hasNext())
		{
			firstName = inputReaderCommOnly.next();
			lastName = inputReaderCommOnly.next();
			grossSales = inputReaderCommOnly.nextDouble();
			commissionPercent = inputReaderCommOnly.nextDouble();
			commOnlyEmp.add(new CommissionEmployee(firstName, lastName, grossSales, commissionPercent));			
		}
		inputReaderCommOnly.close();
		
		// Create Scanner for Inputs For Base Plus Commission 
		System.out.printf("Please enter the name of the input file with Base Plus Commission Salespersons: \n");

		String inputFileNameBaseAndComm = keyboard.next();
		File inputFileBaseAndComm = new File(inputFileNameBaseAndComm);
		if(!inputFileBaseAndComm.exists())
		{
			System.out.printf("Input File %s was not found.\n", inputFileNameBaseAndComm);
			System.exit(0);
		}
		Scanner inputReaderBaseAndComm = new Scanner(inputFileBaseAndComm);
		
		//Read in the COmmision Only Employee Data and place into an ArrayList
		while(inputReaderBaseAndComm.hasNext())
		{
			firstName = inputReaderBaseAndComm.next();
			lastName = inputReaderBaseAndComm.next();
			grossSales = inputReaderBaseAndComm.nextDouble();
			commissionPercent = inputReaderBaseAndComm.nextDouble();
			baseSalary = inputReaderBaseAndComm.nextDouble();
			basePlusCommEmp.add(new BasePlusCommissionEmployee(firstName, lastName, grossSales, commissionPercent, baseSalary));			
		}
		inputReaderBaseAndComm.close();
		
		 //Create the output file writer
		System.out.printf("Please enter the name of the output file: ");
		String outputFileName = keyboard.next();
		File outputFile = new File (outputFileName);
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		outputWriter.printf("Statistics On Commission Only Employees\n");
		outputWriter.printf("%-10s%-10s%-16s\n", "FNAME", "LNAME", "Total Compensation");
		double commOnlyTotal = 0.0;
		for(CommissionEmployee employee: commOnlyEmp)
		{
			outputWriter.printf("%-10s%-10s $%-16.2f\n", employee.getFirstName(), employee.getlastName(), employee.earnings());
			commOnlyTotal = commOnlyTotal + employee.earnings();
		}
		outputWriter.printf("Total Compensation For Commission Only Employees Is: $%,.2f\n\n", commOnlyTotal);
		
		outputWriter.printf("Statistics On Base Pay Plus Commission Employees\n");
		outputWriter.printf("%-10s%-10s%-16s\n", "FNAME", "LNAME", "Total Compensation");
		double baseAndCommTotal = 0.0;
		for(BasePlusCommissionEmployee employee: basePlusCommEmp)
		{
			outputWriter.printf("%-10s%-10s $%-16.2f\n", employee.getFirstName(), employee.getlastName(), employee.earnings());
			baseAndCommTotal = baseAndCommTotal + employee.earnings();
		}
		outputWriter.printf("Total Compensation For Base Plus Commission Employees Is: $%,.2f\n\n", baseAndCommTotal);
		
		outputWriter.printf("Total Compensation For All Employees Is: $%,.2f\n\n", (commOnlyTotal + baseAndCommTotal));
		outputWriter.close();

	}
}
		