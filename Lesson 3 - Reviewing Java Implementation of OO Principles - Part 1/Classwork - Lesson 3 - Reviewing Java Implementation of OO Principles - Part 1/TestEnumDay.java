// A Java program to demonstrate working on enum 
// in switch case (FilenameTest.java) 
import java.util.Scanner; 
  
// An Enum class 
enum Day 
{ 
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY; 
} 
  
// Driver class that contains an object of "day" and 
// main(). 
public class TestEnumDay 
{ 
    Day day; 
  
    // Constructor 
    public TestEnumDay(Day day) 
    { 
        this.day = day; 
    } 
  
    // Prints a line about Day using switch 
    public void dayIsLike() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.printf("Mondays are bad.\n"); 
            break; 
        case FRIDAY: 
            System.out.printf("Fridays are better.\n"); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.printf("Weekends are best.\n"); 
            break; 
        default: 
            System.out.printf("Midweek days are so-so.\n"); 
            break; 
        } 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        String str = "MONDAY"; 
        TestEnumDay t1 = new TestEnumDay(Day.valueOf(str)); 
        t1.dayIsLike(); 
    } 
} 