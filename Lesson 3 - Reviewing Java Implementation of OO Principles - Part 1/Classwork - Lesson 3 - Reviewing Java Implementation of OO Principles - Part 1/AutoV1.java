/* Auto class, version 1
   Anderson, Franceschi Modified By Rosenthal
*/

public class AutoV1
{
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    // Default constructor:
    //  initializes model to "unknown";
    //  milesDriven is auto-initialized to 0
    //        and gallonsOfGas to 0.0
    public AutoV1( )
    {
       model = "unknown";
    }    

    // Overloaded constructor:
    // allows client to set beginning values for
    //   model, milesDriven, and gallonsOfGas.
    // This approach will be replaced with mutators shortly
    public AutoV1( String startModel, int startMilesDriven, double startGallonsOfGas )
    {
       model = startModel;

       // validate startMiles parameter
       if ( startMilesDriven >= 0 )
           milesDriven = startMilesDriven;
       
       // validate startGallonsOfGas parameter
       if ( startGallonsOfGas >= 0.0 )
           gallonsOfGas = startGallonsOfGas;
    }
}
