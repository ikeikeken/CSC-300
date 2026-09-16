/**
   The CellPhone class holds data about a cell phone.
*/

public class CellPhone
{
   // Fields
   private String manufact;    // Manufacturer
   private String model;       // Model
   private double retailPrice; // Retail price

   
   public CellPhone(String man, String mod, double price)
   {
      manufact = man;
      model = mod;
      retailPrice = price;
   }

   public void setManufact(String man)
   {
      manufact = man;
   }

   
   public void setMod(String mod)
   {
      model = mod;
   }

   public void setRetailPrice(double price)
   {
      retailPrice = price;
   }

   
   public String getManufact()
   {
      return manufact;
   }
   
   
   public String getModel()
   {
      return model;
   }
   
   public double getRetailPrice()
   {
      return retailPrice;
   }
   public String toString()
   {
   	  return String.format(" Manufacturer: %s\n Model number: %s\n Retail price: $%.2f\n", manufact, model, retailPrice);
   }
	public boolean equals( Object obj )
    {
       if ( ! ( obj instanceof CellPhone ) )
 	      return false;
       else
       {
          CellPhone objCPhone = ( CellPhone ) obj;
	       if ( manufact.equals( objCPhone.manufact)
               && model.equals(objCPhone.model ))
             return true;
          else 
             return false;
       }
    }
}
