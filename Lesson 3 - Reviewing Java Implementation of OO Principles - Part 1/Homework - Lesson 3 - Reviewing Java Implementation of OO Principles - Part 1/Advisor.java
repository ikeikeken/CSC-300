//Kenny Huynh
//CSC-300

import java.util.ArrayList;

public class Advisor extends UniversityMember
{
    private String department;

    private ArrayList<Student> advStudentList =
        new ArrayList<Student>();

    public Advisor()
    {
    }

    public Advisor(String memberName, String department)
    {
        super(memberName);

        setDepartment(department);
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }

    public void addStudentToAdvisor(Student student)
    {
        advStudentList.add(student);
    }

    public Student getStudentFromAdvisorList(int index)
    {
        return advStudentList.get(index);
    }

    public int getNumStudentsInAdvisorList()
    {
        return advStudentList.size();
    }

    public String toString()
    {
        String str = String.format("%s from the %s department",
                                   super.toString(),
                                   department);

        return str;
    }

    public boolean equals(Object object2)
    {
        if (object2 instanceof Advisor)
        {
            Advisor advisor2 = (Advisor)object2;

            if (super.equals(advisor2) &&
                department.equals(advisor2.department))
            {
                return true;
            }
        }

        return false;
    }
}
