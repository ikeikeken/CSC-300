import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExampleIterator
{
  public static void main ( String[] args)
  {
    // Create and populate the list
    ArrayList<String> names = new ArrayList<String>();
    names.add( "Amy" );    
    names.add( "Bob" ); 
    names.add( "Chris" );  
    names.add( "Deb" ); 
    names.add( "Elaine" ); 
    names.add( "Frank" );
    names.add( "Gail" );   
    names.add( "Hal" );

    // Create an iterator for the list
    Iterator<String> iterOnNames = names.iterator();

    // Use the iterator to visit each element
    System.out.printf("Using the Iterator:\n");
    while ( iterOnNames.hasNext() )//doesn't move the pointer
    {
      System.out.printf( "%s\n", iterOnNames.next() );
      //iterOnNames.remove() ;//removing each element
    }
  
    System.out.printf("Using the Enhanhanced For loop:\n");
    for ( String nm : names ) 
      System.out.printf("%s\n", nm );
  }
}