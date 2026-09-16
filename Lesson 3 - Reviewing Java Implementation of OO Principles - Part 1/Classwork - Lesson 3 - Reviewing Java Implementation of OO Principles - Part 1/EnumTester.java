public class EnumTester
{
	private enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
	public static void main(String [] args)
	{

		Day workday = Day.WEDNESDAY;
		System.out.printf("The value printed out due to toString conversion is %s\n", workday);
		
		System.out.printf("The ordinal value is %d\n", workday.ordinal());
		
		int cVar = workday.compareTo(Day.THURSDAY);
		System.out.printf("The compare value is %d\n", cVar);
		
		String str = workday.toString();
		System.out.printf("The String value is %s\n",str);
		
		System.out.printf("The enum value is %s\n", Day.valueOf("WEDNESDAY"));
		// System.out.printf("The enum value is %s\n", Day.valueOf("Wednesday")); If there is no match you'll get an exception
	}
}