/* Auto Client, Version 1
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV1
{
   public static void main( String [] args )
   {
      System.out.printf("%s\n", "Instantiate sedan" );
      AutoV1 sedan = new AutoV1( );

      System.out.printf("\n%s\n", "Instantiate suv" );
      AutoV1 suv = new AutoV1( "Trailblazer", 7000, 437.5 );

      System.out.printf( "\n%s\n", "Instantiate mini" );
      // attempt to set invalid value for gallons of gas
      AutoV1 mini = new AutoV1( "Mini Cooper", 200, -1.0 );
   }
}
