import java.util.ArrayList ;

public class ArrayListExampleAddAtIndex
{

  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();

    names.add( "Amy" );
    names.add( "Bob" );
    names.add( "Chris" );

    // Print original arrangement
    System.out.printf("Before adding at index 1:\n");
    for ( int j=0; j < names.size(); j++ )
      System.out.printf("Element %d: %s\n", j, names.get(j) ); 
      
    // Insert an element
    names.add( 1, "Valerie");

    // Print new arrangement
    System.out.printf("\nAfter adding at index 1:\n");
    for ( int j=0; j < names.size(); j++ )
      System.out.printf("Element %d: %s\n", j, names.get(j) );  

  }
}