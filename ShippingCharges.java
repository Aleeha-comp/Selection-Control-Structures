import java.util.*;

public class ShippingCharges{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter weight of packages: ");
	double weight = input.nextDouble();
	double shippingPrice;
	
	if (weight <=2)
	{
	 shippingPrice = weight * 1.10;
	 System.out.println("Shipping charges:$ " + shippingPrice);
	}

	else if (weight > 2 && weight <=6)
	{
	 shippingPrice = weight * 2.20;
	 System.out.println("Shipping charges:$ " + shippingPrice);
	}

	else if (weight > 6 && weight <= 10)
	{
	 shippingPrice = weight * 3.70;
	 System.out.println("Shipping charges:$ " + shippingPrice);
	}

	else
	{
	 shippingPrice = weight * 3.80;
	 System.out.println("Shipping charges:$ " + shippingPrice);
	}

	input.close();
	}
}