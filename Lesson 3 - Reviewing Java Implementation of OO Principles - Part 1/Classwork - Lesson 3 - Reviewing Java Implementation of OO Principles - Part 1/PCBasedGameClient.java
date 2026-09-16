/* PCBasedGameClient class 
   Anderson, Franceschi - Modified By Rosenthal
*/
import java.util.Scanner;
public class PCBasedGameClient
{
  public static void main( String [] args )
  {
    Scanner keyboard = new Scanner(System.in);
    String description;
    int ramMBs, hdMBs;
    double cpuGigHertz;
    System.out.printf("Please enter the game description for game one: \n");
    description = keyboard.next();
    System.out.printf("Please enter the required RAM MBs and Disk Size MBs for game one as type int: \n");
    ramMBs = keyboard.nextInt();
    hdMBs = keyboard.nextInt();
    System.out.printf("Please enter the required CPU speed in Gigahertz for game one as a double: \n");
    cpuGigHertz = keyboard.nextDouble();
    
    
  	PCBasedGame pcbg1 = new PCBasedGame(description, ramMBs, hdMBs, cpuGigHertz );
    System.out.printf("%s\n", pcbg1 );
  	
    System.out.printf("Please enter the game description for game two: \n");
    description = keyboard.next();
    System.out.printf("Please enter the required RAM MBs and Disk Size MBs for game two as type int: \n");
    ramMBs = keyboard.nextInt();
    hdMBs = keyboard.nextInt();
    System.out.printf("Please enter the required CPU speed in Gigahertz for game two as a double: \n");
    cpuGigHertz = keyboard.nextDouble();
  	
  	PCBasedGame pcbg2 = new PCBasedGame(description, ramMBs, hdMBs, cpuGigHertz );
    System.out.printf("%s\n", pcbg2 );


    if ( pcbg1.equals( pcbg2 ) )
      System.out.printf( "pcbg1 and pcbg2 are equal\n" );
    else
      System.out.printf( "pcbg1 and pcbg2 are not equal\n" );

    pcbg2.setDescription( pcbg1.getDescription());
    pcbg2.setRamMB( pcbg1.getRamMB());
    pcbg2.setHdMB( pcbg1.getHdMB());
    pcbg2.setCpuGhz( pcbg1.getCpuGhz());

    if ( pcbg1.equals( pcbg2 ) )
      System.out.printf( "pcbg1 and pcbg2 are now equal\n" );
    else
      System.out.printf( "pcbg1 and pcbg2 are still not equal\n" );
  }
}