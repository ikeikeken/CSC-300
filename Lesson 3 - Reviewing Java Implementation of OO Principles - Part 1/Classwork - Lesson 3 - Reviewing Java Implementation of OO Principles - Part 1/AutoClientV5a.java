/* Auto Client, version 5a
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV5a
{
   public static void main( String [] args )
   {
      AutoV5a sporty = new AutoV5a( "Spyder", 0, 0.0 );               
      sporty.setGallonsOfGas( 3.4 ).setMilesDriven( 67 );
      int sportyMiles = sporty.getMilesDriven( );
      double sportyGallons = sporty.getGallonsOfGas( );
      System.out.printf( " Miles driven is %d\n Gallons of gas is %.2f gallons\n", sportyMiles, sportyGallons );
   }
}
