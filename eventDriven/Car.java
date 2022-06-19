package eventDriven;

import javax.swing.JOptionPane;

public class Car {

	public static void main(String[] args) {

		String car = JOptionPane.showInputDialog("what is the name of the car");

		int year = Integer.parseInt(JOptionPane.showInputDialog("when was you car made"));

		double weight = Double.parseDouble(JOptionPane.showInputDialog("what is the weight of the car"));

		JOptionPane.showMessageDialog(null, "The car is " + car);
		JOptionPane.showMessageDialog(null, "The car was made in " + year );
		JOptionPane.showMessageDialog(null, "The car weighs " + weight );
	}
}