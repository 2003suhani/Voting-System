package VotingSys;

public class Validation {

	// This class contains reusable validation methods.

	    // Method to validate a person's name.
	    public static boolean isValidName(String name) {

	        // Name cannot be null or empty.
	        if (name == null || name.trim().isEmpty()) {
	            return false;
	        }

	        // Name should contain only alphabets and spaces.
	        return name.matches("[a-zA-Z ]+");
	    }

	    // Method to validate email.
	    public static boolean isValidEmail(String email) {

	        // Email cannot be null or empty.
	        if (email == null || email.trim().isEmpty()) {
	            return false;
	        }

	        // Email should not contain spaces.
	        if (email.contains(" ")) {
	            return false;
	        }

	        // Basic email format validation.
	        return email.matches(
	            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
	        );
	    }
	

}
