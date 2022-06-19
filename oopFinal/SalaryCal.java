package oopFinal;

public class SalaryCal extends Salary{

	
	public SalaryCal()
	{
	
	}
	
	public SalaryCal(int hour, int rate)
	{
		setHours(hour);
		setRph(rate);
	}
	
	public void printInfo()
	{
		int product;
		product= getHours() * getRph();
		System.out.println(getName() + " " + getEmployeeID() + " "+ "Your salary for this month is " + product );
	}
	
}
