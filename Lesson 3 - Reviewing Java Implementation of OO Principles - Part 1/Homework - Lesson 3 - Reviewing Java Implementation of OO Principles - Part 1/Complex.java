//Kenny Huynh
//CSC-300

public class Complex
{
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary)
    {
        setReal(real);
        setImaginary(imaginary);
    }

    public void setReal(double real)
    {
        this.real = real;
    }

    public void setImaginary(double imaginary)
    {
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return real;
    }

    public double getImaginary()
    {
        return imaginary;
    }

    public boolean isReal()
    {
        return imaginary == 0;
    }

    public boolean equals(Object o)
    {
        if (!(o instanceof Complex))
        {
            return false;
        }

        Complex other = (Complex)o;

        return real == other.real &&
               imaginary == other.imaginary;
    }

    public String toString()
    {
        if (imaginary == 0)
        {
            return String.format("%.2f", real);
        }
        else if (imaginary > 0)
        {
            return String.format("%.2f + %.2fi", real, imaginary);
        }
        else
        {
            return String.format("%.2f - %.2fi", real, -imaginary);
        }
    }
}