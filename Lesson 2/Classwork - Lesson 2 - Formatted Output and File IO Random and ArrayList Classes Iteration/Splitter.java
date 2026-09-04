public class Splitter 
{
    public static void main(String args[]) {

        String s = "geeks@for@geeks    ";
        String[] arr = s.split("@", -2);

        for (String a : arr)
            System.out.printf("%s\n", a);
    }
}