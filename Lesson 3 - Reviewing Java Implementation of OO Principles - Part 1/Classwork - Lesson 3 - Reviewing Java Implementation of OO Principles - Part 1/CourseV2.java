/**
   This class stores data about a course.
*/
import java.util.ArrayList;
public class CourseV2
{
   private String courseName;      // Name of the course
   private Instructor instructor;  // The instructor
   private ArrayList<TextBook> textBooks = new ArrayList<TextBook>();  //textBook List

   /**
      This constructor initializes the courseName,
      instructor, and text fields.
      name The name of the course.
      instructor An Instructor object.
   */

   public CourseV2(String name, Instructor instr)
   {
      // Assign the courseName.
      setCourseName(name);

      // Create a new Instructor object, passing
      // instr as an argument to the copy constructor.
      instructor = new Instructor(instr);
      
   }
   
   public void setCourseName(String name)
   {
      courseName = name;
   }
   
   public void addTextBook(TextBook text)
   {
        textBooks.add(text);
   }
        	
   /**
      getName method
      @return The name of the course.
   */

   public String getCourseName()
   {
      return courseName;
   }

   /**
      getInstructor method
      @return A reference to a copy of this course's
              Instructor object.
   */

   public Instructor getInstructor()
   {
      // Return a copy of the instructor object.
      return new Instructor(instructor);
   }

   /**
      getTextBook method
      @return A reference to a copy of this course's
              TextBook object.
   */

   public ArrayList<TextBook> getTextBooks()
   {
      // Return a copy of the textBook object.
      return textBooks;
   }

   /**
      toString method
      @return A string containing the course information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = String.format("Course name: %s\n\n", courseName);
      str = str + String.format("Instructor Information: \n%s\n", instructor);
      
      for(TextBook text: textBooks) 
      	  str = str + String.format("Textbook Information: \n%s\n", text);
      // Return the string.
      return str;
   }
}