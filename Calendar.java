import java.util.*;

public class Calendar{
	public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.print("Enter Month: ");
        int month = console.nextInt();

        System.out.print("Enter Day: ");
        int day = console.nextInt();

        System.out.print("Enter two-digit year: ");
        int year = console.nextInt();

        if (month * day == year)
        {
            System.out.println("The date is magic.");
        }
        else
        {
            System.out.println("The date is not magic.");
        }

        console.close();
    }
}
