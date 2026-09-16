class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    setTitle(ttl); 
    setLength(90); 
    setAvailable(true); 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    setTitle(ttl); 
    setLength(lngth); 
    setAvailable(true); 
  }
 
  public String getTitle() 
  { 
  	  return title; 
  }
  public void setTitle( String ttl ) 
  { 
  	  title = ttl; 
  }
  public int getLength() 
  { 
  	  return length; 
  }
  public void setLength( int lng ) 
  { 
  	  length = lng; 
  }
  public boolean getAvailable() 
  { 
  	  return avail;
  }
  public void setAvailable( boolean avl ) 
  { 
  	  avail = avl;
  }
  public String toString()
  {
    String str1 = String.format("%s, %d min, available: %b\n", title, length, avail);
    return str1;
  }
}