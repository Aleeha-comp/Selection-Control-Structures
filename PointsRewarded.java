import java.util.*;

public class PointsRewarded{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Number of Books bought: ");
	int x = sc.nextInt();
	
	switch(x){
		case 0:
			System.out.println("He or she earns 0 points.");
			break;
		case 1:
			System.out.println("He or she earns 5 points.");
			break;
		case 2:
			System.out.println("He or she earns 15 points.");
			break;
		case 3:
			System.out.println("He or she earns 30 points.");
			break;
		case 4:
			System.out.println("He or she earns 60 points.");
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}

	sc.close();
	}
}


