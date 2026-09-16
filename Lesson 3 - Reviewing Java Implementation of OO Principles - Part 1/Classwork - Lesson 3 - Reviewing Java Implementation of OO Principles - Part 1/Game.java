/* Game Class
   Anderson, Franceschi - Modified by Rosenthal
*/

public class Game
{
  private String description;

  public Game( String description )
  {
    setDescription( description );
  }

 
  public String getDescription( )
  {
    return description;
  }

  public void setDescription( String description )
  {
    this.description = description;
  }

  public String toString( )
  {
  	  return String.format("Game Description: %s\n", description);
  }

  public boolean equals( Object o )
  {
	if ( ! ( o instanceof Game ) )
	   return false;
	else
	{
		Game g = (Game) o;
        return ( description.equals( g.description ) );
	}
  }
}