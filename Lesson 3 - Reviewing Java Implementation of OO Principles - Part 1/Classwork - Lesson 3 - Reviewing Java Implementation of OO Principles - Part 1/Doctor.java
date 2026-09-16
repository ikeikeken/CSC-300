import java.util.ArrayList;
public class Doctor
{
	private static int doctorIDCounter = 0;
	private String doctorID;
	private Patient patientWithDoctor;
	private int patientsFinishedByDoctor;
	public Doctor()
	{
		setDoctorID();
	}
	public void setDoctorID()
	{
		doctorIDCounter++;
		doctorID = "Doctor"+doctorIDCounter;
	}
	public String getDoctorID()
	{
		return doctorID;
	}
	public void setPatientWithDoctor(Patient pat)
	{
		patientWithDoctor = pat;
	}
	public Patient getPatientWithDoctor()
	{
		return patientWithDoctor;
	}
	public void incrementPatientsFinishedByDoctor()
	{
		patientsFinishedByDoctor++;
	}
	public int getPatientsFinishedByDoctor()
	{
		return patientsFinishedByDoctor;
	}
	public String toString()
	{
		return String.format("%s", doctorID);
	}
}
	
		