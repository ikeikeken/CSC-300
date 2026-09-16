/* Auto class, Version 2
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoV2
{
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    // Default constructor:
    //  initializes model to "unknown";
    //  milesDriven is auto-initialized to 0
    //        and gallonsOfGas to 0.0
    public AutoV2( )
    {
       model = "unknown";
    }

    // Overloaded constructor:
    // allows client to set beginning values for
    //   model, milesDriven, and gallonsOfGas.
    // To be replaced with mutators shortly
    public AutoV2( String startModel, int startMilesDriven, double startGallonsOfGas )
    {
       model = startModel;

       // validate startMiles parameter
       if ( startMilesDriven >= 0 )
          milesDriven = startMilesDriven;
       
       // validate startGallonsOfGas parameter
       if ( startGallonsOfGas >= 0.0 )
          gallonsOfGas = startGallonsOfGas;
    }

    // Accessor method:
    // returns current value of model
    public String getModel( )
    {
       return model;
    }

    // Accessor method:
    // returns current value of milesDriven
    public int getMilesDriven( )
    {
       return milesDriven;
    }

    // Accessor method:
    //  returns current value of gallonsOfGas
    public double getGallonsOfGas( )
    {
       return gallonsOfGas;
    }
}
