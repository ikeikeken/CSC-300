/**
   This program demonstrates the Course class.
*/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class CourseDemoV2
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
   	   // Create an Instructor object.
      Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");

       // Create the courses
      CourseV2 myCourse = new CourseV2("Intro to Java", myInstructor);
      
      System.out.printf("Please enter the name of the input file for textbooks: ");
      String inputFileName = keyboard.next();
      File inputFile = new File(inputFileName);
      if(!inputFile.exists())
      {
      	  System.out.printf("The file of textbooks %s doesn't exist.\n", inputFileName);
      	  System.exit(0);
      }
      Scanner inputReader = new Scanner(inputFile);
 
      String bookTitle, bookAuthor, bookPublisher;
      TextBook myTextBook;
      while (inputReader.hasNext())
      {
      	  bookTitle = inputReader.nextLine();
      	  bookAuthor = inputReader.nextLine();
      	  bookPublisher= inputReader.nextLine();
         // Create a TextBook object.
          myTextBook = new TextBook(bookTitle,bookAuthor, bookPublisher);
          myCourse.addTextBook(myTextBook);
      }
         
      // Display the course information.
      System.out.printf("%s\n", myCourse);
      
      inputReader.close();
   }
}