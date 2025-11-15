import java.util.*;

public class ChangeCountingGame{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);

	System.out.print("Enter the number pennies: ");
	int pennies = console.nextInt();
	
	System.out.print("Enter the number of nickels: ");
	int nickels = console.nextInt();

	System.out.print("Enter the number of dimes: ");
	int dimes = console.nextInt();

	System.out.print("Enter the number of quarters: ");
	int quarters = console.nextInt();

	int totalcents = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25);
	System.out.println("Totalcents: " + totalcents);	

	if (totalcents == 100)
	{
	  System.out.println("Congratulations! You have won the game.");
	}
	else if (totalcents > 100)
	{
	  System.out.println("Sorry, the amount entered is more than one dollar.");
	}
	else
	{
	  System.out.println("Sorry, the amount entered is less than one dollar.");
	}

	console.close();
	}
}

	