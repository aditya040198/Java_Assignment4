package Asignmentsfourjava;


import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the size of the array: ");
			int n = scanner.nextInt();
			int[] array = new int[n];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < n; i++) {
				System.out.print("Enter element " + (i + 1) + ": ");
				array[i] = scanner.nextInt();
			}

			System.out.print("Enter the position (1 to " + n + ") to get the value: ");
			int position = scanner.nextInt();

			if (position < 1 || position > n) {
				throw new IndexOutOfBoundsException("Invalid position. Position should be between 1 and " + n);
			}

			System.out.println("Value at position " + position + ": " + array[position - 1]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter valid integers.");
		} finally {
			scanner.close();
		}
	}
}



