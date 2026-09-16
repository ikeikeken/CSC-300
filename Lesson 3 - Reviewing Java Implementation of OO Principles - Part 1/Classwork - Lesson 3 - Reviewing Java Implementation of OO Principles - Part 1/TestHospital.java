import java.util.Scanner;
public class TestHospital
{
	public static void main(String [] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.printf("Please enter name of the Hospital: ");
		String hospitalName = keyboard.nextLine();
		System.out.printf("Please enter city of the Hospital: ");
		String cityName = keyboard.nextLine();
		System.out.printf("Please enter the number of doctors: ");
		int numDoctors = keyboard.nextInt();
		Hospital hospital = new Hospital(hospitalName, cityName, numDoctors);
		
		//Call initializeHospital() to add waiting patients who arrived before simulation starts.
		hospital.initializeHospital();
		
		System.out.printf("Please enter the length of the simulation in minutes: ");
		int simLength = keyboard.nextInt();
		hospital.updateHospital(simLength);
		
		// print out hospital statistics
		hospital.printHospitalStatistics();
	}
}