/* Auto Client, version 6
   Anderson, Franceschi Modified by Rosenthal
*/

public class AutoClientV6
{
   public static void main( String [] args )
   {
      AutoV6 sporty = new AutoV6( "Spyder", 0, 0.0 );
      System.out.printf("%s", sporty.toString( ) );

      AutoV6 compact = new AutoV6( "Accent", 0, 0.0 );

      System.out.printf( "\n%s\n",compact );
      
      // Note what happens if we print out the toString of AutoV4
      AutoV4 roadster = new AutoV4( "Hot Rod", 0, 0.0 );

      System.out.printf( "\n%s\n",roadster );

      if ( compact.equals( sporty ) )
        System.out.printf( "\n%s\n","sporty and compact are equal" );
      else
        System.out.printf( "\n%s\n","sporty and compact are not equal" );
   }
}
