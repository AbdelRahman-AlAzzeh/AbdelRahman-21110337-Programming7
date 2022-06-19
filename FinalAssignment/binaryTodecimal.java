package FinalAssignment;

import java.util.Scanner;

public class binaryTodecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a binary number");
		String userInput = sc.nextLine();
		int length = userInput.length();
		int a = 0;
		int decimalNumber;

		for (int i = 0; i < length; i++) {
			char a1 = userInput.charAt(i);
			if (a1 == '0') {

				decimalNumber = 0;

			}

			else {
				int power = (length - (i + 1));
				decimalNumber = exponents(power);
			}

			a = a + decimalNumber;
		}
		String digital = a + "";
		int digitalLen = digital.length();
		for (int i = 0; i < digitalLen; i++) {
			char numIndex = digital.charAt(i);
			if (numIndex == '0') {
				System.out.println(" -- ");
				System.out.println("|  |");
				System.out.println("|  |");
				System.out.println(" -- ");
			} else if (numIndex == '1') {
				System.out.println("|");
				System.out.println("|");
			} else if (numIndex == '2') {
				System.out.println(" -- ");
				System.out.println("   |");
				System.out.println(" -- ");
				System.out.println("|");
				System.out.println(" --");
			} else if (numIndex == '3') {
				System.out.println(" -- ");
				System.out.println("   |");
				System.out.println(" -- ");
				System.out.println("   |");
				System.out.println(" --");

			} else if (numIndex == '4') {
				System.out.println("|  |");
				System.out.println(" -- ");
				System.out.println("   |");
			} else if (numIndex == '5') {
				System.out.println(" -- ");
				System.out.println("|");
				System.out.println(" -- ");
				System.out.println("   |");
				System.out.println(" --");
			} else if (numIndex == '6') {
				System.out.println(" -- ");
				System.out.println("|");
				System.out.println(" -- ");
				System.out.println("|  |");
				System.out.println(" --");
			} else if (numIndex == '7') {
				System.out.println(" -- ");
				System.out.println("   |");
				System.out.println("   |");
			} else if (numIndex == '8') {
				System.out.println(" -- ");
				System.out.println("|  |");
				System.out.println(" -- ");
				System.out.println("|  |");
				System.out.println(" --");
			} else if (numIndex == '9') {
				System.out.println(" -- ");
				System.out.println("|  |");
				System.out.println(" -- ");
				System.out.println("   |");
			}
		}

	}

	public static int exponents(int number) {
		int mul = 1;
		for (int y = 0; y < number; y++) {
			mul = mul * 2;
		}

		return mul;

	}

}
