public class VotingService {
    public void checkEligibility(int age) throws Custom_exception {
        if (age < 18) {
            throw new Custom_exception("Age must be at least 18");
        } else {
            System.out.println("Eligibility passed");
        }
    }

    public static void main(String[] args) {
        VotingService votingService = new VotingService();
        try {
            votingService.checkEligibility(19);  // You can change the age here
        } catch (Custom_exception c) {
            System.out.println(c.getMessage());
        }
    }
}



