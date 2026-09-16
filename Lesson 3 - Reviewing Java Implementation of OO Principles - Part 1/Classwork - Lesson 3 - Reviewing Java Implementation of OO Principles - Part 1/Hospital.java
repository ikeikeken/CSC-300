import java.util.ArrayList;
import java.util.Random;
public class Hospital
{
	private Random randy = new Random(9);
	private String name;
	private String city;
	private int timeOfDay;
	private ArrayList<Patient> queueWaitingPatients = new ArrayList<Patient>();
	private ArrayList<Patient> completedVisitPatientList = new ArrayList<Patient>();
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private Patient tempPatient;
	private Doctor tempDoctor;
	public Hospital()
	{
		name = "unknown";
		city = "unknown";
	}
	public Hospital(String name, String city, int numDoctors)
	{
		this.name = name;//would be better to use mutators here as well
		this.city = city;
		createDoctors(numDoctors);
	}
	public String getName()
	{
		return name;
	}
	public  String getCity()
	{
		return city;
	}
	public void createDoctors(int numDoctors)
	{
		for (int i=0; i < numDoctors; i++)
		{
			doctors.add(new Doctor());
		}
	}
	
	public void initializeHospital() //initializes with ten patients
	{
		for(int i = 0; i < 10; i++)
		{
			tempPatient = new Patient();
			addToQueueWaitingPatients(tempPatient);
		}
	}

	public void addToQueueWaitingPatients(Patient patient)
	{
		patient.setTimeArrivedAtHospital(timeOfDay);
		queueWaitingPatients.add(patient);
	}
	
	
	public void updateHospital(int simLength)
	{
		// Execute the hospital activity once per minute for simulayion minutes minutes
		// Add 1-5 new patients each 10 minutes, then start processing patients

		for(int i = 0; i < simLength; i++)
		{
			if(i%10 == 0) // ever 10 minutes check in from 1 to five patients
			{
				int newPatients = randy.nextInt(1, 6);
				for(int j = 0; j < newPatients; j++)
				{
					tempPatient = new Patient();
					addToQueueWaitingPatients(tempPatient);
				}
			}
			timeOfDay = timeOfDay +1;
			// Release patient if completed
			for (Doctor tempDoctor : doctors)
			{
				if(tempDoctor.getPatientWithDoctor() != null)
				{
					tempPatient = tempDoctor.getPatientWithDoctor();
					if ((timeOfDay - tempPatient.getStartTimeWithDoctor()) >=  tempPatient.getExamTime())
					{
						completedVisitPatientList.add(tempPatient);
						tempDoctor.incrementPatientsFinishedByDoctor();
						tempDoctor.setPatientWithDoctor(null);
					}
				}
			}

		//Have Doctor See Patient if available
			for (Doctor tempDoctor : doctors)
			{
				if(queueWaitingPatients.size() > 0)
				{
					if(tempDoctor.getPatientWithDoctor() == null)
					{
						tempDoctor.setPatientWithDoctor(queueWaitingPatients.get(0));
						tempPatient = tempDoctor.getPatientWithDoctor();
						queueWaitingPatients.remove(0);
						tempPatient.setWaitTimeInQueue(timeOfDay);
						tempPatient.setStartTimeWithDoctor(timeOfDay);
					}
				}
			}
		}
	}
	public void printHospitalStatistics()
	{
		System.out.printf("This is the output of %s in the city of %s\n", name, city);
		System.out.printf("The total number of patients that came to the hospital is  %d\n", Patient.patientIDCounter);
		System.out.printf("The number of patients remaining in the queue at the end of the measured time is %s\n", queueWaitingPatients.size());
		for (Doctor tempDoctor : doctors)
		{
			System.out.printf("The number of patients seen and processed by doctor %s is %d\n", tempDoctor.getDoctorID(), tempDoctor.getPatientsFinishedByDoctor());
		}
		// calculate average time in initial wait queue for completed patients
		int totalWaitTime = 0;
		//for (int i = 0; i < completedVisitPatientList.size(); i++)
		for(Patient tempPatient : completedVisitPatientList)
		{
			//tempPatient = completedVisitPatientList.get(i);
			totalWaitTime = totalWaitTime + tempPatient.getWaitTimeInQueue();
		}
		double averageWaitTimeInQueue = (double)totalWaitTime/completedVisitPatientList.size();
		System.out.printf("The average wait time for a patient who has completed the visit is %.2f minutes in the waiting room.\n", averageWaitTimeInQueue);
	}
}			