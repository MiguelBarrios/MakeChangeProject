package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the price of the Item: ");
		
		double userInput = kb.nextDouble();
		
		System.out.println(userInput);
		
	}

}
