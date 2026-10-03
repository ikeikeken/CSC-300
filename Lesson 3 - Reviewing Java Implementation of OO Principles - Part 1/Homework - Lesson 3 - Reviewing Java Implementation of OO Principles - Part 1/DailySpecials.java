import java.util.Scanner;

public class DailySpecials
{
    private enum Days
    {
        Sun, Mon, Tue, Wed, Thur, Fri, Sat
    };

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Enter a day\n");
        System.out.printf("(Sun, Mon, Tue, Wed, Thur, Fri, Sat) > ");

        String str = keyboard.nextLine();

        Days day = Days.valueOf(str);

        switch(day)
        {
            case Mon:
                System.out.printf("The special for %s is BBQ Chicken.\n", day);
                break;

            case Tue:
                System.out.printf("The special for %s is tacos. BECAUSE TACO TUESDAY!\n", day);
                break;

            case Wed:
                System.out.printf("The special for %s is Instant Noodles.\n", day);
                break;

            case Thur:
                System.out.printf("The special for %s is tacos again! Because TACO THURSDAY!\nAnd Burritos\n", day);
                break;

            case Fri:
                System.out.printf("The special for %s is Fish and Chips.\n", day);
                break;

            case Sat:
                System.out.printf("Sorry, we're closed on %s\n", day);
                break;
            case Sun:
                System.out.printf("Sorry, we're closed on %s\n", day);
                break;
        }
    }
}