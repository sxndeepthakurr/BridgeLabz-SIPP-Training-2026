interface LuggageScanner {

    default void displaySecurityGuidelines() {
        System.out.println("Luggage Scanner: Do not carry prohibited items.");
    }

    void scanLuggage();

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.length() == 8;
    }
}

interface PassportVerifier {

    default void displaySecurityGuidelines() {
        System.out.println("Passport Verifier: Carry a valid passport.");
    }

    void verifyPassport();
}

public class AirportSecuritySystem implements LuggageScanner, PassportVerifier {

    String[] passengerNames = {"Aman", "Riya", "Karan"};
    String[] passportNumbers = {"AB123456", "P123", "XY987654"};

    @Override
    public void scanLuggage() {
        System.out.println("Luggage scanned successfully.");
    }

    @Override
    public void verifyPassport() {
        System.out.println("Passport verification completed.");
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }

    public void processPassengers() {

        displaySecurityGuidelines();

        System.out.println("\nPassenger Details:");

        for (int i = 0; i < passengerNames.length; i++) {

            scanLuggage();
            verifyPassport();

            boolean valid = LuggageScanner.isPassportNumberValid(passportNumbers[i]);

            System.out.println("Passenger : " + passengerNames[i]);
            System.out.println("Passport  : " + passportNumbers[i]);

            if (valid)
                System.out.println("Status    : Allowed to Board");
            else
                System.out.println("Status    : Boarding Denied");

            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {

        AirportSecuritySystem obj = new AirportSecuritySystem();
        obj.processPassengers();
    }
}