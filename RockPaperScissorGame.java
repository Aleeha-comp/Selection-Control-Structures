import java.util.*;

public class RockPaperScissorGame{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	int computerChoice = (int)(Math.random() * 3);
	
	System.out.print("Enter your choice (0 for Scissor, 1 for Rock, 2 for Paper): ");
	int userChoice = console.nextInt();
	System.out.println("Computer chose: " + computerChoice);
	System.out.println("You chose: " + userChoice);
	
	if (userChoice == computerChoice)
	{
	  System.out.println("It's a draw!");
	}
	
	else if (userChoice == 0 && computerChoice == 2)
	{
	  System.out.println("You win!");
	}

	else if (userChoice == 1 && computerChoice == 0)
	{
	  System.out.println("You win!");
	}

	else if (userChoice == 2 && computerChoice == 1)
	{
	  System.out.println("You win!");
	}
	
	else 
	{
	  System.out.println("Computer wins!");
	}

	console.close();
	}
}
