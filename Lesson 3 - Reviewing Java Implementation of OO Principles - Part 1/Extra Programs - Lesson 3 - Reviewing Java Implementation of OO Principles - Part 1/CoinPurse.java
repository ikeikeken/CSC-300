/* CoinPurse Class
   Anderson, Franceschi - Modified By Rosenthal
*/
public class CoinPurse
{
  public final double QUARTER_VALUE = .25;
  public final double DIME_VALUE = .1;
  public final double NICKEL_VALUE = .05;
  public final double PENNY_VALUE = .01;
 
  private int quarters;
  private int dimes;
  private int nickels;
  private int pennies;

  public CoinPurse( int newQuarters, int newDimes, int newNickels, int newPennies )
  {
    setQuarters( newQuarters );
    setDimes( newDimes );
    setNickels( newNickels );
    setPennies( newPennies );
  }

  public int getQuarters( )
  {
    return quarters;
  }

  public CoinPurse setQuarters( int quarters )
  {
    if ( quarters >= 0 )
      this.quarters = quarters;  
    return this;
  }

  public int getDimes( )
  {
    return dimes;
  }

  public CoinPurse setDimes( int dimes )
  {
    if ( dimes >= 0 )
      this.dimes = dimes;
      
    return this;
  }

  public int getNickels( )
  {
    return nickels;
  }

  public CoinPurse setNickels( int nickels )
  {
    if ( nickels >= 0 )
      this.nickels = nickels;
    
    return this;
  }

  public int getPennies( )
  {
    return pennies;
  }

  public CoinPurse setPennies( int pennies )
  {
    if ( pennies >= 0 )
      this.pennies = pennies;
      
    return this;
  }


  public String toString( )
  {
    String str = String.format( "quarters: %d dimes: %d nickels: %d pennies: %d\n", quarters, dimes, nickels, pennies );
    return str;
  }

  public boolean equals( Object o )
  {
	 if ( ! ( o instanceof CoinPurse ) )
	   return false;
    else
    {
		CoinPurse c = (CoinPurse) o;
        return ( quarters == c.quarters && dimes == c.dimes&& nickels == c.nickels && pennies == c.pennies );
	 }
  }

  public double totalAmount( )
  {
    double total = quarters * QUARTER_VALUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    return total;
  }

  public double moneyFromQuarters( )
  {
    return ( quarters * QUARTER_VALUE );
  }

  public double moneyFromDimes( )
  {
    return ( dimes * DIME_VALUE );
  }

  public double moneyFromNickels( )
  {
    return ( nickels * NICKEL_VALUE );
  }

  public double moneyFromPennies( )
  {
    return ( pennies * PENNY_VALUE );
  }
}