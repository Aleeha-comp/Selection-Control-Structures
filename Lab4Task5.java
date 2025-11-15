import java.util.*;

public class Lab4Task5{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	int a,b,c;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();

	if(a == b && b == c)
	{
	 System.out.println("3");
	}
	else if((a == b) || (b == c) || (a == c))
	{
	 System.out.println("2");
	}
	else
	{
	System.out.println("0");
	}

	sc.close();
	}
}