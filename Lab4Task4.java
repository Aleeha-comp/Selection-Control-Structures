import java.util.*;

public class Lab4Task4{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a: ");
	int a = input.nextInt();
	System.out.print("Enter b: ");
	int b = input.nextInt();

	if(a > b)
	 {
	  System.out.println("b = " + b);
	 }
	else
	 {
	  System.out.println("a = " + a);
	 }

	System.out.println();
	System.out.print("Enter c: ");
	int c = input.nextInt();
	System.out.print("Enter d: ");
	int d = input.nextInt();
	if(c > d)
	 {
	  System.out.println("d = " + d);
	 }
	else
	 {
	  System.out.println("c = " + c);
	 }

	System.out.println();
	System.out.print("Enter a number: ");
	int x = input.nextInt();
	if(x > 0)
	{
	  System.out.println("1");
	}
	else if (x < 0)
	{
	  System.out.println("-1");
	}
	else
	{
	  System.out.println("0");
	}

	System.out.println();
	int e,f,g,min;
	System.out.print("Enter e: ");
	e = input.nextInt();
	System.out.print("Enter f: ");
	f = input.nextInt();
	System.out.print("Enter g: ");
	g = input.nextInt();
	min = Math.min(e, Math.min(f, g));
	System.out.println(min);

	input.close();
	}
}


	