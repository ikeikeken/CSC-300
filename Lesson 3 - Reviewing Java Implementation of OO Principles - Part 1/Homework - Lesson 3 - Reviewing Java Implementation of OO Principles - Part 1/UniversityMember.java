//Kenny Huynh
//CSC-300

public class UniversityMember
{
    private String memberName;

    public UniversityMember()
    {
        setMemberName("unknown");
    }

    public UniversityMember(String memberName)
    {
        setMemberName(memberName);
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public String toString()
    {
        return memberName;
    }

    public boolean equals(Object object2)
    {
        if (object2 instanceof UniversityMember)
        {
            UniversityMember member2 = (UniversityMember)object2;

            if (memberName.equals(member2.memberName))
            {
                return true;
            }
        }

        return false;
    }
}
