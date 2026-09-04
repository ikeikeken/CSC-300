public class PrintAPoem
{
	public static void main (String [] args)
	{
		System.out.println("He wrote his code");
		System.out.print("\tHe indented well\n");
		System.out.println("\tTill he was done");
		System.out.print("\nThe Author\n");
		
		System.out.printf("%s\n", "He wrote his code");
		System.out.printf("\t%s\n", "He indented well");
		System.out.printf("\t%s\n", "Till he was done");
		System.out.printf("\n%s\n", "The Author");

		List<String> Poem = new LinkedList<String>();
	}
}
