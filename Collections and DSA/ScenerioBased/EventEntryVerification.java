import java.util.HashSet;

public class EventEntryVerification {

    static HashSet<String> participants = new HashSet<>();

    static void registerParticipant(String email) {

        if (participants.add(email))
            System.out.println("Registration Successful.");
        else
            System.out.println("Duplicate Registration Rejected.");
    }

    static void displayParticipants() {

        System.out.println("\nRegistered Participants:");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("abc@gmail.com");
        registerParticipant("xyz@gmail.com");
        registerParticipant("abc@gmail.com");

        displayParticipants();
    }
}