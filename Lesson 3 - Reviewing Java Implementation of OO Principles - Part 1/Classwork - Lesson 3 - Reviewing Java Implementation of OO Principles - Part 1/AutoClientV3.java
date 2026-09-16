/* Auto Client, Version 3
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV3
{
  public static void main( String [] args )
  {
     AutoV3 suv = new AutoV3( "Trailblazer", 7000, 437.5 );

     // print initial values of instance variables
     System.out.printf( " suv: model is %s\n miles driven is %d\n gallons of gas is %.2f\n", suv.getModel( ), suv.getMilesDriven( ), suv.getGallonsOfGas( ));

     // call mutator method for each instance variable
     suv.setModel( "Sportage" );
     suv.setMilesDriven( 200 );
     suv.setGallonsOfGas( 10.5 );

     // print new values of instance variables
     System.out.printf( " \nsuv: model is %s\n miles driven is %d\n gallons of gas is %.2f\n", suv.getModel( ), suv.getMilesDriven( ), suv.getGallonsOfGas( ));

     // attempt to set invalid value for milesDriven
     suv.setMilesDriven( -1 );
     // print current values of instance variables
     System.out.printf( " \nsuv: model is %s\n miles driven is %d\n gallons of gas is %.2f\n", suv.getModel( ), suv.getMilesDriven( ), suv.getGallonsOfGas( ));
  }
}
