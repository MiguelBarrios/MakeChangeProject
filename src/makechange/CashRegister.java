package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter the price of the item: ");
			double totalCost = kb.nextDouble();
			System.out.println("Enter amount given: ");
			double amountGiven = kb.nextDouble();

			if (amountGiven == totalCost) {
				System.out.println("Exact amount given, no change needed");
			} else if (amountGiven < totalCost) {
				System.out.println("Insufficient amount given");
			} else {
				double change = amountGiven - totalCost;
				tendChange(amountGiven, totalCost);
			}
			
		}

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
			message += quarters + " quarters, ";
		}
		if (dimes != 0) {
			message += dimes + " dimes, ";
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

	public static void tendChange(double amountGiven, double totalCost) {

		double changeNeeded = amountGiven - totalCost;
		System.out.println("Change needed: " + changeNeeded);
		System.out.println();

		int dollars = (int) changeNeeded;
		int coins = (int) (((changeNeeded * 100) % 100) + 0.5);

		int numTwenty = dollars / 20;
		dollars = dollars % 20;

		int numTen = dollars / 10;
		dollars = dollars % 10;

		int numFive = dollars / 5;
		dollars = dollars % 5;

		int numOnes = dollars / 1;
		dollars = dollars % 1;

		int quarters = coins / 25;
		coins = coins % 25;

		int dimes = coins / 10;
		coins = coins % 10;

		int nickels = coins / 5;
		coins = coins % 5;

		int pennies = coins;

		printMessage(numTwenty, numTen, numFive, numOnes, quarters, dimes, nickels, pennies);

	}
}
