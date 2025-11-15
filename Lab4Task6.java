import java.util.Scanner;

public class Lab4Task6{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	int x;
	System.out.print("Enter the number: ");
	x = console.nextInt();
	
	switch(x){
		case 1:
			System.out.println("i");
			break;
		case 2:
			System.out.println("ii");
			break;
		case 3:
			System.out.println("iii");
			break;
		case 4:
			System.out.println("iv");
			break;
		case 5:
			System.out.println("v");
			break;
		case 6:
			System.out.println("vi");
			break;
		case 7:
			System.out.println("vii");
			break;
		case 8:
			System.out.println("viii");
			break;
		case 9:
			System.out.println("ix");
			break;
		case 10:
			System.out.println("x");
			break;
		default:
			System.out.println("Invalid input");
		}

	console.close();
	}
}

