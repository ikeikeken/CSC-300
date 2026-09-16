public class TestVideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    System.out.printf("%s", item1.toString() );
    System.out.printf("%s",  item2 );     
  }
}