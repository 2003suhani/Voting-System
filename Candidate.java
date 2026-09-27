package VotingSys;

	// This class represents a candidate.
public class Candidate {

	    // Private variables provide encapsulation.
	    private int candidateId;
	    private String name;
	    private String party;

	    // Stores the total number of votes.
	    private int voteCount;

	    // Constructor initializes candidate details.
	    public Candidate(int candidateId, String name, String party) {

	        this.candidateId = candidateId;
	        this.name = name;
	        this.party = party;

	        // Initially candidate has zero votes.
	        this.voteCount = 0;
	    }

	    // Getter for candidate ID.
	    public int getCandidateId() {
	        return candidateId;
	    }

	    // Getter for candidate name.
	    public String getName() {
	        return name;
	    }

	    // Getter for party name.
	    public String getParty() {
	        return party;
	    }

	    // Getter for vote count.
	    public int getVoteCount() {
	        return voteCount;
	    }

	    // Method to increase vote count by one.
	    public void addVote() {
	        voteCount++;
	    }

	    // Method to display candidate details.
	    public void displayCandidate() {

	        System.out.println(
	            "ID: " + candidateId +
	            " | Name: " + name +
	            " | Party: " + party +
	            " | Votes: " + voteCount
	        );
	    }
	

}
