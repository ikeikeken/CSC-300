//Kenny Huynh
//CSC-300

public class Quadratic
{
    private int a;
    private int b;
    private int c;
    private String comment;

    public Quadratic(int a, int b, int c)
    {
        setA(a);
        setB(b);
        setC(c);
        setComment();
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public void setC(int c)
    {
        this.c = c;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }

    public int getC()
    {
        return c;
    }

    public String getComment()
    {
        return comment;
    }

    public int discriminant()
    {
        return b * b - 4 * a * c;
    }

    public void setComment()
    {
        if (a == 0)
        {
            comment = "Linear equation: one real root";
        }
        else if (discriminant() == 0)
        {
            comment = "Quadratic with one real root";
        }
        else if (discriminant() > 0)
        {
            comment = "Two distinct real roots";
        }
        else
        {
            comment = "Two distinct complex roots";
        }
    }

    public ComplexPair solveQuadratic()
    {
        ComplexPair result;
        Complex firstRoot;
        Complex secondRoot;

        int discrim = discriminant();

        if (a == 0)
        {
            firstRoot = new Complex((double)-c / b, 0);

            result = new ComplexPair(firstRoot, firstRoot);
        }
        else if (discrim == 0)
        {
            firstRoot = new Complex((double)-b / (2 * a), 0);

            result = new ComplexPair(firstRoot, firstRoot);
        }
        else if (discrim > 0)
        {
            firstRoot = new Complex(
                    (-b + Math.sqrt(discrim)) / (2 * a), 0);

            secondRoot = new Complex(
                    (-b - Math.sqrt(discrim)) / (2 * a), 0);

            result = new ComplexPair(firstRoot, secondRoot);
        }
        else
        {
            firstRoot = new Complex(
                    (double)-b / (2 * a),
                    Math.sqrt(-discrim) / (2 * a));

            secondRoot = new Complex(
                    (double)-b / (2 * a),
                    -Math.sqrt(-discrim) / (2 * a));

            result = new ComplexPair(firstRoot, secondRoot);
        }

        return result;
    }

    public boolean equals(Object o)
    {
        if (!(o instanceof Quadratic))
        {
            return false;
        }

        Quadratic other = (Quadratic)o;

        return a == other.a &&
                b == other.b &&
                c == other.c;
    }

    public String toString()
    {
        String result = "";

        if (a != 0)
        {
            if (a == 1)
            {
                result += "x^2";
            }
            else if (a == -1)
            {
                result += "-x^2";
            }
            else
            {
                result += a + "x^2";
            }
        }

        if (b != 0)
        {
            if (!result.equals(""))
            {
                if (b > 0)
                {
                    result += " + ";
                }
                else
                {
                    result += " - ";
                }
            }
            else if (b < 0)
            {
                result += "-";
            }

            int absB = Math.abs(b);

            if (absB == 1)
            {
                result += "x";
            }
            else
            {
                result += absB + "x";
            }
        }

        if (c != 0)
        {
            if (!result.equals(""))
            {
                if (c > 0)
                {
                    result += " + ";
                }
                else
                {
                    result += " - ";
                }

                result += Math.abs(c);
            }
            else
            {
                result += c;
            }
        }

        result += " = 0";

        return result;
    }
}