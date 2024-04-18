package Asignmentsfourjava;

	import java.util.Scanner;

	public class Four {

		public static void main(String[] args) {

			Scanner ab = new Scanner(System.in);
			String inputString = ab.next();

			System.out.println("Input String: " + inputString);
			System.out.println("Is Palindrome: " + isPalindrome(inputString));

		}

		private static boolean isPalindrome(String inputString) {

			String cleanedInput = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

			StringBuilder sb = new StringBuilder(cleanedInput);
			String reversedInput = sb.reverse().toString();

			return cleanedInput.equals(reversedInput);
		}
	}


