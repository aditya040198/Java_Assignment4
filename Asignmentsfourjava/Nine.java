package Asignmentsfourjava;

public class Nine {

	private int num1;
	private int num2;

	public Nine(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int Add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Number must be positive.");
		}
		return num1 + num2;
	}

	public int Sub() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Numbers must be positive.");
		}
		return num1 - num2;
	}

	public int Multiply() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Numbers cannot be zero.");
		}
		return num1 * num2;
	}

	public int Divide() {
		if (num2 == 0) {
			throw new ArithmeticException("Division by zero is not allowed.");
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		try {
			Nine obj1 = new Nine(4, 6);
			Nine obj2 = new Nine(20, 12);
			Nine obj3 = new Nine(9, 0);
			Nine obj4 = new Nine(-6, 6);

			System.out.println("Addition result: " + obj1.Add());
			System.out.println("Subtraction result: " + obj2.Sub());
			System.out.println("Multiplication result: " + obj3.Multiply());
			System.out.println("Division result: " + obj4.Divide());
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Error: Non-integer values provided.");
		}
	}
}
