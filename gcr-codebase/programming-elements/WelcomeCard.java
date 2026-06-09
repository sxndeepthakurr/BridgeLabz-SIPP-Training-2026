public class WelcomeCard {
    public static void main(String[] args) {
        
        // Storing Ravi's details
        String name = "Ravi";
        int age = 25;
        String rank = "Senior Member";
        int salary = 50000;
        float membershipFee = 1499.75f;

        // Calculating annual bonus (12% of salary) and casting to int
        int annualBonus = (int) (salary * 0.12);

        // Formatted Welcome Card
        System.out.println("=================================");
        System.out.println("      WELCOME TO THE GUILD       ");
        System.out.println("=================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.printf("Membership Fee : ₹%.2f%n", membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("=================================");
        System.out.println("Welcome, " + name + "! We are glad to have you.");
        System.out.println("=================================");
    }
}