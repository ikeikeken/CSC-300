/* Auto Client, version 2
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV2
{
    public static void main( String [] args )
    {
        AutoV2 sedan = new AutoV2( );
        String sedanModel = sedan.getModel( );
        int sedanMiles = sedan.getMilesDriven( );
        double sedanGallons = sedan.getGallonsOfGas( );
        System.out.printf( " sedan: model is %s\n miles driven is %d\n gallons of gas is %.2f\n", sedanModel, sedanMiles, sedanGallons );

        AutoV2 suv = new AutoV2( "Trailblazer", 7000, 437.5 );
        String suvModel = suv.getModel( );
        int suvMiles = suv.getMilesDriven( );
        double suvGallons = suv.getGallonsOfGas( );
        System.out.printf( " suv: model is %s\n miles driven is %d\n gallons of gas is %.2f\n", suvModel, suvMiles, suvGallons );
        System.out.printf("%s\n", suv);
    }
}
