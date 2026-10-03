public class ComplexPair
{
    private Complex first;
    private Complex second;

    public ComplexPair(Complex first, Complex second)
    {
        setFirst(first);
        setSecond(second);
    }

    public void setFirst(Complex first)
    {
        this.first = first;
    }

    public void setSecond(Complex second)
    {
        this.second = second;
    }

    public Complex getFirst()
    {
        return first;
    }

    public Complex getSecond()
    {
        return second;
    }

    public boolean bothIdentical()
    {
        return first.equals(second);
    }

    public String toString()
    {
        return "first: " + first + "; second: " + second;
    }
}