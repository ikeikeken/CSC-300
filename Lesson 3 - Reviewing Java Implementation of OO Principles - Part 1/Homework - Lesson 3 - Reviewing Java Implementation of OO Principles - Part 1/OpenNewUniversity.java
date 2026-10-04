//Kenny Huynh
//CSC-300

import java.util.Scanner;
import java.io.IOException;

public class OpenNewUniversity
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Please enter the University Name: ");
        String universityName = keyboard.nextLine();

        University university =
            new University(universityName);

        university.hireAdvisors();

        university.admitStudents();

        university.printUniversityCommunity();
    }
}
