class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // G, PG, R, or X

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );      // use the base class's constructor to initialize members inherited from it
    setDirector(dir);           // initialize what's new to Movie
    setRating(rtng);      
  }

  public String getDirector() 
  { 
  	  return director; 
  }
  public String getRating() 
  { 
  	  return rating; 
  }
  
  public void setDirector( String dir ) 
  { 
  	  director = dir; 
  }
  
  public void setRating( String rtng ) 
  { 
  	  rating = rtng; 
  }
}