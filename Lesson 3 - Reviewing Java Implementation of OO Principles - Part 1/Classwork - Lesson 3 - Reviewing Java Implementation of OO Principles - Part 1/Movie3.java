class Movie3 extends Video
{
  private String  director;     // name of the director
  private String  rating;       // G, PG, R, or X

  // constructor
  public Movie3( String ttl, int lngth, String dir, String rtng )
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
  
  public String toString()
  {
    //This works either of three ways!!
  	//String str1 = String.format("%s, %d min, available: %b\n", getTitle(), getLength(), getAvailable());
    
  	//String str1 = super.toString();
    //str1 = str1 + String.format("Director: %s  Rating: %s\n", director, rating);
    
    String str1 = String.format("%sDirector: %s  Rating: %s\n", super.toString(), director, rating);
    return str1;
    
  }
}