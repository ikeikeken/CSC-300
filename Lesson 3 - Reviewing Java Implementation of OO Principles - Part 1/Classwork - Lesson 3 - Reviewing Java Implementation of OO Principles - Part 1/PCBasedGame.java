/* PCBasedGame Class 
   Anderson, Franceschi - Modified By Rosenthal
*/

public class PCBasedGame extends Game
{
  private int ramMB;
  private int hdMB;
  private double cpuGhz;

  public PCBasedGame( String description, int ramMB, int hdMB, 
                                     double cpuGhz )
  {
    super( description );
    setRamMB( ramMB );
    setHdMB( hdMB );
    setCpuGhz( cpuGhz );
  }

  // Accessors

  public int getRamMB( )
  {
    return ramMB;
  }

  public int getHdMB( )
  {
    return hdMB;
  }

  public double getCpuGhz( )
  {
    return cpuGhz;
  }

  // Mutator methods

  public void setRamMB( int ramMB )
  {
    if ( ramMB  >= 0 )
      this.ramMB = ramMB;
  }

  public void setHdMB( int hdMB )
  {
    if ( hdMB >= 0 )
      this.hdMB = hdMB;
  }

  public void setCpuGhz( double cpuGhz )
  {
    if ( cpuGhz >= 0 )
      this.cpuGhz = cpuGhz;
  }
  //Other methods
  public String toString( )
  {
    String str1 = String.format("%s", super.toString());
  	str1 = str1 + String.format("Minimum configuration: RAM: %d MB; hard disk: %d MB; CPU %.2f GHZ\n", ramMB, hdMB, cpuGhz);      
    return str1;
  }

  public boolean equals( Object o )
  {
	if ( ! ( o instanceof PCBasedGame ) )
	   return false;
	else
	{
	   PCBasedGame pcbg = (PCBasedGame) o;
       return ( super.equals( pcbg )
            && ramMB == pcbg.ramMB && hdMB == pcbg.hdMB
            && Math.abs( cpuGhz - pcbg.cpuGhz ) < 0.0001 );
 	}
  }
}