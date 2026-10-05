package day1;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter cost price of the product:");
		int cost_price=sc.nextInt();
		System.out.println("enter selling price of product:");
		int selling_price=sc.nextInt();
		if (cost_price>selling_price)
			System.out.println("LOSS");
		else
			System.out.println("PROFIT");

		sc.close();
	}
	
}
