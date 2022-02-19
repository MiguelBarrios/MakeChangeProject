package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter the price of the item: ");
		double totalCost = kb.nextDouble();

		System.out.println("Enter amount given: ");
		double amountGiven = kb.nextDouble();

		System.out.println(totalCost);
		System.out.println(amountGiven);

		if (amountGiven == totalCost) {
			System.out.println("Exact amount given, no change needed");
		} else if (amountGiven < totalCost) {
			System.out.println("Insufficient amount given");
		} else {
			System.out.println("Change needed");
		}

	}

}
