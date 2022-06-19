package oopFinal;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		int rate;
		int hours;
		int employeeID;
		String name;

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter your name and ID number");
		name=sc1.next();
		employeeID=sc1.nextInt();
		System.out.println("Please enter the number of hours you worked this month");
		hours= sc1.nextInt();
		System.out.println("Please enter your rate per hour");
		rate= sc1.nextInt();
		SalaryCal salary = new SalaryCal (hours,rate);
		salary.setEmployeeID(employeeID);
		salary.setName(name);
		salary.printInfo();
		
		

		
	}

}
