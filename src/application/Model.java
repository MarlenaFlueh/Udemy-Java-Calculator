package application;

public class Model {
	public double calculate(double numOne, double numTwo, String operation) {
		
		switch(operation) {
		case "+":
			return numOne + numTwo;
		case "-":
			return numOne - numTwo;
		case "*":
			return numOne * numTwo;
		case "/":
			if (numTwo == 0) {
				System.out.println("Nicht durch 0 teilbar.");
				return 0;
			}
			return numOne / numTwo;
		default:
			return 0;
		}
	}
}
