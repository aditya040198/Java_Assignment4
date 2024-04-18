package Asignmentsfourjava;


	import java.util.HashSet;
	import java.util.Set;

	public class Eight {

	    public static void main(String[] args) {
	        String inputString = "crthrr";
	        try {
	            validateString(inputString);
	            System.out.println("The string " + inputString + " contains vowels.");
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void validateString(String input) {
	        if (!hasVowels(input)) {
	            throw new IllegalArgumentException("The string does not contain any vowels.");
	        }
	    }

	    private static boolean hasVowels(String input) {
	        Set<Character> vowels = new HashSet<>();
	        vowels.add('a');
	        vowels.add('e');
	        vowels.add('i');
	        vowels.add('o');
	        vowels.add('u');

	        for (int i = 0; i < input.length(); i++) {
	            if (vowels.contains(Character.toLowerCase(input.charAt(i)))) {
	                return true;
	            }
	        }

	        return false;
	    }
	}

