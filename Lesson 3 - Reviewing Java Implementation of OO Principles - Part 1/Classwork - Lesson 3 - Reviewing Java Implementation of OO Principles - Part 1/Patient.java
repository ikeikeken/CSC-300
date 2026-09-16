import java.util.Random;
public class Patient
{
	public static int patientIDCounter;
	public static Random randy2 = new Random(5);
	private int patientID;
	private int timeArrivedAtHospital;
	private int waitTimeInQueue;
	private int startTimewithDoctor;
	private int examTime;
	
	public Patient()
	{
		setPatientID();
		setExamTime();
		
	}
	public void setPatientID()
	{
		++patientIDCounter;
		patientID = patientIDCounter;
	}
	
	public int getPatientID()
	{
		return patientID;
	}
	
	public void setExamTime()
	{
		examTime = randy2.nextInt(1, 16);
	}
	
	public int getExamTime()
	{
		return examTime;
	}
	
	public void setWaitTimeInQueue(int time)
	{
		waitTimeInQueue = time - timeArrivedAtHospital;
	}
	
	public int getWaitTimeInQueue()
	{
		return waitTimeInQueue;
	}
	
	public void setTimeArrivedAtHospital(int time)
	{
		timeArrivedAtHospital = time;
	}
	
	public void setStartTimeWithDoctor(int time)
	{
		startTimewithDoctor = time;
	}
	public int getStartTimeWithDoctor()
	{
		return startTimewithDoctor;
	}
}