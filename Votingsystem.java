package VotingSys;

import java.util.ArrayList;
import java.util.HashMap;

// This class contains the main business logic of the voting system.
public class Votingsystem {


	    // ArrayList stores multiple voter objects.
	    private ArrayList<Voter> voters = new ArrayList<>();

	    // ArrayList stores multiple candidate objects.
	    private ArrayList<Candidate> candidates = new ArrayList<>();

	    // HashMap stores username as key and password as value.
	    private HashMap<String, String> users = new HashMap<>();


	    // ==========================================
	    // REGISTER VOTER
	    // ==========================================

	    public void registerVoter(Voter voter) {

	        // Check whether username already exists.
	        if (users.containsKey(voter.getUsername())) {

	            System.out.println("Username already exists.");

	            return;
	        }

	        // Check whether voter ID already exists.
	        for (Voter v : voters) {

	            if (v.getVoterId() == voter.getVoterId()) {

	                System.out.println("Voter ID already exists.");

	                return;
	            }
	        }

	        // Add voter to ArrayList.
	        voters.add(voter);

	        // Add username and password to HashMap.
	        users.put(
	            voter.getUsername(),
	            voter.getPassword()
	        );

	        System.out.println("Voter registered successfully.");
	    }


	    // ==========================================
	    // LOGIN
	    // ==========================================

	    public Voter login(String username, String password) {

	        // Check whether username exists.
	        if (users.containsKey(username)) {

	            // Get stored password.
	            String storedPassword = users.get(username);

	            // Compare passwords.
	            if (storedPassword.equals(password)) {

	                // Find the voter object.
	                for (Voter voter : voters) {

	                    if (voter.getUsername().equals(username)) {

	                        System.out.println("Login successful.");

	                        return voter;
	                    }
	                }
	            }
	        }

	        System.out.println("Invalid username or password.");

	        return null;
	    }


	    // ==========================================
	    // ADD CANDIDATE
	    // ==========================================

	    public void addCandidate(Candidate candidate) {

	        // Check duplicate candidate ID.
	        for (Candidate c : candidates) {

	            if (c.getCandidateId() == candidate.getCandidateId()) {

	                System.out.println(
	                    "Candidate ID already exists."
	                );

	                return;
	            }
	        }

	        // Add candidate to ArrayList.
	        candidates.add(candidate);

	        System.out.println("Candidate added successfully.");
	    }


	    // ==========================================
	    // DISPLAY CANDIDATES
	    // ==========================================

	    public void displayCandidates() {

	        if (candidates.isEmpty()) {

	            System.out.println("No candidates available.");

	            return;
	        }

	        System.out.println("\n===== CANDIDATES =====");

	        // Display every candidate.
	        for (Candidate candidate : candidates) {

	            candidate.displayCandidate();
	        }
	    }


	    // ==========================================
	    // SEARCH CANDIDATE
	    // ==========================================

	    public void searchCandidate(int candidateId) {

	        for (Candidate candidate : candidates) {

	            if (candidate.getCandidateId() == candidateId) {

	                System.out.println("\nCandidate found:");

	                candidate.displayCandidate();

	                return;
	            }
	        }

	        System.out.println("Candidate not found.");
	    }


	    // ==========================================
	    // CAST VOTE
	    // ==========================================

	    public void castVote(Voter voter, int candidateId) {

	        // Check whether voter already voted.
	        if (voter.hasVoted()) {

	            System.out.println(
	                "You have already voted."
	            );

	            return;
	        }

	        // Search for candidate.
	        for (Candidate candidate : candidates) {

	            if (candidate.getCandidateId() == candidateId) {

	                // Increase candidate vote count.
	                candidate.addVote();

	                // Mark voter as voted.
	                voter.setHasVoted(true);

	                System.out.println(
	                    "Vote cast successfully."
	                );

	                return;
	            }
	        }

	        System.out.println("Candidate not found.");
	    }


	    // ==========================================
	    // DISPLAY RESULTS
	    // ==========================================

	    public void displayResults() {

	        System.out.println("\n===== VOTING RESULTS =====");

	        for (Candidate candidate : candidates) {

	            System.out.println(
	                candidate.getName() +
	                " (" + candidate.getParty() + ")" +
	                " -> " +
	                candidate.getVoteCount() +
	                " votes"
	            );
	        }
	    }
	

}
