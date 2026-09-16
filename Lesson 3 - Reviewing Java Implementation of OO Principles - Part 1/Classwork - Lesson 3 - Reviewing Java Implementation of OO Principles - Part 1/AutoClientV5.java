/* Auto Client, version 5
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV5
{
   public static void main( String [] args )
   {
      AutoV5 sporty = new AutoV5( "Spyder", 0, 0.0 );               
      sporty.setGallonsOfGas( 3.4 ).setMilesDriven( 67 );
      int sportyMiles = sporty.getMilesDriven( );
      double sportyGallons = sporty.getGallonsOfGas( );
      System.out.printf( " Miles driven is %d\n Gallons of gas is %.2f gallons\n", sportyMiles, sportyGallons );
   }
}
