public class Course
{
   private String courseName;      // Name of the course
   private Instructor instructor;  // The instructor
   private TextBook textBook;      // The textbook


   public Course(String name, Instructor instr, TextBook text)
   {
      setCourseName(name);
      setInstructor(instr);
      setTextBook(text);
   }
  
   public void setCourseName(String name)
   {
      courseName = name;
   }
   
   public void setInstructor(Instructor instr)
   {
      instructor = new Instructor(instr);
   }
   
   public void setTextBook(TextBook text)
   {
     textBook = new TextBook(text);
   }
   
   public String getCourseName()
   {
      return courseName;
   }

   public Instructor getInstructor()
   {
      // Return a copy of the instructor object.
      return new Instructor(instructor);
   }

   public TextBook getTextBook()
   {
      // Return a copy of the textBook object.
      return new TextBook(textBook);
   }

   public String toString()
   {
      // Create a string representing the object.
      String str = String.format("Course name: %s\n\n", courseName);
      str = str + String.format("Instructor Information: \n%s\n", instructor);
      str = str + String.format("Textbook Information: \n%s\n", textBook);
      // Return the string.
      return str;
   }
}