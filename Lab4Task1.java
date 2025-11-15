public class Lab4Task1{
	public static void main(String[] args){
	int x = 10, y = 15, z = 20;
	boolean a = !(x > 10);
	boolean b = x <= 5 || y < 15;
	boolean c = (x != 5 ) && (y != z);
	boolean d = x >= z || (x + y >= z);
	boolean e = (x <= y - 2) && (y >= z) || (z - 2 != 20);
	System.out.println("!(x > 10): " + a);
	System.out.println("x <= 5 || y < 15: " + b);
	System.out.println("(x != 5) && (y != z): " + c);
	System.out.println("x >= z || (x + y >= z): " + d);
	System.out.println("(x <= y - 2) && (y >=z ) || (z - 2 != 20): " + e);
	}
}