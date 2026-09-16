// A simple enum example where enum is declared 
// outside any class (Note enum keyword instead of 
// class keyword) 
enum Color 
{ 
    RED, GREEN, BLUE; 
} 
  
public class TestEnumColorV1
{ 
    // Driver method 
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.printf("%s\n",c1); 
    } 
}