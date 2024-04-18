package Asignmentsfourjava;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Five {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			try {
				System.out.print("Enter a number to calculate its square: ");
				int number = scanner.nextInt();
				int square = calculateSquare(number);
				System.out.println("Square of " + number + " is: " + square);
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid number.");
			} finally {
				scanner.close();
			}
		}

		private static int calculateSquare(int number) {
			return number * number;
		}
	}


