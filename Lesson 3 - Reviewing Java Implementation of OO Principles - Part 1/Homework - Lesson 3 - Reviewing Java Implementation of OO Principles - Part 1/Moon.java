//Kenny Huynh
//CSC-300

/*
Has a single instance variable moonName
Has a single constructor with a string parameter with the value of moonName
Has a mutator and an accessor for the moonName
Has a toString method with no parameters that returns the moonName as a String
 */

public class Moon
{
    private String moonName;

    public Moon(String moonName)
    {
        //this.moonName = moonName;
        setMoonName(moonName);
    }

    public void setMoonName(String moonName)
    {
        this.moonName = moonName;
    }

    public String getMoonName()
    {
        return moonName;
    }

    public String toString()
    {
        return moonName;
    }
}
