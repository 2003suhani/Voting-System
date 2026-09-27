package VotingSys;

public class Voter {


	    // Private variables are used for encapsulation.
	    private int voterId;
	    private String name;
	    private String email;
	    private String username;
	    private String password;

	    // This variable checks whether the voter has already voted.
	    private boolean hasVoted;

	    // Constructor is used to initialize voter details.
	    public Voter(int voterId, String name, String email,
	                 String username, String password) {

	        this.voterId = voterId;
	        this.name = name;
	        this.email = email;
	        this.username = username;
	        this.password = password;

	        // Initially voter has not voted.
	        this.hasVoted = false;
	    }

	    // Getter for voter ID.
	    public int getVoterId() {
	        return voterId;
	    }

	    // Getter for voter name.
	    public String getName() {
	        return name;
	    }

	    // Getter for voter email.
	    public String getEmail() {
	        return email;
	    }

	    // Getter for username.
	    public String getUsername() {
	        return username;
	    }

	    // Getter for password.
	    public String getPassword() {
	        return password;
	    }

	    // Getter to check whether voter has voted.
	    public boolean hasVoted() {
	        return hasVoted;
	    }

	    // Setter to update voting status.
	    public void setHasVoted(boolean hasVoted) {
	        this.hasVoted = hasVoted;
	    }

	    // Method to display voter details.
	    public void displayVoter() {

	        System.out.println(
	            "ID: " + voterId +
	            " | Name: " + name +
	            " | Email: " + email +
	            " | Username: " + username +
	            " | Voted: " + hasVoted
	        );
	    }
	

}
