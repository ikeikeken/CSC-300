public class Printf1
{
  public static void main(String[] args) 
  {
		int x=5, y=123456789, z=-10;
		System.out.printf("%3d\n", 0);
		System.out.printf("%3d\n", 123456789);
		System.out.printf("%,3d\n", 123456789);
		System.out.printf("%3d\n", -10);
		System.out.printf("%(3d%(3d%(3d%(3d\n", 0, y, -10, 5);
		System.out.printf("%-3d %-3d %-3d %-3d\n", 0, y, -10, x);
		System.out.printf("%+05d %+05d %+05d %+05d\n", 0, 123, -10, z);
		System.out.printf("%(+,05d %(+,05d %(+,05d %(+,05d %(+,05d\n", 0, 123, z, x, y);
  }
}