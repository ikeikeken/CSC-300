//Kenny Huynh
//CSC-300

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class University {
    private String univName;

    private ArrayList<Advisor> advList =
            new ArrayList<Advisor>();

    private ArrayList<Student> freshmanStudList =
            new ArrayList<Student>();

    private ArrayList<Student> sophomoreStudList =
            new ArrayList<Student>();

    private ArrayList<Student> juniorStudList =
            new ArrayList<Student>();

    private ArrayList<Student> seniorStudList =
            new ArrayList<Student>();

    private Scanner keyboard = new Scanner(System.in);

    public University() {
        setUnivName("unknown");
    }

    public University(String univName) {
        setUnivName(univName);
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public String getUnivName() {
        return univName;
    }

    public void hireAdvisors() throws IOException {
        System.out.printf("Please enter the name of the input file with advisor's name and department: ");
        String inputFileName = keyboard.nextLine();

        File inputFile = new File(inputFileName);

        if (!inputFile.exists()) {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        while (inputReader.hasNextLine()) {
            String advisorName = inputReader.nextLine();
            String department = inputReader.nextLine();

            Advisor advisor =
                    new Advisor(advisorName, department);

            advList.add(advisor);
        }

        inputReader.close();
    }

    public void admitStudents() throws IOException {
        System.out.printf("Please enter the name of the input file with student's name and year: ");
        String inputFileName = keyboard.nextLine();

        File inputFile = new File(inputFileName);

        if (!inputFile.exists()) {
            System.out.printf("File %s is not found\n", inputFileName);
            System.exit(0);
        }

        Scanner inputReader = new Scanner(inputFile);

        int advisorIndex = 0;

        while (inputReader.hasNextLine()) {
            String studentName = inputReader.nextLine();
            String year = inputReader.nextLine();
            String major = inputReader.nextLine();

            if (year.equals("Freshman") ||
                    year.equals("Sophomore") ||
                    year.equals("Junior") ||
                    year.equals("Senior")) {
                Advisor advisor = advList.get(advisorIndex);

                Student student =
                        new Student(studentName, advisor, year, major);

                advisor.addStudentToAdvisor(student);

                if (year.equals("Freshman")) {
                    freshmanStudList.add(student);
                } else if (year.equals("Sophomore")) {
                    sophomoreStudList.add(student);
                } else if (year.equals("Junior")) {
                    juniorStudList.add(student);
                } else if (year.equals("Senior")) {
                    seniorStudList.add(student);
                }

                advisorIndex++;

                if (advisorIndex >= advList.size()) {
                    advisorIndex = 0;
                }
            } else {
                System.out.printf("%s has an illegal student year: %s Rejected entry\n",
                        studentName,
                        year);
            }
        }

        inputReader.close();
    }

    public void printUniversityCommunity() throws IOException {
        System.out.printf("Please enter the name of the output file for the University: ");
        String outputFileName = keyboard.nextLine();

        PrintWriter outputWriter = new PrintWriter(outputFileName);

        outputWriter.printf("%s University's Community Of Advisors and Their Students\n",
                univName);

        for (int i = 0; i < advList.size(); i++) {
            Advisor advisor = advList.get(i);

            outputWriter.printf("Students advised by %s of the %s Department\n",
                    advisor.getMemberName(),
                    advisor.getDepartment());

            for (int j = 0;
                 j < advisor.getNumStudentsInAdvisorList();
                 j++) {
                outputWriter.printf("%s\n",
                        advisor.getStudentFromAdvisorList(j));
            }

            outputWriter.printf("\n");
        }

        outputWriter.printf("%s University's List Of Students By Year\n",
                univName);

        outputWriter.printf("FRESHMAN STUDENTS\n");

        for (int i = 0; i < freshmanStudList.size(); i++) {
            outputWriter.printf("%s\n",
                    freshmanStudList.get(i));
        }

        outputWriter.printf("\nSOPHOMORE STUDENTS\n");

        for (int i = 0; i < sophomoreStudList.size(); i++) {
            outputWriter.printf("%s\n",
                    sophomoreStudList.get(i));
        }

        outputWriter.printf("\nJUNIOR STUDENTS\n");

        for (int i = 0; i < juniorStudList.size(); i++) {
            outputWriter.printf("%s\n",
                    juniorStudList.get(i));
        }

        outputWriter.printf("\nSENIOR STUDENTS\n");

        for (int i = 0; i < seniorStudList.size(); i++) {
            outputWriter.printf("%s\n",
                    seniorStudList.get(i));
        }

        outputWriter.close();
    }
}