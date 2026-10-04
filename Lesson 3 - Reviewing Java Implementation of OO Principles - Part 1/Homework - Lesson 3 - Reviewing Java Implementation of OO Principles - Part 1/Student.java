//Kenny Huynh
//csc-300

public class Student extends UniversityMember
{
    private Advisor advisor;
    private String year;
    private String major;
    private int studentNumber;

    private static int IDNUMBER = 1000;

    public Student()
    {
    }

    public Student(String memberName, Advisor advisor, String year, String major)
    {
        super(memberName);

        setAdvisor(advisor);
        setYear(year);
        setMajor(major);
        setStudentNumber();
    }

    public void setAdvisor(Advisor advisor)
    {
        this.advisor = advisor;
    }

    public Advisor getAdvisor()
    {
        return advisor;
    }

    public void setYear(String year)
    {
        this.year = year;
    }

    public String getYear()
    {
        return year;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getMajor()
    {
        return major;
    }

    public void setStudentNumber()
    {
        studentNumber = IDNUMBER;

        IDNUMBER++;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public String toString()
    {
        String str = String.format("%s %s with ID number %d is in the %s class and has the major %s",
                                   super.toString(),
                                   advisor.getMemberName(),
                                   studentNumber,
                                   year,
                                   major);

        return str;
    }

    public boolean equals(Object object2)
    {
        if (object2 instanceof Student)
        {
            Student student2 = (Student)object2;

            if (super.equals(student2) &&
                year.equals(student2.year) &&
                major.equals(student2.major) &&
                studentNumber == student2.studentNumber)
            {
                return true;
            }
        }

        return false;
    }
}
