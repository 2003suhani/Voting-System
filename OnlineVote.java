package VotingSys;
import java.util.Scanner;
// Main class of the Online Voting System.
public class OnlineVote {

	    public static void main(String[] args) {

	        // Scanner is used to take input from the user.
	        Scanner sc = new Scanner(System.in);

	        // Create VotingSystem object.
	        Votingsystem system = new Votingsystem();


	        // ==========================================
	        // ADD SAMPLE CANDIDATES
	        // ==========================================

	        system.addCandidate(
	            new Candidate(101, "suhani", "Party A")
	        );

	        system.addCandidate(
	            new Candidate(102, "vanita", "Party B")
	        );

	        system.addCandidate(
	            new Candidate(103, "nana", "Party C")
	        );


	        // ==========================================
	        // MAIN MENU
	        // ==========================================

	        while (true) {

	            System.out.println(
	                "\n========================================"
	            );

	            System.out.println(
	                "       ONLINE VOTING MANAGEMENT SYSTEM"
	            );

	            System.out.println(
	                "========================================"
	            );

	            System.out.println("1. Register Voter");
	            System.out.println("2. Login");
	            System.out.println("3. Display Candidates");
	            System.out.println("4. Search Candidate");
	            System.out.println("5. Display Results");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();


	            // ==========================================
	            // SWITCH MENU
	            // ==========================================

	            switch (choice) {


	                // ======================================
	                // 1. REGISTER VOTER
	                // ======================================

	                case 1:

	                    System.out.print("Enter Voter ID: ");

	                    int voterId = sc.nextInt();

	                    sc.nextLine();


	                    // ------------------------------
	                    // NAME VALIDATION
	                    // ------------------------------

	                    String name;

	                    while (true) {

	                        System.out.print("Enter Name: ");

	                        name = sc.nextLine();

	                        if (Validation.isValidName(name)) {

	                            break;

	                        } else {

	                            System.out.println(
	                                "Invalid name!"
	                            );

	                            System.out.println(
	                                "Name should contain alphabets and spaces only."
	                            );
	                        }
	                    }


	                    // ------------------------------
	                    // EMAIL VALIDATION
	                    // ------------------------------

	                    String email;

	                    while (true) {

	                        System.out.print("Enter Email: ");

	                        email = sc.nextLine();

	                        if (Validation.isValidEmail(email)) {

	                            break;

	                        } else {

	                            System.out.println(
	                                "Invalid email!"
	                            );

	                            System.out.println(
	                                "Please enter a valid email."
	                            );
	                        }
	                    }


	                    // ------------------------------
	                    // USERNAME
	                    // ------------------------------

	                    System.out.print("Enter Username: ");

	                    String username = sc.nextLine();


	                    // ------------------------------
	                    // PASSWORD
	                    // ------------------------------

	                    System.out.print("Enter Password: ");

	                    String password = sc.nextLine();


	                    // Create Voter object.
	                    Voter voter = new Voter(
	                        voterId,
	                        name,
	                        email,
	                        username,
	                        password
	                    );


	                    // Register voter.
	                    system.registerVoter(voter);

	                    break;


	                // ======================================
	                // 2. LOGIN
	                // ======================================

	                case 2:

	                    sc.nextLine();

	                    System.out.print("Enter Username: ");

	                    String loginUsername = sc.nextLine();

	                    System.out.print("Enter Password: ");

	                    String loginPassword = sc.nextLine();


	                    // Call login method.
	                    Voter loggedInVoter =
	                        system.login(
	                            loginUsername,
	                            loginPassword
	                        );


	                    // Check login result.
	                    if (loggedInVoter != null) {

	                        // Voter menu.
	                        while (true) {

	                            System.out.println(
	                                "\n===== VOTER MENU ====="
	                            );

	                            System.out.println(
	                                "1. View Candidates"
	                            );

	                            System.out.println(
	                                "2. Cast Vote"
	                            );

	                            System.out.println(
	                                "3. Search Candidate"
	                            );

	                            System.out.println(
	                                "4. Logout"
	                            );

	                            System.out.print(
	                                "Enter your choice: "
	                            );

	                            int voterChoice =
	                                sc.nextInt();


	                            switch (voterChoice) {


	                                // --------------------------
	                                // VIEW CANDIDATES
	                                // --------------------------

	                                case 1:

	                                    system.displayCandidates();

	                                    break;


	                                // --------------------------
	                                // CAST VOTE
	                                // --------------------------

	                                case 2:

	                                    System.out.print(
	                                        "Enter Candidate ID: "
	                                    );

	                                    int candidateId =
	                                        sc.nextInt();

	                                    system.castVote(
	                                        loggedInVoter,
	                                        candidateId
	                                    );

	                                    break;


	                                // --------------------------
	                                // SEARCH CANDIDATE
	                                // --------------------------

	                                case 3:

	                                    System.out.print(
	                                        "Enter Candidate ID: "
	                                    );

	                                    int searchId =
	                                        sc.nextInt();

	                                    system.searchCandidate(
	                                        searchId
	                                    );

	                                    break;


	                                // --------------------------
	                                // LOGOUT
	                                // --------------------------

	                                case 4:

	                                    System.out.println(
	                                        "Logged out successfully."
	                                    );

	                                    break;


	                                default:

	                                    System.out.println(
	                                        "Invalid choice."
	                                    );
	                            }


	                            // Exit voter menu.
	                            if (voterChoice == 4) {

	                                break;
	                            }
	                        }
	                    }

	                    break;


	                // ======================================
	                // 3. DISPLAY CANDIDATES
	                // ======================================

	                case 3:

	                    system.displayCandidates();

	                    break;


	                // ======================================
	                // 4. SEARCH CANDIDATE
	                // ======================================

	                case 4:

	                    System.out.print(
	                        "Enter Candidate ID: "
	                    );

	                    int searchId = sc.nextInt();

	                    system.searchCandidate(searchId);

	                    break;


	                // ======================================
	                // 5. DISPLAY RESULTS
	                // ======================================

	                case 5:

	                    system.displayResults();

	                    break;


	                // ======================================
	                // 6. EXIT
	                // ======================================

	                case 6:

	                    System.out.println(
	                        "Thank you for using Online Voting System."
	                    );

	                    sc.close();

	                    return;


	                // ======================================
	                // INVALID CHOICE
	                // ======================================

	                default:

	                    System.out.println(
	                        "Invalid choice. Please try again."
	                    );
	            }
	        }
	    }
	

}
