import java.util.ArrayList;
public class ArrayListExampleRemove
{
  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();

    names.add( "Amy" );    
    names.add( "Bob" );
    names.add( "Chris" );  
    names.add( "Deb" );

    names.remove(2);

    for ( int j=0; j < names.size(); j++ )
      System.out.printf("Element % d: %s\n", j, names.get(j) ); 
  	
    System.out.printf("Deb is at index % d\n",names.indexOf("Deb"));
    System.out.printf("Chris is at index % d\n",names.indexOf("Chris"));
    
    names.add( "Bob" );
    System.out.printf("First index of Bob is at index % d\n",names.indexOf("Bob"));
    System.out.printf("Last index of Bob is at index % d\n",names.lastIndexOf("Bob"));
  }
}