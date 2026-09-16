/* Auto Client, Version 4
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV4
{
   public static void main( String [] args )
   {
     AutoV4 suv = new AutoV4( "Trailblazer", 7000, 437.5 );

     double mileage = suv.milesPerGallon( );
     System.out.printf( "Mileage for suv is %.2f miles/gallon\n", mileage);                        
     double gasCost = suv.moneySpentOnGas( 2.79 );
     System.out.printf( "Gas cost for suv is $%.2f\n", gasCost);
   }
}
