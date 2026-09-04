public class Printf5
{
  public static void main(String [] args) 
  {
    int n = 12345, m = 7, p = -5;
    double x = 1245.76, y = 3.1, z = -45.983;
  	System.out.printf("Printing integers %d %(d %+d %05d\n", 3, -3, 3, 3);

    System.out.printf("Default floating-point format: %f\n", 1234567.123);
    System.out.printf("Floating-point with commas: %,f\n", 1234567.123);
    System.out.printf("Negative floating-point default: %,f\n", -1234567.123);
    System.out.printf("Negative floating-point option: %,(f\n", -1234567.123);

    System.out.printf("\nLine-up positive and negative values:\n");
    System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    
    System.out.printf("\nThe product of %,d and %,d is %,d\n", n, m, n*m);
    System.out.printf("The quotient of %,d and %,d is %,d\n", m, p, m/p);	
    
    System.out.printf("\n%15s%15s%15s\n%,15.3f%,15.3f%,15.3f\n", "column1", "column2", "column3", x,y,z);
    
    System.out.printf("\n%15s%15s%15s\n", "column1", "column2", "column3");
    System.out.printf("%,15.3f%,15.3f%,15.3f\n", x,y,z);
    System.out.printf("%,15.3f%,15.3f%,15.3f\n", x*z,y*z,x*y);
    System.out.printf("%,15d%,15d%,15d\n", m,n,p);
  }
}