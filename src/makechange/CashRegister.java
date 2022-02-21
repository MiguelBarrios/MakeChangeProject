package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the price of the item: ");
		double totalCost = scanner.nextDouble();
		System.out.print("Enter amount given: ");
		double amountGiven = scanner.nextDouble();

		if (amountGiven == totalCost) {
			System.out.println("Exact amount given, no change needed");
		} else if (amountGiven < totalCost) {
			System.out.println("Insufficient amount given");
		} else {
			tendChange(amountGiven, totalCost);
		}

		scanner.close();

	}

	public static void tendChange(double moneyGiven, double totalCost) {

		double change = moneyGiven - totalCost;
		System.out.printf("Change: %.2f\n", change);

		int dollarsNeeded = (int) change;
		int coinsNeeded = (int) (((change * 100) % 100) + 0.5);

		int numTwenty = dollarsNeeded / 20;
		dollarsNeeded = dollarsNeeded % 20;

		int numTen = dollarsNeeded / 10;
		dollarsNeeded = dollarsNeeded % 10;

		int numFive = dollarsNeeded / 5;
		dollarsNeeded = dollarsNeeded % 5;

		int numOnes = dollarsNeeded / 1;
		dollarsNeeded = dollarsNeeded % 1;

		int quarters = coinsNeeded / 25;
		coinsNeeded = coinsNeeded % 25;

		int dimes = coinsNeeded / 10;
		coinsNeeded = coinsNeeded % 10;

		int nickels = coinsNeeded / 5;
		coinsNeeded = coinsNeeded % 5;

		int pennies = coinsNeeded;

		printMessage(numTwenty, numTen, numFive, numOnes, quarters, dimes, nickels, pennies);

	}

	public static void printMessage(int twenties, int tens, int fives, int ones, int quarters, int dimes, int nickels,
			int pennies) {
		String message = "Result: ";

		if (twenties != 0) {
			message += twenties + " twenty dollar bill, ";
		}
		if (tens != 0) {
			message += tens + " ten dollar bill, ";
		}
		if (fives != 0) {
			message += fives + " five dollar bill, ";
		}
		if (ones != 0) {
			message += ones + " one dollar bill, ";
		}
		if (quarters != 0) {
			message += quarters + " quarter, ";
		}
		if (dimes != 0) {
			message += dimes + " dime, ";
		}
		if (nickels != 0) {
			message += nickels + " nickel, ";
		}
		if (pennies != 0) {
			message += pennies + " pennies";
		}

		System.out.println(message);
		System.out.println();

	}

}
