//Kenny Huynh
//CSC-300

/*
Has three instance variables:
String sunName – the name of the Sun
int sunAge – the age of the Sun
A Random variable called randy with a seed of 6
*/

import java.util.Random;

public class Sun
{
    private String sunName;
    private int sunAge;
    private Random randii = new Random(6);

    public Sun()
    {
        setSunName("unknown");
    }

    public Sun(String sunName)
    {
        setSunName(sunName);
        setSunAge(randii.nextInt(1000000000, 2000000001));
    }

    public void setSunName(String sunName)
    {
        this.sunName = sunName;
    }

    public void setSunAge(int sunAge)
    {
        this.sunAge = sunAge;
    }

    public String getSunName()
    {
        return sunName;
    }

    public int getSunAge()
    {
        return sunAge;
    }

    public String toString()
    {
        String str = String.format("The sun named %s is %,d years old\n",
                                   sunName, sunAge);

        return str;
    }
}
