package Asignmentsfourjava;


	import java.util.LinkedHashSet;
	import java.util.Set;

	public class Second {

		public static void main(String[] args) {
			String inputString = "programming";
			System.out.println("Original String: " + inputString);
			System.out.println("String After Removing Duplicate Characters: " + removeDuplicates(inputString));
		}

		private static String removeDuplicates(String inputString) {
			Set<Character> set = new LinkedHashSet<>();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < inputString.length(); i++) {
				char c = inputString.charAt(i);
				if (!set.contains(c)) {
					set.add(c);
					sb.append(c);
				}
			}

			return sb.toString();
		}
	}

