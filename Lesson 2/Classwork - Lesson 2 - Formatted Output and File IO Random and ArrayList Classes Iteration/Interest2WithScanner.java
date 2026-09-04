import java.util.Scanner; // Make the Scanner class available.
public class Interest2WithScanner 
{
   public static void main(String[] args) 
   { 
	  Scanner keyboard= new Scanner(System.in ); // Create the Scanner.    
      double principal; // The value of the investment. 
      double rate; // The annual interest rate. 
      double interest; // The interest earned during the year.  
      System.out.printf("Enter the initial investment: ");//Always ask fo an input with a question
      principal = keyboard.nextDouble();
      System.out.printf("Enter the annual interest rate as a percent: "); 
      rate = keyboard.nextDouble(); 
      rate = rate/100; //denominator can be an int since the numerator is already type double
      interest = principal * rate; // Compute this year's interest. 
      principal = principal + interest; // Add it to principal. 
      System.out.printf("The value of the investment after one year is $%.2f\n", principal);  
	}  
 }  // end of class Interest2withScanner
