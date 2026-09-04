import java.util.ArrayList ;

public class ArrayListExample1
{

  public static void main ( String[] args)
  {
    // Create an ArrayList that holds references to String
    ArrayList<String> names = new ArrayList<String>();

    // Add three String references
    boolean b = names.add("Amy");
    names.add("Bob");
    names.add(null);
    names.add("Cindy");
       
    // Access and print out the three String Objects
    System.out.printf("element 0: %s\n", names.get(0));
    System.out.printf("element 1: %s\n", names.get(1));
    System.out.printf("element 2: %s\n", names.get(2));
    System.out.printf("element 3: %s\n", names.get(3));
    System.out.printf("The size of names is: %d\n", names.size());
    System.out.printf("%b\n", b);
    //System.out.printf("The lengrh of wlement 2 is %d\n", names.get(2).length());
    names.clear();
    //System.out.printf("element 0: %s\n", names.get(0)); clear eliminate all enties, doesn't fill with null
    System.out.printf("The size of names after clearing is: %d\n", names.size());
    
  }
}