package programmingParadigms;

import java.util.Scanner;

public class ProceduralCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("Please enter two numbers, keeping in mind that the order you enter the numbers in might affect the solution");

			double firstNum = sc.nextDouble();
			double secondNum = sc.nextDouble();
			System.out.println("Now enter the mathematical operation you would like us to carry out or enter @ to leave");
			char operation = sc.next().charAt(0);

			if (operation == '+') {
				double sum = calculateSum(firstNum, secondNum);
				System.out.println("The sum of the two numbers you entered is" + " " + sum);
			}

			else if (operation == '-')
			{
				double difference = calculateDifference(firstNum, secondNum);
				System.out.println("The sum of the two numbers you entered is" + " " + difference);
			}
			else if (operation == '/')
			{
				double quotient = calculateQuotient(firstNum, secondNum);
				System.out.println("The sum of the two numbers you entered is" + " " + quotient);
			}
			else if (operation == '*')
			{
				double product = calculateProduct(firstNum, secondNum);
				System.out.println("The sum of the two numbers you entered is" + " " + product);
			}
			else if (operation == '@')
			{
				break;
			}
			else {
				System.out.println("Incorrect input");
			}
		}
	}

	public static double calculateSum(double x, double y) {
		double sum = x + y;
		return sum;

	}

	public static double calculateDifference(double x, double y) {
		double difference = x - y;
		return difference;

	}

	public static double calculateQuotient(double x, double y) {
		double quotient = x / y;
		return quotient;

	}

	public static double calculateProduct(double x, double y) {
		double product = x * y;
		return product;

	}

}
