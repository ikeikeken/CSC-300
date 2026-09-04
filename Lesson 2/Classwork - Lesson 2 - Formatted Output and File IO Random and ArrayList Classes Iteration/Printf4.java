public class Printf4
{
  public static void main(String[] args) 
  {
    String y = "Hello", z = "Mindy";
  	System.out.printf("%s %s\n", "Hello", "Mindy");
  	System.out.printf("%8s %6s\n", "Hello", "Mindy");
  	System.out.printf("%-8s %-6s\n\n", "Hello", "Mindy");

  	System.out.printf("%s %s\n", y,z) ;
  	System.out.printf("%8s %6s\n", y,z);
  	System.out.printf("%-8s %-6s\n\n", y,z);
  	
  	System.out.printf("%S %S\n", y,z) ;
  	System.out.printf("%8S %6S\n", y,z);
  	System.out.printf("%-8S %-6S\n\n", y,z);
  	
  	boolean a = true, b= false;
  	System.out.printf("%b %b\n", a,b) ;
  	System.out.printf("%8b %6b\n", a,b);
  	System.out.printf("%-8b %-6b\n", a,b);
  	
  	System.out.printf("\n%B %B\n", a,b) ;
  	System.out.printf("%8B %6B\n", a,b);
  	System.out.printf("%-8B %-6B\n\n", a,b);
  	
  	char ch1 = 'c', ch2 ='D', ch3 ='?';
  	System.out.printf("%c %c %c\n", ch1,ch2,ch3) ;
  	System.out.printf("%3c %3c %3c\n", ch1,ch2,ch3);
  	System.out.printf("%-3c %-3c %-3c\n", ch1,ch2,ch3);
  	
  	System.out.printf("\n%C %C %C\n", ch1,ch2,ch3) ;
  	System.out.printf("%3C %3C %3C\n", ch1,ch2,ch3);
  	System.out.printf("%-3C %-3C %-3C\n", ch1,ch2,ch3);
  	
  }
}