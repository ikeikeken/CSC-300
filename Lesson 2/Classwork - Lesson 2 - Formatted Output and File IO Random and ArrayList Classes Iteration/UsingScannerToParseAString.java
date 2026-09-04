 /* Demonstrating how to parse a String with the Scanner class
    Anderson, Franceschi Modified By Rosenthal
 */

 import java.util.Scanner;
 import java.util.InputMismatchException;
 import java.util.NoSuchElementException;

 public class UsingScannerToParseAString
 {
   public static void main( String [ ] args )
   {
     String flightRecord1 = "AA123,BWI,SFO,235,239.5";
     
     try ( Scanner parse = new Scanner( flightRecord1 ) )
     {
       // set the delimiter to a comma
       parse.useDelimiter( "," );
       
       System.out.printf("%s\n",  parse.next( ) ); // flight number
       System.out.printf("%s\n",  parse.next( ) ); // origin airport
       System.out.printf("%s\n",  parse.next( ) ); // destination airport
       System.out.printf("%d\n",  parse.nextInt( ) ); // number of passengers
       System.out.printf("%-8.2f\n",  parse.nextDouble( ) ); // average ticket price
       System.out.printf("%s\n",  parse.next( ) ); 
     }
     catch ( InputMismatchException ime )
     {
       System.out.printf( "Error in data format\n" );
     }
     catch ( NoSuchElementException nse )
     {
       System.out.printf( "No more tokens\n" );
     }
     catch ( IllegalStateException ise )
     {
       ise.printStackTrace ( );
     }
   }
 }