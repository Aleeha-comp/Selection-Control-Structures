import java.util.*;

public class QuantityDiscounts{
	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	int packages;
	double discount;
	double totalAmount, discountedAmount;
	final int RETAIL = 99;

	System.out.print("Enter number of packages: ");
	packages = console.nextInt();

	if (packages < 10)
	{
	  System.out.println("Invalid input.");
	}

	else if (packages >= 10 && packages <=19)
	{
	  totalAmount = packages * RETAIL;
	  System.out.println("Total Amount=$ " + totalAmount);
	  discount = totalAmount * 0.20;
	  System.out.println("Discount=$ " + discount);
	  discountedAmount = totalAmount - discount;
	  System.out.println("Total amount of the purchase after discount:$ " + discountedAmount);
	}
 
	else if (packages >= 20 && packages <= 49)
	{
	  totalAmount = packages * RETAIL;
	  System.out.println("Total Amount=$ " + totalAmount);
	  discount = totalAmount * 0.30;
	  System.out.println("Discount=$ " + discount);
	  discountedAmount = totalAmount - discount;
	  System.out.println("Total amount of the purchase after discount:$ " + discountedAmount);
	}

	else if (packages >= 50 && packages <= 90)
	{
	  totalAmount = packages * RETAIL;
	  System.out.println("Total Amount=$ " + totalAmount);
	  discount = totalAmount * 0.40;
	  System.out.println("Discount=$ " + discount);
	  discountedAmount = totalAmount - discount;
	  System.out.println("Total amount of the purchase after discount:$ " + discountedAmount);
	}

	else
	{
	  totalAmount = packages * RETAIL;
	  System.out.println("Total Amount=$ " + totalAmount);
	  discount = totalAmount * 0.50;
	  System.out.println("Discount=$ " + discount);
	  discountedAmount = totalAmount - discount;
	  System.out.println("Total amount of the purchase after discount:$ " + discountedAmount);

	}

	console.close();
	}
}