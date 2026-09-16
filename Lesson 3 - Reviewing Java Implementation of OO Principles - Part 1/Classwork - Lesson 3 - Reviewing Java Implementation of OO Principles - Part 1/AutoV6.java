/* Auto class, version 6 
   Anderson, Franceschi Modified by Rosenthal
*/


public class AutoV6
{  
    // instance variables
    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    /* Default constructor:
       initializes model to "unknown";
       milesDriven is auto-initialized to 0
       and gallonsOfGas to 0.0; */
    public AutoV6( )
    {
       setModel("unknown");
    }

    // Overloaded constructor:
    // allows client to set beginning values for
    // model, milesDriven, and gallonsOfGas;
    public AutoV6( String startModel, int startMilesDriven, double startGallonsOfGas )
    {
       setModel(startModel);
       setMilesDriven( startMilesDriven );
       setGallonsOfGas( startGallonsOfGas );
    }

    // Accessor Method:
    // returns current value of model
    public String getModel( )
    {
       return model;
    }

    // Accessor Method:
    // returns current value of milesDriven
    public int getMilesDriven( )
    {
       return milesDriven;
    }

    // Accessor Method:
    // returns current value of gallonsOfGas
    public double getGallonsOfGas( )
    {
       return gallonsOfGas;
    }

    // Mutator Method:
    // allows client to set model
    public void setModel( String newModel )
    {
        this.model = newModel;
    }

    // Mutator Method:
    // allows client to set value of milesDriven
    // if new value is not less than 0
    public void setMilesDriven( int milesDriven )
    {
       if ( milesDriven >= 0 )
          this.milesDriven = milesDriven;
    }

    /* Mutator Method:
       allows client to set value of gallonsOfGas
       if new value is not less than 0.0 */
    public void setGallonsOfGas( double gallonsOfGas )
    {
       if ( gallonsOfGas >= 0.0 )
         this.gallonsOfGas = gallonsOfGas;
    }

    /* Calculates miles per gallon.
       if no gallons of gas have been used, returns 0.0;
       otherwise, returns miles per gallon
       as milesDriven / gallonsOfGas */
    public double milesPerGallon( )
    {
       if ( gallonsOfGas >= 0.0001 )
           return milesDriven / gallonsOfGas;
       else
           return 0.0;
    }

    // Calculates money spent on gas.
    // returns price per gallon times gallons of gas
    public double moneySpentOnGas( double pricePerGallon )
    {
       return pricePerGallon * gallonsOfGas;
    }

    // toString: returns a String of instance variable values
    //@Override
    public String toString( )
    {
       return String.format("Model: %s\n miles driven: %d\n gallons of gas: %.2f\n", model, milesDriven, gallonsOfGas );
    }

    /* equals: returns true if fields of parameter object
       are equal to fields in this object */
    //@Override
    public boolean equals( Object obj )
    {
       if ( ! ( obj instanceof AutoV6 ) )
 	      return false;
       else
       {
          AutoV6 objAuto = ( AutoV6 ) obj; //creating a reference variable of the proper type
	       if ( model.equals( objAuto.model )
               && milesDriven == objAuto.milesDriven
               && Math.abs( gallonsOfGas - objAuto.gallonsOfGas )
                < 0.0001 )
             return true;
          else
             return false;
       }
    }
 }
