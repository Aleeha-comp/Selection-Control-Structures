import java.util.Scanner;

public class Lab4Task7{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int length1,width1,rectangle1,area1;

	System.out.print("Length of rectangle 1: ");
	length1 = input.nextInt();

	System.out.print("Width of rectangle 1: ");
	width1 = input.nextInt();

	area1 = length1 * width1;
	System.out.println("Area of Rectangle 1: " + area1);
	System.out.println();

	int length2,width2,rectangle2,area2;

	System.out.print("Length of rectangle 2: ");
	length2 = input.nextInt();

	System.out.print("Width of rectangle 2: ");
	width2 = input.nextInt();

	area2 = length2 * width2;
	System.out.println("Area of Rectangle 2: " + area2);
	System.out.println();

	if(area1 > area2){
		System.out.println("Rectangle 1 has greater area.");
	}
	else if(area2 > area1){
		System.out.println("Rectangle 2 has greater area.");
	}
	else{
		System.out.println("Both rectangles have same area.");
	}
	
	input.close();
	}
}

