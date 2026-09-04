import java.util.ArrayList ;

public class ArrayListExample2
{

  public static void main ( String[] args)
  {
    // Create an ArrayList that holds references to String
    ArrayList<String> names = new ArrayList<String>();

    // Capacity starts at 10, but size starts at 0
    System.out.printf("Initial size: %d\n", names.size() );

    // Add three String references
    names.add("Amy");
    names.add("Bob");
    names.add("Cindy");
    System.out.printf("New size: %d\n", names.size() );
       
    // Access and print out the Objects
    for ( int j=0; j<names.size(); j++ )
      System.out.printf("Element %d: %s\n", j, names.get(j) );
  }
}